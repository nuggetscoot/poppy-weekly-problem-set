import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {


        char[] sChars = s.toCharArray(); //convert strings to char arrays
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars); //short char arrays
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars); // return true if arrays are equal
    }

}
