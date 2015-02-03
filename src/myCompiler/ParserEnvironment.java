package myCompiler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

import myComponents.*;
import myException.semanticsError;
import myException.sintaxGrammarError;




public class ParserEnvironment {


	int counter;
	int optional_start = 0;
	int optional_block = 0;
	int optional_node = 0;
	
	public static boolean lock_start = false;
	//public static boolean lock_element = false;
	//public static boolean lock_node = false;
	

//	public Hashtable<String, Value> symbolTable = null;
	public Vector<Component<?>> blockSchema = null;
	public ArrayList<semanticsError> errorList = null;
	public ArrayList<sintaxGrammarError> grammarList = null;
	public ArrayList<sintaxGrammarError> sintaxGrammarList = null;
	public StringBuffer translation = null;
	public HashSet<String> hs = null;
	public HashSet<String> hsNameArrowOrigin = null;
	public HashSet<String> hsNameArrowDestination = null;
	public static HashSet<Integer> global = null; 
	public static HashSet<Integer> globalName = null; 
	public static HashSet<String> globalLineArrowBlock = null;
	public static HashSet<String> globalLineArrowNode = null;
	
	
	
// dichiarazioen degli oggetti che finiranno nella vector
	Start start;
	Block block;
	Node node;
	StraightArrow straightArrow;
	CurvedArrow curvedArrow;
	End end;

	public ParserEnvironment () {
//		symbolTable = new Hashtable<String, Value> (101);		// 101 numero primo
		blockSchema = new Vector<Component<?>>();
		errorList = new ArrayList<semanticsError>(); 
		grammarList = new ArrayList<sintaxGrammarError>();
        sintaxGrammarList = new ArrayList<sintaxGrammarError>();
		translation = new StringBuffer ();
		hs = new HashSet<String>(); //mi serve per gestire i nomi di tutti i components senza duplicati
		global = new HashSet<Integer>();
		globalName = new HashSet<Integer>();
		globalLineArrowBlock = new HashSet<String>();
		globalLineArrowNode = new HashSet<String>();
		hsNameArrowOrigin = new HashSet<String>();
		hsNameArrowDestination = new HashSet<String>();
		InstanceObject();
	}

	public void InstanceObject(){
		start = new Start();
		block = new Block();
		node = new Node();
		straightArrow = new StraightArrow();
		curvedArrow = new CurvedArrow();
		end = new End();
		
	}
	public Vector<Component<?>> getBlockSchema() {
		return blockSchema;
	}
    public ArrayList<semanticsError> getErrorList() {
	return errorList;
}

    
    


	public ArrayList<sintaxGrammarError> getSintaxGrammarList() {
		return sintaxGrammarList;
	}

	public void setSintaxGrammarList(ArrayList<sintaxGrammarError> sintaxGrammarList) {
		this.sintaxGrammarList = sintaxGrammarList;
	}

	/*
    public static boolean isLock_node() {
		return lock_node;
	}

	public static void setLock_node(boolean lock_node) {
		ParserEnvironment.lock_node = lock_node;
	}

	public static boolean isLock_element() {
		return lock_element;
	}

	public static void setLock_element(boolean lock_element) {
		ParserEnvironment.lock_element = lock_element;
	}
	*/
	public int getOptional_node() {
		return optional_node;
	}

	public void setOptional_node(int optional_node) {
		this.optional_node = optional_node;
	}    
    
    

public int getOptional_block() {
		return optional_block;
	}

	public void setOptional_block(int optional_block) {
		this.optional_block = optional_block;
	}

public static boolean isLock_start() {
		return lock_start;
	}

	public static void setLock_start(boolean lock_start) {
		ParserEnvironment.lock_start = lock_start;
	}




public int getOptional_start() {
		return optional_start;
	}

	public void setOptional_start(int optional_start) {
		this.optional_start = optional_start;
	}

public ArrayList<sintaxGrammarError> getGrammarList() {
		return grammarList;
	}

