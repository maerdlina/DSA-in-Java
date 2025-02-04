import java.util.HashMap;
import java.util.Map;

public class HashMapMy {
    public static void main(String[] args){
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Gianni", "02.04.2003");
        myHashMap.put("John", "20.07.2006");
        myHashMap.put("Yasu", "10.09.1996");
        myHashMap.put("Donato", "02.11.1990");
        myHashMap.put("Luca", "16.04.1980");

        for(Map.Entry<String, String> entry: myHashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
