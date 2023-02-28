package in.neuron.main;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		System.out.println("Elements before Merge Sorting");
		display(a);
		
		mergeSort(a,0,a.length-1);
		
		System.out.println("Elements after Merge Sorting");
		display(a);
		
		scan.close();
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void mergeSort(int[] a, int beg, int end) {
		
		if (beg<end) {
			int mid = (beg+end)/2;
			mergeSort(a, beg, mid);
			mergeSort(a, mid+1, end);
			merge(a,beg,mid,end);
		}
		
	}

	private static void merge(int[] a, int beg, int mid, int end) {
		
		int n1 = (mid-beg)+1;
		int n2 = end - mid;
		
		int l[] = new int[n1];
		int r[] = new int[n2];
		
		int i,j,k;
		
		for (i = 0; i < l.length; i++) {
			l[i] = a[beg+i];
		}
		for (i = 0; i < r.length; i++) {
			r[i] = a[mid+1+i];
		}
		i=0;j=0;
		k = beg;
		
		while (i<n1 && j<n2) {
			if (l[i]<=r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] =  r[j];
				j++;
			}
			k++;
		}
		while (i<n1) {
			a[k] = l[i];
			i++;
			k++;
		}
		while (j<n2) {
			a[k] = r[j];
			j++;
			k++;
		}
	}
}
