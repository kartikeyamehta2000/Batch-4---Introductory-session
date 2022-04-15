public class first {
    int x = 5;
    int y = 5;

    public static void main(String[] args) {
        first f1 = new first();
        first f2 = new first();
        int z=f2.y;
       
            for (int i = 0; i < f1.x; i++) {
                System.out.println("*");
                z--;
                if(z==0){
                    break;
                }

            }
            
        

    }
}
