package myComponents;

public class StraightArrow extends Connettors {

	public StraightArrow() {
		// TODO Auto-generated constructor stub
	}

	public StraightArrow(String origin, String destination, char orientation) {
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

	}

	@Override
	public String toString() {
		return "StraightArrow [Draw_straightArrow --> origin=" + origin
				+ ", destination=" + destination + ", terminator=;]";
	}

	@Override
	public void clearConnettor() {
		this.origin = null;
		this.destination = null;

	}

}
