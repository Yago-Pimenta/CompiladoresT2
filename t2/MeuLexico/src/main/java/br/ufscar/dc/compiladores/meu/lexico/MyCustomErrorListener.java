package br.ufscar.dc.compiladores.meu.lexico;

import java.io.PrintWriter;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
class MeuErrorListenerPersonalizado implements ANTLRErrorListener {

    private final PrintWriter writer;

    public MeuErrorListenerPersonalizado(PrintWriter writer) {
        this.writer = writer;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int column, String message, RecognitionException e) {
        String textoToken = (offendingSymbol instanceof Token) ? ((Token) offendingSymbol).getText() : "simbolo desconhecido";

        if ("<EOF>".equals(textoToken)) {
            textoToken = "EOF";
        }

        writer.printf("Linha %d: erro sintatico proximo a %s%n", line, textoToken);
        writer.println("Fim da compilacao");
        writer.flush();
        System.exit(1);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Método não utilizado
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Método não utilizado
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Método não utilizado
    }
}

