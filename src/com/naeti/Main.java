package com.naeti;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();

        a.empty()
        a.equals(b);

    }

    public int countElements(int[] arr) {
        HashMap<Integer,Integer> hashTable = new HashMap<>();
        int ret = 0;
        for(int num : arr) {
            hashTable.put(num, hashTable.getOrDefault(num,0) + 1);

        }

        for(int num : arr) {
            int flag = hashTable.getOrDefault(num + 1 ,0);
            if(flag != 0) {
                ret += 1;
            }
        }


        return ret;
    }

}
