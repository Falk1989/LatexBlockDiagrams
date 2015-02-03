package myProjectPackage;

import java.io.FileReader;
import java.io.FileWriter;



import myCompiler.*;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class myTesterLexer {
  public static void main(String[] args) {
  	String fileIn = ".\\documenti\\i_file.txt";
  	String fileOut = ".\\documenti\\o_file.txt";
  	FileWriter fOut;
  	Token tk;
  	int i;
  	
		try {
			System.out.println ("Test ANTLR lexer");
			languageLexer lex = new languageLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			fOut = new FileWriter (fileOut);
			i = 0;
			while ((tk = lex.nextToken()).getType() != languageLexer.EOF) {
				// scrittura a video
					System.out.println(++i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]	--> " + 
							"TokenType: " + tk.getType()  +"		--- > " + tk.getText());
			   
				//scrittura su file differenziata solo le parole
				//if (tk.getType() == 15)
				//	   fOut.append(tk.getText() + "\n");
				        
					
			} 
			fOut.close();
			
		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito"); //Poi mi ricordo di gestire eccezione di errore inseriemnto nome file
			e.printStackTrace();
		}
  }
}
