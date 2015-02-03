package myComponents;

public class Node extends Elements {

	public Node() {
		super();
	}

	public Node(String position, String nameRef, Double distance, String name,
			String label) {
		this.position = position.toUpperCase();
		this.nameRef = nameRef;
		this.distance = distance;
		this.name = name;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Node [Draw_node --> position=" + position + ", nameRef="
				+ nameRef + ", distance=" + distance + ", name=" + name
				+ ", label=" + label + ", terminator=;]";
	}

}
