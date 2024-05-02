package md.tekwillacademy.zooclubservice;

public class ZooClubService {
    public static void main(String[] args) {
        Dog bimDog = new Dog("Bim");
        Animal lucyCat = new Cat("LucyMiaw");
        Animal mouseMikey = new Mouse("Mickey mouse");
        lucyCat.eat();
        lucyCat.makeSound();

        bimDog.eat();
        bimDog.makeSound();

        mouseMikey.eat();
        mouseMikey.makeSound();
    }
}
