
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores_datos;

import java_cup.runtime.*;
import graficadorbarras.*;
import clases.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\003\000\002\003" +
    "\010\000\002\004\007\000\002\005\006\000\002\005\005" +
    "\000\002\010\005\000\002\010\003\000\002\006\005\000" +
    "\002\006\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\004\006\001\002\000\004\002\040\001" +
    "\002\000\004\002\000\001\002\000\004\015\007\001\002" +
    "\000\004\013\010\001\002\000\004\007\011\001\002\000" +
    "\006\014\ufff8\016\ufff8\001\002\000\006\014\014\016\013" +
    "\001\002\000\004\007\037\001\002\000\004\005\016\001" +
    "\002\000\004\002\uffff\001\002\000\004\015\017\001\002" +
    "\000\004\013\020\001\002\000\004\011\022\001\002\000" +
    "\006\011\033\014\034\001\002\000\010\006\025\007\024" +
    "\010\023\001\002\000\006\012\ufff6\016\ufff6\001\002\000" +
    "\006\012\ufff5\016\ufff5\001\002\000\006\012\ufff7\016\ufff7" +
    "\001\002\000\006\012\ufffa\016\ufffa\001\002\000\006\012" +
    "\030\016\031\001\002\000\006\011\ufffc\014\ufffc\001\002" +
    "\000\010\006\025\007\024\010\023\001\002\000\006\012" +
    "\ufffb\016\ufffb\001\002\000\010\006\025\007\024\010\023" +
    "\001\002\000\004\002\ufffe\001\002\000\006\012\036\016" +
    "\031\001\002\000\006\011\ufffd\014\ufffd\001\002\000\006" +
    "\014\ufff9\016\ufff9\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\020\001\001\000\002\001\001\000\006\007\025\010\026" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\031\001\001\000\002\001\001\000\006\007" +
    "\025\010\034\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    ArchivoDatos datos = graficadorbarras.GraficadorBarras.datos;
    public String salida = "";
    /**
    * Metodo para error sintactico
    **/

    public void errorSemantico(String tipo){
        graficadorbarras.GraficadorBarras.erroresSemanticos.add("Error semantico en "+ tipo +" en la linea ");  
    }
    public void syntax_error(Symbol s){
        System.err.println("Error sintacto línea " + (s.left) +" columna "+s.right+ ". No se esperaba " +s.value+"."); 
            //hojatrabajo1.HojaTrabajo1.erroresSintacticos.add(new Token(0,s.value.toString(), "Sintactico", Integer.toString(s.left), Integer.toString(s.right)));
        }
    
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        //System.err.println("Error irrecuperable en la linea " + (s.left)+ " columna " +s.right+". Elemento " + s.value + " no reconocido.");
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= CDAT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // CDAT ::= CLA 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CDAT",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLA ::= claves igual corcheteA LISTACAD corcheteC REGIS 
            {
              String RESULT =null;
		System.out.println("Entre a claves"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CLA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // REGIS ::= registros igual corcheteA LISTAR corcheteC 
            {
              String RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("REGIS",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LISTAR ::= LISTAR llaveA LISTAMIX llaveC 
            {
              String RESULT =null;
		int regisleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int regisright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Registro regis = (Registro)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		if(regis.datos.size() == datos.registros.get(0).datos.size()){
            datos.registros.add(regis);}else{
                errorSemantico("diferente largo de registro" + regisleft); 
            }
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTAR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LISTAR ::= llaveA LISTAMIX llaveC 
            {
              String RESULT =null;
		int regisleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int regisright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Registro regis = (Registro)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		datos.registros.add(regis);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTAR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LISTAMIX ::= LISTAMIX coma DATOS 
            {
              Registro RESULT =null;
		int regisleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int regisright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Registro regis = (Registro)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int datleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int datright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Dato dat = (Dato)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		regis.datos.add(dat); RESULT = regis;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTAMIX",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTAMIX ::= DATOS 
            {
              Registro RESULT =null;
		int datleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int datright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Dato dat = (Dato)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Registro nuevo = new Registro(); nuevo.datos.add(dat);
            RESULT = nuevo;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTAMIX",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTACAD ::= LISTACAD coma cadena 
            {
              String RESULT =null;
		int cadleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cadright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String cad = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Clave nueva = new Clave(cad);
                          datos.claves.add(nueva);
                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTACAD",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LISTACAD ::= cadena 
            {
              String RESULT =null;
		int cadleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cadright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String cad = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Clave nueva = new Clave(cad);
                          datos.claves.add(nueva);
                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTACAD",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DATOS ::= num 
            {
              Dato RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Dato dat = new Dato(0,"",Integer.parseInt(num),0); RESULT = dat;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DATOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DATOS ::= decimal 
            {
              Dato RESULT =null;
		int decleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String dec = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Dato dat = new Dato(1,"",0,Double.parseDouble(dec)); RESULT = dat;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DATOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DATOS ::= cadena 
            {
              Dato RESULT =null;
		int cadleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cadright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String cad = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Dato dat = new Dato(2,cad,0,0); RESULT = dat;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DATOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
