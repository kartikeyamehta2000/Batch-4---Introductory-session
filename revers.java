import java.util.*;
public class revers {
    public static void main(String[] args) {
        int num,sum=0,rem;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num>0){   //num=121 //num=12 //num=1 //false
            rem=num%10; //rem=1   //rem=2 //rem=0
            sum=sum*10+rem; //1  //12   //121
            num=num/10;     //num=12 //num=1 //num=0
        }
        System.out.println(sum);
    }
}
