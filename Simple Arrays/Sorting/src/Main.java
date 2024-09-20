public class Main {
    public static void main(String[] args) {
        ClassDataArray arr = new ClassDataArray(5);
        arr.insert(2);
        arr.insert(4);
        arr.insert(3);
        arr.insert(1);
        arr.insert(5);
        arr.displayA();

        arr.insertionSort();
        arr.displayA();
    }
}