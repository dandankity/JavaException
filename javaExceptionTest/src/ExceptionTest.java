/**
 * Created by dchen on 7/20/14.
 */
public class ExceptionTest {
    public static void main(String args[]){
        int [] array=new int[3];
        try {
            System.out.println("Access element three :"+array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("Exception thrown:"+ e);
            System.out.println("Exception thrown:"+ e.getMessage());
            //System.out.println("Exception thrown:"+ e.toString());
           // System.out.println("Exception thrown:"+ e.getStackTrace());
            e.printStackTrace();
        }
      //  System.out.println("out of the block");

    }
}
