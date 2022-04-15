import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        int n;
        double sum = 0;
        System.out.println("Enter Size Of An Array :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Numbers You Want To Insert In Array :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        
        for (int i = 0; i < n; i++) {
            sum = (double)sum + Math.sqrt(a[i]);

        }
        System.out.print(sum);
    }
}
