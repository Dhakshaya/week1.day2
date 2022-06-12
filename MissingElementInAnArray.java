package week1.day2;
import java.util.Arrays;   

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};			
		Arrays.sort(arr);  	
		int length1 = arr.length;		//length = 6
		for(int i=0; i<length1; i++)			
		{				
			
			
			if(i!=arr[i])
			{
				System.out.println(arr[i]);
				break;
		
			}
			
			
		}
	
	}

}
