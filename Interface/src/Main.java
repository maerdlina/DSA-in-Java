import java.util.ArrayList;
import java.util.TreeSet;
import java.lang.Comparable;
public class Main {
    public static void main(String[] args) {
        TreeSet<House> myHouseArrayList = new TreeSet<House>();
        House myHouse = new House(100, 500000, "Milan", true);
        //без compareTo в class House будет ошибка, тк TreeSet
        // не знает по какому критерию проводить сортировку
        // также нужно сделать implements Comparable<House>
        House firstHouse = new House(30, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);
        myHouseArrayList.add(myHouse);
        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);
        System.out.println("Sorted by Comparable by area: ");
        for (House h: myHouseArrayList) {
            System.out.println(h);
        }

        ArrayList<House> arrayListHouse = new ArrayList<>();

        House firstHouse1 = new House(100, 120000, "Tokyo", true);
        House secondHouse1 = new House(40, 70000, "Oxford", true);
        House thirdHouse1 = new House(70, 180000, "Paris", false);

        arrayListHouse.add(firstHouse1);
        arrayListHouse.add(secondHouse1);
        arrayListHouse.add(thirdHouse1);

        PriceComparator myPriceComparator = new PriceComparator();
        arrayListHouse.sort(myPriceComparator);
        System.out.println("Sorted by Comparator by price: ");
        for (House h: arrayListHouse) {
            System.out.println(h);
        }
    }
}