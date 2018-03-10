import java.util.*;


class Sorts{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int nums[] = new int[sc.nextInt()];
		int i = 0;
		while(i != nums.length){
			nums[i] = sc.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(nums));
		
		selectSort(nums);
		System.out.println(Arrays.toString(nums));

		
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
	
	
	
	
}