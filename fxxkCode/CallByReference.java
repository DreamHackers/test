import java.util.HashMap;
import java.util.Map;

public class CallByReference {

    public static void main(String[] args) {
        System.out.println(1111112);
        fxxk1();
    }

    private static void fxxk1() {
        Map<Integer, String> fxxk = new HashMap<Integer, String>(2);
        fxxk.put(0, "素晴らしい格納");
        Map<Integer, String> viewMap = fxxk();
        int i = 0;
        while (i < viewMap.size()) {
            System.out.println(viewMap.get(i));
        	System.out.println("foo");
            i++;
        }
    }

    private static Map<Integer, String> fxxk() {
        Map<Integer, String> map = new Map<Integer, String>();
        map.put(0, "fxxk格納");
        map.put(1, "fxxk2格納");
        return map;
    }
