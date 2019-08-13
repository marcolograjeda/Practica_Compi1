package analizadores_datos;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import clases.Token;
%% 

%{
    public void agregarError(String lexema, String tipo){
        String linea, columna;
        linea = Integer.toString(yyline);
        columna = Integer.toString(yycolumn);
        graficadorbarras.GraficadorBarras.erroresSintacticos.add(new Token(0,lexema, tipo, linea, columna));

    }
%}

%class Lexico_Datos
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
num = ["-"]?[0-9]+
decimal = ["-"]?[0-9]+["."][0-9]+

%%
"=" {return new Symbol(sym.igual,yyline,yychar, yytext());}
"[" {return new Symbol(sym.corcheteA,yyline,yychar, yytext());}
"]" {return new Symbol(sym.corcheteC,yyline,yychar, yytext());}
"," {return new Symbol(sym.coma,yyline,yychar, yytext());}
"{" {return new Symbol(sym.llaveA,yyline,yychar, yytext());}
"}" {return new Symbol(sym.llaveC,yyline,yychar, yytext());}

"claves" {return new Symbol(sym.claves,yyline,yychar, yytext());}
"registros" {return new Symbol(sym.registros,yyline,yychar, yytext());}

\n {yychar=1;}

{comentario} { }
{comentarioMulti} { }
{espacios} { }
{num} {return new Symbol(sym.num,yyline,yychar, yytext());}
{decimal} {return new Symbol(sym.decimal,yyline,yychar, yytext());}
{cadena} {return new Symbol(sym.cadena,yyline,yychar, yytext());}

. {
    System.out.println("Error lexico "+ yytext() +" linea No: "+ yyline+ " columna: " +yychar); 
    agregarError(yytext(), "Lexico en archivo de datos");
}