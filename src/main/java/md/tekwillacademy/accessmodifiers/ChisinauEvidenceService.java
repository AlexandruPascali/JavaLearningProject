package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {

    public static void main(String[] args) {
        Person ionelGrozavu = new Person();

        Person marcelBogatu = new Person("Marcel Bogatu", 78980098, 32, "male");

        System.out.println(marcelBogatu.getAge());
        System.out.println(ionelGrozavu.getAge());

        ionelGrozavu.name = "Ion Grozavu";

        marcelBogatu.name = "Marcel Bogatu";

        Person raisaPacalo = new Person("Raisa Pacalo","F");
        System.out.println(raisaPacalo.getGender());
        System.out.println(raisaPacalo.toString());
        System.out.println("Numele obiectului raisaPacalo " + raisaPacalo.name);

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean";
        System.out.println(Person.nationality);


    }
}
