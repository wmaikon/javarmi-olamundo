import java.rmi.Naming;

public class OlaCliente {

	public static void main(String arg[]) {

		try {

			// obtem o objeto usando o registro do java
			IOla obj = (IOla) Naming.lookup("//localhost/OlaServer");
			System.out.println(obj.digaOla());

		} catch (Exception e) {
			System.out.println("OlaCliente exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
