package in.neuron.main;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		System.out.println("Elements before Selection Sorting");
		display(a);
		
		selectionSort(a);
		
		System.out.println("Elements after Selection Sorting");
		display(a);
		
		scan.close();
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void selectionSort(int[] a) {
		
		int l;
		for (int i = 0; i < a.length-1; i++) {
			l = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[l])
					l = j;
			}
			int t = a[l];
			a[l] = a[i];
			a[i] = t;
		}
		
	}
}
