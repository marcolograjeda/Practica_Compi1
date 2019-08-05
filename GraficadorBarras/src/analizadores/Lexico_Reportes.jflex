package analizadores;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import hojatrabajo1.*;
import clases.Token;
%% 

%{
    public void agregarError(String lexema, String tipo){
        String linea, columna;
        linea = Integer.toString(yyline);
        columna = Integer.toString(yycolumn);
        hojatrabajo1.HojaTrabajo1.listaErrores.add(new Token(0,lexema, tipo, linea, columna));

    }
    public ArrayList<Token> listaTokens = HojaTrabajo1.tokens;
    public void agregarToken(int num, String lexema, String tipo){
        listaTokens.add(new Token(num, lexema, tipo, Integer.toString(yyline), Integer.toString(yycolumn)));
    }
%}

%cupsym sym
%class Lexico_Reportes
%cup
%public
%unicode
%line 
%column
%char
%full
%8bit
%ignorecase

espacios = [ |\r|\t|\n|\f]*
identificador = [A-Za-zñÑ]("_"|[A-Za-zñÑ]|[0-9])*
num = ("-")?[0-9]+

%%
";" {agregarToken(1,yytext(), "Punto y Coma"); 
    return new Symbol(sym.puntocoma,yyline,yychar, yytext());}
"," {agregarToken(1,yytext(), "Coma"); 
    return new Symbol(sym.coma,yyline,yychar, yytext());}
"(" {agregarToken(1,yytext(), "ParenA"); 
    return new Symbol(sym.parentesisa,yyline,yychar, yytext());}
")" {agregarToken(1,yytext(), "ParenC"); 
    return new Symbol(sym.parentesisc,yyline,yychar, yytext());}
"[" {}
"]" {}

"extraer" {agregarToken(1,yytext(), "ParenC"); 
    return new Symbol(sym.extraer,yyline,yychar, yytext());}


\n {yychar=1;}

{espacios} {}
{identificador} {agregarToken(1,yytext(), "Identificador"); 
    return new Symbol(sym.identificador,yyline,yychar, yytext());}
{num} {agregarToken(1,yytext(), "Numero"); 
    return new Symbol(sym.num,yyline,yychar, yytext());}

. {
    System.out.println("Error lexico "+ yytext() +" linea No: "+ yyline+ " columna: " +yychar); 
    agregarError(yytext(), "No se reconoce");
}