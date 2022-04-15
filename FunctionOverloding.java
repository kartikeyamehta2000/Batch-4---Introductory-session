public class FunctionOverloding {
    
    public int f1(int x, int y) {
        return x + y;
    }
    static double f1(double x, double y) {
        return x - y;
    }

    public static void main(String[] args) {
        
        System.out.println(f1(10,20));
        System.out.println(f1(10.20,20.52));
    }
}
