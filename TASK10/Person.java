package TASK10;

public class Person {
     String name;
     int age;
    
     Person(String n,int a){
    	  name=n;
    	  age=a;
     }
     public void display() {
    	 System.out.println("Name:"+name+" Age:"+age);
    	
    	 
     }
     public static void main(String []args) {
    	 Person obj=new Person("Hari",21);
    	 obj.display();
    	
    	 
    	 
     }
     
}
