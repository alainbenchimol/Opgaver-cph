/*
6.a make 2 integer variables named a and b. Print "Success!" if either of them is
 equal to 10 or if the sum is. If not, print "Failure!".
 
 6.b make 3 integer variables named x, y and z. Print "Success!"
 if their sum is 30, but none of them may have the value of 10, 20 or 30.
 Otherwise print "Failure!".
 */
int a=5;
int b=5;
if (a+b==10||a==10||b==10)
{
  println("Success!");
} else
  println("Failure!");

int x=10;
int y=9;
int z=8;
if (x+y+z==30&& x!=10&&y!=10&&z!=10&& x!=20&&y!=20&&z!=20&& x!=30&&y!=30&&z!=30)
{
  print("Success!");
} else
  print("Failure!");
