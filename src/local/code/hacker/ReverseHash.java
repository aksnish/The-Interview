package local.code.hacker;

import java.util.Scanner;

public class ReverseHash {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(n-i-2<j){	
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
