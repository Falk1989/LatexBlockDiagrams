package launcher;

public class FileConstant {
	public static final String inizialize = "\\"
			+ "documentclass{standalone}\n\n"
			+ "\\"
			+ "usepackage{tikz}\n\n"
			+ "\\"
			+ "usetikzlibrary{shapes,shadows,arrows, decorations.pathmorphing}\n\n"
			+ "\\"
			+ "begin{document}\n\n"
			+ "\\"
			+ "tikzstyle{block} = [draw, rectangle, minimum height=2em, minimum width=4em]\n"
			+ "\\"
			+ "tikzstyle{node} = [draw, fill=blue!20, circle, node distance=1cm]\n"
			+ "\\" + "begin{tikzpicture}\n\n";

	public static final String scope = "\\"
			+ "begin{scope}[->,decoration={post length=4pt},rounded corners=2mm]\n";

	public static final String termination = "\\" + "end{scope}\n\n" + "\\"
			+ "end{tikzpicture}\n\n" + "\\" + "end{document}\n\n";

}
