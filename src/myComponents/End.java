package myComponents;

public class End {
	String name;
	Coordinate coordinate;
	String label;
	String position;
	String nameRef;
	double distance;

	public End() {

	}

	public End(String name, Coordinate coordinate, String label) {
		this.name = name;
		this.coordinate = coordinate;
		this.label = label;
	}

	public End(String position, String nameRef, Double distance, String name,
			String label) {
		this.position = position;
		this.nameRef = nameRef;
		this.distance = distance;
		this.name = name;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNameRef() {
		return nameRef;
	}

	public void setNameRef(String nameRef) {
		this.nameRef = nameRef;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String translatePosition() {
		String app = "";
		switch (this.getPosition().toUpperCase()) {
		case "ABOVE_OF": {
			app = "above of";
			break;
		}
		case "BELOW_OF": {
			app = "below of";
			break;
		}
		case "LEFT_OF": {
			app = "left of";
			break;
		}
		case "RIGHT_OF": {
			app = "right of";
			break;
		}

		}

		return app;
	}

	@Override
	public String toString() {
		return "End [Draw_end --> name=" + name + ", coordinate=" + coordinate
				+ ", label=" + label + ", position=" + position + ", nameRef="
				+ nameRef + ", distance=" + distance + ", terminator=;]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		End other = (End) obj;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		if (Double.doubleToLongBits(distance) != Double
				.doubleToLongBits(other.distance))
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
		if (nameRef == null) {
			if (other.nameRef != null)
				return false;
		} else if (!nameRef.equals(other.nameRef))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

}
