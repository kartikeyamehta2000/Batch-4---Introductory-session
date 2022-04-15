public class Typecasting {
    public static void main(String[] args) {
        
        double a=2.567; // Narrowing Typecasting
        int b= (int) a; //Manual Typecasting 
        System.out.println(a);
        System.out.println(b);

        int c=2;
        double d=c; // Automatic Typecasting 
        System.out.println(c); //Wider Typecasting
        System.out.println(d);

        int x=10;
        x+=5;
        System.out.println(x);

        int y=10;
        y-=5;
        System.out.println(y);

       

        int z=20;
        
        System.out.println(z>>2); //Right Shift
        System.out.println(z<<2); //Left Shift





    }
}
