package patronSingleton.instancia;

import persona.Person;

//HACER SINGLETON CON ENUM, ES M�S �PTIMO
public enum SingletonEnum {

	INSTANCE;
	
	Person person;
	
	private SingletonEnum() {
		this.person=new Person();
	}
	
	public Person getPerson() {
		return this.person;
	}
}
