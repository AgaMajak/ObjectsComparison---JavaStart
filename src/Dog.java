import java.util.Objects;

public class Dog {
    private String name;
    private double age;

    Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.age, age) == 0 &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gatunek='" + name + '\'' +
                ", waga=" + age +
                "kg}";
    }
}
