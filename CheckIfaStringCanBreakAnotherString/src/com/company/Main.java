package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean checkIfCanBreak(String s1, String s2) {
        char[] str_arr1 = s1.toCharArray();
        char[] str_arr2 = s2.toCharArray();

        Arrays.sort(str_arr1);
        Arrays.sort(str_arr2);

        boolean valid = true;
        for(int i = 0; i < str_arr1.length; i++) {
            if(str_arr1[i] < str_arr2[i]) {
                valid = false;
            }
        }
        if(valid) return true;

        valid = true;
        for(int i = 0; i < str_arr2.length; i++) {
            if(str_arr2[i] < str_arr1[i]) {
                valid = false;
            }
        }
        if(valid) return true;
        else return false;
    }
}
