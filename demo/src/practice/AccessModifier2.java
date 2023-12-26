package practice;

public class AccessModifier2 {
	 public int publicField = 10;

	    // Default (package-private) field
	    int defaultField = 20;

	    // Protected field
	    protected int protectedField = 30;

	    // Private field
	    private int privateField = 40;

	    // Public method with public access modifier
	    public void publicMethod() {
	        System.out.println("Public method called");
	    }

	    // Default (package-private) method
	    void defaultMethod() {
	        System.out.println("Default method called");
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("Protected method called");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("Private method called");
	    }
}
