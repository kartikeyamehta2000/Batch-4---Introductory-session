class Animal{
    
    void legs(){
        System.out.println("Animal Has Four Legs : ");
    }
}

class Dog extends Animal{
   
    void eat(){
        System.out.println("Dog Eat Biscuits ");
    }
}
class babydog extends Dog{
    void weep(){
        System.out.println("*-*-*-*-*- ");
    }
}
public class inherit {
    public static void main(String[] args) {
        Dog germans =new Dog();
        babydog b = new babydog();
        germans.legs();
        germans.eat();
        b.eat();
        b.legs();
    }

}
