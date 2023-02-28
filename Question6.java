package in.neuron.main;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array :: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the "+n+" elements of 1st array");
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array :: ");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter the "+m+" elements of 2nd array :: ");
		for (int i = 0; i < b.length; i++) {
			b[i]= sc.nextInt();
		}
		subset(a,b);
		sc.close();
	}

	private static void subset(int[] a, int[] b) {
		boolean flag = false;
		if (a.length<b.length) {
			for (int i = 0; i < a.length; i++) {
				flag = false;
				for (int j = 0; j < b.length; j++) {
					if (a[i]==b[j]) {
						flag=true;
					}
				}
				if (!flag) {
					break;
				}	
			}
			if (flag) {
				System.out.println("Array 1 is subset of array 2");;
			} else {
				System.out.println("Array are not subset");
			}
		} else {
			for (int i = 0; i < b.length; i++) {
				flag = false;
				for (int j = 0; j < a.length; j++) {
					if (a[j]==b[i]) {
						flag=true;
					}
				}
				if (!flag) {
					break;
				}	
			}
			if (flag) {
				System.out.println("Array 2 is subset of array 1");;
			} else {
				System.out.println("Arrays are not subset");
			}
		}
	}
}