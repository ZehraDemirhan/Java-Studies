
public class Circle {
	
	double radius , area , perimeter;
	
	Circle(double radiusInput)
	{
		radius= radiusInput;
		
	}
	
	void initilize()
	{
		radius =1;
		System.out.println("A circle object is initialized");
		
	}
	
	double findArea() {
			
		area= radius * radius *Math.PI;
		return area;
	}
	
	double findPerimeter() {
		
		perimeter = 2*Math.PI *radius;
		return perimeter;
		
		
	}
	

}
