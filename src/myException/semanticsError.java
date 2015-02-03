package myException;

import java.util.HashSet;

import org.antlr.runtime.Token;

public class semanticsError implements Comparable<semanticsError> {
	Token error;
	int type;
	String object;
	String nome;
	int line;
	HashSet<Integer> lineDuplicate;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// costanti rappresentanti i tipi di errori semantici ricevuti in ingresso
	public final int ERR_MISSING_REFERENCE = 1;
	public final int ERR_ROW_ALREADY_EXIST = 2;
	public final int ERR_NAME_ITEM_DUPLICATED = 3;
	public final int ERR_NEGATIVE_COORDINATES = 4;
	public final int ERR_NEGATIVE_DISTANCE = 5;
	public final int ERR_BLOCK_UNLINKED = 6;
	public final int ERR_NODE_UNLINKED = 7;

	// inserire codice 0 per errori sintattici (fare in modo che non venga
	// visualizzato nessun errore semantico
	// se prima non sono stati corretti tutti gli errori sintattici.)

	public semanticsError() {
	}

	public semanticsError(Token error, int type, String object) {
		super();
		this.error = error;
		this.type = type;
		this.object = object;
		this.nome = null;
		this.line = error.getLine();
	}

	public semanticsError(int type, String object, String nome, int line,
			HashSet<Integer> lineDuplicate) {
		super();
		this.type = type;
		this.object = object;
		this.line = line;
		this.nome = nome;
		this.lineDuplicate = lineDuplicate;
		this.error = null;

	}

	public semanticsError(int type, String object, String nome, int line) {
		super();
		this.type = type;
		this.object = object;
		this.line = line;
		this.nome = nome;

		this.lineDuplicate = null;
		this.error = null;

	}

	public Token getError() {
		return error;
	}

	public void setError(Token error) {
		this.error = error;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public HashSet<Integer> getLineDuplicate() {
		return lineDuplicate;
	}

	public void setLineDuplicate(HashSet<Integer> lineDuplicate) {
		this.lineDuplicate = lineDuplicate;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	@Override
	public String toString() {
		String msg = "";

		switch (this.type) {

		case 1:
			msg = "Type ["
					+ convertType(this.type)
					+ "]  at Line("
					+ error.getLine()
					+ "), Column ("
					+ error.getCharPositionInLine()
					+ ")".concat(" --> This [" + this.object.toUpperCase()
							+ "] has a reference to [" + error.getText()
							+ "] that is: MISSING or ERROR in WRITE...\n");
			break;

		case 2: // if (this.nome == null) //significa che la duplicazione è di
			// una freccia (che è un oggetto senza nome)
			msg = "Type ["
					+ convertType(this.type)
					+ "]".concat(" --> The row number (" + this.line
							+ ") already EXIST at line: "
							+ this.lineDuplicate.toString() + "\n");

			// else
			// msg = "Type [" + convertType(this.type) +
			// "]".concat(" --> Element ["+this.object.toUpperCase() +
			// "] whith name [" + this.nome.toUpperCase() +
			// "] at line ("+this.line+") already EXIST at line: "+
			// this.lineDuplicate.toString()+"\n");
			break;

		case 3: // if (this.nome != null) //significa che la duplicazione è di
			// una freccia (che è un oggetto senza nome)
			msg = "Type [" + convertType(this.type) + "]" + " --> Element ["
					+ this.object.toUpperCase() + "] whith name ["
					+ this.nome.toUpperCase() + "] at line (" + this.line
					+ ") have the same name that items at lines: "
					+ this.lineDuplicate.toString() + "\n";

			break;

		case 4:
			msg = "Type ["
					+ convertType(this.type)
					+ "]  at Line("
					+ error.getLine()
					+ "), Column ("
					+ error.getCharPositionInLine()
					+ ")".concat(" --> This [" + this.object.toUpperCase()
							+ "] whith name [" + error.getText()
							+ "] have one or both coordinate NEGATIVE...\n");
			break;

		case 5:
			msg = "Type ["
					+ convertType(this.type)
					+ "]  at Line("
					+ error.getLine()
					+ "), Column ("
					+ error.getCharPositionInLine()
					+ ")".concat(" --> This [" + this.object.toUpperCase()
							+ "] whith name [" + error.getText()
							+ "] have the distance NEGATIVE...\n");
			break;

		case 6:
			msg = "Type [" + convertType(this.type) + "]" + " --> Element ["
					+ this.object.toUpperCase() + "] whith name ["
					+ this.nome.toUpperCase() + "] at line (" + this.line
					+ ") is NOT LINKED by arrows (input e/o output)...\n";

			break;

		case 7:
			msg = "Type [" + convertType(this.type) + "]" + " --> Element ["
					+ this.object.toUpperCase() + "] whith name ["
					+ this.nome.toUpperCase() + "] at line (" + this.line
					+ ") is NOT LINKED by arrows (input e/o output)...\n";

			break;

		}

		return msg;
	}

	private String convertType(int type) {
		String out = "";

		switch (type) {
		case 1:
			out = "MISSING_REFERENCE";
			break;
		case 2:
			out = "ROW_ALREADY_EXIST";
			break;
		case 3:
			out = "NAME_ITEM_DUPLICATED";
			break;
		case 4:
			out = "NEGATIVE_COORDINATES";
			break;
		case 5:
			out = "NEGATIVE_DISTANCE";
			break;
		case 6:
			out = "BLOCK_UNLINKED";
			break;
		case 7:
			out = "NODE_UNLINKED";
			break;

		default:
			System.out.println(".");

		}

		return out;
	}

	@Override
	public int compareTo(semanticsError o) {
		return ((Integer) this.getLine()).compareTo((Integer) o.getLine());
	}

}
