package patronSingleton.instancia;

public class mainSingleton {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getSingletonInstancia("Pepe");
		Singleton singleton2 = Singleton.getSingletonInstancia("Juan");
		System.out.println(singleton.getNombre());
		System.out.println(singleton2.getNombre());
	}

}
