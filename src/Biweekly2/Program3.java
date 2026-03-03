package Biweekly2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String s = sc.nextLine();
        System.out.println(frogs(s));
    }
    private static int frogs(String s){
        if(s.length() % 5 != 0) return -1;
        if(!isValid2(s)) return -1;
        int count = 1;
        int i = 0;
        while(i != s.length()){
            count += checkSound(s , i);
            i+=5;
        }
        return count;
    }

    private static boolean isValid2(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            if(ch == 'c'){
                freq[2]++;
            }
            else if(ch == 'r'){
                if(freq[17] != freq[2]-1) return false;
                freq[17]++;
            }else if(ch == 'o'){
                if(freq[14] != freq[17]-1) return false;
                freq[14]++;
            }else if(ch == 'a'){
                if(freq[0] != freq[14]-1) return false;
                freq[0]++;
            }else if(ch == 'k'){
                if(freq[10] != freq[0]-1) return false;
                freq[10]++;
            }
        }
        return true;
    }
    private static int checkSound(String s, int i){
        int count = 0;
        for(int ind = i ; ind < i+5 ; ind++){
            if(s.charAt(ind) == 'c'){
                count++;
            }
        }
        if(count != 0)return count-1;
        return 0;
    }
}