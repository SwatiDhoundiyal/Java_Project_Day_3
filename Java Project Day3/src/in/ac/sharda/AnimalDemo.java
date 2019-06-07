package in.ac.sharda;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.speak();
		a.walk();
		
	    Dog d= new Dog();
		d.speak();
		d.walk();
		d.bite();
		
		Animal c= new Cat();
		c.speak();
		c.walk();
	
        Tiger t = new Tiger();
        Tiger v = new Tiger();
        System.out.println(t.equals(v));
        t.speak();
        t.walk();
}
}