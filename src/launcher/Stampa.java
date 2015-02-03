package launcher;

import graphic.WarningFrame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * This class has the aim to grup-up all the methods for the print on
 * screen/file.
 * 
 * @author Falcone Federico
 * 
 * 
 */
public class Stampa {

	/** Name contains the name of the file where the input is saved **/
	static private String Name = "progetto.file";

	/** Destination contains the Path where the user choose to save the output **/

	/** Constructor of the class **/
	public Stampa() {
	}

	/**
	 * stampaManuale is a static method to save on a file the input given by the
	 * user. So other methods of the program can use the data.
	 * 
	 * @param input
	 *            contains the input the user has edited.
	 */
	public static void stampaManuale(String input) {

		input = input.replace("\n\n", "\n");

		FileWriter fileWriter = null;
		try {
			File newTextFile = new File(Name);
			fileWriter = new FileWriter(newTextFile);
			fileWriter.write(input);
			fileWriter.close();
		} catch (IOException ex) {
			WarningFrame.creaWarningFrame("", "Errore",
					"File di destinazione non trovato.");
		}

		finally {
			try {
				fileWriter.close();
			} catch (IOException ex) {
				WarningFrame.creaWarningFrame("", "Errore",
						"Chiusura del file non riuscita.");
			}
		}
	}

	/**
	 * 
	 * stampaLink is a static method with the the aim to copy a file which
	 * contains the input of the compiler (the path is saved in the parameter)
	 * into the project.
	 * 
	 * @param link
	 */
	public static void stampaLink(String link) {

		InputStream inStream = null;
		OutputStream outStream = null;
		try {

			File afile = new File(link);
			File bfile = new File(Name);

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;

			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			inStream.close();
			outStream.close();
		} catch (IOException e) {
			WarningFrame.creaWarningFrame("", "Errore",
					"Input/output exception");
		}
	}

	/**
	 * stampaFileFinale is a static method which save the output in a directory
	 * choosen by the user.
	 * 
	 * @param supp
	 *            contains the output of the compiler.
	 * @param path
	 *            is the location where the file will be saved. If the file
	 *            doesn't exist, a new one will be created.
	 */
	public static void stampaFileFinale(String supp, String path) {

		FileWriter fileWriter = null;

		try {
			File newTextFile = new File(path + ".tex");
			fileWriter = new FileWriter(newTextFile);
			fileWriter.write(supp);
			fileWriter.close();

		} catch (IOException ex) {
			WarningFrame.creaWarningFrame("", "Errore",
					"File di destinazione non trovato.");
		}

		finally {
			try {
				fileWriter.close();
			} catch (IOException ex) {
				WarningFrame.creaWarningFrame("", "Errore",
						"Chiusura del file non riuscita.");
			}
		}
	}

	public static String readFile() {

		String content = "";
		String sCurrentLine;
		int counter = 1;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("progetto.file"));

			while ((sCurrentLine = br.readLine()) != null) {
				content = content.concat(sCurrentLine + "\n");
				counter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return content;
	}
}
