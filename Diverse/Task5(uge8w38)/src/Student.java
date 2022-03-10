package com.alainskoder;
public class Student
{
        //1. fields/felter/objektvariable
        private String name;


        //2. Constructors – variable/parametre uden værdier
        public Student(String tmpName)
        {
            this.name = tmpName;
        }

        //3. Metoder/Methods
        public String getStudentName() { return this.name; }
}

