
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1, num2=2;
		
		System.out.println("before swap"+num1+" "+ num2);
		
		swap(num1,num2);
		System.out.println("After swap"+num1+" "+num2);
		
		//swap
		
		//METHOD OVERLOADING
		//overloaded methods must be in the same class (so the versions must be inside of the same class)
		//name of the methods must must be the same 
		//the return type and /or parameter list may be different 
		
		int number;
		number= (int)(Math.random()*10);
		System.out.println(number);
		
	
		//A single array variable can reference a large collection of data.
		//An array stores a fixed size sequential collection of elements of the same data type
		
		//DECLEARING ARRAY VARIABLES
		//to use an array in a program, you must declare a variable to reference the array and you must specify the array's element type
		//if we declare the array and we don't create it,  it refers to NULL.
		//unlike declarations for primitive data type variables ,,the declaration of an array variable dosen't allocate any space in memory for the array 
		//it creates only a storage location for the reference to an array and if a variable dosen't contain a reference to an array the value of the variable is NULL 
		//and you cannot assign elements to an array unless it has been created
		
		//SYNTAX:
		//arrayRefvar= new elementType[elementSize];
		
		
		
		
		double[] myList = new double[10]; //declaration and creation are at the same time , this statement declares an array variable and creates an array 
		//of ten elements of double type and assigns its reference to mtList
		
		//When an array is created , its elements are assigned the default value of 0 for the numeric primitive data types,u000  for char types
		//NULL for string and  false for boolean types 
		
		for(int i=0;i<10;i++)
		{
			myList[i]=i;
		}
			
		System.out.println(myList[0]);
		

	}
	
	public static void swap(int n1,int n2)
	{
		//need to use arrays or other data structures as we don't have pointer logic here 
		
		
	}

}
