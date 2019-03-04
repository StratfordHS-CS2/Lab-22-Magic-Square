[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-22-magic-square-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-22-magic-square-username)

# Lab 22 - Magic Square

## Lab Goal
You will determine if a square of numbers is a magic square or not.  A magic square is a grid of numbers (equal number of rows and columns) where each row, column, and diagonal sum to the same number.

## Instructions
* Complete the method `isMagicSquare` so it returns `true` if it is a magic square, `false` otherwise.  Use the other methods you are to complete to help you out.
* Complete the method `sumRow` to return the sum of the specified row.
* Complete the method `sumCol` to return the sum of the specified column.
* Complete the method `sumDownDiag` to return the sum of the diagonal that passes from the top-left to the bottom-right.
* Complete the method `sumUpDiag` to return the sum of the diagonal that passes from the bottom-left to the top-right.
* Complete the standard `toString` method to allow Java to print a MagicSquare object.  You should print the values in a square shape.  It's ok if the columns don't line up perfectly.
* Complete all javadoc comments with the proper tags.

## Example
This is a magic square:
```
8 1 6
3 5 7
4 9 2
```

## Reference
* [ThinkJava chapter on Arrays](https://books.trinket.io/thinkjava/chapter8.html)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 20 - `isMagicSquare`
* 14 - `sumRow`
* 14 - `sumCol`
* 14 - `sumDownDiag`
* 14 - `sumUpDiag`
* 14 - `toString`
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
