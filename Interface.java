 interface Circle {

    float PI = 3.14f;
    float Area (float Radius);
    float Circumference(float radius);
 }
  
 class gun implements Circle{
    public float Area(float Radius){
        return Circle.PI* Radius*Radius;
    }

    public float Circumference(float Radius){
        return 2*Circle.PI*Radius;
    }
 }
    class Interface{

        public static void main(String args[]){
            gun gobj = new gun();
            System.out.println("value od PI is :" + Circle.PI);

            float fRet = 0.0f;

            fRet = gobj.Area(10.7f);
            System.out.println("Area is :" + fRet);

            fRet = gobj. Circumference(10.7f);
            System.out.println("Circumference is :" + fRet);
        }



    }

 



    

