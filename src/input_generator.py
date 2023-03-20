# Author: PhiHungTF
# Run: python input_generator.py [N_LINES] [FILE_NAME]
# Example: python input_generator.py 10000 input.txt
import random
import sys

ALL_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def random_uppercase():
    return random.choice(ALL_UPPER)

def main():
    N_LINES = 10000
    FILE_NAME = "input.txt"

    argv = sys.argv
    if len(argv) > 1:
        N_LINES = int(argv[1])

    if len(argv) > 2:
        FILE_NAME = argv[2]

    with open(FILE_NAME, "w") as f:
        for i in range(N_LINES):
            f.writelines(random_uppercase() + " " + random_uppercase() + "\n")
                        
if __name__ == "__main__":
    main()