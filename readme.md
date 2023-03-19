<div style="text-align: center">
    <span style="font-size: 3em; font-weight: 700; font-family: Consolas">
        Lab 01 <br>
        A Gentle Introduction to Hadoop
    </span>
    <br><br>
    <span style="">
        A assignment for <code>CSC14118</code> Introduction to Big Data @ 20KHMT1
    </span>
</div>

## Collaborators (your-team-name)

- `20120489` **Võ Phi Hùng** ([@phihungtf](https://github.com/phihungtf))
- `20120474` **Lê Kim Hiếu** ([@githubaccount2](https://github.com/githubaccount2))
- `20120632` **Trần Thái Vỹ** ([@githubaccount3](https://github.com/githubaccount3))
- `20120573` **Nguyễn Phú Tân** ([@githubaccount4](https://github.com/githubaccount4))

## Instructors

- `HCMUS` **Đoàn Đình Toàn** ([@ddtoan](ddtoan18@clc.fitus.edu.vn))
- `HCMUS` **Nguyễn Ngọc Thảo** ([@nnthao](nnthao@fit.hcmus.edu.vn))

---

<div style="page-break-after: always"></div>

## Quick run

> You can clear this section and insert your own instruction.

To export your report with the [OSCP](https://help.offensive-security.com/hc/en-us/articles/360046787731-PEN-200-Reporting-Requirements) template, you should install the following packages:

For Archlinux:

```bash
pacman -S texlive-most pandoc
```

For Ubuntu:

```
apt install texlive-latex-recommended texlive-fonts-extra texlive-latex-extra pandoc
```

Then using the `convert_md_to_pdf.sh` to export your report to pdf.

> For those who don't want to use OSCP template, you can use alternative ways to export your `report.md` to `pdf` (`Typora`, `pandoc` without `Latex`, `Obsidian`,...) but please keep the `yaml` header of the report as follow:

```yaml
---
title: 'Lab 01: A Gentle Introduction to Hadoop'
author: ['your-team-name']
date: 'yyyy-mm-dd'
subtitle: 'CSC14118 Introduction to Big Data 20KHMT1'
lang: 'en'
titlepage: true
titlepage-color: '0B1887'
titlepage-text-color: 'FFFFFF'
titlepage-rule-color: 'FFFFFF'
titlepage-rule-height: 2
book: true
classoption: oneside
code-block-font-size: \scriptsize
---
```
