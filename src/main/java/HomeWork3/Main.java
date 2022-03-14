package HomeWork3;

public class Main {

    public static void main(String[] args) {

        MyString str = new MyString("1233321");
        MyString str2 = new MyString("546131664546654");

        System.out.println(str.isPalindrome());
        System.out.println(str.longestPalindrome());
        System.out.println(str.longestPalindrome4time());

        System.out.println(str2.isPalindrome());
        System.out.println(str2.longestPalindrome());
        System.out.println(str2.longestPalindrome4time());

    }
}