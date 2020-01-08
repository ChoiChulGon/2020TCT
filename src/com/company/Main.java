package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Solution obj = new Solution();
        String[] partcipant = {"eden", "kiki", "eden"};
        String[] completion = {	"eden", "kiki"};
//        String[] s1 = {"a"};
//        String[] s2 = {"b"};
        String result = obj.solution(partcipant,completion);
        System.out.println(result);

        HashMap<String, Integer> map = new HashMap<String,Integer>();
    }
}