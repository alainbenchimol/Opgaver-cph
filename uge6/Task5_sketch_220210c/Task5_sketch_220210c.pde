/*
Have a look at the file in the folder named "TaskFive".
 5.a solve the problem presented in MethodOne.
 5.b solve the problem presented in MethodTwo.
 */
void setup() {
  MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line.
  int max = 10;

  if (i > max)
  {
    String output = "i is greater than "+max+".";
    println(output);
  }
}

/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */

void MethodTwo()
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else
  {
    weekend = true;
  }

  // Print the name of the weekday here:
  if (weekDay==0)
  {
    print(Monday);
  }


  // Print if it is weekend here:
}
