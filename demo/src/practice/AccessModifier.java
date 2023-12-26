package practice;


public class AccessModifier {
	public static void main(String[] args) {
        // Create an instance of MyClass
		 AccessModifier2 myObject = new  AccessModifier2();

        // Access public members
        System.out.println("Public field: " + myObject.publicField);
        myObject.publicMethod();
        
        // Access default (package-private) members (within the same package)
        System.out.println("Default field: " + myObject.defaultField);
        myObject.defaultMethod();
        
        // Access protected members (within the same package)
        System.out.println("Protected field: " + myObject.protectedField);
        myObject.protectedMethod();
       
        // Cannot access private members directly
        // System.out.println("Private field: " + myObject.privateField); // Compilation error
        // myObject.privateMethod(); // Compilation error
	}
}
	
	
