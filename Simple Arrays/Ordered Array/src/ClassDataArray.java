public class ClassDataArray {
    private Person[] pers;
    private int nElems;

    public ClassDataArray(int max){
        pers = new Person[max];
        nElems = 0;
    }

    public Person find(String searchLastName){
        for(int j = 0; j < nElems; j++){
            if(pers[j].getLast().equals(searchLastName)) {
                return pers[j]; // Return the found person immediately
            }
        }
        return null; // If no match is found, return null
    }

    public void insert(String last, String first, int age){
        pers[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchLastName){
        boolean ans = true;
        int j;
        for(j = 0; j < nElems; j++){
            if(pers[j].getLast().equals(searchLastName)) break;
        }
        if(j == nElems){
            ans = false;
        } else{
            for(int i = j; i < nElems - 1; i++){ // Fix off-by-one error
                pers[i] = pers[i + 1];
            }
            nElems--;
            ans = true;
        }
        return ans;
    }

    public void displayA(){
        for(int j = 0; j < nElems; j++){
            pers[j].displayPerson();
            System.out.println("--->");
        }
    }
    public void noDupsLastName() {
        // Создаем временный массив для хранения уникальных элементов
        Person[] temp = new Person[nElems];
        int tempIndex = 0;

        for (int i = 0; i < nElems; i++) {
            String searchLastName = pers[i].getLast();
            boolean isDuplicate = false;

            // Проверяем, есть ли уже такая фамилия в временном массиве
            for (int j = 0; j < tempIndex; j++) {
                if (temp[j].getLast().equals(searchLastName)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Если фамилия уникальна, добавляем в временный массив
            if (!isDuplicate) {
                temp[tempIndex] = pers[i];
                tempIndex++;
            } else {
                System.out.println("We already have: " + searchLastName);
            }
        }

        // Копируем уникальные элементы обратно в оригинальный массив
        for (int i = 0; i < tempIndex; i++) {
            pers[i] = temp[i];
        }

        // Обновляем размер массива
        nElems = tempIndex;

        // Устанавливаем оставшиеся элементы в null (если нужно)
        for (int i = nElems; i < pers.length; i++) {
            pers[i] = null;
        }
    }



}
