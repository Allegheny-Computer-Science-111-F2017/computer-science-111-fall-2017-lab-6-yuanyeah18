# Reflection by YE Yuan

In order to produce a random number or char.
First, we need to introduce random class in the java program.
*import java.util.Random;*
Second, we should produce a random (name as n1 there)
*Random n1 = new Random();*
If i have a string, and i want to have a random char within the string named cc
4 means the string have 4 charactors
we are going to get a random char from the 4 charactor
*char randomC = cc.charAt(n1.nextInt(4));*

substring can extract characters from a string:
var str = Hello world!;
var res = str.substring(1, 4);
string.substring(start, end)
start: Required. The position where to start the extraction.
First character is at index 0
or var res = str.substring(1);
then the output is ello world.

Those are the two basical point i learn from the lab.





