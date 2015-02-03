package myComponents;

public class Block extends Elements {

	public Block() {
		super();

	}

	public Block(String position, String nameRef, Double distance, String name,
			String label) {
		this.position = position.toUpperCase();
		this.nameRef = nameRef;
		this.distance = distance;
		this.name = name;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Block [Draw_block --> position=" + position + ", nameRef="
				+ nameRef + ", distance=" + distance + ", name=" + name
				+ ", label=" + label + ", terminator=;]";
	}

}
