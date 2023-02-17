import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
            Map<Character, Integer> charFreq = new HashMap<>();
    
            for (char c : str.toCharArray()) {
                charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
            }
    
            char mostCommon = ' ';
            int maxFreq = 0;
            for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    mostCommon = entry.getKey();
                }
            }
    
            return mostCommon;
        }
    }
