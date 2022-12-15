
public class SubArrayLengthK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {3,5,8,9,10,7};
		//find the maximum sum that any sub set of size 3 can give 
		int max = 0, sum = 0;
		
		for(int i= 0; i<3 ; i++)
			 sum+= array[i];

			
		
		for (int i=0; i< array.length-3; i++)
		{
			
				if(sum > max)
					max = sum;
				sum += array[i+3] - array[i]; 
		
		
			
		}
		
		System.out.println(max);
		
	}
	
	

}
