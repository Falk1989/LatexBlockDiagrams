package myProjectPackage;

import graphic.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import org.antlr.runtime.*;

import myCompiler.*;
import myComponents.*;
import myException.semanticsError;
import myException.sintaxGrammarError;



public class myTesterParser {
  static languageParser parser;
	
	
  public static Vector<Component<?>> compiler(String fileIn) {
   	CommonTokenStream tk;
  	Vector<Component<?>> v = null;
  	semanticsError sme = new semanticsError();
  			try {
	    	languageLexer lexer = new languageLexer(new ANTLRReaderStream(new FileReader(fileIn)));
			tk = new CommonTokenStream(lexer); 
			parser = new languageParser(tk);
			//---------------------------
			//---------------------------
			//comando fondamentale di lancio del compilatore. Con esso viene letto l'input e se corretto popolato il VECTOR
			parser.block_schema();
			//---------------------------
			//---------------------------
			//---------------------------
			
			//controllo... se ci sono errori nella error list...  allora genera la finestra
			int sizeSintaxGrammarList = parser.getEnv().getSintaxGrammarList().size();
			if(sizeSintaxGrammarList !=0)
				{
			    	//System.out.println ("Parsing completato con " + sizeErrorList + " errori semantici\n\n");
			    	ArrayList<sintaxGrammarError> erroriSintatticiGrammaticali = parser.getEnv().getSintaxGrammarList();
			        String msg = "Parsing completato con " + sizeSintaxGrammarList + " errori Sintattico-Grammaticali\n\n";
			        int counter=0;
			        
			        // gestire l'ordinamento errori per farli vedere in ordine di riga
			        Collections.sort(erroriSintatticiGrammaticali);
			       	
			        //conteggio del numero di errori sintattici riconosciuti
			        while (counter < erroriSintatticiGrammaticali.size())
			       		{
			    		msg = msg.concat((counter+1+") ")+erroriSintatticiGrammaticali.get(counter).toString());
			    		counter++;
			       		}
			    	//lancio della finestra di errire. Da qui non esce fino a che tutto il controllo semantico non è POSITIVO
			    	WarningErrorFrame.creaWarningErrorFrame("Sintax-Grammar Notification!!!","CRITICAL GRAMMAR ERROR",msg );
			    	return null;
			    }//fine se
			else
			
			
			{ //se il test grammatico-lessicale è positivo (zoro errori in lista) inizia il controllo semantico
			
			
			
			//-------------------------------------------------------------
			//inizio analisi e popolamento lista ERRORI SEMANTICI
			//-------------------------------------------------------------
			
			
			for (int k = 0; k < parser.getEnv().getBlockSchema().size(); k++)
				{
				//controllo errore semantico N°2 presenza di duplicati di riga
						sme =  ParserEnvironment.getAlreadyExist(parser.getEnv().getBlockSchema(),
															  parser.getEnv().getBlockSchema().get(k), 
															  k);					
						if (!(sme.getLineDuplicate().isEmpty())) //cioè se ha trovato almeno un duplicato di riga ed ha riempito la hs poichè l'oggettolo riempie anche se non trova duplicati
							parser.getEnv().getErrorList().add(new semanticsError(2, sme.getObject().toUpperCase(), sme.getNome(), sme.getLine(), sme.getLineDuplicate()));
									
				//controllo errore semantico N°3 presenza di duplicati  di nome
						sme =  ParserEnvironment.getAlreadyExistName(parser.getEnv().getBlockSchema(),
								  parser.getEnv().getBlockSchema().get(k), 
								  k);
		
						if (!(sme.getLineDuplicate().isEmpty())) //cioè se ha trovato almeno un duplicato di riga ed ha riempito la hs poichè l'oggettolo riempie anche se non trova duplicati
							parser.getEnv().getErrorList().add(new semanticsError(3, sme.getObject(), sme.getNome(), sme.getLine(), sme.getLineDuplicate()));
	
						if (parser.getEnv().getBlockSchema().get(k).getOgg() instanceof StraightArrow){
							        parser.getEnv().getHsNameArrowOrigin().add(((StraightArrow)parser.getEnv().getBlockSchema().get(k).getOgg()).getOrigin());
							        parser.getEnv().getHsNameArrowDestination().add(((StraightArrow)parser.getEnv().getBlockSchema().get(k).getOgg()).getDestination());}
						
						if (parser.getEnv().getBlockSchema().get(k).getOgg() instanceof CurvedArrow){	
				                    parser.getEnv().getHsNameArrowOrigin().add(((CurvedArrow)parser.getEnv().getBlockSchema().get(k).getOgg()).getOrigin());
				                    parser.getEnv().getHsNameArrowDestination().add(((CurvedArrow)parser.getEnv().getBlockSchema().get(k).getOgg()).getDestination());}
				
				} // fine for	
	
			for (int k = 0; k < parser.getEnv().getBlockSchema().size(); k++)
				{
				//controllo errore semantico N°6 presenza di bloccki non linkati
						sme =  ParserEnvironment.getBlockUnlinked(parser.getEnv(),
						  								  parser.getEnv().getBlockSchema().get(k), 
						  								  k);
						if (!(sme.getLine() == -1)){ //cioè se ha trovato almeno un duplicato di riga ed ha riempito la hs poichè l'oggettolo riempie anche se non trova duplicati
							parser.getEnv().getErrorList().add(new semanticsError(6, sme.getObject(), sme.getNome(), sme.getLine()));}
				
				//controllo errore semantico N°7 presenza di nodi non linkati
						sme =  ParserEnvironment.getNodeUnlinked(parser.getEnv(),
						  								  parser.getEnv().getBlockSchema().get(k), 
						  								  k);
               			if (!(sme.getLine() == -1)){ //cioè se ha trovato almeno un duplicato di riga ed ha riempito la hs poichè l'oggettolo riempie anche se non trova duplicati
               				parser.getEnv().getErrorList().add(new semanticsError(7, sme.getObject(), sme.getNome(), sme.getLine()));}
				}// fine for
			
				
			
			int sizeErrorList = parser.getEnv().getErrorList().size();
			//controllo buon esito delle verifiche sintattiche
			/* if (sizeErrorList == 0)
			 {
				 WarningFrame.creaWarningFrame("Esito PARSING...","Parsing completato con successo!!!",
						                       "Numero di espressioni riconosciute: "+ parser.getEnv().getCounter() );	
			 }	*
			  else*/
			
			
			
			//controllo... se ci sono errori nella error list...  allora genera la finestra
			if(sizeErrorList !=0)
				{
			    	//System.out.println ("Parsing completato con " + sizeErrorList + " errori semantici\n\n");
			    	ArrayList<semanticsError> errori = parser.getEnv().getErrorList();;
			        String msg = "Parsing completato con " + sizeErrorList + " errori semantici\n\n";
			        int counter=0;
			        
			        // gestire l'ordinamento errori per farli vedere in ordine di riga
			        Collections.sort(errori);
			       	
			        //conteggio del numero di errori sintattici riconosciuti
			        while (counter < errori.size())
			       		{
			    		msg = msg.concat((counter+1+") ")+errori.get(counter).toString());
			    		counter++;
			       		}
			    	//lancio della finestra di errire. Da qui non esce fino a che tutto il controllo semantico non è POSITIVO
			    	WarningErrorFrame.creaWarningErrorFrame("Semantic Notification!!!","CRITICAL GRAMMAR ERROR",msg );
			    	return null;
			    }//fine se
			}//fine else primario
			
			//restituzione del vector contenente tutto l'input spacchettato
			v = parser.getEnv().getBlockSchema();

	
			
		} catch (Exception e) {
			System.out.println ("Parsing ANTLR abortito"); //Poi mi ricordo di gestire eccezione di errore inseriemnto nome file
			e.printStackTrace();
		}
  	
  		return v;
  			
  }
  
  
}




