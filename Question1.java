package in.neuron.main;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the size of array");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter "+n+" elements in array");
		        for (int i = 0; i < n; i++)
		            arr[i] = sc.nextInt();
		        Question1 Obj = new Question1();
		        Obj.duplicates(arr);
		        sc.close();
	}
	public void duplicates(int[] arr) {
		int j,k,t=-1;    
		System.out.println("Duplicate Elements present in array are :: ");
		for(j=0;j<arr.length;j++)
		{
			for(k=j+1;k<arr.length;k++)
			{
				if(arr[j]==arr[k])
				{
					System.out.println(arr[k]);
					t++;
				}
		    }
		}
		if (t == -1) {
			System.out.println("Sorry, No Duplicates element present ");
		}
	}
}