	public void setGrammarList(ArrayList<sintaxGrammarError> grammarList) {
		this.grammarList = grammarList;
	}

public void setErrorList(ArrayList<semanticsError> errorList) {
	this.errorList = errorList;
}



public HashSet<String> getHsNameArrowOrigin() {
	return hsNameArrowOrigin;
}

public void setHsNameArrowOrigin(HashSet<String> hsNameArrowOrigin) {
	this.hsNameArrowOrigin = hsNameArrowOrigin;
}
public HashSet<String> getHsNameArrowDestination() {
	return hsNameArrowDestination;
}

public void setHsNameArrowDestination(HashSet<String> hsNameArrowDestination) {
	this.hsNameArrowDestination = hsNameArrowDestination;
}

public HashSet<String> getHs() {
	return hs;
}


public void setHs(HashSet<String> hs) {
	this.hs = hs;
}


public Start getStart() {
		return start;
	}


	public void setStart(Start start) {
		this.start = start;
	}


	public Block getBlock() {
		return block;
	}


	public void setBlock(Block block) {
		this.block = block;
	}


	public Node getNode() {
		return node;
	}


	public void setNode(Node node) {
		this.node = node;
	}


	public StraightArrow getStraightArrow() {
		return straightArrow;
	}


	public void setStraightArrow(StraightArrow straightArrow) {
		this.straightArrow = straightArrow;
	}


	public CurvedArrow getCurvedArrow() {
		return curvedArrow;
	}


	public void setCurvedArrow(CurvedArrow curvedArrow) {
		this.curvedArrow = curvedArrow;
	}


	public End getEnd() {
		return end;
	}


