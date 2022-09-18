import java.util.HashMap;
import java.util.Set;

public class WordsChecker {
    protected String text;
    HashMap<String, Integer> map = new HashMap<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord() {
        String[] item = text.split("\\P{IsAlphabetic}+");
        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        Set<String> keysPack = map.keySet();
        for (String key : keysPack) {
            if (map.get(key) > 1) {
                System.out.println(key + " - " + map.get(key));
            }
        }
        return true;
    }
}
