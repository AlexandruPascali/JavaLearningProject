package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {

    public static String nationality = "MDA";

    public String name;

    public int phoneNumber;

    private int age;

    protected String gender;

    public Person(String nameInput, int phoneNumberInput, int ageInput, String genderInput){
        name = nameInput;
        phoneNumber = phoneNumberInput;
        age = ageInput;
        gender = genderInput;
    }

    public Person(){

    }

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;


    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return this.gender;
    }

    public String toString(){
        return "Numele obiectului de tip Person este " + this.name + " are numarul de telefon " + this.phoneNumber +
                " are genul " + this.gender + " si " + age + " ani";
    }

}
