
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in) {
        String vowels = "aeiouAEIOU";
        String pigLatin = "";
        int index = 0;
        while (index < in.length() && !vowels.contains("" + in.charAt(index))) {
            index++;
        }
        if (index == 0) {
            pigLatin = in + "way";
        } else if (index == in.length()) {
            pigLatin = in + "ay";
        } else {
            String start = in.substring(0, index);
            String end = in.substring(index);
            pigLatin = end + start + "ay";
        }
        return pigLatin;
    }
}