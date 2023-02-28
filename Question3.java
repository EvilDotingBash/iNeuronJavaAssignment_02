package in.neuron.main;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		System.out.println("Elements before Bubble Sorting");
		display(a);
		
		bubbleSort(a);
		
		System.out.println("Elements after Bubble Sorting");
		display(a);
		
		scan.close();
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void bubbleSort(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) 
			for (int j = 0; j < a.length-i-1; j++) 
				if (a[j] > a[j+1]) {
					
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					
				}
	}
}
