import java.util.HashMap;
import java.util.Map;

public class CallByReference.java {

    public static void main(String[] args) {
        System.out.println(111111);
        fxxk1();
    }

    private static void fxxk1() {
        Map<Integer, String> fxxk = new HashMap<Integer, String>(2);
        fxxk.put(0, "素晴らしい格納");
        Map<Integer, String> viewMap = fxxk();
        int i = 0;
        while (i < viewMap.size()) {
            System.out.println(viewMap.get(i));
            i++;
        }
    }

    private static Map<Integer, String> fxxk() {
        Map<Integer, String> map = new Map<Integer, String>();
        map.put(0, "fxxk格納");
        map.put(1, "fxxk2格納");
    }

}
