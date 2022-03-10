/*2.a store your name in a variable and print it.
 2.b store your age in a varible and print it.
 2.c store whether or not you are happy right now, as a boolean
 (true for happy, false for sad).
 2.d using the above variables print the following message: "Hi, my name is <name>"
 "I am <age> years old"
 "I <dont> clap my hands"
 
 where the <> refers to variables.
 the last variable (<dont>) is only to be printed if the happy boolean is false
 */
String name="Alain";
int age=48;
println("Name: "+name);
println("Age: "+age+" years");
boolean happy=false;

String happy2=age<40?"":"don't";
println(happy2);

println("Hi, my name is "+name);
println("I am "+age+" yers old");

if (happy==true)
{
  println("I clap my hands");
}
if (happy==false)
{
  println("I don't clap my hands");
}
