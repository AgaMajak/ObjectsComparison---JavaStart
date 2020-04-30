import java.util.Objects;

public class Animal {
    private final String species;
    private final double weight;

    Animal(String species, double weight) {
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

    @Override
    public String toString() {
        return "Animal{" +
                "gatunek='" + species + '\'' +
                ", waga=" + weight +
                "kg}";
    }
}
