package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String word = "abcdce";

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (Character c : word.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Character key : map.keySet()) {

            if (map.get(key) > 1) {
                System.out.println("First Repeated Character Is: " + key);
                break;
            }


        }
    }
}
