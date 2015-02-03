grammar language;

options {
  k = 1;
  language = Java;
}

@lexer::header{ 
  package myCompiler;

}

@lexer::members{

  
  }
    
@header{
  package myCompiler;
  import myComponents.*;
  import myCompiler.ParserEnvironment;
  import myException.semanticsError;
  import myException.sintaxGrammarError;
  import org.antlr.runtime.*;
}
 
@members{
 
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

}
//--------------------------------------------------------------------------------------------------------- 
//************************************************ PARSER *************************************************
//---------------------------------------------------------------------------------------------------------


//quando si usano i fragment devi dichiararli per primo
//e chi li utilizza deve essere un terminale altrimenti non viene abilitata
//la simulazione all'interno di interpreter

fragment A : 'A'|'a';
fragment B : 'B'|'b'; 
fragment C : 'C'|'c';
fragment D : 'D'|'d';
fragment E : 'E'|'e';
fragment F : 'F'|'f';  
fragment G : 'G'|'g';
fragment H : 'H'|'h';
fragment I : 'I'|'i';
fragment J : 'J'|'j';
fragment K : 'K'|'k';
fragment L : 'L'|'l';  
fragment M : 'M'|'m'; 
fragment N : 'N'|'n'; 
fragment O : 'O'|'o';
fragment P : 'P'|'p';
fragment Q : 'Q'|'q';
fragment R : 'R'|'r';  
fragment S : 'S'|'s';
fragment T : 'T'|'t';
fragment U : 'U'|'u';
fragment V : 'V'|'v';
fragment W : 'W'|'w';
fragment X : 'X'|'x'; 
fragment Y : 'Y'|'y';
fragment Z : 'Z'|'z';

//--------------------------------start_rule-------------------------------------------------------------
block_schema
@init { init ();} 
         
            : 
              start {env.getBlockSchema().add(new Component<Start>(env.getStart()));} //caricamento in lista
          
              elements 
              end 
              connettors  
             
            ;
             
                       
  
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
start: DRAW_START  
       na=NAME {
                env.getStart().setName(na.getText());
                env.getHs().add(na.getText());//devo implementare il controllo semantico 3
                }
      co=coordinate? {
                        if (co != null ){
                       
                        env.getStart().setCoordinate(Coordinate.computCoord(co));
                        if ((Coordinate.computCoord(co).getX() < 0) || (Coordinate.computCoord(co).getY() < 0) )
                                  
                                   env.getErrorList().add(new semanticsError(na,4,"start"));
                        
                        }
                       } 
       lb=LABEL? {
                  if (lb != null )
                       env.getStart().setLabel(languageParser.cutDoubleQuote(lb.getText()));}
       s=SEMICOL{env.counter++;}
       ;
     
//--------------------------------------------------------------------------------------------------------

 
//--------------------------------------------------------------------------------------------------------
coordinate returns [String s]
          :{s="";
             }
          (op=OPEN_P {if (s!=null) s=s.concat(op.getText());} 
          n1=number {if (s!=null) s=s.concat(n1);}
          c=COMMA  {if (s!=null) s=s.concat(c.getText());}
          n2=number {if (s!=null) s=s.concat(n2);}
          cp=CLOSE_P{if (s!=null) s=s.concat(cp.getText());})
          ;
//--------------------------------------------------------------------------------------------------------



//--------------------------------------------------------------------------------------------------------
number returns [String n]
      :
      {n="";} 
      (m=MINUS {if (m!=null) n=n.concat(m.getText());}
      |p=PLUS {if (p!=null) n=n.concat(p.getText());} 
      )?
      (i=NUM_INT {n=n.concat(i.getText());} 
      |f=NUM_FLOAT {n=n.concat(f.getText());}
      ) 
      ;
//--------------------------------------------------------------------------------------------------------


 
//--------------------------------------------------------------------------------------------------------
elements: 
        block
        ({env.getBlock().clearElement();} block 
        |{env.getNode().clearElement();} node)* 
        
        ;
         
       
    
//--------------------------------------------------------------------------------------------------------        
  
