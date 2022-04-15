public class Pattern {
    public static void main(String [] args)

    {
        int i=1;
        while(i<=5)

          {
                int k=1;
                while(k<=5-i+1)

                {

                      System.out.print(" ");
                      k++;

                }
                
                int j=1;
                while(j<=(2*i)-1)

                {

                      System.out.print("*");
                      j++;

                }

            System.out.println( );
            i++;

          }

     }
}
