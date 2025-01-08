package org.example;

public class stringpalindrome {

    public static boolean PalindromeChecker(String str){
      char[] charStr = str.toCharArray();
      int start =0;
      int end = charStr.length-1;

        while (start<end){
            if (charStr[start] != charStr[end]) {
                return false;
            }
                start++;
                end--;
        }
        return true;
    }

public static void main(String[] args) {

    String str = "sst";
    System.out.println(PalindromeChecker(str));
}
}
