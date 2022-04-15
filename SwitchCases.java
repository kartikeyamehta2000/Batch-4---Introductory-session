import java.util.*;
public class SwitchCases {
    public static void main(String[] args) {
        
        String n;
        int x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Select Any One Them : ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        n=sc.nextLine();
        
        System.out.println("Enter Two Numbers  : ");
        x=sc.nextInt();
        y=sc.nextInt();

        
        
        switch(n)
        {
            case "+" :
            System.out.println("Your Sum Is  : " + (x+y) );
            break;
            case "-" :
            System.out.println("Your subtraction  Is  : " + (x-y) );
            break;
            case "*" :
            System.out.println("Your multiplucation  Is  : " + (x*y) );
            break;
            case "/" :
            System.out.println("Your Division  Is  : " + (x/y) );
            break;
            
            default:
            System.out.println("Wrong Choise !!!!!!!!");
        








        }

    }
}
