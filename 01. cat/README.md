# Cat Tool

This folder contains the Java solution for the "Write Your Own Cat Tool" challenge from [Coding Challenges](https://codingchallenges.fyi/challenges/challenge-cat/). 

## About

The `cat` command is a Unix utility that concatenates and lists files. In this challenge, a custom `cat` tool is created that can read files, read input from standard in, concatenate files, and number lines.

## Language Used

- Java

## Arguments

The program takes the following arguments:

- No arguments: If no arguments are provided, the program reads from the standard input and prints to the standard output.
- File name(s): The name of the file(s) to be read. The program reads the file(s) and prints to the standard output. If multiple file names are provided, the program concatenates the contents and prints them.
- `-n` followed by file name: The program reads the file, numbers the lines, and prints to the standard output.
- `-b` followed by file name: The program reads the file, numbers the lines excluding blank lines, and prints to the standard output.

Usage examples:

- `cat` -> print stdin to stdout
- `cat file` -> print file to stdout
- `cat file1 file2` -> print file1 and file2 to stdout
- `cat -n file` -> print file to stdout with line numbers
- `cat -b file` -> print file to stdout with line numbers, but not for blank lines