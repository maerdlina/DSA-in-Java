public class ClassDataArray {
    private Person[] pers;
    private int nElems;

    public ClassDataArray(int max){
        pers = new Person[max];
        nElems = 0;
    }

    public void swap(int one, int two){
        Person temp = pers[one];
        pers[one] = pers[two];
        pers[two] = temp;
    }

    public void insert(int age){
        pers[nElems] = new Person(age);
        nElems++;
    }

    public void displayA(){
        for(int j = 0; j < nElems; j++){
            pers[j].displayPerson();
            System.out.println("--->");
        }
    }

    public void selectionSort() {
        int out, in, minIndex;
        for (out = 0; out < nElems - 1; out++) {
            minIndex = out; // Start with the first element as the minimum
            for (in = out + 1; in < nElems; in++) { // Change to nElems
                if (pers[in].getAge() < pers[minIndex].getAge()) {
                    minIndex = in; // Update minIndex to the new minimum
                }
            }
            swap(out, minIndex); // Swap the found minimum element with the first element
        }
    }

    public void insertionSort() {
        if (nElems == 0) return; // Проверка на пустой массив
        int in, out;
        for (out = 1; out < nElems; out++) {
            Person temp = pers[out];
            in = out;
            while (in > 0 && pers[in - 1].getAge() >= temp.getAge()) {
                pers[in] = pers[in - 1];
                --in;
            }
            pers[in] = temp;
        }
    }


}
