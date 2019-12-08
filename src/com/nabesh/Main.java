package com.nabesh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> contactList = new HashMap<String, Integer>();
        for(int i=0;i<n;i++){
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            contactList.put(name, phone);
        }
        while(in.hasNext()){
            String s=in.nextLine();
            System.out.println();
            if (contactList.containsKey(s)){
                System.out.println(s + " = " + contactList.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
