package exammidterm;

public class Animal {
	private String type;
	private double weight;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + "]";
	}

	public Animal(String type, double weight) {
		this.type = type;
		this.weight = weight;
	}

}
