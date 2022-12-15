import java.util.Arrays;

public class ArrayList {
	
	private int  capacity, size;
	private int[] array;



	ArrayList() {
		capacity = 10;
		array = new int[capacity];
		size = 0;
	}
	
	void addInteger(int input)
	{
//		if (size >= capacity) 
		if(size >= capacity) {
			capacity *= 2; //Grow
			int[] tmpArray = array;
			//System.out.println(Arrays.toString(tmpArray));
			
			array = new int[capacity];
			//System.out.println(Arrays.toString(array));
			System.arraycopy(tmpArray,0,array,0,size);
			//System.out.println(Arrays.toString(array));
			//System.out.println(size + "-" + capacity);
			
			array[size++] = input;
			System.out.println(size + "-" + capacity);
			return;
			
		}
		
		
		array[size++] = input;
		System.out.println(size + "-" + capacity);
	}
	
	
	int pop()
	{
	
		//System.out.println(size);
		
		size--;
		int toReturn = array[size];
		System.out.println("Before Pop: " + Arrays.toString(array));
		
		array[size]=0;
		 
		System.out.println("After Pop: " + Arrays.toString(array));
		
		return toReturn;		
	}
	
	int remove(int index)
	{		
		if(index >= size)
			return -1;
		
		int toRemove = array[index];

		for (int i = index ; i < size - 1; i++)
		{
			array[i]= array[i+1];
		}
		size--;
		System.out.println("After remove: "+ Arrays.toString(array));
		return toRemove;
		
		
	}
	
	int find(int toSearch)
	{
		for(int i = 0 ; i < size; i++)
			if(array[i] == toSearch)
				return i;
		
		return -1;
	}
	
	int findElementbyIndex(int index)
	{
		if(index >= size)
			return -1;
		
		return array[index];
	}
	
	
	boolean insert(int index, int value)
	{
		if(index > size)
			return false;
		
		array[index] = value;
		return true;
	}
	
	int getSize()
	{
		return size;
	}

	@Override
	public String toString() {
		return "ArrayList [capacity=" + capacity + ", size=" + size + ", array=" + Arrays.toString(array) + "]";
	}
	
}
