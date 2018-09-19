import java.util.*;

class Lab4
{
    public static int[] sort(int nums[])
    {
        int n = nums.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (nums[j] < nums[min])
                    min = j;

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        
        return nums;
    }
    
    public static void main (String[] args){
    int num1[] = new int[]{10,9,8,7,6,5,4,3,2,1};
    int num2[] = new int[]{2,8,6,4,1};
    int num3[] = new int[]{1,2,3,4,5};
    int num4[] = new int[]{8,5,4,6,7};
    int num5[] = new int[]{1028,256,512,2056,768};
    
    num1 = sort(num1);
    num2 = sort(num2);
    num3 = sort(num3);
    num4 = sort(num4);
    num5 = sort(num5);
    
    System.out.println(Arrays.toString(num1));
    System.out.println(Arrays.toString(num2));
    System.out.println(Arrays.toString(num3));
    System.out.println(Arrays.toString(num4));
    System.out.println(Arrays.toString(num5));
    
    }
    }