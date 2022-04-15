public class Methodes {

    static void func1(){
        System.out.println("BY BY");
    }
    public void func(){
        System.out.println("Welcome");
    }
    static void func2(String name){
        System.out.println("Welcome "+name);
    }
    public void rec(int x,int y){
        System.out.println("Rectangle Area Is :"+x*y);
    }

    
    public static void main(String[] args) {
        Methodes m=new Methodes();
        m.func();
        func1();
        func2("Kartikeya Mehta");
        m.rec(10,20);


    }
}
