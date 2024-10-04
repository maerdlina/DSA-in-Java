import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args){
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        List<Integer> forArray = new ArrayList<>();
        for(int i = 10; i >= 0; i--) forArray.add(i);
        list.addAll(forArray);
        System.out.println(list.pop());
        System.out.println(list.pop());
    }
}
