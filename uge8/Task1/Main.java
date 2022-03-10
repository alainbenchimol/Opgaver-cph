public class Main
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("Hallo World!");
		empty();
		nameAge();		
	}
	
	static void empty()
	{
	System.out.println("");
	}

	static void nameAge() 
   	{
        String name = "Alain";
        int age = 48;
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
   	}
}