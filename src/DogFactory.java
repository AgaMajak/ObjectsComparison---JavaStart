import java.util.Scanner;

public class DogFactory {
    private final Dog[] dogs = new Dog[3];
    private int dogsIndex = 0;

    private Dog createAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scan.nextLine();
        System.out.print("Podaj wiek: ");
        double age = scan.nextInt();
        scan.nextLine();
        return new Dog(name, age);
    }

    void createAndCompareAnimal() {
        int i = 0;
        while (dogs.length > i) {
            Dog dog = createAnimal();
            if (dogsIndex == 0) {
                dogs[dogsIndex] = dog;
            } else if (dogsIndex == 1 && !(dog.equals(dogs[0]))){
                dogs[dogsIndex] = dog;
            } else if (dogsIndex == 2 && !(dog.equals(dogs[0])) && !(dog.equals(dogs[1]))) {
                dogs[dogsIndex] = dog;
            } else {
                System.out.println("Dane psów się powtarzają! Podaj informacje dotyczące nowego psa.");
                continue;
            }
            dogsIndex++;
            i++;
        }
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}

