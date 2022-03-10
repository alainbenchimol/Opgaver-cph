public class Student
    {
        //1. fields/felter/objektvariable
        private String name;
        private String age;
        private String isFemale;
        private String datamatikerTeam;

        //2. Constructors – variable/parametre uden værdier
        public Student(String tmpName,String tmpAge,String tmpIsFemale,String tmpDatamatikerTeam)
        {
            this.name = tmpName;
            this.age = tmpAge;
            this.isFemale = tmpIsFemale;
            this.datamatikerTeam = tmpDatamatikerTeam;
        }
        //3. Metoder/Methods
        public String getStudent()
        {
            return this.name+" "+this.age+" "+this.isFemale+" "+this.datamatikerTeam;
        }
	public String getNameTeam()
        {
            return this.name+" "+this.datamatikerTeam;
        }
    }
