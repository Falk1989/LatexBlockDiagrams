package myComponents;

public class CurvedArrow extends Connettors {
	String shift;

	public CurvedArrow() {
		// TODO Auto-generated constructor stub
	}

	public CurvedArrow(String origin, String destination, String shift,
			char orientation) {
		switch (orientation) {
		case '>':
			this.origin = origin;
			this.destination = destination;
			break;
		case '<':
			this.origin = destination;
			this.destination = origin;
			break;
		}
		this.shift = shift.toUpperCase();

	}

	@Override
	public void clearConnettor() {
		this.origin = null;
		this.destination = null;
		this.shift = null;

	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getRelativePositionTanslated() {
		String position = "";

		if ((this.getShift().equals("LEFT"))
				|| (this.getShift().equals("RIGHT"))) {
			position = "-|";
		} else {
			position = "|-";
		}
		return position;
	}

	@Override
	public String toString() {
		return "CurvedArrow [Draw_curvedArrow --> origin=" + origin
				+ ", destination=" + destination + ", shift=" + shift
				+ ", terminator=;]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurvedArrow other = (CurvedArrow) obj;
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
		if (shift == null) {
			if (other.shift != null)
				return false;
		} else if (!shift.equals(other.shift))
			return false;
		return true;
	}

}
