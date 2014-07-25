import java.rmi.RemoteException;

/**
 * Created by dchen on 7/20/14.
 */
public class CheckedException {
    public static void main(String args[])  {
        ExceptionMethod exceptionMethod=new ExceptionMethod();
       // exceptionMethod.myMethod();
        try {
            exceptionMethod.myMethod();
        } catch (RemoteException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

    }
}
