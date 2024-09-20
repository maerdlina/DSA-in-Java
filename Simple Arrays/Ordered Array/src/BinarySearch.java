public class BinarySearch {
    private final int[] array;

    BinarySearch(int[] a){
        this.array = a;
    }
    public String find(long searchKey){
        int lowerBound = 0;
        int upperBound = array.length - 1;

        int curIn;
        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(array[curIn] == searchKey)
                return "index of searchKey: " + String.valueOf(curIn);
            else if(lowerBound > upperBound)
                return "index of searchKey didn't found";
            else{
                if(array[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
}
