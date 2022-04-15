import java.util.Scanner;

class Area{
    void are(){

    }
}
class Circle{
     
     void are(int r){
         System.out.println("Area Of Circle Is  :"+2*3.14*r);
     }

}
class Square{
    
    void are(int x){
        System.out.println("Area Of Square Is  :"+x*x);
    }
}
public class poly {
    public static void main(String[] args) {
        int rad,len;
        Scanner sc = new Scanner(System.in);
        Circle c=new Circle();
        Square s=new Square();
        System.out.println("Enter Radius of Circle  :");
        rad=sc.nextInt();
        System.out.println("Enter Lenth Of Square  :");
        len=sc.nextInt();
        c.are(rad);
        s.are(len);



        
    }

}
