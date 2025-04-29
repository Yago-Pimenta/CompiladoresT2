package br.ufscar.dc.compiladores.meu.lexico;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;

public class Principal {

    public static void main(String[] argumentos) throws IOException {

        if (argumentos.length < 2) {
            System.err.println("Uso: java Principal <arquivo_entrada> <arquivo_saida>");
            System.exit(1);
        }

        String caminhoEntrada = argumentos[0];
        String caminhoSaida = argumentos[1];

        try (PrintWriter saida = new PrintWriter(new File(caminhoSaida))) {

            CharStream entrada = CharStreams.fromFileName(caminhoEntrada);
            MeuLexer analisadorLexico = new MeuLexer(entrada);
            CommonTokenStream tokenStream = new CommonTokenStream(analisadorLexico);
            MeuParser analisadorSintatico = new MeuParser(tokenStream);

            Token t;
            while ((t = analisadorLexico.nextToken()).getType() != Token.EOF) {
                String tipoToken = analisadorLexico.getVocabulary().getDisplayName(t.getType());

                if ("ERRO".equals(tipoToken)) {
                    saida.printf("Linha %d: %s - simbolo nao identificado%n", t.getLine(), t.getText());
                    saida.println("Fim da compilacao");
                    saida.flush();
                    System.exit(1);
                } else if ("COMENTARIO_NAO_FECHADO".equals(tipoToken)) {
                    saida.printf("Linha %d: comentario nao fechado%n", t.getLine());
                    saida.println("Fim da compilacao");
                    saida.flush();
                    System.exit(1);
                } else if ("CADEIA_NAO_FECHADA".equals(tipoToken)) {
                    saida.printf("Linha %d: cadeia literal nao fechada%n", t.getLine());
                    saida.println("Fim da compilacao");
                    saida.flush();
                    System.exit(1);
                }
            }

            // Reprocessa o código para o parser agora que o lexer foi consumido
            analisadorLexico.setInputStream(CharStreams.fromFileName(caminhoEntrada));
            analisadorSintatico.removeParseListeners();
            MeuErrorListenerPersonalizado listener = new MeuErrorListenerPersonalizado(saida);
            analisadorSintatico.addErrorListener(listener);

            analisadorSintatico.programa();
        }
    }
}

