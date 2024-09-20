public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 40;
        arr[4] = 15;
        SelectionSort selectionSort = new SelectionSort(arr);
        System.out.println("Sorted!");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}