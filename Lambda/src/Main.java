import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Mo", 15));
        people.add(new Person("Gianni", 21));
        people.add(new Person("Jin Cu", 32));

        Collections.sort(people, (p1, p2) -> p1.age - p2.age);

        System.out.println(people); // [Bob (25), Alice (30), Charlie (35)]
    }
}
