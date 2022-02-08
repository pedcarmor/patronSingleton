package patronSingleton.instancia;

public class Singleton {

	private static Singleton instancia;
	private String nombre;
	
	private Singleton(String nombre) {
		this.nombre=nombre;
		System.out.println("Mi nombre es "+this.nombre);
	}
	
	public static Singleton getSingletonInstancia(String nombre) {
		if(instancia==null) {
			instancia=new Singleton(nombre);
		}else {
			System.out.println("No se puede crear el objeto "+nombre);
		}
		return instancia;
	}

	public static Singleton getInstancia() {
		return instancia;
	}

	public static void setInstancia(Singleton instancia) {
		Singleton.instancia = instancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
