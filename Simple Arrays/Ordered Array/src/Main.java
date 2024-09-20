public class Main {
    /*public static void main(String[] args) {
        int[] a = {0, 1, 3, 10, 21, 22, 24, 34, 33, 67, 100};
        BinarySearch bs = new BinarySearch(a);
        bs.find(3);
        System.out.println(bs.find(21));
    }*/
    public static void main(String[] args) {
        ClassDataArray arr;
        int max = 10;
        arr = new ClassDataArray(max);

        arr.insert("Sholz", "James", 21);
        arr.insert("Versace", "Gianni", 55);
        arr.insert("Durov", "Pavel", 39);
        arr.insert("Sholz", "Tomas", 21);
        arr.insert("Domenicos", "Gianni", 55);
        arr.insert("Klost", "Pavel", 39);
        arr.insert("Versace", "Giovanni", 23);
        arr.insert("Versace", "Goko", 53);

//        arr.displayA();
//        System.out.println("--------------------------------");
//        String searchKey = "Durov";
//        Person person;
//        person = arr.find(searchKey);
//        if(person == null){
//            System.out.println("Person not found!");
//        } else{
//            System.out.println("Found!");
//            String last = person.getLast();
//            System.out.println(last);
//        }
//
//        System.out.println("--------------------------------");
//
//        String deleteKey;
//        deleteKey = "Versace";
//        arr.delete(deleteKey);
//        arr.displayA();

        System.out.println("new new new new new new new new");
        arr.noDupsLastName();
        arr.displayA();
    }
}