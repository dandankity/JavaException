import java.rmi.RemoteException;

/**
 * Created by dchen on 7/20/14.
 */
public class ExceptionMethod {
    public void myMethod() throws RemoteException
    {
        System.out.println("excute mymethod");
        throw new RemoteException("myMethod Exception");

    }
}
