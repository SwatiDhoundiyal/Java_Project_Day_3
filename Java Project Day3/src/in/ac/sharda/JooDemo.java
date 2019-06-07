package in.ac.sharda;

public class JooDemo {

	public static void main(String[] args) {
		Joo z= new Joo();
		z.feed();
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Dog());
		z.add(new Dog());
		z.add(new Dog());
		z.add(new Dog());
		z.add(new Dog());
		z.add(new Cat());
		z.add(new Cat());
		z.add(new Cat());
		z.add(new Cat());
		z.add(new Cat());
		z.add(new Tiger());
		z.add(new Tiger());
		z.add(new Tiger());
		z.add(new Tiger());
		z.add(new Tiger());
		z.feed();
		System.out.println(z.count());
		
	}

}
