package exammidterm;

public final class Tree {
	final String species;
	final int age;

	public Tree(String species, int age) {
		this.species = species;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}