//--------------------------------------------------------------------------------------------------------
block:
      DRAW_BLOCK 
      po=position {env.getBlock().setPosition(po);} 
      naref=NAME  {if ((env.getHs().contains(naref.getText())) == false)
                     env.getErrorList().add(new semanticsError(naref,1,"block"));
                  
                  
                      env.getBlock().setNameRef(naref.getText());
     
                        }
      di=distance {env.getBlock().setDistance(Elements.computeDistance(di));
                  }
      na=NAME  {env.getBlock().setName(na.getText());
                   env.getHs().add(na.getText());
                   if (Elements.computeDistance(di) < 0)
                                   env.getErrorList().add(new semanticsError(na,5,"block"));
                }
      lb=LABEL? { if (lb != null )
                        env.getBlock().setLabel(languageParser.cutDoubleQuote(lb.getText()));}
      SEMICOL {env.counter++;
               env.getBlockSchema().add(new Component<Block>(new Block(env.getBlock().getPosition(),
                                                                       env.getBlock().getNameRef(),
                                                                       env.getBlock().getDistance(),
                                                                       env.getBlock().getName(),
                                                                       env.getBlock().getLabel()
                                                                       
                                                                       )));
               } //caricamento in lista
      ;
    
   
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
distance returns [String s]
          :{s="";}
          (op=OPEN_P {s=s.concat(op.getText());}
          n=number {s=s.concat(n);} 
          cp=CLOSE_P {s=s.concat(cp.getText());}
          )
          ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
position returns [String s]
        :
        (l=LEFT_OF  {s=l.getText();} 
        |r=RIGHT_OF {s=r.getText();}
        |a=ABOVE_OF {s=a.getText();}
        |b=BELOW_OF {s=b.getText();}
        )
        ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
node:
    DRAW_NODE 
    pos=position {env.getNode().setPosition(pos);}  
    nameref=NAME {env.getNode().setNameRef(nameref.getText());
                 if ((env.getHs().contains(nameref.getText())) == false)
                      env.getErrorList().add(new semanticsError(nameref,1,"node"));}
    dis=distance {env.getNode().setDistance(Elements.computeDistance(dis));}
    name=NAME  {env.getNode().setName(name.getText());
                 env.getHs().add(name.getText());
                 if (Elements.computeDistance(dis) < 0)
                                   env.getErrorList().add(new semanticsError(name,5,"node"));}
    lbn=LABEL_NODE? {//env.setOptional_node(1);
                     if (lbn != null )
                       env.getNode().setLabel(languageParser.cutDoubleQuote(lbn.getText()));}
    SEMICOL {  env.counter++;
               env.getBlockSchema().add(new Component<Node>(new Node(env.getNode().getPosition(),
                                                                       env.getNode().getNameRef(),
                                                                       env.getNode().getDistance(),
                                                                       env.getNode().getName(),
                                                                       env.getNode().getLabel()
                                                                       
                                                                       )));
               } //caricamento in lista
     ;
 
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
LABEL_NODE:
          (DOUBLE_QUOTE
           ( PLUS
           | MINUS
           | QUEST
           | ' '
           )
          DOUBLE_QUOTE)
          ;
          
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
connettors:  //ce ne devono essere almeno 2 per essere attaccate al minimo di un blocco
           arrow 
           (arrow)+
           ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
arrow: 
      ({env.getStraightArrow().clearConnettor();} straight_arrow 
      |{env.getCurvedArrow().clearConnettor();} curved_arrow)
      ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
straight_arrow:{char orientation=' ';}
              DRAW_ARROW
              or=NAME {env.getStraightArrow().setOrigin(or.getText());
                      
                      if ((env.getHs().contains(or.getText())) == false)
                          env.getErrorList().add(new semanticsError(or,1,"arrow"));} 
              (gt=GREATER_THAN { orientation = gt.getText().charAt(0);}
              |lt=LESS_THAN { orientation = lt.getText().charAt(0);}
              )
              des=NAME {env.getStraightArrow().setDestination(des.getText());
                        if ((env.getHs().contains(des.getText())) == false)
                            env.getErrorList().add(new semanticsError(des,1,"arrow"));} 
              SEMICOL {env.counter++;
                         
                         env.getBlockSchema().add(new Component<StraightArrow>(new StraightArrow(
                                                                       env.getStraightArrow().getOrigin(),
                                                                       env.getStraightArrow().getDestination(),
                                                                       orientation
                                                                       )));}
              ;
//--------------------------------------------------------------------------------------------------------             
       

