import java.util.HashMap;

public class HashHash {
    public static void main(String[] args) {


        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("hetfo", 1);
        hmap.put("kedd", 2);
        hmap.put("szerda", 3);
        hmap.put("csutortok", 4);
        hmap.put("pentek", 5);
        hmap.put("szombat", 6);
        hmap.put("vasarnap", 7);

        for (String s : hmap.keySet()) {
            System.out.println(s + ": " + hmap.get(s));
        }
        for (Integer i : hmap.values()) {

            System.out.println(i + ": " + hmap);
        }
    }
}
