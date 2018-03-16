import java.util.*;
import java.lang.*;


class Sorts{
	
	public static void main(String args[]){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int nums[] = new int[sc.nextInt()];
		int i = 0;
		while(i != nums.length){
			nums[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(nums));
		
		//selectSort(nums);
		//insertionSort(nums);
		//bubbleSort(nums);
		//mergeSort(nums);*/
		int[] a = {2,4,6,8};
		int[] b = {1,3,5,7};
		int c[] = new int[a.length+b.length];
		
		c = Merge(a,b,c);
		
		System.out.println(Arrays.toString(c));
		
		int x = 5;
		

		
	}
	
	public static void selectSort(int[] a){
		int n = a.length;
		for(int i = 0; i < n-1; i++){
			int min_i = i;
			for(int j = i+1; j < n; j++){
				if(a[min_i] > a[j]){
					min_i = j;
				}
			}
			int temp = a[min_i];
				a[min_i] = a[i];
				a[i] = temp;
		}
		return;
		
	}
	
	public static void bubbleSort(int[] a){
		int n = a.length;
		for(int i = 0; i < n; i++){
			for(int j = 0;j<n-i-1;j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			} 
		}
		
		return;
	}
	
	static void insertionSort(int[] a){
		int n = a.length;
		for(int i = 1; i < n; i++){
			int val = a[i];
			int hole = i-1;
			while(hole>=0 && a[hole]>val){
				a[hole+1] = a[hole];
				hole--;
				
			}
			a[hole+1] = val;
		}
		return;
	}
	
	static void MergeSort(int[] a){
		
	}
	
	static int[] Merge(int[] L, int[] R, int[] A){
		int nL = L.length;
		int nR = R.length;
		
		int i, j, k;
		i = j = k = 0;
		
		while(nL > i && nR > j){
			if(L[i] > R[j]){
				A[k] = R[j];
				i++;
				k++;
				
			}else if(R[j] > L[i]){
				A[k] = L[i];
				j++;
				k++;
				
			}
		}
		while(i == nL && j < nR){
			A[k] = R[j];
			j++;
			k++;
		}
		while(i < nL && j == nR){
			A[k] = L[i];
			i++;
			k++;
		}
		return A;
		
		
	}
	
	
	
}
