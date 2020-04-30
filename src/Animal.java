import java.util.Objects;

public class Animal {
    String species;
    double weight;

    public Animal(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 &&
                Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, weight);
    }
}
