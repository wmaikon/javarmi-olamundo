import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OlaImpl extends UnicastRemoteObject implements IOla {

	public OlaImpl() throws RemoteException {

	}

	public static void main(String args[]) {

		try {

			OlaImpl obj = new OlaImpl();

			// Garante que o nome de registro aponte para o nosso objeto
			Naming.rebind("OlaServer", obj);

		} catch (Exception e) {
			System.out.println("OlaImpl err: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public String digaOla() {

		return "Olá mundo!";
	}
}
