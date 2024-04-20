package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea Orheiului 147", 3, 220);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxes);
        System.out.println(autoLux.address);
        System.out.println(autoLux.dimensionSqFt);

        autoLux.address = "Str. Voluntarilor";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfBoxes = 5;

        System.out.println("Informatii despre obiectul autoLux de pe adresa " + autoLux.address +
                " cu dimensiunea " + autoLux.dimensionSqFt + " si numarul de boxe " + autoLux.numberOfBoxes);

        Tool hummer011 = new Tool("Hummer");
        System.out.println(hummer011.material);
        System.out.println(hummer011.nameOfTheTool);

        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker ionelCelHarnic = new Worker("Ion");
        System.out.println(ionelCelHarnic.pricePerHour);
        ionelCelHarnic.yearsOfExperience = 5;
        System.out.println(ionelCelHarnic.yearsOfExperience);

        Worker marcel = new Worker();

        Car carLuiNicoleta = new Car("Ferrari", "Red", 3, 4500);
        System.out.println(carLuiNicoleta.make);

        Car carLuiAdrian = new Car("Mercedes", "black", 3, 5000);

        System.out.println(carLuiAdrian.colorOfTheCar);

    }
}
