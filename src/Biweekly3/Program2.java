package Biweekly3;

public class Program2 {
    public static void main(String[] args) {
        String str = "11106";
        System.out.println(decodeCount(str));
    }
    private static int decodeCount(String str){
        if(str.charAt(0) == '0') return 0;
        return helper(str , 0);
    }
    private static int helper(String str, int ind){
        if(ind == str.length()) return 1;
        if(ind > str.length()) return 0;

        return helper(str, ind+1) + helper(str , ind+2);
    }
}