	public void setEnd(End end) {
		this.end = end;
	}


	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}

	
	public static semanticsError getAlreadyExistName(Vector<Component<?>> blockSchema, Component<?> istanza, int posizione){
		HashSet<Integer> hsline = new HashSet<Integer>();
		Components classe = null;
		Components classeSchema = null;
		semanticsError s = new semanticsError();
		
		if (istanza.getOgg() instanceof Start) {classe = Components.Start;
												s.setObject(classe.toString());
												s.setNome(((Start)istanza.getOgg()).getName());}
		else if (istanza.getOgg() instanceof Block) {classe = Components.Block;
													 s.setObject(classe.toString());
													 s.setNome(((Block)istanza.getOgg()).getName());}
		else if (istanza.getOgg() instanceof Node) {classe = Components.Node;
													s.setObject(classe.toString());
													s.setNome(((Node)istanza.getOgg()).getName());}
		/*else if (istanza.getOgg() instanceof StraightArrow) {classe = Components.StraightArrow;
															 s.setObject(classe.toString());
															 s.setNome("");}				
		else if (istanza.getOgg() instanceof CurvedArrow) {classe = Components.CurvedArrow;
														   s.setObject(classe.toString());
														   s.setNome("");}  */
		else if (istanza.getOgg() instanceof End) {classe = Components.End;
												   s.setObject(classe.toString());
												   s.setNome(((End)istanza.getOgg()).getName());}
		
		
		
	
		for (int j = 0; j < blockSchema.size(); j++)
			{
			if (blockSchema.get(j).getOgg() instanceof Start) classeSchema = Components.Start;
			else if (blockSchema.get(j).getOgg() instanceof Block) classeSchema = Components.Block;
    		else if (blockSchema.get(j).getOgg() instanceof Node) classeSchema = Components.Node;
			else if (blockSchema.get(j).getOgg() instanceof End) classeSchema = Components.End;
			
			if ((j != posizione) && (((blockSchema.get(j).getOgg() instanceof StraightArrow) || (blockSchema.get(j).getOgg() instanceof CurvedArrow))== false)	//cioè non confrontare le frecce che sono prive di nome 
								 && (((istanza.getOgg() instanceof StraightArrow) || (istanza.getOgg() instanceof CurvedArrow)) == false)
					             && (!(globalName.contains(new Integer(posizione+1)))))
			   	{
				switch (classeSchema)
					{
					case Start: switch(classe)
									{
									case Start: if (((Start)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Start)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
										 			break;
									case Block: if (((Start)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Block)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case Node: if (((Start)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Node)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case End: if (((Start)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((End)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
								    default: System.out.println("");
									} //fine switch interno
							break;
					case Block: switch(classe)
									{
									case Start: if (((Block)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Start)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
										 			break;
									case Block: if (((Block)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Block)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case Node: if (((Block)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Node)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case End: if (((Block)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((End)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
								    default: System.out.println("");
									} //fine switch interno
							break;
					case Node: switch(classe)
									{
									case Start: if (((Node)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Start)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
										 			break;
									case Block: if (((Node)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Block)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case Node: if (((Node)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Node)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case End: if (((Node)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((End)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
								    default: System.out.println("");
									} //fine switch interno
							break;
					case End: switch(classe)
									{
									case Start: if (((End)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Start)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
										 			break;
									case Block: if (((End)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Block)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case Node: if (((End)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((Node)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									case End: if (((End)blockSchema.get(j).getOgg()).getName().toString()
													.equals(((End)istanza.getOgg()).getName().toString()))
													{
													hsline.add(new Integer(j+1));
													globalName.add(new Integer(j+1));
													}
													break;
									default: System.out.println("");
								   // default: System.out.println("");
									} //fine switch interno
							break;
					 default: System.out.println("");
					          break;
			    	} //fine switch esterno				
			   	}//fine se			
			 }//fine for

		s.setLine(posizione+1);
		s.setLineDuplicate(hsline);
		
		
		
		return s;
			
	
	} //fine funzione
	
	
	
	
	

	public static semanticsError getAlreadyExist(Vector<Component<?>> blockSchema, Component<?> istanza, int posizione){
		 HashSet<Integer> hsline = new HashSet<Integer>();
		Components classe = null;
		semanticsError s = new semanticsError();
		
		if (istanza.getOgg() instanceof Start) {classe = Components.Start;
												s.setObject(classe.toString());
												s.setNome(((Start)istanza.getOgg()).getName());}
		else if (istanza.getOgg() instanceof Block) {classe = Components.Block;
													 s.setObject(classe.toString());
													 s.setNome(((Block)istanza.getOgg()).getName());}
		else if (istanza.getOgg() instanceof Node) {classe = Components.Node;
													s.setObject(classe.toString());
													s.setNome(((Node)istanza.getOgg()).getName());}
		else if (istanza.getOgg() instanceof StraightArrow) {classe = Components.StraightArrow;
															 s.setObject(classe.toString());
															 s.setNome(null);}				
		else if (istanza.getOgg() instanceof CurvedArrow) {classe = Components.CurvedArrow;
														   s.setObject(classe.toString());
														   s.setNome(null);}
		else if (istanza.getOgg() instanceof End) {classe = Components.End;
												   s.setObject(classe.toString());
												   s.setNome(((End)istanza.getOgg()).getName());}
		
	
		for (int j = 0; j < blockSchema.size(); j++)
			{
			
			if ((blockSchema.get(j).getOgg().getClass().toString().equals( (istanza.getOgg().getClass().toString())) ) 
					&& (j != posizione)
					&& (!(global.contains(new Integer(posizione+1)) )))
			   {
				
				
				switch (classe)
					{
					case Start: if (((Start)blockSchema.get(j).getOgg()).equals((Start)istanza.getOgg())){
					                hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
								break;
					case Block: if (((Block)blockSchema.get(j).getOgg()).equals((Block)istanza.getOgg())){
									hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
		              			break;
					case Node: if (((Node)blockSchema.get(j).getOgg()).equals((Node)istanza.getOgg())){
									hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
					            break;
					case StraightArrow: if (((StraightArrow)blockSchema.get(j).getOgg()).equals((StraightArrow)istanza.getOgg())){
									hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
				              	break;
					case CurvedArrow: if (((CurvedArrow)blockSchema.get(j).getOgg()).equals((CurvedArrow)istanza.getOgg())){
									hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
					            break;
					case End: if (((End)blockSchema.get(j).getOgg()).equals((End)istanza.getOgg())){
									hsline.add(new Integer(j+1));
									global.add(new Integer(j+1));}
					            break;            
					              
					} //fine switch
				
					
				}//fine se
			
				
			 }//fine for

		s.setLine(posizione+1);
		s.setLineDuplicate(hsline);
		
				  
			   
			
		
		
		return s;
	}	
	
	

	public static semanticsError getBlockUnlinked(ParserEnvironment env, Component<?> istanza, int posizione){
		
		semanticsError s = new semanticsError();
		Components classe = null;
		
		s.setLine(-1);	
		
		if ((istanza.getOgg() instanceof Block) && (!(globalLineArrowBlock.contains(((Block)istanza.getOgg()).getName())))
												&& (
													((env.getHsNameArrowOrigin().contains(((Block)istanza.getOgg()).getName())) == false) ||
											        ((env.getHsNameArrowDestination().contains(((Block)istanza.getOgg()).getName())) == false)    
											       )
											        )
		   {
			        classe = Components.Block;
			        globalLineArrowBlock.add(((Block)istanza.getOgg()).getName());
					 //serve per evitare che se il blocco è duplicato, venga generato un messaggio di mancato link due volte
				    s.setObject(classe.toString());
					s.setNome(((Block)istanza.getOgg()).getName());
					s.setLine(posizione+1);
					
			}//fine se
			
		return s;
	}
	
	
	public static semanticsError getNodeUnlinked(ParserEnvironment env, Component<?> istanza, int posizione){
		
		semanticsError s = new semanticsError();
		Components classe = null;
		
		s.setLine(-1);	
		
		if ((istanza.getOgg() instanceof Node) && (!(globalLineArrowNode.contains(((Node)istanza.getOgg()).getName())))
												&& ((env.getHsNameArrowOrigin().contains(((Node)istanza.getOgg()).getName())) == false)
												&& (
														((env.getHsNameArrowOrigin().contains(((Node)istanza.getOgg()).getName())) == false) ||
												        ((env.getHsNameArrowDestination().contains(((Node)istanza.getOgg()).getName())) == false)    
												       )
												        )
		   {
			        classe = Components.Node;
			        globalLineArrowNode.add(((Node)istanza.getOgg()).getName());
					 //serve per evitare che se il nodo è duplicato, venga generato un messaggio di mancato link due volte
				    s.setObject(classe.toString());
					s.setNome(((Node)istanza.getOgg()).getName());
					s.setLine(posizione+1);
					
			}//fine se
			
		return s;
	}	
	
	
/*
	public void handleError(String[] tokenNames, RecognitionException e, String rule,String msg){
			
		
		    String missing = ""; 
			String found = "";
			
				//String st = "Sintax Error. at [" + e.token.getLine() + 
		       // ", " + e.token.getCharPositionInLine()+"] : "
		       // + "Found " + tokenNames[e.token.getType()] + 
		       //  "(" + e.token.getText() + ") " //+ tk.getText()		        
		      //  ;
				//if (e instanceof MissingTokenException)
				//   st = st + m;
		  /* System.out.println(m);
		   System.out.println( e.getUnexpectedType()+"\n");
		   System.out.println( e.c+"\n");
		   System.out.println( e.index+"\n");
		   System.out.println( e.node+"\n");
		   System.out.println( e.getLocalizedMessage()+"\n");
		   System.out.println( e.getMessage()+"\n");
		   System.out.println( e.hashCode()+"\n");
		   System.out.println( e.toString()+"\n");
		   System.out.println( e.input+"\n");
		   System.out.println( e.getCause()+"\n");
		   System.out.println( e.getStackTrace()+"\n");
		   
			System.out.println( e.toString()+" k\n");
			System.out.println( rule+"\n");
			System.out.println( msg+"\n");
	     if (((e.toString().indexOf('<')) != -1) && ((e.toString().indexOf('>')) != -1))
		   missing = missing.concat(e.toString().substring((e.toString().indexOf('<')+1), (e.toString().indexOf('>'))));
		
		 if ((msg.indexOf('\'')) != -1)
		         found = found.concat(msg.substring((msg.indexOf('\'')+1), (msg.lastIndexOf('\''))));

		  if  ((languageLexer.getStart_label3() == 1))
		  {
			  
			  grammarList.add(new sintaxGrammarError("Non è stato rispettato il fomato di inseriemnto del campo LABEL: mancano le \" in chiusura",
                      e.line,
                      e.charPositionInLine));
              languageLexer.setStart_label(0);			  
		      }
			  
			  else if (missing.compareTo("") != 0)
			      {  
		     		grammarList.add(new sintaxGrammarError(rule,
												   found,
												   missing,
												   e.token.getLine(),
												   e.charPositionInLine));
			      }
			  else 
			     {
				  grammarList.add(new sintaxGrammarError(10,
						                                 e.token.getLine(),
						                                 e.charPositionInLine,
						                                 e.toString(),
						                                 rule, 
						                                 msg));
			     }
		   
		
  
		  
	  }
	*/

	}


