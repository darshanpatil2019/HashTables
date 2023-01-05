import java.util.HashMap;

public class FindFrequencyOfWord {

    public static void main(String[] args) {

        String string ="To be or not to be";
        char[] array = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : array) {
            if (hashMap.containsKey(c)) {
                int count = hashMap.get(c);
                hashMap.put(c, count + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);
    }
}