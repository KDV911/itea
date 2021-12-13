package lesson12.builder;

public class Person {

    private String name;
    private String lastName;
    private String date;
    private String age;
    private String gender;
    private String nationality;
    private String colorHair;


    public static  class Builder{
        private  Person person;

        public Builder()
        {
            person = new Person();
        }


        public Builder withName(String name)
        {
            person.name = name;
            return this;
        }

        public Builder withLastName(String lastName)
        {
            person.lastName = lastName;
            return this;
        }

        //..

        public Builder withColorHair(String colorHair)
        {
            person.colorHair = colorHair;
            return this;
        }

        public Person build()
        {
            return person;
        }

    }
}
