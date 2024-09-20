//Listing 2.5
public class Person {
    private int age;
    int nElems;

    public Person(int a){
        age = a;
        nElems = 0;
    }

    public void displayPerson(){
        System.out.println("Age: " + age);
    }

    public int getAge(){
        return age;
    }
}
