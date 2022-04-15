
public class swap {

    public void swa(int x,int y){

        int temp=x; //temp=10
        x=y;        //
        temp=y;
        System.out.println(x+""+y);
    }
    public static void main(String[] args) {
        int a=10,b=20;
        swap s = new swap();
        s.swa(a,b);
    }
}
