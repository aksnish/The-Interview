package CTCI;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String array[] = new String[num];
        for(int i = 0; i<num; i++){
            array[i]= scan.next();
            System.out.println(array[i]);
        }
        for(String s: array){
            char [] charArray = s.toCharArray();
            String strEven = "";
            String strOdd = "";
            for(int j = 0; j < charArray.length; j++){
                if(j%2 == 0){
                	strEven += charArray[j];
                }else{
                	strOdd += charArray[j];
                }
            }
            System.out.println(strEven+" "+strOdd);
        }
    }
}
