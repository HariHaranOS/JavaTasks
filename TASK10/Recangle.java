package TASK10;

public class Recangle {
   double width;
   double height;
   public Recangle(double width,double height) {
	   this.width=width;
	   this.height=height;
 }
   public double calculateArea() {
	   return width * height;
	  
   }
   public double calculatePerimeter() {
		  return 2*(width+height);

   }
  public static void main(String []args) {
	  Recangle Rect=new Recangle(5.0,3.0);
	  System.out.println("Area: "+Rect.calculateArea());
	  System.out.println("Perimeter"+Rect.calculatePerimeter());
  }
}
