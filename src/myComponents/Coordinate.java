package myComponents;

public class Coordinate {
	double x;
	double y;

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public static Coordinate computCoord(String s)
			throws NumberFormatException, StringIndexOutOfBoundsException {
		String a, b;
		double x = -1, y = -1;
		try {

			a = s.substring((s.indexOf('(') + 1), (s.indexOf(',')));
			b = s.substring((s.indexOf(',') + 1), (s.indexOf(')')));
			// conversione
			x = Double.parseDouble(a);
			y = Double.parseDouble(b);
		} catch (NumberFormatException e) {
		} catch (StringIndexOutOfBoundsException e) {
		}
		return (new Coordinate(x, y));
	}

}
