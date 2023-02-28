package in.neuron.main;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		System.out.println("Elements before Quick Sorting");
		
		display(a);
		
		quickSort(a,0,(a.length)-1);
		
		System.out.println("Elements after Quick Sorting");
		display(a);
		scan.close();
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}	
	}

	private static void quickSort(int[] a, int beg, int end) {
		
		
		if (beg<end) {
			int p = partition(a,beg,end);
			quickSort(a, beg, p-1);
			quickSort(a, p+1, end);
		}
		//return a;
	}

	private static int partition(int[] a, int beg, int end) {
		
		int pivot = a[end];
		int i = beg-1;
		
		for (int j = beg; j < end; j++) {
			if (a[j]<pivot) {
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				
			}
		}
		int temp = a[i+1];
		a[i+1] = a[end];
		a[end] = temp;
		return i+1;
	}

}
