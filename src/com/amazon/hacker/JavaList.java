package com.amazon.hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d=0;
		ArrayList[] set = new ArrayList[n];
        for(int i=0; i<n ; i++){
        	d = in.nextInt();
        	set[i] = new ArrayList();
        	for(int j =0; j<d; j++){
        		set[i].add(in.nextInt());
        	}
        }
		int q = in.nextInt();
		for(int i =0; i<q;i++){
			if(in.nextLine().equals("Insert")){
				int x = in.nextInt();
				int y = in.nextInt();
				set[x-1].get(y-1);
			}
			else if(in.nextLine().equals("Delete")){
				int x = in.nextInt();
				int y = in.nextInt();
				set[x-1].remove(y);
			}
		}
		System.out.println();
	}
}
