package practice;
class OuterClass {
    
    private int outerVariable = 10;

public class Innerclass {
	 public void display() {
         System.out.println("Inside Regular Inner Class");
         System.out.println("Outer Variable: " + outerVariable);
     }
 }

 // Method with Local Inner Class
 public void outerMethod() {
     int localVariable = 20;

     class LocalInnerClass {
         public void display() {
             System.out.println("Inside Local Inner Class");
             System.out.println("Outer Variable: " + outerVariable);
             System.out.println("Local Variable: " + localVariable);
         }
     }

     LocalInnerClass localInner = new LocalInnerClass();
     localInner.display();
 }

 public static void main(String[] args) {
     // Create an instance of the outer class
     OuterClass outer = new OuterClass();

     // Create an instance of the regular inner class
     Innerclass inner = outer.new Innerclass();
     inner.display();

     // Call the method with local inner class
     outer.outerMethod();

     // Anonymous Inner Class
     Runnable myRunnable = new Runnable() {
         @Override
         public void run() {
             System.out.println("Inside Anonymous Inner Class");
         }
     };

     // Execute the run method of the anonymous inner class
     myRunnable.run();
 }
}

