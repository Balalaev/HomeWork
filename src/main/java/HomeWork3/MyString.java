package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class MyString {

    String s;

    public MyString(String s) {
        this.s = s;
    }

    public String reverse() {
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            reverse += s.charAt(s.length() - i - 1);
        }
        return reverse;
    }

    public String isPalindrome() {
        String x;
        boolean result = s.equals(reverse());
        return x = String.valueOf(result);
    }

    public String longestPalindrome() {

        List<String> palindromeList = new ArrayList<>();
        String longestPal = "";

        for (int charIdx = 0; charIdx < s.length() - 1; charIdx++) {
            int start = charIdx - 1;
            int end = charIdx + 1;
            while (end < s.length() && s.charAt(charIdx) == s.charAt(end)) {
                end++;
            }
            charIdx = end - 1;
            while (start >= 0 && end < s.length()) {
                if (s.charAt(start) == s.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }
            if (end - start >= 3) {
                palindromeList.add(s.substring(start + 1, end));
            }
        }
        for (String palindrome : palindromeList) {
            longestPal = palindrome;
        }
        return longestPal;
    }

    public String isPalindrome(int left, int right) {

        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public String longestPalindrome4time() {
        if (s == null) return null;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String palindrome = isPalindrome(i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            palindrome = isPalindrome(i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }

    @Override
    public String toString() {
        return "This string is a palindrome? " + isPalindrome() +
                "\nLongest palindrome is = " + "\"" +  longestPalindrome() + "\"\n" +
                "Longest palindrome O(n^2) is = " + "\"" +  longestPalindrome4time() + "\"";
    }
}
