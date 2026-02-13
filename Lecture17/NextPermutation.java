package Lecture17;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,1,5};
        nextPermutation(nums);
        for(int ele : nums) {
            System.out.println(ele);
        }
    }

    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        
        if(i>=0)
        {
            int j=n-1;
            while(nums[j]<=nums[i])
                j--;
            
            swap(nums,i,j);
        }
        
       reverse(nums,i+1,n-1); 
    }
    
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void reverse(int[] arr,int i,int j)
    {
        while(j>i)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
