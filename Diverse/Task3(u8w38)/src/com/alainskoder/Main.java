package com.alainskoder;
/*
Task 3 - Objects:
V 3.a Create a new file and save it by the name "Datamatik".

V 3.b Create a new file called "Teacher" and another one called "Student". Save both files with the
extension .java, and in the same folder as Datamatik.java

V 3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale",
 "datamatikerTeam" using appropriate data types for each.

V 3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName",
 "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c

V 3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d
(you may use shaddowing with the keyword this)

V 3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale",
using appropriate data types for each.

V 3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName",
"tmpAge", "tmpIsFemale" with the same datatypes used in 3.f

V 3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g



V3.i Returning to the Datamatik class add a main() function and in this function, create a new
object/instance of the type Teacher and give it the name, age and gender of your teacher.

3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student.
The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group.

3.k in the main() function print the name of the teacher

3.l in the main() function print the names of both students and which teams they are from. Do this witout
 writing any toString() methods
 */

public class Main {

    public Main() {
    }

    public static void main(String[] args)
    {
        com.alainskoder.Student alain=new com.alainskoder.Student("Alain","48 years","Male","Team B");
        System.out.println(alain.getStudent());

        com.alainskoder.Student israa=new com.alainskoder.Student("Israa","28 years","Female","Team B");
        System.out.println(israa.getStudent());

        System.out.println(israa.getNameTeam());
        System.out.println(alain.getNameTeam());

        com.alainskoder.Teacher tess=new com.alainskoder.Teacher("Tess","40 years","Female");
        System.out.println(tess.getTeacher());
    }

}
