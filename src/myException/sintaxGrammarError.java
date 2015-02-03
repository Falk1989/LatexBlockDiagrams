package myException;

public class sintaxGrammarError implements Comparable<sintaxGrammarError> {
	int line;
	int column;
	String message;

	// HashSet<Integer> lineDuplicate;

	public sintaxGrammarError(String message, int line, int column) {
		this.message = message;
		this.line = line;
		this.column = column;
	}

	@Override
	public String toString() {

		return "Problema alla linea[" + this.line + "] --> " + this.message;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int compareTo(sintaxGrammarError o) {
		int x;
		if (((Integer) this.getLine()).compareTo((Integer) o.getLine()) == 0)
			x = ((Integer) this.getColumn()).compareTo((Integer) o.getColumn());
		else
			x = ((Integer) this.getLine()).compareTo((Integer) o.getLine());

		return x;
	}

}
