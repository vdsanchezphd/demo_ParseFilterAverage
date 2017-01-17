# demo_ParseFilterAverage
Scala object used to parse file lines, filter floating numbers included, and average their values. Arguments passed are input and output file names.

## Signature of Singletone Object:
```
object demo_ParseFilterAverage extends App
```
## Brief Description:

Scala object used to parse file lines, filter floating numbers included, and average their values. Arguments passed are input and output file names.

## Input:

Two arguments: the input file name and the output file name.
Each line of the input file contains strings, some representing floating point numbers and some not.
Results are written to the output file.

## Output:

The average of the floating point numbers in each line together with original line content.
Displayed in the console and written to the output file.

## Testing:

was done in a Windows 10 environment using:

- Scala Compiler Version 2.12.1
- Scala Code Runner Version 2.12.1

run from a regular Command Prompt, cf. enclosed screenshot below:

![alt tag](https://github.com/vdsanchezphd/demo_ParseFilterAverage/blob/master/1-Building%20and%20Running.JPG)

The test.dat text file contains test vectors, can be easily modified. The results are displayed in the console and written to the output file results.dat.

## References:

*Scala Standard Library 2.12.1*. (2017, January 17). Retrieved from http://www.scala-lang.org/api/current/
