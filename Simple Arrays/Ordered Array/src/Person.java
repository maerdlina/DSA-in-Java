//Listing 2.5
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson(){
        System.out.println("LN: " + lastName);
        System.out.println("FN: " + firstName);
        System.out.println("Age: " + age);
    }

    public String getLast(){
        return lastName;
    }
}
