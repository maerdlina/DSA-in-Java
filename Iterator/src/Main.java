import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<String>();

        System.out.println("Adding element into hashSet...");
        hashSet.add("Charlie");
        hashSet.add("Delta");
        hashSet.add("Alpha");
        hashSet.add("Echo");
        hashSet.add("Bravo");

        hashSet.remove("Alpha");

        Iterator<String> i = hashSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}