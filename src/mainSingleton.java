import persona.Person;

public class mainSingleton {

	public static void main(String[] args) {

		
		//PATRON PROTOTYPE CLONE
		Person p1 = new Person("Pepe",10);
		System.out.println("Edad: "+p1.getAge()+", Nombre: "+p1.getName()+", Objeto: "+p1.hashCode());
		Person p2 = p1.clonar();
		System.out.println("Edad: "+p2.getAge()+", Nombre: "+p2.getName()+", Objeto: "+p2.hashCode());
		
		if(p1==p2) {
			System.out.println("Son iguales los objetos");
		}else {
			System.out.println("No son iguales los objetos");
		}
		
		Person pbuilder = Person.builder().age(43).name("Ale").build();
		System.out.println(pbuilder.getAge());
		System.out.println(pbuilder.getName());
	}
}
