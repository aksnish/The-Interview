package com.amazon.attempt;

public class BucketSortTwo{
    public static void sort(int[] a, int maxVal){
        int [] bucket=new int[maxVal+1];
        for (int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }
        for (int i=0; i<a.length; i++){
            bucket[a[i]]++;
        }
        int outPos=0;
        for (int i=0; i<bucket.length; i++){
            for (int j=0; j<bucket[i]; j++){
                a[outPos++]=i;
            }
        }
    }

    public static void main(String[] args){
        int [] data= {1,0,1,2,3,1,0,3,1,0,1,3}; //ArrayUtil.randomIntArray(10,maxVal+1);
        int maxVal = 0;
        for(int i=0; i< data.length; i++){
        	if(data[i] > maxVal){
        		maxVal = data[i];
        	}
        }
        sort(data,maxVal);
        for(int i : data){
        	System.out.print(i);
        }
    }

}
