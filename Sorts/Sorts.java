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
		int[] a = {9,8,7,6,5,4,3,2,1};//{1,2,3,4,5,6,7,8,9,11,23,45,67,89,90,91,92};
		int[] b = {2,3,4,5,6,7,8,12,23,34,56,58};
		int c[] = new int[a.length+b.length];
		
		qsort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));
		
		//c = merge(a, a.length,b, b.length);
		
		//System.out.println(Arrays.toString(c));
		
		int x = 5;
		

		
	}
	
	public static void qsort(int[] arr, int start, int end){
		if(start < end){
			
			int pindex = partition(arr, start, end);
			qsort(arr, start, pindex - 1);
			qsort(arr, pindex + 1, end);
		}
		return;
	}

	public static int partition(int[] arr, int start, int end){
		//choose a pivot
		int pivot = arr[end];
		System.out.println(Arrays.toString(arr));
		//start scanning
		int p_i = start;
		for(int i = start; i < end; i++){
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i] = arr[p_i];
				arr[p_i] = temp;
				p_i++;
			}
		}
		int t = arr[end];
		arr[end] = arr[p_i];
		arr[p_i] = t;
		return p_i;
		
		
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
				//push elements up as needed
				a[hole+1] = a[hole];
				hole--;
				
			}
			a[hole+1] = val;
		}
		return;
	}
	
	static void MergeSort(int[] a){
		int n = a.length;
		if(n <2){return;}
		int mid = n/2;
		int[] l = new int[mid];
		int[] r = new int[n-mid];
		
		for(int i = 0;i <mid;i++){
			l[i] = a[i];
		}
		for(int i = 0;i <r.length;i++){
			r[i] = a[mid+i];
		}
		MergeSort(l);
		MergeSort(r);
		merge(l, l.length,r, r.length, a);
		System.out.println("l :"  + Arrays.toString(l)+ " r: " + Arrays.toString(r));
		
	}
	
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n,int[] a) {
        //int[] a = new int[m+n];
        
        System.out.println("m "+ m+ " n "+ n);
        
        int ml, nl, al;
        ml = al = nl = 0;
        //m = a.length - n;
        
        while(ml < m && nl < n){
            if(nums1[ml] >= nums2[nl]){
                a[al] = nums2[nl];
                nl++;
            }else if(nums1[ml] <= nums2[nl]){
                a[al] = nums1[ml];
                ml++;
            }
            al++;
        }
        
        if(ml == m && nl == n){
            return a;
        }
        System.out.println("size of a: "+a.length);
        while(nl < n){
            System.out.println("BEFORE: m "+ m+ " n "+ n+" ml "+ml+" nl "+nl+" al "+al);
 //           System.out.println(a[0] + " " + a[1]);
            a[al] = nums2[nl];
            nl++;
            al++;
            System.out.println("AFTER: m "+ m+ " n "+ n+" ml "+ml+" nl "+nl+" al "+al);
//            System.out.println(a[0] + " " + a[1]);
        }
        while(ml < m){
            a[al] = nums1[ml];
            ml++;
            al++;
        }
        return a;
    }
	
	
	
}
