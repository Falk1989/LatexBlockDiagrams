package myComponents;

public abstract class Connettors {
	String origin;
	String destination;

	public abstract void clearConnettor();

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String toString() {
		return "Connettors [Draw_connettor --> origin=" + origin
				+ ", destination=" + destination + " terminator=;]";
	}

	public static String computeShift(String s) {
		return s.substring((s.indexOf('(') + 1), (s.indexOf(')')));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Connettors other = (Connettors) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

}
