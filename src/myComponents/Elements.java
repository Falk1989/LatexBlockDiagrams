package myComponents;

public abstract class Elements {
	String position;
	String nameRef;
	Double distance;
	String name;
	String label;

	public void clearElement() {
		position = null;
		nameRef = null;
		distance = null;
		name = null;
		label = null;
	}

	public String getPosition() {
		if (this.position != null)
			return position.toUpperCase();
		else
			return "";
	}

	public void setPosition(String position) {
		if (position != null)
			this.position = position.toUpperCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elements other = (Elements) obj;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
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

	public String getNameRef() {
		return nameRef;
	}

	public void setNameRef(String nameRef) {
		this.nameRef = nameRef;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label.replaceAll(" ", " \\\\enspace ");
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

	public String toString() {
		return "Block [Draw_element --> position=" + position + ", nameRef="
				+ nameRef + ", distance=" + distance + ", name=" + name
				+ ", label=" + label + ", terminator=;]";
	}

	public static double computeDistance(String s) {
		if (((s.indexOf('(')) == -1) || ((s.indexOf(')') == -1)))
			return 0.0;
		else
			return Double.parseDouble(s.substring((s.indexOf('(') + 1),
					(s.indexOf(')'))));

	}

}
