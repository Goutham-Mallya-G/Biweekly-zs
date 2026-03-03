package Biweekly3;

public class Program3 {
    public static void main(String[] args) {
        int[] days = new int[]{7,6,4,3,1};
        System.out.println(profit(days));
    }
    private static int profit(int[] days){
        int ans = 0;
        int buy = days[0];
        for(int day : days){
            if(day < buy){
                buy = day;
            }else{
                ans = max(ans , day - buy);
            }
        }
        return ans;
    }
    private static int max(int a , int b){
        if(a > b) return a;
        return b;
    }

}
