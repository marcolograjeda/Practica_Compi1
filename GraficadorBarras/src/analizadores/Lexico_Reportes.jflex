package analizadores;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import graficadorbarras.*;
import clases.Token;
%% 

%{
    public void agregarError(String lexema, String tipo){
        String linea, columna;
        linea = Integer.toString(yyline);
        columna = Integer.toString(yycolumn);
        graficadorbarras.GraficadorBarras.erroresLexicos.add(new Token(0,lexema, tipo, linea, columna));
    }
%}

%class Lexico_Reportes
%public 
%unicode
%full
%line 
%char 
%column
%ignorecase
%cup
%8bit

espacios = [ |\r|\t|\n|\f]*
comentario = ["/"]["/"][^\r\n]*[\n|\r|\r\n|\n\r]?
comentarioMulti = "/*" [^*] ~"*/" | "/*" "*"+ "/"
cadena = [\"][^\"\n]*[\"]
identificador = [A-Za-zñÑ]("_"|[A-Za-zñÑ]|[0-9])*
num = ("-")?[0-9]+
decimal = ["-"]?[0-9]+["."][0-9]+

%%
";" {return new Symbol(sym.puntocoma,yyline,yychar, yytext());}
"," {return new Symbol(sym.coma,yyline,yychar, yytext());}
"(" {return new Symbol(sym.parentesisA,yyline,yychar, yytext());}
")" {return new Symbol(sym.parentesisC,yyline,yychar, yytext());}
"=" {return new Symbol(sym.igual,yyline,yychar, yytext());}
">" {return new Symbol(sym.mayor,yyline,yychar, yytext());}
"<" {return new Symbol(sym.menor,yyline,yychar, yytext());}
">=" {return new Symbol(sym.mayorigual,yyline,yychar, yytext());}
"<=" {return new Symbol(sym.menorigual,yyline,yychar, yytext());}
"==" {return new Symbol(sym.igualigual,yyline,yychar, yytext());}
"!=" {return new Symbol(sym.noigual,yyline,yychar, yytext());}

"leerarchivo" {return new Symbol(sym.leerarchivo,yyline,yychar, yytext());}
"sumar" {return new Symbol(sym.sumar,yyline,yychar, yytext());}
"contar" {return new Symbol(sym.contar,yyline,yychar, yytext());}
"promedio" {return new Symbol(sym.promedio,yyline,yychar, yytext());}
"contarsi" {return new Symbol(sym.contarsi,yyline,yychar, yytext());}
"obtenersi" {return new Symbol(sym.obtenersi,yyline,yychar, yytext());}
"Graficar" {return new Symbol(sym.graficar,yyline,yychar, yytext());}
"cadena" {return new Symbol(sym.tipoCadena,yyline,yychar, yytext());}
"numerico" {return new Symbol(sym.numerico,yyline,yychar, yytext());}
"archivo" {return new Symbol(sym.archivo,yyline,yychar, yytext());}
"imprimir" {return new Symbol(sym.imprimir,yyline,yychar, yytext());}


\n {yychar=1;}

{comentario} { }
{comentarioMulti} { }
{espacios} { }
{num} {return new Symbol(sym.num,yyline,yychar, yytext());}
{decimal} {return new Symbol(sym.decimal,yyline,yychar, yytext());}
{cadena} {return new Symbol(sym.cadena,yyline,yychar, yytext());}
{identificador} {return new Symbol(sym.identificador,yyline,yychar, yytext());}

. {
    System.out.println("Error lexico "+ yytext() +" linea No: "+ yyline+ " columna: " +yychar); 
    agregarError(yytext(), "Lexico en archivo de reportes");
}