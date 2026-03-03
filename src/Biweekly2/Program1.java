package Biweekly2;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        String str = "Keep calm and carry on";
        System.out.println(sortStr(str));
    }
    private static String sortStr(String str){
        str.toLowerCase();
        String[] arr = str.split(" ");
        Arrays.sort(arr , (a,b) -> a.length() - b.length());
        StringBuilder ans = new StringBuilder();
        for(String s : arr){
            ans.append(s + " ");
        }
        String res = ans.toString().trim();
        res = ((char)(res.charAt(0)-32)) + res.substring(1);
        return  res;
    }
}
