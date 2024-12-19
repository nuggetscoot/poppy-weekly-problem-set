class isPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) { //takes care of test case 3
            return true;
        }
        int start = 0; // first pointer, starts at beginning of string
        int last = s.length() - 1; // second pointer, starts at end of string
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last); // cycles through all chars
            if (!Character.isLetterOrDigit(currFirst )) { // checks that char is an alphanumeric number
                start++; // if not alphanumeric, skips over it
            } else if (!Character.isLetterOrDigit(currLast)) { // same thing as line 11 but in reverse
                last--; // same thing as line 12 but in reverse
            } else {
                if (Character.toLowerCase(currFirst)  != Character.toLowerCase(currLast)) {
                    return false; // if strings are not equal, it is not a palindrome
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
