import java.util.Locale;
import java.util.Scanner;

public class AnimalFactory {

    public Animal createAnimal() {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Podaj gatunek zwierzęcia: ");
        String species = scan.nextLine();
        System.out.print("Podaj wagę zwierzęcia (w kilogramach): ");
        double weight = scan.nextDouble();
        scan.nextLine();
        Animal animal = new Animal(species, weight);
        return animal;
    }
}

