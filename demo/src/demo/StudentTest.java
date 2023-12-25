package demo;
class Student {
	int regNumber;
	String studentName;
	Student(int regno,String name){
		this.regNumber = regno;
		this.studentName = name;
	}

}
public class StudentTest{
	public static void main(String[] args)
	{
		Student[] arr;
		arr = new Student[5];
        arr[0]=new Student(12341,"manish");
        arr[1]=new Student(12342,"aravid");
        arr[2]=new Student(12343,"satish");
        arr[3]=new Student(12344,"hari");
        arr[4]=new Student(12344,"ahmed");
       // for(int i=0;i<arr.length;i++)
        	//System.out.println(arr[i]);
        for(int i=0;i<arr.length;i++)
        	System.out.println("student with registration number "+arr[i].regNumber+" is :"+arr[i].studentName);
	}
}
