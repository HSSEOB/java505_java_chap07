import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        System.out.println("HashMap의 크기 : " + map.size());

        map.put("이지은", 30);
        map.put("유인나", 35);
        map.put("유재석", 50);
        map.put("강호동", 54);
        map.put("신동엽", 55);

        System.out.println("HashMap의 크기 : " + map.size());

        System.out.println("\t 강호동 : " + map.get("강호동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            int value = map.get(key);
            System.out.println("key : " + key + "\tvalue : "+value);
        }

        System.out.println();

        if (map.containsKey("김종국")){
            map.remove("김종국");
        }
        map.remove("신동엽");
        map.remove("강호동");
        System.out.println("HashMap의 크기 : " + map.size());

        map.clear();
        System.out.println("HashMap 의 크기 : " + map.size());

    }
}
