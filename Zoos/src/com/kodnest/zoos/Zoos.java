package com.kodnest.zoos;

import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String zoos = findZoos(s);
        System.out.println(zoos);
    }
    public static String findZoos(String s){
        int countZ = 0;
        int countO = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'z'){
                countZ++;
            }
            else{
                countO++;
            }
        }

        int y = 2 * countZ;
        if(y == countO){
            return "Yes";
        }
        return "No";
    }
}