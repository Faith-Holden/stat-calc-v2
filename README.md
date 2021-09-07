# stat-calc-v2

My solution for Chapter 5 Exercise 2 of “Introduction to Programming Using Java”.
Implementation note: For this exercise, I modified the class StatCalc.java to add a getMin and getMax method, as well as related instance variables.

Problem Description:
A common programming task is computing statistics of a set of numbers. (A statistic is
a number that summarizes some property of a set of data.) Common statistics include
the mean (also known as the average) and the standard deviation (which tells how spread
out the data are from the mean). I have written a little class called StatCalc that can be
used to compute these statistics, as well as the sum of the items in the dataset and the
number of items in the dataset. You can read the source code for this class in the file
StatCalc.java. If calc is a variable of type StatCalc, then the following instance methods
are available:
• calc.enter(item) where item is a number, adds the item to the dataset.
• calc.getCount() is a function that returns the number of items that have been
added to the dataset.
• calc.getSum() is a function that returns the sum of all the items that have been
added to the dataset.
• calc.getMean() is a function that returns the average of all the items.
• calc.getStandardDeviation() is a function that returns the standard deviation
of the items.
Typically, all the data are added one after the other by calling the enter() method
over and over, as the data become available. After all the data have been entered, any
of the other methods can be called to get statistical information about the data. The
methods getMean() and getStandardDeviation() should only be called if the number
of items is greater than zero.
Modify the current source code, StatCalc.java, to add instance methods getMax() and
getMin(). The getMax() method should return the largest of all the items that have been
added to the dataset, and getMin() should return the smallest. You will need to add two
new instance variables to keep track of the largest and smallest items that have been seen
so far.
Test your new class by using it in a program to compute statistics for a set of non-zero
numbers entered by the user. Start by creating an object of type StatCalc:
StatCalc calc; // Object to be used to process the data.
calc = new StatCalc();
Read numbers from the user and add them to the dataset. Use 0 as a sentinel value
(that is, stop reading numbers when the user enters 0). After all the user’s non-zero
numbers have been entered, print out each of the six statistics that are available from
calc.

Notes: TextIO is an IO helper class created by the textbook's author to assist with IO before the book covers java's IO utilities.
