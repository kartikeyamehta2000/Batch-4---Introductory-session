import java.util.Scanner;

public class electricity {
    static int unitprice=7;
    int unituse;
    public static void main(String[] args) {
        electricity e = new electricity();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter use electricity ");
        e.unituse=sc.nextInt();
        System.out.println(e.unituse*unitprice+"Rs"+"You Need To Pay");
        



    }
}
