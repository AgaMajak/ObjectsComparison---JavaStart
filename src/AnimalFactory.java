import java.util.Locale;
import java.util.Scanner;

public class AnimalFactory {
    private final Animal[] animals = new Animal[3];
    private int animalsIndex = 0;

    private Animal createAnimal() {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Podaj gatunek zwierzęcia: ");
        String species = scan.nextLine();
        System.out.print("Podaj wagę zwierzęcia (w kilogramach): ");
        double weight = scan.nextDouble();
        scan.nextLine();
        return new Animal(species, weight);
    }

    void createAndCompareAnimal() {
        int i = 0;
        while (animals.length > i) {
            Animal animal = createAnimal();
            if (animalsIndex == 0) {
                animals[animalsIndex] = animal;
                animalsIndex++;
            } else if (animalsIndex == 1 && !(animal.equals(animals[0]))) {
                animals[animalsIndex] = animal;
                animalsIndex++;
            } else if (animalsIndex == 2 && !(animal.equals(animals[0])) && !(animal.equals(animals[1]))) {
                animals[animalsIndex] = animal;
                animalsIndex++;
            } else {
                System.out.println("Dane zwierząt się powtarzają! Podaj nowe zwierzę.");
                continue;
            }
            i++;
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}

