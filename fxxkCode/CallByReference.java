import java.util.HashMap;
import java.util.Map;

public class CallByReference {

    public static void main(String[] args) {
        System.out.println(111111);
        fxxk1();
    }

    private static void fxxk1() {
        Map<Integer, String> fxxk = new HashMap<Integer, String>(2);
        fxxk.put(0, "素晴らしい格納");
        fxxk(fxxk);
        int i = 0;
        while (i < fxxk.size()) {
            System.out.println(fxxk.get(i));
            i++;
        }
    }

    public static void fxxk(Map<Integer, String> map) {
        map.put(0, "fxxk格納");
        map.put(1, "fxxk2格納");
    }

}
