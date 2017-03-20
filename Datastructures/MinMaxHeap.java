package Datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMaxHeap {

	public static void addNumber(int number, PriorityQueue<Integer> lowersMaxH, PriorityQueue<Integer> highersMinH){
		if(lowersMaxH.size() == 0 || number < lowersMaxH.peek()){
			lowersMaxH.add(number);
		}
		else{
			highersMinH.add(number);
		}
	}

	public static void rebalance(PriorityQueue<Integer> lowersMaxH, PriorityQueue<Integer> highersMinH){
		PriorityQueue<Integer> biggerH = lowersMaxH.size() > highersMinH.size() ? lowersMaxH : highersMinH;
		PriorityQueue<Integer> smallerH = lowersMaxH.size() > highersMinH.size() ? highersMinH : lowersMaxH;

		if((biggerH.size() - smallerH.size()) >= 2){
			smallerH.add(biggerH.poll());
		}

		//		if(biggerH.size() == smallerH.size() || (biggerH.size() - smallerH.size()) == 1){
		//			return;
		//		}
		//		else{
		//			smallerH.add(biggerH.poll());
		//		}
	}

	//if different size heaps, pull the top element from larger heap, if smaller size average their tops
	public static double getMedian(PriorityQueue<Integer> lowersMaxH, PriorityQueue<Integer> highersMinH){
		PriorityQueue<Integer> biggerH = lowersMaxH.size() > highersMinH.size() ? lowersMaxH : highersMinH;
		PriorityQueue<Integer> smallerH = lowersMaxH.size() > highersMinH.size() ? highersMinH : lowersMaxH;
		if(biggerH.size() == smallerH.size()){
			//very common bug in languages like java,
			//where in integer division it truncates the double,
			//hence cast that to double and then divide
			return ((double)biggerH.peek() + smallerH.peek()) /2;
		}else{
			return biggerH.peek();
		}
	}

	public static double [] getMedian(int [] array){
		//Max heap construction, with a custom comparator
		PriorityQueue<Integer> lowersMaxH = new PriorityQueue<Integer>(new Comparator<Integer>() {
			//change comparision to put max element on top
			public int compare (Integer a, Integer b){
				return -1 * a.compareTo(b);
			}
		});
		//min heap
		PriorityQueue<Integer> highersMinH = new PriorityQueue<Integer>();

		double [] medians = new double[array.length];
		for(int i = 0; i< array.length; i++){
			int number = array[i];
			addNumber(number, lowersMaxH, highersMinH);
			rebalance(lowersMaxH, highersMinH);
			medians[i] = getMedian(lowersMaxH, highersMinH);
		}
		return medians;

	}

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		double [] medians = getMedian(array);
		for(int i = 0; i< medians.length; i++){
			System.out.println(medians[i]);
		}
	}
}
