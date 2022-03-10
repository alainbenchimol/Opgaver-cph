package com.alainskoder;
public class Person {

            //1. fields/felter/objektvariable
        private String firstName;
        private String lastName;
        private String cpr;

        //2. Constructors – variable/parametre uden værdier
        public Person(String fn,String ln,String cpr)//Person i stedet for Main
        {
            this.firstName=fn;
            this.lastName=ln;
            this.cpr=cpr;
        }

        //3. Metoder/Methods
        public String getFullName()
        {
            return this.firstName+" "+this.lastName;
        }

        public String getFirstName()
        {
            return this.firstName;
        }

        public String getLastName()
        {
            return this.lastName;
        }

        public void changeName(String newFirstName, String newLastName)
        {
            this.firstName=newFirstName;
            this.lastName=newLastName;
        }
        public String getCpr()
        {
            return this.cpr;
        }
}
