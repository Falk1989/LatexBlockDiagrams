package launcher;

import java.util.Vector;

import myComponents.*;

public class OutputGenerator {

	public static String beginGeneration(Vector<Component<?>> elementi) {

		String output = FileConstant.inizialize;
		boolean arrow = true;

		for (int i = 0; i < elementi.size(); i++) {

			classes x = getType(elementi.get(i).getOgg());
			if ((x == classes.StraightArrow || x == classes.CurvedArrow)
					&& arrow) {
				output = output.concat(FileConstant.scope);
				arrow = false;
			}
			switch (x) {
			case Start: {
				Start locale = (Start) elementi.get(i).getOgg();
				output = output.concat("\\" + "node [name=" + locale.getName()
						+ "]");
				if (locale.getCoordinate() != null) {
					output = output.concat(" at ("
							+ locale.getCoordinate().getX() + ","
							+ locale.getCoordinate().getY() + ")");
				}

				if (locale.getLabel() != null) {
					output = output.concat(" {$" + locale.getLabel() + "$};\n");
				} else
					output = output.concat("{};\n");
				break;
			}
			case Block: {
				Block locale = (Block) elementi.get(i).getOgg();
				output = output.concat("\\" + "node [block,"
						+ locale.translatePosition() + "="
						+ locale.getNameRef() + ",node distance= "
						+ locale.getDistance() + "mm] (" + locale.getName()
						+ ")");
				if (locale.getLabel() != null) {
					output = output.concat(" {$" + locale.getLabel() + "$};\n");
				} else
					output = output.concat("{};\n");
				break;
			}
			case Node: {
				Node locale = (Node) elementi.get(i).getOgg();
				String position = locale.translatePosition();
				output = output.concat("\\" + "node [node," + position + "="
						+ locale.getNameRef() + ",node distance= "
						+ locale.getDistance() + "mm] (" + locale.getName()
						+ ")");
				if (locale.getLabel() != null) {
					output = output.concat(" {$" + locale.getLabel() + "$};\n");
				} else
					output = output.concat("{};\n");

				break;
			}

			case StraightArrow: { // \draw [->,ultra thick] (origin) --
									// (destination);
				StraightArrow locale = (StraightArrow) elementi.get(i).getOgg();
				output = output.concat("\\" + "draw [->,ultra thick] ("
						+ locale.getOrigin() + ") -- ("
						+ locale.getDestination() + ");\n");
				break;
			}
			case CurvedArrow: { // \draw [->,ultra thick] (sum2) |-
								// (measurements);
				CurvedArrow locale = (CurvedArrow) elementi.get(i).getOgg();
				output = output.concat("\\" + "draw [->,ultra thick] ("
						+ locale.getOrigin() + ") "
						+ locale.getRelativePositionTanslated() + " ("
						+ locale.getDestination() + ");\n");
				break;
			}

			case End: { // \node [name=name]at (coordinate){label}; || \node
						// [position=distance mm,name=name] at (nameRef) {};
				End locale = (End) elementi.get(i).getOgg();
				output = output.concat("\\" + "node [");
				if (locale.getCoordinate() == null) {
					output = output.concat(locale.translatePosition() + "="
							+ locale.getNameRef() + ", node distance = "
							+ locale.getDistance() + "mm] (" + locale.getName()
							+ ")");
				} else {
					output = output.concat("name= " + locale.getName()
							+ " ] at (" + locale.getCoordinate().getX() + ","
							+ locale.getCoordinate().getY() + ") ");
				}
				if (locale.getLabel() != null) {
					output = output.concat(" {$" + locale.getLabel() + "$};\n");
				} else
					output = output.concat("{};\n");
				break;
			}
			case errore:
				System.out.print("errore");

			}
		}
		output = output.concat(FileConstant.termination);
		return output;
	}

	private static classes getType(Object ogg) {

		if (ogg instanceof Start)
			return classes.Start;
		if (ogg instanceof Block)
			return classes.Block;

		if (ogg instanceof StraightArrow)
			return classes.StraightArrow;

		if (ogg instanceof CurvedArrow)
			return classes.CurvedArrow;

		if (ogg instanceof Node)
			return classes.Node;

		if (ogg instanceof End)
			return classes.End;

		return classes.errore;
	}

	enum classes {
		Start, Block, CurvedArrow, StraightArrow, Node, End, errore
	}
}
