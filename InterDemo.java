import java.util.*;
interface Circle {

    float PI = 3.14f;

    float Circumference(float ratidus);

    float Area(float radius);
    
}

class Arithematic implements Circle{
     
   public  float Area(float radius){
    float Area = 0.0f;
    Area = Circle.PI * radius * radius;
    return Area;
   }

 public float Circumference(float radius){
    float Circum = 0.0f;
    Circum = 2 * Circle.PI * radius;
    return Circum;
 }
}

public class InterDemo{
    
    public static void main(String[] args) {
        
        Arithematic aobj = new Arithematic();
        Scanner sobj = new Scanner(System.in);

        float radius = 0.0f;
        float Ans = 0.0f;

        System.out.println("Enter the value of radius");
        radius = sobj.nextFloat();

        Ans = aobj.Area(radius);
        System.out.println("Area of circle is:" + Ans);

        Ans = aobj.Circumference(radius);
        System.out.println("Circumference is:" + Ans);
    }
}