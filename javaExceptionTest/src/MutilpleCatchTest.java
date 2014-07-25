import java.io.*;

/**
 * Created by dchen on 7/20/14.
 */
public class MutilpleCatchTest {
    public static void main(String args[]){
        BufferedReader reader = null;
        OutputStream x;
            try {
               // file=new FileInputStream("test.txt");
//                reader=MutilpleCatchTest.class.getResourceAsStream("test.txt");
                reader=new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
            } catch (FileNotFoundException f){
                f.printStackTrace();

            } catch(IOException i) {
                i.printStackTrace();

            }finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



    }
}
