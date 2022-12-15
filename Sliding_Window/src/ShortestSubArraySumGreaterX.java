
public class ShortestSubArraySumGreaterX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6};
		//find the maximum sum that any sub set of size 3 can give 
		int min = 214121241, sum = 0, i = 0 , j = 0;
		int target = 11;
		
		while(j < array.length )
		{
			
			if (sum < target)
			{
				sum += array[j];
				j++;
				
				
			}
			else {
				if ( j-i < min)
					min = j-i;
				sum -= array[i];
				if (sum >= target)
					min--;
								
				i++;
				
			}
			System.out.println(sum);
			
		}
		System.out.println(min);
		
		
		
		
		
	}

}
