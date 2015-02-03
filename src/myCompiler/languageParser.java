// $ANTLR 3.4 C:\\Antlr\\LatexBlockDiagrams\\src\\language.g 2015-01-06 09:03:08

  package myCompiler;
  import myComponents.*;
  import myCompiler.ParserEnvironment;
  import myException.semanticsError;
  import myException.sintaxGrammarError;
  import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class languageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABOVE", "ABOVE_OF", "AMP", "APICS", "ASTERISK", "AT", "B", "BACK_SLASH", "BELOW", "BELOW_OF", "C", "CLOSE_GRAPH", "CLOSE_P", "CLOSE_SB", "COL", "COMMA", "D", "DOT", "DOUBLE_QUOTE", "DRAW_ARROW", "DRAW_BLOCK", "DRAW_CURVED_ARROW", "DRAW_END", "DRAW_NODE", "DRAW_START", "E", "EQ", "F", "G", "GREATER_EQ", "GREATER_THAN", "H", "I", "J", "K", "L", "LABEL", "LABEL_NODE", "LEFT", "LEFT_OF", "LESS_EQ", "LESS_THAN", "LETTER", "M", "MINUS", "N", "NAME", "NOT_EQ", "NUM_FLOAT", "NUM_INT", "O", "OPEN_GRAPH", "OPEN_P", "OPEN_SB", "OVER", "P", "PERCENT", "PLUS", "Q", "QUEST", "R", "RIGHT", "RIGHT_OF", "S", "SCAN_ERROR", "SEMICOL", "SINGLE_QUOTE", "SLASH", "T", "U", "UNDER", "UNDERSCORE", "V", "VERT_BAR", "W", "WS", "X", "Y", "Z"
    };

    public static final int EOF=-1;
    public static final int A=4;
    public static final int ABOVE=5;
    public static final int ABOVE_OF=6;
    public static final int AMP=7;
    public static final int APICS=8;
    public static final int ASTERISK=9;
    public static final int AT=10;
    public static final int B=11;
    public static final int BACK_SLASH=12;
    public static final int BELOW=13;
    public static final int BELOW_OF=14;
    public static final int C=15;
    public static final int CLOSE_GRAPH=16;
    public static final int CLOSE_P=17;
    public static final int CLOSE_SB=18;
    public static final int COL=19;
    public static final int COMMA=20;
    public static final int D=21;
    public static final int DOT=22;
    public static final int DOUBLE_QUOTE=23;
    public static final int DRAW_ARROW=24;
    public static final int DRAW_BLOCK=25;
    public static final int DRAW_CURVED_ARROW=26;
    public static final int DRAW_END=27;
    public static final int DRAW_NODE=28;
    public static final int DRAW_START=29;
    public static final int E=30;
    public static final int EQ=31;
    public static final int F=32;
    public static final int G=33;
    public static final int GREATER_EQ=34;
    public static final int GREATER_THAN=35;
    public static final int H=36;
    public static final int I=37;
    public static final int J=38;
    public static final int K=39;
    public static final int L=40;
    public static final int LABEL=41;
    public static final int LABEL_NODE=42;
    public static final int LEFT=43;
    public static final int LEFT_OF=44;
    public static final int LESS_EQ=45;
    public static final int LESS_THAN=46;
    public static final int LETTER=47;
    public static final int M=48;
    public static final int MINUS=49;
    public static final int N=50;
    public static final int NAME=51;
    public static final int NOT_EQ=52;
    public static final int NUM_FLOAT=53;
    public static final int NUM_INT=54;
    public static final int O=55;
    public static final int OPEN_GRAPH=56;
    public static final int OPEN_P=57;
    public static final int OPEN_SB=58;
    public static final int OVER=59;
    public static final int P=60;
    public static final int PERCENT=61;
    public static final int PLUS=62;
    public static final int Q=63;
    public static final int QUEST=64;
    public static final int R=65;
    public static final int RIGHT=66;
    public static final int RIGHT_OF=67;
    public static final int S=68;
    public static final int SCAN_ERROR=69;
    public static final int SEMICOL=70;
    public static final int SINGLE_QUOTE=71;
    public static final int SLASH=72;
    public static final int T=73;
    public static final int U=74;
    public static final int UNDER=75;
    public static final int UNDERSCORE=76;
    public static final int V=77;
    public static final int VERT_BAR=78;
    public static final int W=79;
    public static final int WS=80;
    public static final int X=81;
    public static final int Y=82;
    public static final int Z=83;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public languageParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public languageParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return languageParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Antlr\\LatexBlockDiagrams\\src\\language.g"; }


     
      ParserEnvironment env;

      
      
      
      void init () { 
        //System.out.println("Start Parsing\n");
        env = new ParserEnvironment ();
      }
      
      
      public ParserEnvironment getEnv(){
           return env;
      }
      
     
      
      public static String cutDoubleQuote(String s)
      {
        String a;
        a=s.substring((s.indexOf('"')+1), (s.length()-1));
        return (a);
      }  
     
     
     
     
     
     

     public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
      // if (!(e instanceof EarlyExitException))
       //{        
                    int found_next;
                  String hdr = getErrorHeader(e);//)getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString();
                  String msg;
                  msg = getErrorMessage(e, tokenNames); //+ " -->>> " +  getTokenErrorDisplay(e.token);
                  found_next = Integer.parseInt(getCurrentInputSymbol(input).toString().
                                     substring((getCurrentInputSymbol(input).toString().indexOf('<')+1), 
                                                (getCurrentInputSymbol(input).toString().indexOf('>'))));
                  String messaggio = e.getClass()+hdr + "--> "+msg+"\n -----> token: "
                                                    +e.token.getText() + "\n"  
                                                    +e.token.getTokenIndex()+"\n" 
                                                    + e.token.getType()+"\n" 
                                                    +e.token.getInputStream().toString()+"\n"
                                                    +" +++ "+   e.getStackTrace().toString() +
                        " c-> "+e.c+" e.index-> "+e.index+" e.getMessage()-> "+e.getMessage()+"\n"+
                        "regola-> " + getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString()+"\n"+
                        "stack-> "+ getRuleInvocationStack()+"\n"+
                        "DEFAULT_TOKEN_CHANNEL: " +  DEFAULT_TOKEN_CHANNEL + "\n" +
                        "INITIAL_FOLLOW_STACK_SIZE: " +  INITIAL_FOLLOW_STACK_SIZE + "\n" +
                        "MEMO_RULE_FAILED: " +  MEMO_RULE_FAILED + "\n" +
                        "MEMO_RULE_UNKNOWN: " +  MEMO_RULE_UNKNOWN + "\n" +
                        "NEXT_TOKEN_RULE_NAME: " +  NEXT_TOKEN_RULE_NAME + "\n" +
                        "computeContextSensitiveRuleFOLLOW(): " +  computeContextSensitiveRuleFOLLOW() + "\n" +                                 
                        "computeErrorRecoverySet() : " +  computeErrorRecoverySet()  + "\n" +                                 
                        "getBacktrackingLevel() : " +  getBacktrackingLevel()  + "\n" +                                 
                        "getCurrentInputSymbol(IntStream input): " +  getCurrentInputSymbol(input) + "\n" +                                 
                        "getNumberOfSyntaxErrors(): " +  getNumberOfSyntaxErrors() + "\n" +                                 
                        "getGrammarFileName(): " +  getGrammarFileName() + "\n" +                                 
                        "getRuleMemoizationCacheSize(): " +  getRuleMemoizationCacheSize() + "\n"                                  
                   +   "getSourceName(): " +  getSourceName() + "\n"                                  
                   +   "getTokenErrorDisplay(Token t): " +  getTokenErrorDisplay(e.token) + "\n"                                 
                   +   "getTokenNames(): " +  getTokenNames() + "\n";
                
                  
    			   //   Token tk = input.LT(1);
    			     
    			       if ((getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("start") == 0))
                    {
                    if ((msg.indexOf("SEMICOL")>-1) && !(msg.indexOf("label")>-1))
                          {
                          System.out.println(msg);
                          env.sintaxGrammarList.add(new sintaxGrammarError("Manca il terminatore di stringa dell'elemento START <;>\n",(e.line-1), e.charPositionInLine));
                          }
                        else if ((msg.indexOf("SEMICOL")>-1) && (msg.indexOf("label")>-1) ) //problema nella nota
                             env.sintaxGrammarList.add(new sintaxGrammarError("Problema nel formato della LABEL <\"...\">\n",e.line, e.charPositionInLine));
                        else 
                            {
                             if (found_next == 51) //nome
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando draw_start per disegnare l'oggetto\n",e.line, e.charPositionInLine));
                             else if ((found_next == 23) || (found_next == 57)|| (found_next == 70)) //iniziatori dei campi opzionali o il terminatore
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando draw_start e/o il nome dell'oggetto subito dopo il comando\n",e.line, e.charPositionInLine));
                             else
                            {
                               consumeUntil( input, 70); //consuma fino al terminatore, tanto sono sicuro che c è
                               env.sintaxGrammarList.add(new sintaxGrammarError("Errore esteso in <Start>. Rivedere la grammatica\n",e.line, e.charPositionInLine));
                            }
                            }         
        
                    }
                 else if ((getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("number") == 0) ||
                              (getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("coordinate") == 0))
                                   {
                                   env.sintaxGrammarList.add(new sintaxGrammarError("Errore nel formato del campo opzionale coordinate <(num,num)>\n",e.line, e.charPositionInLine));
                                //   consumeUntil( input, 70);
                                   }
                 else if (getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("block") == 0)
                        {
                        if (msg.indexOf("expecting SEMICOL")>-1) //problema nella nota
                            {
                            System.out.println(msg+" "+getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString());
                             env.sintaxGrammarList.add(new sintaxGrammarError("Problema nel formato della LABEL <\"...\">\n",e.line, e.charPositionInLine));
                        
                            }
                       
                       else if (msg.indexOf("SEMICOL")>-1){
                           System.out.println(msg+" "+getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString());
                           env.sintaxGrammarList.add(new sintaxGrammarError("Manca il terminatore di stringa del elemnto BLOCK <;>\n",(e.line-1), e.charPositionInLine));
                           }
                        else 
                            {
                             if ((found_next == 6)||(found_next == 14)||(found_next == 44)||(found_next == 67)) //6 14 44 67
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_block> per disegnare l'oggetto\n",e.line, e.charPositionInLine));
                             else if (found_next == 51) //nome riferiemnto
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_block>\n    e/o la posizione dell'oggetto BLOCK <above_of,below_of, right_of, left_of>\n    e/o il nome dell'oggetto a cui il blocco si riferisce\n    e/o la distanza dall'oggetto a cui ci si riferisce <(num)> \n",e.line, e.charPositionInLine));
                             else if (found_next == 57) //parentesi aperta della distanza
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il nome dell'oggetto a cui il blocco si riferisce\n    e/o il comando <draw_block>\n    e/o la posizione dell'oggetto BLOCK <above_of,below_of, right_of, left_of>\n",e.line, e.charPositionInLine));
                             else if ((found_next == 41)||(found_next == 70)) //parentesi aperta della distanza
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il nome dell'oggetto Block.\n    e/o il comando <draw_block>\n    e/o la posizione dell'oggetto BLOCK <above_of,below_of, right_of, left_of>\n    e/o il nome dell'oggetto a cui il blocco si riferisce\n",e.line, e.charPositionInLine));
                             
                             else
                            {
                               //consumeUntil( input, 70); //consuma fino al terminatore, tanto sono sicuro che c è
                               env.sintaxGrammarList.add(new sintaxGrammarError("Errore esteso. E' necessario che ci sia almeno un blocco. Rivedere la grammatica\n",e.line, e.charPositionInLine));
                               System.out.println(messaggio);
                            }
                            }         
                          
                        } 
                 else if (getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("node") == 0)
                        {
                        if (msg.indexOf("expecting SEMICOL")>-1) //problema nella nota
                            {
                            System.out.println(msg+" "+getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString());
                             env.sintaxGrammarList.add(new sintaxGrammarError("Problema nel formato della LABEL <\"...\">\n",e.line, e.charPositionInLine));
                        
                            }
                       
                       else if (msg.indexOf("SEMICOL")>-1){
                           System.out.println(msg+" "+getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString());
                           env.sintaxGrammarList.add(new sintaxGrammarError("Manca il terminatore di stringa del elemnto NODE <;>\n",(e.line-1), e.charPositionInLine));
                           }
                        else 
                            {
                             if ((found_next == 6)||(found_next == 14)||(found_next == 44)||(found_next == 67)) //6 14 44 67
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_node> per disegnare l'oggetto\n",e.line, e.charPositionInLine));
                             else if (found_next == 51) //nome riferiemnto
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_node>\n    e/o la posizione dell'oggetto NODE <above_of,below_of, right_of, left_of>\n    e/o il nome dell'oggetto a cui il nodo si riferisce\n    e/o la distanza dall'oggetto a cui ci si riferisce <(num)> \n",e.line, e.charPositionInLine));
                             else if (found_next == 57) //parentesi aperta della distanza
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il nome dell'oggetto a cui il blocco si riferisce\n    e/o il comando <draw_node>\n    e/o la posizione dell'oggetto NODE <above_of,below_of, right_of, left_of>\n",e.line, e.charPositionInLine));
                             else if ((found_next == 42)||(found_next == 70)) //parentesi aperta della distanza
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il nome dell'oggetto Node.\n    e/o il comando <draw_node>\n    e/o la posizione dell'oggetto NODE <above_of,below_of, right_of, left_of>\n    e/o il nome dell'oggetto a cui il nodo si riferisce\n",e.line, e.charPositionInLine));
                             
                             else
                            {
                               //consumeUntil( input, 70); //consuma fino al terminatore, tanto sono sicuro che c è
                               env.sintaxGrammarList.add(new sintaxGrammarError("Errore esteso. Rivedere la grammatica\n",e.line, e.charPositionInLine));
                               System.out.println(messaggio);
                            }
                            }         
                          
                        } 
                 
                 else if (getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("arrow") == 0)
                        {
                        if (msg.indexOf("SEMICOL")>-1){
                           System.out.println(msg+" "+getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString());
                           env.sintaxGrammarList.add(new sintaxGrammarError("Manca il terminatore di stringa del elemnto ARROW <;>\n",(e.line-1), e.charPositionInLine));
                           }
                        else if (found_next == 51)
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_arrow> per disegnare l'oggetto\n",e.line, e.charPositionInLine));
                        else
                            {
                               //consumeUntil( input, 70); //consuma fino al terminatore, tanto sono sicuro che c è
                               env.sintaxGrammarList.add(new sintaxGrammarError("Errore esteso. Rivedere la grammatica\n",e.line, e.charPositionInLine));
                               System.out.println(messaggio);
                            }
                        
                        
                        
                        }
                 
                 
                 
                 else if ((getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("position") == 0))
                                   {
                                   env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_block>\n",e.line, e.charPositionInLine));
                                //   consumeUntil( input, 70);
                                   }
                 else if ((getRuleInvocationStack().get(getRuleInvocationStack().size()-2).toString().compareTo("end") == 0)&&
                           ((msg.toString().indexOf("(...)+"))>-1))
                    {
                    if ((found_next == 6)||(found_next == 14)||(found_next == 44)||(found_next == 67)) //6 14 44 67
                                     env.sintaxGrammarList.add(new sintaxGrammarError("Manca il comando <draw_node> per disegnare l'oggetto\n",e.line, e.charPositionInLine));
                    else
                      {         
                      env.sintaxGrammarList.add(new sintaxGrammarError("Errore distribuito tra i componenti <Block> e <Node>. Compreso tra la riga ["+e.line+"] e il componente <End>" ,e.line, e.charPositionInLine));
                           System.out.println(messaggio);
                        
                      }
                    }
                 else
                 {
                 env.sintaxGrammarList.add(new sintaxGrammarError(messaggio,e.line, e.charPositionInLine
                        ));
              }
             
     			
    			      // Token tk = input.LT(1); 
    			       //env.handleError(tokenNames,e,hdr,msg); 
    			     
    			      // env.addError("Sintax Error. at line" + tk.getLine() + 
    			        //                        ", column " + tk.getPositionInline() ); 
               }
       
    //}//finese




    // $ANTLR start "block_schema"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:285:1: block_schema : start elements end connettors ;
    public final void block_schema() throws RecognitionException {
         init ();
        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:288:13: ( start elements end connettors )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:289:15: start elements end connettors
            {
            pushFollow(FOLLOW_start_in_block_schema413);
            start();

            state._fsp--;


            env.getBlockSchema().add(new Component<Start>(env.getStart()));

            pushFollow(FOLLOW_elements_in_block_schema443);
            elements();

            state._fsp--;


            pushFollow(FOLLOW_end_in_block_schema460);
            end();

            state._fsp--;


            pushFollow(FOLLOW_connettors_in_block_schema477);
            connettors();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block_schema"



    // $ANTLR start "start"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:302:1: start : DRAW_START na= NAME (co= coordinate )? (lb= LABEL )? s= SEMICOL ;
    public final void start() throws RecognitionException {
        Token na=null;
        Token lb=null;
        Token s=null;
        String co =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:302:6: ( DRAW_START na= NAME (co= coordinate )? (lb= LABEL )? s= SEMICOL )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:302:8: DRAW_START na= NAME (co= coordinate )? (lb= LABEL )? s= SEMICOL
            {
            match(input,DRAW_START,FOLLOW_DRAW_START_in_start556); 

            na=(Token)match(input,NAME,FOLLOW_NAME_in_start569); 


                            env.getStart().setName(na.getText());
                            env.getHs().add(na.getText());//devo implementare il controllo semantico 3
                            

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:307:9: (co= coordinate )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==OPEN_P) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:307:9: co= coordinate
                    {
                    pushFollow(FOLLOW_coordinate_in_start581);
                    co=coordinate();

                    state._fsp--;


                    }
                    break;

            }



                                    if (co != null ){
                                   
                                    env.getStart().setCoordinate(Coordinate.computCoord(co));
                                    if ((Coordinate.computCoord(co).getX() < 0) || (Coordinate.computCoord(co).getY() < 0) )
                                              
                                               env.getErrorList().add(new semanticsError(na,4,"start"));
                                    
                                    }
                                   

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:317:10: (lb= LABEL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LABEL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:317:10: lb= LABEL
                    {
                    lb=(Token)match(input,LABEL,FOLLOW_LABEL_in_start596); 

                    }
                    break;

            }



                              if (lb != null )
                                   env.getStart().setLabel(languageParser.cutDoubleQuote(lb.getText()));

            s=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_start610); 

            env.counter++;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "coordinate"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:327:1: coordinate returns [String s] : (op= OPEN_P n1= number c= COMMA n2= number cp= CLOSE_P ) ;
    public final String coordinate() throws RecognitionException {
        String s = null;


        Token op=null;
        Token c=null;
        Token cp=null;
        String n1 =null;

        String n2 =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:328:11: ( (op= OPEN_P n1= number c= COMMA n2= number cp= CLOSE_P ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:328:12: (op= OPEN_P n1= number c= COMMA n2= number cp= CLOSE_P )
            {
            s="";
                         

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:330:11: (op= OPEN_P n1= number c= COMMA n2= number cp= CLOSE_P )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:330:12: op= OPEN_P n1= number c= COMMA n2= number cp= CLOSE_P
            {
            op=(Token)match(input,OPEN_P,FOLLOW_OPEN_P_in_coordinate665); 

            if (s!=null) s=s.concat(op.getText());

            pushFollow(FOLLOW_number_in_coordinate682);
            n1=number();

            state._fsp--;


            if (s!=null) s=s.concat(n1);

            c=(Token)match(input,COMMA,FOLLOW_COMMA_in_coordinate698); 

            if (s!=null) s=s.concat(c.getText());

            pushFollow(FOLLOW_number_in_coordinate715);
            n2=number();

            state._fsp--;


            if (s!=null) s=s.concat(n2);

            cp=(Token)match(input,CLOSE_P,FOLLOW_CLOSE_P_in_coordinate731); 

            if (s!=null) s=s.concat(cp.getText());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "coordinate"



    // $ANTLR start "number"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:341:1: number returns [String n] : (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT ) ;
    public final String number() throws RecognitionException {
        String n = null;


        Token m=null;
        Token p=null;
        Token i=null;
        Token f=null;

        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:342:7: ( (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:343:7: (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT )
            {
            n="";

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:344:7: (m= MINUS |p= PLUS )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MINUS) ) {
                alt3=1;
            }
            else if ( (LA3_0==PLUS) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:344:8: m= MINUS
                    {
                    m=(Token)match(input,MINUS,FOLLOW_MINUS_in_number784); 

                    if (m!=null) n=n.concat(m.getText());

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:345:8: p= PLUS
                    {
                    p=(Token)match(input,PLUS,FOLLOW_PLUS_in_number797); 

                    if (p!=null) n=n.concat(p.getText());

                    }
                    break;

            }


            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:347:7: (i= NUM_INT |f= NUM_FLOAT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NUM_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==NUM_FLOAT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:347:8: i= NUM_INT
                    {
                    i=(Token)match(input,NUM_INT,FOLLOW_NUM_INT_in_number820); 

                    n=n.concat(i.getText());

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:348:8: f= NUM_FLOAT
                    {
                    f=(Token)match(input,NUM_FLOAT,FOLLOW_NUM_FLOAT_in_number834); 

                    n=n.concat(f.getText());

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "number"



    // $ANTLR start "elements"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:356:1: elements : block ( block | node )* ;
    public final void elements() throws RecognitionException {
        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:356:9: ( block ( block | node )* )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:357:9: block ( block | node )*
            {
            pushFollow(FOLLOW_block_in_elements873);
            block();

            state._fsp--;


            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:358:9: ( block | node )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DRAW_BLOCK) ) {
                    alt5=1;
                }
                else if ( (LA5_0==DRAW_NODE) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:358:10: block
            	    {
            	    env.getBlock().clearElement();

            	    pushFollow(FOLLOW_block_in_elements886);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:359:10: node
            	    {
            	    env.getNode().clearElement();

            	    pushFollow(FOLLOW_node_in_elements900);
            	    node();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "elements"



    // $ANTLR start "block"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:368:1: block : DRAW_BLOCK po= position naref= NAME di= distance na= NAME (lb= LABEL )? SEMICOL ;
    public final void block() throws RecognitionException {
        Token naref=null;
        Token na=null;
        Token lb=null;
        String po =null;

        String di =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:368:6: ( DRAW_BLOCK po= position naref= NAME di= distance na= NAME (lb= LABEL )? SEMICOL )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:369:7: DRAW_BLOCK po= position naref= NAME di= distance na= NAME (lb= LABEL )? SEMICOL
            {
            match(input,DRAW_BLOCK,FOLLOW_DRAW_BLOCK_in_block961); 

            pushFollow(FOLLOW_position_in_block972);
            po=position();

            state._fsp--;


            env.getBlock().setPosition(po);

            naref=(Token)match(input,NAME,FOLLOW_NAME_in_block985); 

            if ((env.getHs().contains(naref.getText())) == false)
                                 env.getErrorList().add(new semanticsError(naref,1,"block"));
                              
                              
                                  env.getBlock().setNameRef(naref.getText());
                 
                                    

            pushFollow(FOLLOW_distance_in_block998);
            di=distance();

            state._fsp--;


            env.getBlock().setDistance(Elements.computeDistance(di));
                              

            na=(Token)match(input,NAME,FOLLOW_NAME_in_block1010); 

            env.getBlock().setName(na.getText());
                               env.getHs().add(na.getText());
                               if (Elements.computeDistance(di) < 0)
                                               env.getErrorList().add(new semanticsError(na,5,"block"));
                            

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:385:9: (lb= LABEL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LABEL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:385:9: lb= LABEL
                    {
                    lb=(Token)match(input,LABEL,FOLLOW_LABEL_in_block1023); 

                    }
                    break;

            }


             if (lb != null )
                                    env.getBlock().setLabel(languageParser.cutDoubleQuote(lb.getText()));

            match(input,SEMICOL,FOLLOW_SEMICOL_in_block1034); 

            env.counter++;
                           env.getBlockSchema().add(new Component<Block>(new Block(env.getBlock().getPosition(),
                                                                                   env.getBlock().getNameRef(),
                                                                                   env.getBlock().getDistance(),
                                                                                   env.getBlock().getName(),
                                                                                   env.getBlock().getLabel()
                                                                                   
                                                                                   )));
                           

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "distance"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:402:1: distance returns [String s] : (op= OPEN_P n= number cp= CLOSE_P ) ;
    public final String distance() throws RecognitionException {
        String s = null;


        Token op=null;
        Token cp=null;
        String n =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:403:11: ( (op= OPEN_P n= number cp= CLOSE_P ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:403:12: (op= OPEN_P n= number cp= CLOSE_P )
            {
            s="";

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:404:11: (op= OPEN_P n= number cp= CLOSE_P )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:404:12: op= OPEN_P n= number cp= CLOSE_P
            {
            op=(Token)match(input,OPEN_P,FOLLOW_OPEN_P_in_distance1091); 

            s=s.concat(op.getText());

            pushFollow(FOLLOW_number_in_distance1107);
            n=number();

            state._fsp--;


            s=s.concat(n);

            cp=(Token)match(input,CLOSE_P,FOLLOW_CLOSE_P_in_distance1124); 

            s=s.concat(cp.getText());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "distance"



    // $ANTLR start "position"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:412:1: position returns [String s] : (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF ) ;
    public final String position() throws RecognitionException {
        String s = null;


        Token l=null;
        Token r=null;
        Token a=null;
        Token b=null;

        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:413:9: ( (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:414:9: (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF )
            {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:414:9: (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF )
            int alt7=4;
            switch ( input.LA(1) ) {
            case LEFT_OF:
                {
                alt7=1;
                }
                break;
            case RIGHT_OF:
                {
                alt7=2;
                }
                break;
            case ABOVE_OF:
                {
                alt7=3;
                }
                break;
            case BELOW_OF:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:414:10: l= LEFT_OF
                    {
                    l=(Token)match(input,LEFT_OF,FOLLOW_LEFT_OF_in_position1182); 

                    s=l.getText();

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:415:10: r= RIGHT_OF
                    {
                    r=(Token)match(input,RIGHT_OF,FOLLOW_RIGHT_OF_in_position1199); 

                    s=r.getText();

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:416:10: a= ABOVE_OF
                    {
                    a=(Token)match(input,ABOVE_OF,FOLLOW_ABOVE_OF_in_position1214); 

                    s=a.getText();

                    }
                    break;
                case 4 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:417:10: b= BELOW_OF
                    {
                    b=(Token)match(input,BELOW_OF,FOLLOW_BELOW_OF_in_position1229); 

                    s=b.getText();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "position"



    // $ANTLR start "node"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:423:1: node : DRAW_NODE pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL_NODE )? SEMICOL ;
    public final void node() throws RecognitionException {
        Token nameref=null;
        Token name=null;
        Token lbn=null;
        String pos =null;

        String dis =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:423:5: ( DRAW_NODE pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL_NODE )? SEMICOL )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:424:5: DRAW_NODE pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL_NODE )? SEMICOL
            {
            match(input,DRAW_NODE,FOLLOW_DRAW_NODE_in_node1263); 

            pushFollow(FOLLOW_position_in_node1272);
            pos=position();

            state._fsp--;


            env.getNode().setPosition(pos);

            nameref=(Token)match(input,NAME,FOLLOW_NAME_in_node1284); 

            env.getNode().setNameRef(nameref.getText());
                             if ((env.getHs().contains(nameref.getText())) == false)
                                  env.getErrorList().add(new semanticsError(nameref,1,"node"));

            pushFollow(FOLLOW_distance_in_node1294);
            dis=distance();

            state._fsp--;


            env.getNode().setDistance(Elements.computeDistance(dis));

            name=(Token)match(input,NAME,FOLLOW_NAME_in_node1304); 

            env.getNode().setName(name.getText());
                             env.getHs().add(name.getText());
                             if (Elements.computeDistance(dis) < 0)
                                               env.getErrorList().add(new semanticsError(name,5,"node"));

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:434:8: (lbn= LABEL_NODE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LABEL_NODE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:434:8: lbn= LABEL_NODE
                    {
                    lbn=(Token)match(input,LABEL_NODE,FOLLOW_LABEL_NODE_in_node1315); 

                    }
                    break;

            }


            //env.setOptional_node(1);
                                 if (lbn != null )
                                   env.getNode().setLabel(languageParser.cutDoubleQuote(lbn.getText()));

            match(input,SEMICOL,FOLLOW_SEMICOL_in_node1324); 

              env.counter++;
                           env.getBlockSchema().add(new Component<Node>(new Node(env.getNode().getPosition(),
                                                                                   env.getNode().getNameRef(),
                                                                                   env.getNode().getDistance(),
                                                                                   env.getNode().getName(),
                                                                                   env.getNode().getLabel()
                                                                                   
                                                                                   )));
                           

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "node"



    // $ANTLR start "connettors"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:464:1: connettors : arrow ( arrow )+ ;
    public final void connettors() throws RecognitionException {
        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:464:11: ( arrow ( arrow )+ )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:465:12: arrow ( arrow )+
            {
            pushFollow(FOLLOW_arrow_in_connettors1485);
            arrow();

            state._fsp--;


            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:466:12: ( arrow )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DRAW_ARROW||LA9_0==DRAW_CURVED_ARROW) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:466:13: arrow
            	    {
            	    pushFollow(FOLLOW_arrow_in_connettors1500);
            	    arrow();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "connettors"



    // $ANTLR start "arrow"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:471:1: arrow : ( straight_arrow | curved_arrow ) ;
    public final void arrow() throws RecognitionException {
        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:471:6: ( ( straight_arrow | curved_arrow ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:472:7: ( straight_arrow | curved_arrow )
            {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:472:7: ( straight_arrow | curved_arrow )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DRAW_ARROW) ) {
                alt10=1;
            }
            else if ( (LA10_0==DRAW_CURVED_ARROW) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:472:8: straight_arrow
                    {
                    env.getStraightArrow().clearConnettor();

                    pushFollow(FOLLOW_straight_arrow_in_arrow1533);
                    straight_arrow();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:473:8: curved_arrow
                    {
                    env.getCurvedArrow().clearConnettor();

                    pushFollow(FOLLOW_curved_arrow_in_arrow1545);
                    curved_arrow();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arrow"



    // $ANTLR start "straight_arrow"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:478:1: straight_arrow : DRAW_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME SEMICOL ;
    public final void straight_arrow() throws RecognitionException {
        Token or=null;
        Token gt=null;
        Token lt=null;
        Token des=null;

        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:478:15: ( DRAW_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME SEMICOL )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:478:16: DRAW_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME SEMICOL
            {
            char orientation=' ';

            match(input,DRAW_ARROW,FOLLOW_DRAW_ARROW_in_straight_arrow1577); 

            or=(Token)match(input,NAME,FOLLOW_NAME_in_straight_arrow1595); 

            env.getStraightArrow().setOrigin(or.getText());
                                  
                                  if ((env.getHs().contains(or.getText())) == false)
                                      env.getErrorList().add(new semanticsError(or,1,"arrow"));

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:484:15: (gt= GREATER_THAN |lt= LESS_THAN )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==GREATER_THAN) ) {
                alt11=1;
            }
            else if ( (LA11_0==LESS_THAN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:484:16: gt= GREATER_THAN
                    {
                    gt=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_straight_arrow1617); 

                     orientation = gt.getText().charAt(0);

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:485:16: lt= LESS_THAN
                    {
                    lt=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_straight_arrow1638); 

                     orientation = lt.getText().charAt(0);

                    }
                    break;

            }


            des=(Token)match(input,NAME,FOLLOW_NAME_in_straight_arrow1674); 

            env.getStraightArrow().setDestination(des.getText());
                                    if ((env.getHs().contains(des.getText())) == false)
                                        env.getErrorList().add(new semanticsError(des,1,"arrow"));

            match(input,SEMICOL,FOLLOW_SEMICOL_in_straight_arrow1693); 

            env.counter++;
                                     
                                     env.getBlockSchema().add(new Component<StraightArrow>(new StraightArrow(
                                                                                   env.getStraightArrow().getOrigin(),
                                                                                   env.getStraightArrow().getDestination(),
                                                                                   orientation
                                                                                   )));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "straight_arrow"



    // $ANTLR start "curved_arrow"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:502:1: curved_arrow : DRAW_CURVED_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME sh= shift SEMICOL ;
    public final void curved_arrow() throws RecognitionException {
        Token or=null;
        Token gt=null;
        Token lt=null;
        Token des=null;
        String sh =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:502:13: ( DRAW_CURVED_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME sh= shift SEMICOL )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:502:14: DRAW_CURVED_ARROW or= NAME (gt= GREATER_THAN |lt= LESS_THAN ) des= NAME sh= shift SEMICOL
            {
            char orientation=' ';

            match(input,DRAW_CURVED_ARROW,FOLLOW_DRAW_CURVED_ARROW_in_curved_arrow1741); 

            or=(Token)match(input,NAME,FOLLOW_NAME_in_curved_arrow1758); 

            env.getCurvedArrow().setOrigin(or.getText());
                                 
                                  if ((env.getHs().contains(or.getText())) == false)
                                      env.getErrorList().add(new semanticsError(or,1,"curved_arrow"));

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:508:14: (gt= GREATER_THAN |lt= LESS_THAN )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GREATER_THAN) ) {
                alt12=1;
            }
            else if ( (LA12_0==LESS_THAN) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:508:15: gt= GREATER_THAN
                    {
                    gt=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_curved_arrow1779); 

                     orientation = gt.getText().charAt(0);

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:509:15: lt= LESS_THAN
                    {
                    lt=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_curved_arrow1799); 

                     orientation = lt.getText().charAt(0);

                    }
                    break;

            }


            des=(Token)match(input,NAME,FOLLOW_NAME_in_curved_arrow1833); 

            env.getCurvedArrow().setDestination(des.getText());
                                   if ((env.getHs().contains(des.getText())) == false)
                                  env.getErrorList().add(new semanticsError(des,1,"curved_arrow"));

            pushFollow(FOLLOW_shift_in_curved_arrow1855);
            sh=shift();

            state._fsp--;


            env.getCurvedArrow().setShift(Connettors.computeShift(sh));

            match(input,SEMICOL,FOLLOW_SEMICOL_in_curved_arrow1874); 

            env.counter++;
                                    env.getBlockSchema().add(new Component<CurvedArrow>(new CurvedArrow(
                                                                                   env.getCurvedArrow().getOrigin(),
                                                                                   env.getCurvedArrow().getDestination(),
                                                                                   env.getCurvedArrow().getShift(),
                                                                                   orientation
                                                                                   )));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "curved_arrow"



    // $ANTLR start "shift"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:528:1: shift returns [String shift] : (op= OPEN_P ex= exit_from_element cp= CLOSE_P ) ;
    public final String shift() throws RecognitionException {
        String shift = null;


        Token op=null;
        Token cp=null;
        String ex =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:529:7: ( (op= OPEN_P ex= exit_from_element cp= CLOSE_P ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:529:8: (op= OPEN_P ex= exit_from_element cp= CLOSE_P )
            {
            shift="";

            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:530:7: (op= OPEN_P ex= exit_from_element cp= CLOSE_P )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:531:7: op= OPEN_P ex= exit_from_element cp= CLOSE_P
            {
            op=(Token)match(input,OPEN_P,FOLLOW_OPEN_P_in_shift1929); 

            shift=shift.concat(op.getText());

            pushFollow(FOLLOW_exit_from_element_in_shift1943);
            ex=exit_from_element();

            state._fsp--;


            shift=shift.concat(ex);

            cp=(Token)match(input,CLOSE_P,FOLLOW_CLOSE_P_in_shift1957); 

            shift=shift.concat(cp.getText());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return shift;
    }
    // $ANTLR end "shift"



    // $ANTLR start "exit_from_element"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:541:1: exit_from_element returns [String exit] : (l= LEFT |r= RIGHT |a= ABOVE |b= BELOW ) ;
    public final String exit_from_element() throws RecognitionException {
        String exit = null;


        Token l=null;
        Token r=null;
        Token a=null;
        Token b=null;

        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:542:11: ( (l= LEFT |r= RIGHT |a= ABOVE |b= BELOW ) )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:543:11: (l= LEFT |r= RIGHT |a= ABOVE |b= BELOW )
            {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:543:11: (l= LEFT |r= RIGHT |a= ABOVE |b= BELOW )
            int alt13=4;
            switch ( input.LA(1) ) {
            case LEFT:
                {
                alt13=1;
                }
                break;
            case RIGHT:
                {
                alt13=2;
                }
                break;
            case ABOVE:
                {
                alt13=3;
                }
                break;
            case BELOW:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:543:12: l= LEFT
                    {
                    l=(Token)match(input,LEFT,FOLLOW_LEFT_in_exit_from_element2013); 

                    exit=l.getText();

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:544:12: r= RIGHT
                    {
                    r=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_exit_from_element2031); 

                    exit=r.getText();

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:545:12: a= ABOVE
                    {
                    a=(Token)match(input,ABOVE,FOLLOW_ABOVE_in_exit_from_element2048); 

                    exit=a.getText();

                    }
                    break;
                case 4 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:546:12: b= BELOW
                    {
                    b=(Token)match(input,BELOW,FOLLOW_BELOW_in_exit_from_element2065); 

                    exit=b.getText();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return exit;
    }
    // $ANTLR end "exit_from_element"



    // $ANTLR start "end"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:552:1: end : ( DRAW_END end_parameters SEMICOL )+ ;
    public final void end() throws RecognitionException {
        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:552:4: ( ( DRAW_END end_parameters SEMICOL )+ )
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:553:4: ( DRAW_END end_parameters SEMICOL )+
            {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:553:4: ( DRAW_END end_parameters SEMICOL )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==DRAW_END) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:553:5: DRAW_END end_parameters SEMICOL
            	    {
            	    match(input,DRAW_END,FOLLOW_DRAW_END_in_end2106); 

            	    pushFollow(FOLLOW_end_parameters_in_end2112);
            	    end_parameters();

            	    state._fsp--;


            	    match(input,SEMICOL,FOLLOW_SEMICOL_in_end2117); 

            	    env.counter++;

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "end"



    // $ANTLR start "end_parameters"
    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:564:1: end_parameters : ( (na= NAME (co= coordinate )? (lb= LABEL )? ) | (pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL )? ) );
    public final void end_parameters() throws RecognitionException {
        Token na=null;
        Token lb=null;
        Token nameref=null;
        Token name=null;
        Token lbn=null;
        String co =null;

        String pos =null;

        String dis =null;


        try {
            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:564:15: ( (na= NAME (co= coordinate )? (lb= LABEL )? ) | (pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            else if ( (LA18_0==ABOVE_OF||LA18_0==BELOW_OF||LA18_0==LEFT_OF||LA18_0==RIGHT_OF) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:565:15: (na= NAME (co= coordinate )? (lb= LABEL )? )
                    {
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:565:15: (na= NAME (co= coordinate )? (lb= LABEL )? )
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:565:16: na= NAME (co= coordinate )? (lb= LABEL )?
                    {
                    na=(Token)match(input,NAME,FOLLOW_NAME_in_end_parameters2169); 

                    env.getEnd().setName(na.getText());
                                           // if ((env.getHs().contains(na.getText())) == true)
                                           //     env.getErrorList().add(new semanticsError(na,3,"end"));
                                           // else
                                                env.getHs().add(na.getText());

                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:570:18: (co= coordinate )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==OPEN_P) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:570:18: co= coordinate
                            {
                            pushFollow(FOLLOW_coordinate_in_end_parameters2190);
                            co=coordinate();

                            state._fsp--;


                            }
                            break;

                    }


                    if (co != null ){
                                            env.getEnd().setCoordinate(Coordinate.computCoord(co));
                                            if ((Coordinate.computCoord(co).getX() < 0) || (Coordinate.computCoord(co).getY() < 0) )
                                                       env.getErrorList().add(new semanticsError(na,4,"end"));}

                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:574:18: (lb= LABEL )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LABEL) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:574:18: lb= LABEL
                            {
                            lb=(Token)match(input,LABEL,FOLLOW_LABEL_in_end_parameters2213); 

                            }
                            break;

                    }


                    if (lb != null )
                                              env.getEnd().setLabel(languageParser.cutDoubleQuote(lb.getText()));
                                              
                                              env.getBlockSchema().add(new Component<End>(new End(env.getEnd().getName(),env.getEnd().getCoordinate(), env.getEnd().getLabel())));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:580:15: (pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL )? )
                    {
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:580:15: (pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL )? )
                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:580:18: pos= position nameref= NAME dis= distance name= NAME (lbn= LABEL )?
                    {
                    pushFollow(FOLLOW_position_in_end_parameters2270);
                    pos=position();

                    state._fsp--;


                    env.getEnd().setPosition(pos);

                    nameref=(Token)match(input,NAME,FOLLOW_NAME_in_end_parameters2294); 

                    env.getEnd().setNameRef(nameref.getText());
                                                  if ((env.getHs().contains(nameref.getText())) == false)
                                                        env.getErrorList().add(new semanticsError(nameref,1,"end"));

                    pushFollow(FOLLOW_distance_in_end_parameters2317);
                    dis=distance();

                    state._fsp--;


                    env.getEnd().setDistance(Elements.computeDistance(dis));

                    name=(Token)match(input,NAME,FOLLOW_NAME_in_end_parameters2340); 

                    env.getEnd().setName(name.getText());
                                                      env.getHs().add(name.getText());
                                                      if (Elements.computeDistance(dis) < 0)
                                                          env.getErrorList().add(new semanticsError(name,5,"end"));

                    // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:589:21: (lbn= LABEL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LABEL) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:589:21: lbn= LABEL
                            {
                            lbn=(Token)match(input,LABEL,FOLLOW_LABEL_in_end_parameters2364); 

                            }
                            break;

                    }


                    if (lbn != null )
                                           env.getEnd().setLabel(languageParser.cutDoubleQuote(lbn.getText()));
                                           
                                            env.getBlockSchema().add(new Component<End>(new End(env.getEnd().getPosition(),
                                                                                                env.getEnd().getNameRef(),
                                                                                                env.getEnd().getDistance(),
                                                                                                env.getEnd().getName(),
                                                                                                env.getEnd().getLabel())));

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "end_parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_start_in_block_schema413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_elements_in_block_schema443 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_end_in_block_schema460 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_connettors_in_block_schema477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_START_in_start556 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_start569 = new BitSet(new long[]{0x0200020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_coordinate_in_start581 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LABEL_in_start596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_start610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_P_in_coordinate665 = new BitSet(new long[]{0x4062000000000000L});
    public static final BitSet FOLLOW_number_in_coordinate682 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_coordinate698 = new BitSet(new long[]{0x4062000000000000L});
    public static final BitSet FOLLOW_number_in_coordinate715 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_P_in_coordinate731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number784 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_PLUS_in_number797 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_NUM_INT_in_number820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_FLOAT_in_number834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_elements873 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_block_in_elements886 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_node_in_elements900 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_DRAW_BLOCK_in_block961 = new BitSet(new long[]{0x0000100000004040L,0x0000000000000008L});
    public static final BitSet FOLLOW_position_in_block972 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_block985 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_distance_in_block998 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_block1010 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LABEL_in_block1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_block1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_P_in_distance1091 = new BitSet(new long[]{0x4062000000000000L});
    public static final BitSet FOLLOW_number_in_distance1107 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_P_in_distance1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_OF_in_position1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_OF_in_position1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABOVE_OF_in_position1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BELOW_OF_in_position1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_NODE_in_node1263 = new BitSet(new long[]{0x0000100000004040L,0x0000000000000008L});
    public static final BitSet FOLLOW_position_in_node1272 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_node1284 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_distance_in_node1294 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_node1304 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LABEL_NODE_in_node1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_node1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrow_in_connettors1485 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_arrow_in_connettors1500 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_straight_arrow_in_arrow1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_curved_arrow_in_arrow1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_ARROW_in_straight_arrow1577 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_straight_arrow1595 = new BitSet(new long[]{0x0000400800000000L});
    public static final BitSet FOLLOW_GREATER_THAN_in_straight_arrow1617 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LESS_THAN_in_straight_arrow1638 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_straight_arrow1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_straight_arrow1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_CURVED_ARROW_in_curved_arrow1741 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_curved_arrow1758 = new BitSet(new long[]{0x0000400800000000L});
    public static final BitSet FOLLOW_GREATER_THAN_in_curved_arrow1779 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LESS_THAN_in_curved_arrow1799 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_curved_arrow1833 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_shift_in_curved_arrow1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_curved_arrow1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_P_in_shift1929 = new BitSet(new long[]{0x0000080000002020L,0x0000000000000004L});
    public static final BitSet FOLLOW_exit_from_element_in_shift1943 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_P_in_shift1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_exit_from_element2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_exit_from_element2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABOVE_in_exit_from_element2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BELOW_in_exit_from_element2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_END_in_end2106 = new BitSet(new long[]{0x0008100000004040L,0x0000000000000008L});
    public static final BitSet FOLLOW_end_parameters_in_end2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOL_in_end2117 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_NAME_in_end_parameters2169 = new BitSet(new long[]{0x0200020000000002L});
    public static final BitSet FOLLOW_coordinate_in_end_parameters2190 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LABEL_in_end_parameters2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_end_parameters2270 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_end_parameters2294 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_distance_in_end_parameters2317 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NAME_in_end_parameters2340 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LABEL_in_end_parameters2364 = new BitSet(new long[]{0x0000000000000002L});

}