package Biweekly2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine();
        System.out.println();
        System.out.println(shortestPalindrom(s));
    }
    private static String shortestPalindrom(String s){
        int i = 0;
        int j = s.length()-1;
        while(!isPalindrome(s , i, j)){
            j--;
        }
        String rev = reverse(s.substring(j+1));
        return rev + s;
    }
    private static boolean isPalindrome(String s , int i, int j) {
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    private static String reverse(String s){
        int i = 0;
        int j =s.length()-1;
        char[] arr = s.toCharArray();
        while(i <= j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