//--------------------------------------------------------------------------------------------------------
curved_arrow:{char orientation=' ';}
             DRAW_CURVED_ARROW
             or=NAME {env.getCurvedArrow().setOrigin(or.getText());
                     
                      if ((env.getHs().contains(or.getText())) == false)
                          env.getErrorList().add(new semanticsError(or,1,"curved_arrow"));} 
             (gt=GREATER_THAN { orientation = gt.getText().charAt(0);}
             |lt=LESS_THAN { orientation = lt.getText().charAt(0);}
             )
             des=NAME {env.getCurvedArrow().setDestination(des.getText());
                       if ((env.getHs().contains(des.getText())) == false)
                      env.getErrorList().add(new semanticsError(des,1,"curved_arrow"));} 
             sh = shift {env.getCurvedArrow().setShift(Connettors.computeShift(sh));}  
             SEMICOL {env.counter++;
                        env.getBlockSchema().add(new Component<CurvedArrow>(new CurvedArrow(
                                                                       env.getCurvedArrow().getOrigin(),
                                                                       env.getCurvedArrow().getDestination(),
                                                                       env.getCurvedArrow().getShift(),
                                                                       orientation
                                                                       )));}
             ;
//--------------------------------------------------------------------------------------------------------



//--------------------------------------------------------------------------------------------------------             
shift returns [String shift]
      :{shift="";}
      (
      op=OPEN_P {shift=shift.concat(op.getText());}  
      ex=exit_from_element {shift=shift.concat(ex);}  
      cp=CLOSE_P {shift=shift.concat(cp.getText());}
      )
      ;
//--------------------------------------------------------------------------------------------------------



//--------------------------------------------------------------------------------------------------------      
exit_from_element returns [String exit]
          :
          (l=LEFT  {exit=l.getText();}
          |r=RIGHT {exit=r.getText();}
          |a=ABOVE {exit=a.getText();}
          |b=BELOW {exit=b.getText();}  
          )
          ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
end: 
   (DRAW_END 
   end_parameters
   SEMICOL {env.counter++;} //caricamento in lista}
   )+
   ;
   
   
    
//--------------------------------------------------------------------------------------------------------   

//--------------------------------------------------------------------------------------------------------   
end_parameters:
              (na=NAME {env.getEnd().setName(na.getText());
                       // if ((env.getHs().contains(na.getText())) == true)
                       //     env.getErrorList().add(new semanticsError(na,3,"end"));
                       // else
                            env.getHs().add(na.getText());}
               co=coordinate? {if (co != null ){
                        env.getEnd().setCoordinate(Coordinate.computCoord(co));
                        if ((Coordinate.computCoord(co).getX() < 0) || (Coordinate.computCoord(co).getY() < 0) )
                                   env.getErrorList().add(new semanticsError(na,4,"end"));}} 
               lb=LABEL? {if (lb != null )
                          env.getEnd().setLabel(languageParser.cutDoubleQuote(lb.getText()));
                          
                          env.getBlockSchema().add(new Component<End>(new End(env.getEnd().getName(),env.getEnd().getCoordinate(), env.getEnd().getLabel())));}
              )
              | // 2 costruttori
              (  pos=position {env.getEnd().setPosition(pos);} 
                 nameref=NAME {env.getEnd().setNameRef(nameref.getText());
                              if ((env.getHs().contains(nameref.getText())) == false)
                                    env.getErrorList().add(new semanticsError(nameref,1,"end"));}
                 dis=distance {env.getEnd().setDistance(Elements.computeDistance(dis));}
                 name=NAME  {env.getEnd().setName(name.getText());
                                  env.getHs().add(name.getText());
                                  if (Elements.computeDistance(dis) < 0)
                                      env.getErrorList().add(new semanticsError(name,5,"end"));}
                 lbn=LABEL? {if (lbn != null )
                       env.getEnd().setLabel(languageParser.cutDoubleQuote(lbn.getText()));
                       
                        env.getBlockSchema().add(new Component<End>(new End(env.getEnd().getPosition(),
                                                                            env.getEnd().getNameRef(),
                                                                            env.getEnd().getDistance(),
                                                                            env.getEnd().getName(),
                                                                            env.getEnd().getLabel())));}
              )
              ;
              
              
              
    
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------- 
//************************************************* LEXER *************************************************
//---------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------
DRAW_START: D R A W UNDERSCORE S T A R T;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
DRAW_BLOCK: D R A W UNDERSCORE B L O C K;
//--------------------------------------------------------------------------------------------------------            

