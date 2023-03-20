import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Unhealthy_relationship {
	public static class SplitterMapper extends Mapper<Object, Text, Text, IntWritable> {
		private final static IntWritable pos = new IntWritable(1);
		private final static IntWritable neg = new IntWritable(-1);

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			String[] tokens = value.toString().split(" ");
			context.write(new Text(tokens[0]), pos);
			context.write(new Text(tokens[1]), neg);
		}
	}

	public static class IntSumReducer extends Reducer<Text, IntWritable, Text, Text> {
		public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
			int sum = 0;
			for (IntWritable val : values) {
				sum += val.get();
			}
			
			if (sum > 0) context.write(key, new Text("pos"));
			else if (sum < 0) context.write(key, new Text("neg"));
			else context.write(key, new Text("eq"));
		}
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "Unhealthy_relationship");
		job.setJarByClass(Unhealthy_relationship.class);
		job.setMapperClass(SplitterMapper.class);
		job.setReducerClass(IntSumReducer.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
