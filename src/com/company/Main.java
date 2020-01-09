package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
	// write your code here
        //Solution question1 = new Solution();
        Solution1 question2 = new Solution1();
        String[] partcipant = {"eden", "kiki", "eden"};
        String[] completion = {	"eden", "kiki"};
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book1 = {"123","456","789"};
        String[] phone_book2 = {"119", "97674223", "1195524421"};
//      String[] s1 = {"a"};
//      String[] s2 = {"b"};
//      String result1 = question1.solution(partcipant,completion);
        boolean result2 = question2.solution(phone_book2);
        System.out.println(result2);
    }
}