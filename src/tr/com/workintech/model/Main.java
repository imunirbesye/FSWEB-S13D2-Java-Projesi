package tr.com.workintech.model;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("------------------------");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("------------------------");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int sayi) {
        if(sayi < 0){
            sayi *= -1;
        }
        char[] textSayi =(String.valueOf(sayi)).toCharArray();
        String ters = "";

        for(int i = textSayi.length - 1; i >= 0; i--){
            ters += textSayi[i];
        }

        return ters.equals(String.valueOf(sayi));
    }

    public static boolean isPerfectNumber(int sayi){
        int sum = 0;

        for(int i = 1; i < sayi; i++){
            if(sayi % i == 0){
                sum += i;
            }
        }

        if(sum == sayi && sayi != 0)
            return true;
        else
            return false;
    }

    public static String numberToWords(int sayi){
        String[] numbersInWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        String[] numberArray = (String.valueOf(sayi)).split("");

        for (String numberInt : numberArray) {
            for (int j = 0; j < 10; j++) {
                String b = String.valueOf(j);
                if(Objects.equals(numberInt, b)){
                    result += numbersInWords[j] + " ";
                }
            }
        }

        return result;
    }
}