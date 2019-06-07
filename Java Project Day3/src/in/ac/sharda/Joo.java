package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Joo {

	private List<Animal> animals;
	
	public Joo(){
		this.animals = new ArrayList<>();
	}
	
	public void add(Animal a) {
	this.animals.add(a);
	}
	public int count() {
		return animals.size();
	}
	
    public void feed() {
    	animals.parallelStream()
    	.forEach(a -> a.eat());
    	}

    }

