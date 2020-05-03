package logic;

import data.Dog;

import java.util.Scanner;

public class DogFactory {
    private final Dog[] dogs = new Dog[3];
    private int dogsIndex = 0;

    private Dog createAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scan.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scan.nextInt();
        scan.nextLine();
        return new Dog(name, age);
    }

    private boolean checkIfExists(Dog[] dogs, Dog dog){
        for (int j = 0; j < dogsIndex; j++) {
            if (dogs[j].equals(dog)) {
                return true;
            }
        }
        return false;
    }

    public void createAndCompareAnimal() {
        int i = 0;
        while (dogs.length > i) {
            Dog dog = createAnimal();
            if (checkIfExists(dogs,dog)) {
                System.out.println("Dane psów się powtarzają! Podaj informacje dotyczące nowego psa.");
                continue;
            } else{
                dogs[dogsIndex] = dog;
            }
            dogsIndex++;
            i++;
        }
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
