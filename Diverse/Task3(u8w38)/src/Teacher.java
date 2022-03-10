package com.alainskoder;

public class Teacher
{
    //1. fields/felter/objektvariable
    private String name;
    private String age;
    private String isFemale;

    //2. Constructors – variable/parametre uden værdier
    public Teacher(String tmpName,String tmpAge,String tmpIsFemale)
    {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
    }
    //3. Metoder/Methods
    public String getTeacher()
    {
        return this.name+" "+this.age+" "+this.isFemale;
    }
}
