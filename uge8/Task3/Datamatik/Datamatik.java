public class Datamatik 
{

    public static void main(String[] args)
    {
        Student alain=new Student("Alain","48 years","Male","Team B");
        System.out.println(alain.getStudent());

	Student izra=new Student("Izra","28 years","Female","Team B");
        System.out.println(izra.getStudent());

	System.out.println(izra.getNameTeam());
        System.out.println(alain.getNameTeam());

        Teacher tess=new Teacher("Tess","40 years","Female");
        System.out.println(tess.getTeacher());
    }

}
