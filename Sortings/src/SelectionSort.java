public class SelectionSort {
    public void swap(int[] arr, int i, int j){
        int var = arr[i];
        arr[i] = arr[j];
        arr[j] = var;
    }
    public SelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min != i)
                swap(arr, i, min);
        }
    }
}
