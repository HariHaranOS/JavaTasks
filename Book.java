package TASK10;

public class Book {
      String title;
     String author;
     double price;
    public Book()
     {
    	 System.out.println(" ");
         System.out.println(" "); 
       }
    public Book(String t, String a){
    	 title=t;
    	 author=a;
     }
    public Book(String t, String a,double p){
   	 title=t;
   	 author=a;
   	 price=p;
    }
     public static void main(String []args) {
    	 Book ob1=new Book();
    	 System.out.println(ob1.title);
    	 System.out.println(ob1.author);
    	 
    	 Book ob2=new Book("Ric dad poor dad","Robert");
    	 System.out.println(ob2.title);
    	 System.out.println(ob2.author);
    	 
    	 Book ob3=new Book("Psychology of Money","Morgan Housel",199);
    	System.out.println(ob3.title);
    	System.out.println(ob3.author);
    	System.out.println(ob3.price);
     }
     
     
}
