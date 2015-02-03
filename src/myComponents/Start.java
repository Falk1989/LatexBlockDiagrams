package myComponents;

public class Start {
	String name;
	Coordinate coordinate;
	String label;

	public Start() {

	}

	public Start(String name, Coordinate coordinate, String label) {
		super();
		this.name = name;
		this.coordinate = coordinate;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label.replaceAll(" ", " \\\\enspace ");
	}

	@Override
	public String toString() {
		return "Start [Draw_start --> " + "name=" + name + ", coordinate="
				+ coordinate + ", label=" + label + ", terminator=;]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Start other = (Start) obj;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
