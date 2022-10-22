
//Defining Classes for Objects 
// A class defines the properties and behaviors for objects and OOP involves programming using objects.
//An object represents an entity in the real world that can be distinctly identified 
// we call them concrete classes 
//An object has a unique identity, state & behavior 
//the state of an object also know as its properties or attributes is represented by data fields with their current values.

//Example: A circle object, has the data field of: radius; which is the property that characterizes a circle.
// The behavior of an object also known as its actions is defined by methods. 
//To invoke a method on an object is to ask the object to perform an action. 

//A circle object, findArea() is its method. 

//Objects of the same type are defined using a common class.
//A class is a template or a blueprint that defines what an object's data fields  & methods will be . 
//An object is an instance of a class
//You can create many instances of a class 

//Creating an  instance is referred as instantiation.

//Constructing objects using constructors
//constructors are special kind of methods 
//A java class uses variables to define actions. 
//Additionally , a class provides methods of a special type, known as constructors, which are invoked to create a new object.

//RULES:
//1) A constructor must have the same name as the class itself.
//Scanner input = new Scanner(System.in);
//Constructors do not have a return type, not even void, designed only to create object
//3)Constructors are invoked using the new operator when an object is created.
//4)Constructors can be overloaded ; making it easy to construct objects with different initial values
//To construct an object from a class

// new ClassName();
//OR 
//new ClassName(arguments);

//Example:new Circle();
//A class normally provides a constructor without arguments.
//Such a constructor is referred to as no-argument constructor.

//A class maybe defined without constructors (security concerns)
//in this case a no-argument constructor with an empty body is implicitly defined in the class , this constructor is called as a default constructor, provided  automatically.
//Only if no constructor explicitly defined in the class


//The illustrations of class templates and  objects can be standardized using UML (unified markup language) notations

//data field is denoted as;
//dataFieldName : dataFieldType

//constructors are denoted as;
//ClassName(parameterName: parameterType)


//methods are denoted as:
//methodName(parameterName: parameterType) : returnType









public class classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle c1;
		double radius;
		System.out.println("Enter radius:");
		
		//c1= new Circle();
		
		
		System.out.println("Radius " + c1.radius);
		System.out.println("Area: " + c1.area);
		System.out.println("Perimeter: " + c1.perimeter);
		
		System.out.println("\n");
		c1.initilize();

		System.out.println("Radius " + c1.radius);
		System.out.println("Area: " + c1.findArea());
		System.out.println("Perimeter: " + c1.findPerimeter());
		
		
		Circle c2 = new Circle(); 
		c2.radius=7;

		System.out.println("\n");
		System.out.println("Radius " + c2.radius);
		System.out.println("Area: " + c2.area);
		System.out.println("Perimeter: " + c2.perimeter);
		
		
		
		
		
		
		
	}

}