//--------------------------------------------------------------------------------------------------------
DRAW_ARROW: D R A W UNDERSCORE A R R O W;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
DRAW_CURVED_ARROW:  D R A W UNDERSCORE C U R V E D UNDERSCORE A R R O W;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
DRAW_END:  D R A W UNDERSCORE E N D;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------            
DRAW_NODE:  D R A W UNDERSCORE N O D E;            
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
LEFT_OF: L E F T UNDERSCORE O F;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------         
RIGHT_OF: R I G H T UNDERSCORE O F;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------          
ABOVE_OF: A B O V E UNDERSCORE O F;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
BELOW_OF: B E L O W UNDERSCORE O F;
//--------------------------------------------------------------------------------------------------------         

//--------------------------------------------------------------------------------------------------------          
LEFT: L E F T;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------         
RIGHT: R I G H T;
//--------------------------------------------------------------------------------------------------------         

//--------------------------------------------------------------------------------------------------------
ABOVE: A B O V E;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
BELOW: B E L O W;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
OVER: O V E R;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
UNDER: U N D E R;
//--------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------
fragment LETTER:
       ('a'..'z'
       |'A'..'Z')
       ;
//--------------------------------------------------------------------------------------------------------


//definizione simboli-------------------------------------------------------------------------------------
AT           : '@' ;
DOUBLE_QUOTE : '"' ;
PERCENT      : '%' ;
AMP          : '&' ;
SINGLE_QUOTE : '\'';
OPEN_P       : '(' ;
CLOSE_P      : ')' ;
OPEN_SB      : '[' ;
OPEN_GRAPH   : '{' ;
CLOSE_GRAPH  : '}' ;
CLOSE_SB     : ']' ;
ASTERISK     : '*' ;
PLUS         : '+' ;
MINUS        : '-' ;
DOT          : '.' ;
COMMA        : ',' ;
COL          : ':' ; 
SEMICOL      : ';' ;
SLASH        : '/' ;
BACK_SLASH   : '\\';
EQ           : '=' ;
NOT_EQ       : '<>';
LESS_THAN    : '<' ;
GREATER_THAN : '>' ;
LESS_EQ      : '<=';
GREATER_EQ   : '>=';
QUEST        : '?' ;
UNDERSCORE   : '_' ;
VERT_BAR     : '|' ;
APICS        : '^' ;
//--------------------------------------------------------------------------------------------------------
 

// NUMERI-------------------------------------------------------------------------------------------------
NUM_INT: '0'|
          (('1'..'9')('0'..'9')*)
          ;

NUM_FLOAT : NUM_INT
            |(NUM_INT DOT NUM_INT+ )
            |( DOT NUM_INT+ )
            ;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------       
NAME:  //vincolo la partenza ad una lettera e poi numeri e/o due dimboli: " - " " _ " solitamente usati nei nomi 
      LETTER 
      (LETTER 
      | NUM_INT
      | UNDERSCORE
      )*
;
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
LABEL:    
      ( DOUBLE_QUOTE 
      ( LETTER 
      | NUM_INT
      | UNDERSCORE
      | OPEN_SB
      | OPEN_P
      | CLOSE_P
      | CLOSE_SB
      | APICS
      | ASTERISK
      | SLASH
      | MINUS
      | PLUS
      | OPEN_GRAPH
      | CLOSE_GRAPH
      | ' '
      )+
      DOUBLE_QUOTE )
       //se la LABEL c'è deve iniziare con una lettera ed essere costituita poi da 
       //quello che si vuole e terminare con il carattere " ; " che può comparire una sola volta
       //avendo significato di separatore di paramtri
      ;
     
//--------------------------------------------------------------------------------------------------------


// SPAZI BIANCHI, RIENTIRI, A CAPO------------------------------------------------------------------------
WS  : ( ' '           
      | '\t'
      | '\r'
      | '\n'
      ){$channel=HIDDEN;};
//--------------------------------------------------------------------------------------------------------      

//--------------------------------------------------------------------------------------------------------      
SCAN_ERROR   
  : . //carattere jolly. Stà ad indicare qualsiasi altra cosa diversa dalle regole identificate
    {System.out.println("\r Trovato Errore: carattere non identificato \r");
     }
  ; 
//--------------------------------------------------------------------------------------------------------      
  
  
 