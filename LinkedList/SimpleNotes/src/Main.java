public class Main {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(22, 2.1);
        theList.insertFirst(44, 10.9);
        theList.insertFirst(31, 0.99);
        theList.insertFirst(66, 99.0);

        theList.displayList();

        Link f = theList.find(44);
        if(f != null)
            System.out.println("Found link key " + f.iData);
        else
            System.out.println("Key not found!");
    }
}