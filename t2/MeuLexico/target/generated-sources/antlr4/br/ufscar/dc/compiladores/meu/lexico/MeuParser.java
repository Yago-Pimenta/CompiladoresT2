// Generated from br/ufscar/dc/compiladores/meu/lexico/MeuParser.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.meu.lexico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, FALSO=3, VERDADEIRO=4, NEGACAO=5, REGISTRO=6, 
		FIM_REGISTRO=7, LEIA=8, ESCREVA=9, PROCEDIMENTO=10, FIM_PROCEDIMENTO=11, 
		RETORNE=12, FACA=13, FUNCAO=14, FIM_FUNCAO=15, DECLARE=16, TIPO=17, LITERAL=18, 
		VAR=19, CONSTANTE=20, REAL=21, LOGICO=22, INTEIRO=23, CASO=24, FIM_CASO=25, 
		SE=26, SENAO=27, FIM_SE=28, ENTAO=29, SEJA=30, ENQUANTO=31, FIM_ENQUANTO=32, 
		PARA=33, FIM_PARA=34, ATE=35, MAIOR_OU_IGUAL_QUE=36, IGUAL=37, DIFERENTE=38, 
		E=39, OU=40, ATRIBUICAO=41, MENOR_QUE=42, MAIOR_QUE=43, MENOR_OU_IGUAL_QUE=44, 
		NUM_REAL=45, NUM_INT=46, IDENT=47, SOMA=48, MODULO=49, SUBTRACAO=50, DIVISAO=51, 
		MULTIPLICACAO=52, REFERENCIA=53, DEREFERENCIA=54, FECHA_PARENTESES=55, 
		VIRGULA=56, ABRE_COLCHETES=57, FECHA_COLCHETES=58, PONTO=59, INTERVALO=60, 
		DOIS_PONTOS=61, ABRE_PARENTESES=62, CADEIA=63, CADEIA_NAO_FECHADA=64, 
		COMENTARIO_NAO_FECHADO=65, COMENTARIO=66, WS=67, ERRO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_cmdPara = 22, RULE_cmdEnquanto = 23, RULE_cmdFaca = 24, RULE_cmdAtribuicao = 25, 
		RULE_cmdChamada = 26, RULE_cmdRetorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", 
			"cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", 
			"cmdRetorne", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"op_unario", "exp_aritmetica", "termo", "fator", "op1", "op2", "op3", 
			"parcela", "parcela_unario", "parcela_nao_unario", "exp_relacional", 
			"op_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
			"op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'falso'", "'verdadeiro'", "'nao'", 
			"'registro'", "'fim_registro'", "'leia'", "'escreva'", "'procedimento'", 
			"'fim_procedimento'", "'retorne'", "'faca'", "'funcao'", "'fim_funcao'", 
			"'declare'", "'tipo'", "'literal'", "'var'", "'constante'", "'real'", 
			"'logico'", "'inteiro'", "'caso'", "'fim_caso'", "'se'", "'senao'", "'fim_se'", 
			"'entao'", "'seja'", "'enquanto'", "'fim_enquanto'", "'para'", "'fim_para'", 
			"'ate'", "'>='", "'='", "'<>'", "'e'", "'ou'", "'<-'", "'<'", "'>'", 
			"'<='", null, null, null, "'+'", "'%'", "'-'", "'/'", "'*'", "'&'", "'^'", 
			"')'", "','", "'['", "']'", "'.'", "'..'", "':'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "FALSO", "VERDADEIRO", "NEGACAO", 
			"REGISTRO", "FIM_REGISTRO", "LEIA", "ESCREVA", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"RETORNE", "FACA", "FUNCAO", "FIM_FUNCAO", "DECLARE", "TIPO", "LITERAL", 
			"VAR", "CONSTANTE", "REAL", "LOGICO", "INTEIRO", "CASO", "FIM_CASO", 
			"SE", "SENAO", "FIM_SE", "ENTAO", "SEJA", "ENQUANTO", "FIM_ENQUANTO", 
			"PARA", "FIM_PARA", "ATE", "MAIOR_OU_IGUAL_QUE", "IGUAL", "DIFERENTE", 
			"E", "OU", "ATRIBUICAO", "MENOR_QUE", "MAIOR_QUE", "MENOR_OU_IGUAL_QUE", 
			"NUM_REAL", "NUM_INT", "IDENT", "SOMA", "MODULO", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "REFERENCIA", "DEREFERENCIA", "FECHA_PARENTESES", "VIRGULA", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABRE_PARENTESES", "CADEIA", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"COMENTARIO", "WS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MeuParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(MeuParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(MeuParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(FIM_ALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDIMENTO) | (1L << FUNCAO) | (1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
				{
				{
				setState(105);
				decl_local_global();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(MeuParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(MeuParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(MeuParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(MeuParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(DECLARE);
				setState(116);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CONSTANTE);
				setState(118);
				match(IDENT);
				setState(119);
				match(DOIS_PONTOS);
				setState(120);
				tipo_basico();
				setState(121);
				match(IGUAL);
				setState(122);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(TIPO);
				setState(125);
				match(IDENT);
				setState(126);
				match(DOIS_PONTOS);
				setState(127);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			identificador();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(131);
				match(VIRGULA);
				setState(132);
				identificador();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(DOIS_PONTOS);
			setState(139);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(MeuParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MeuParser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(MeuParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(MeuParser.PONTO, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(142);
				match(PONTO);
				setState(143);
				match(IDENT);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_PARENTESES) {
				{
				setState(149);
				dimensao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ABRE_PARENTESES);
			setState(153);
			exp_aritmetica();
			setState(154);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				registro();
				}
				break;
			case LITERAL:
			case REAL:
			case LOGICO:
			case INTEIRO:
			case IDENT:
			case DEREFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MeuParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(MeuParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(MeuParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(MeuParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << REAL) | (1L << LOGICO) | (1L << INTEIRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REAL:
			case LOGICO:
			case INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEREFERENCIA) {
				{
				setState(166);
				match(DEREFERENCIA);
				}
			}

			setState(169);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(MeuParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(MeuParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(MeuParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(MeuParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MeuParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSO) | (1L << VERDADEIRO) | (1L << NUM_REAL) | (1L << NUM_INT) | (1L << CADEIA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(MeuParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(MeuParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(REGISTRO);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(174);
				variavel();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(MeuParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(MeuParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(MeuParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(MeuParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(PROCEDIMENTO);
				setState(183);
				match(IDENT);
				setState(184);
				match(ABRE_PARENTESES);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(185);
					parametros();
					}
				}

				setState(188);
				match(FECHA_PARENTESES);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
					{
					{
					setState(189);
					declaracao_local();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
					{
					{
					setState(195);
					cmd();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(FUNCAO);
				setState(203);
				match(IDENT);
				setState(204);
				match(ABRE_PARENTESES);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(205);
					parametros();
					}
				}

				setState(208);
				match(FECHA_PARENTESES);
				setState(209);
				match(DOIS_PONTOS);
				setState(210);
				tipo_estendido();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
					{
					{
					setState(211);
					declaracao_local();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
					{
					{
					setState(217);
					cmd();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MeuParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(227);
				match(VAR);
				}
			}

			setState(230);
			identificador();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(231);
				match(VIRGULA);
				setState(232);
				identificador();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(DOIS_PONTOS);
			setState(239);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			parametro();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(242);
				match(VIRGULA);
				setState(243);
				parametro();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << TIPO) | (1L << CONSTANTE))) != 0)) {
				{
				{
				setState(249);
				declaracao_local();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(255);
				cmd();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(MeuParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> REFERENCIA() { return getTokens(MeuParser.REFERENCIA); }
		public TerminalNode REFERENCIA(int i) {
			return getToken(MeuParser.REFERENCIA, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LEIA);
			setState(274);
			match(ABRE_PARENTESES);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REFERENCIA) {
				{
				setState(275);
				match(REFERENCIA);
				}
			}

			setState(278);
			identificador();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(279);
				match(VIRGULA);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REFERENCIA) {
					{
					setState(280);
					match(REFERENCIA);
					}
				}

				setState(283);
				identificador();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(MeuParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdEscreva(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ESCREVA);
			setState(292);
			match(ABRE_PARENTESES);
			setState(293);
			expressao();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(294);
				match(VIRGULA);
				setState(295);
				expressao();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(MeuParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(MeuParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(MeuParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(MeuParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(SE);
			setState(304);
			expressao();
			setState(305);
			match(ENTAO);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(306);
				cmd();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(312);
				match(SENAO);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
					{
					{
					setState(313);
					cmd();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(321);
			match(FIM_SE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(MeuParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(MeuParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(MeuParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(MeuParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdCaso(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(CASO);
			setState(324);
			exp_aritmetica();
			setState(325);
			match(SEJA);
			setState(326);
			selecao();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(327);
				match(SENAO);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
					{
					{
					setState(328);
					cmd();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
			match(FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MeuParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(MeuParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(MeuParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(MeuParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(PARA);
			setState(339);
			match(IDENT);
			setState(340);
			match(ATRIBUICAO);
			setState(341);
			exp_aritmetica();
			setState(342);
			match(ATE);
			setState(343);
			exp_aritmetica();
			setState(344);
			match(FACA);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(345);
				cmd();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(MeuParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(MeuParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ENQUANTO);
			setState(354);
			expressao();
			setState(355);
			match(FACA);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(356);
				cmd();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(FIM_ENQUANTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(MeuParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdFaca(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(FACA);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(365);
				cmd();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(ATE);
			setState(372);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(MeuParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEREFERENCIA) {
				{
				setState(374);
				match(DEREFERENCIA);
				}
			}

			setState(377);
			identificador();
			setState(378);
			match(ATRIBUICAO);
			setState(379);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdChamada(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IDENT);
			setState(382);
			match(ABRE_PARENTESES);
			setState(383);
			expressao();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(384);
				match(VIRGULA);
				setState(385);
				expressao();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(MeuParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdRetorne(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(RETORNE);
			setState(394);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM_INT || _la==SUBTRACAO) {
				{
				{
				setState(396);
				item_selecao();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitItem_selecao(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			constantes();
			setState(403);
			match(DOIS_PONTOS);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << RETORNE) | (1L << FACA) | (1L << CASO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << IDENT) | (1L << DEREFERENCIA))) != 0)) {
				{
				{
				setState(404);
				cmd();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			numero_intervalo();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(411);
				match(VIRGULA);
				setState(412);
				numero_intervalo();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(MeuParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(MeuParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(MeuParser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(418);
				op_unario();
				}
			}

			setState(421);
			match(NUM_INT);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(422);
				match(INTERVALO);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(423);
					op_unario();
					}
				}

				setState(426);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(MeuParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			termo();
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					op1();
					setState(433);
					termo();
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			fator();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVISAO || _la==MULTIPLICACAO) {
				{
				{
				setState(441);
				op2();
				setState(442);
				fator();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			parcela();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULO) {
				{
				{
				setState(450);
				op3();
				setState(451);
				parcela();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(MeuParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(MeuParser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(MeuParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(MeuParser.DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==DIVISAO || _la==MULTIPLICACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(MeuParser.MODULO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(MODULO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(464);
					op_unario();
					}
				}

				setState(467);
				parcela_unario();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				parcela_nao_unario();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(MeuParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(MeuParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEREFERENCIA) {
					{
					setState(471);
					match(DEREFERENCIA);
					}
				}

				setState(474);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(IDENT);
				setState(476);
				match(ABRE_PARENTESES);
				setState(477);
				expressao();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(478);
					match(VIRGULA);
					setState(479);
					expressao();
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				match(ABRE_PARENTESES);
				setState(490);
				expressao();
				setState(491);
				match(FECHA_PARENTESES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(MeuParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			exp_aritmetica();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR_OU_IGUAL_QUE) | (1L << IGUAL) | (1L << DIFERENTE) | (1L << MENOR_QUE) | (1L << MAIOR_QUE) | (1L << MENOR_OU_IGUAL_QUE))) != 0)) {
				{
				setState(500);
				op_relacional();
				setState(501);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(MeuParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(MeuParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_OU_IGUAL_QUE() { return getToken(MeuParser.MAIOR_OU_IGUAL_QUE, 0); }
		public TerminalNode MENOR_OU_IGUAL_QUE() { return getToken(MeuParser.MENOR_OU_IGUAL_QUE, 0); }
		public TerminalNode MAIOR_QUE() { return getToken(MeuParser.MAIOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(MeuParser.MENOR_QUE, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR_OU_IGUAL_QUE) | (1L << IGUAL) | (1L << DIFERENTE) | (1L << MENOR_QUE) | (1L << MAIOR_QUE) | (1L << MENOR_OU_IGUAL_QUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			termo_logico();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(508);
				op_logico_1();
				setState(509);
				termo_logico();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			fator_logico();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(517);
				op_logico_2();
				setState(518);
				fator_logico();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NEGACAO() { return getToken(MeuParser.NEGACAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(525);
				match(NEGACAO);
				}
			}

			setState(528);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(MeuParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MeuParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(VERDADEIRO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(FALSO);
				}
				break;
			case NUM_REAL:
			case NUM_INT:
			case IDENT:
			case SUBTRACAO:
			case DEREFERENCIA:
			case ABRE_PARENTESES:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(MeuParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_logico_1(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(MeuParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_logico_2(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u021e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\7\3m\n\3\f\3\16\3p\13\3\3\4\3\4\5\4t\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\7\6"+
		"\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0093\n\7\f"+
		"\7\16\7\u0096\13\7\3\7\5\7\u0099\n\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00a1"+
		"\n\t\3\n\3\n\3\13\3\13\5\13\u00a7\n\13\3\f\5\f\u00aa\n\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00bd\n\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4"+
		"\13\17\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00d1\n\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da"+
		"\13\17\3\17\7\17\u00dd\n\17\f\17\16\17\u00e0\13\17\3\17\3\17\5\17\u00e4"+
		"\n\17\3\20\5\20\u00e7\n\20\3\20\3\20\3\20\7\20\u00ec\n\20\f\20\16\20\u00ef"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00f7\n\21\f\21\16\21\u00fa"+
		"\13\21\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\7\22\u0103\n\22"+
		"\f\22\16\22\u0106\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0112\n\23\3\24\3\24\3\24\5\24\u0117\n\24\3\24\3\24\3\24\5\24"+
		"\u011c\n\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u012b\n\25\f\25\16\25\u012e\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u0136\n\26\f\26\16\26\u0139\13\26\3\26\3\26"+
		"\7\26\u013d\n\26\f\26\16\26\u0140\13\26\5\26\u0142\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u014c\n\27\f\27\16\27\u014f\13\27\5\27"+
		"\u0151\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u015d"+
		"\n\30\f\30\16\30\u0160\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0168"+
		"\n\31\f\31\16\31\u016b\13\31\3\31\3\31\3\32\3\32\7\32\u0171\n\32\f\32"+
		"\16\32\u0174\13\32\3\32\3\32\3\32\3\33\5\33\u017a\n\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u0185\n\34\f\34\16\34\u0188\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\7\36\u0190\n\36\f\36\16\36\u0193\13\36"+
		"\3\37\3\37\3\37\7\37\u0198\n\37\f\37\16\37\u019b\13\37\3 \3 \3 \7 \u01a0"+
		"\n \f \16 \u01a3\13 \3!\5!\u01a6\n!\3!\3!\3!\5!\u01ab\n!\3!\5!\u01ae\n"+
		"!\3\"\3\"\3#\3#\3#\3#\7#\u01b6\n#\f#\16#\u01b9\13#\3$\3$\3$\3$\7$\u01bf"+
		"\n$\f$\16$\u01c2\13$\3%\3%\3%\3%\7%\u01c8\n%\f%\16%\u01cb\13%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\5)\u01d4\n)\3)\3)\5)\u01d8\n)\3*\5*\u01db\n*\3*\3*\3*"+
		"\3*\3*\3*\7*\u01e3\n*\f*\16*\u01e6\13*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01f0"+
		"\n*\3+\3+\5+\u01f4\n+\3,\3,\3,\3,\5,\u01fa\n,\3-\3-\3.\3.\3.\3.\7.\u0202"+
		"\n.\f.\16.\u0205\13.\3/\3/\3/\3/\7/\u020b\n/\f/\16/\u020e\13/\3\60\5\60"+
		"\u0211\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u0218\n\61\3\62\3\62\3\63\3"+
		"\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\7\4\2\24\24\27\31\5\2\5\6/\60AA\4\2\62"+
		"\62\64\64\3\2\65\66\4\2&(,.\2\u0231\2f\3\2\2\2\4n\3\2\2\2\6s\3\2\2\2\b"+
		"\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u008f\3\2\2\2\16\u009a\3\2\2\2\20\u00a0"+
		"\3\2\2\2\22\u00a2\3\2\2\2\24\u00a6\3\2\2\2\26\u00a9\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00af\3\2\2\2\34\u00e3\3\2\2\2\36\u00e6\3\2\2\2 \u00f3\3\2\2"+
		"\2\"\u00fe\3\2\2\2$\u0111\3\2\2\2&\u0113\3\2\2\2(\u0125\3\2\2\2*\u0131"+
		"\3\2\2\2,\u0145\3\2\2\2.\u0154\3\2\2\2\60\u0163\3\2\2\2\62\u016e\3\2\2"+
		"\2\64\u0179\3\2\2\2\66\u017f\3\2\2\28\u018b\3\2\2\2:\u0191\3\2\2\2<\u0194"+
		"\3\2\2\2>\u019c\3\2\2\2@\u01a5\3\2\2\2B\u01af\3\2\2\2D\u01b1\3\2\2\2F"+
		"\u01ba\3\2\2\2H\u01c3\3\2\2\2J\u01cc\3\2\2\2L\u01ce\3\2\2\2N\u01d0\3\2"+
		"\2\2P\u01d7\3\2\2\2R\u01ef\3\2\2\2T\u01f3\3\2\2\2V\u01f5\3\2\2\2X\u01fb"+
		"\3\2\2\2Z\u01fd\3\2\2\2\\\u0206\3\2\2\2^\u0210\3\2\2\2`\u0217\3\2\2\2"+
		"b\u0219\3\2\2\2d\u021b\3\2\2\2fg\5\4\3\2gh\7\3\2\2hi\5\"\22\2ij\7\4\2"+
		"\2j\3\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\5\3\2"+
		"\2\2pn\3\2\2\2qt\5\b\5\2rt\5\34\17\2sq\3\2\2\2sr\3\2\2\2t\7\3\2\2\2uv"+
		"\7\22\2\2v\u0083\5\n\6\2wx\7\26\2\2xy\7\61\2\2yz\7?\2\2z{\5\22\n\2{|\7"+
		"\'\2\2|}\5\30\r\2}\u0083\3\2\2\2~\177\7\23\2\2\177\u0080\7\61\2\2\u0080"+
		"\u0081\7?\2\2\u0081\u0083\5\20\t\2\u0082u\3\2\2\2\u0082w\3\2\2\2\u0082"+
		"~\3\2\2\2\u0083\t\3\2\2\2\u0084\u0089\5\f\7\2\u0085\u0086\7:\2\2\u0086"+
		"\u0088\5\f\7\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7?\2\2\u008d\u008e\5\20\t\2\u008e\13\3\2\2\2\u008f\u0094\7\61\2"+
		"\2\u0090\u0091\7=\2\2\u0091\u0093\7\61\2\2\u0092\u0090\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0099\5\16\b\2\u0098\u0097\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\r\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\5D#\2\u009c\u009d"+
		"\79\2\2\u009d\17\3\2\2\2\u009e\u00a1\5\32\16\2\u009f\u00a1\5\26\f\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\t\2\2"+
		"\2\u00a3\23\3\2\2\2\u00a4\u00a7\5\22\n\2\u00a5\u00a7\7\61\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00aa\78\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\24"+
		"\13\2\u00ac\27\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\31\3\2\2\2\u00af\u00b3"+
		"\7\b\2\2\u00b0\u00b2\5\n\6\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7\t\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00bc\7@\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\79\2\2\u00bf\u00c1\5\b"+
		"\5\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5$"+
		"\23\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00e4\7\r"+
		"\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00d0\7@\2\2\u00cf"+
		"\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\79\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d8\5\26\f\2\u00d5"+
		"\u00d7\5\b\5\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\5$\23\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\21\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00b8\3\2\2\2\u00e3\u00cc\3"+
		"\2\2\2\u00e4\35\3\2\2\2\u00e5\u00e7\7\25\2\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ed\5\f\7\2\u00e9\u00ea\7:"+
		"\2\2\u00ea\u00ec\5\f\7\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2\5\26\f\2\u00f2\37\3\2\2\2\u00f3\u00f8"+
		"\5\36\20\2\u00f4\u00f5\7:\2\2\u00f5\u00f7\5\36\20\2\u00f6\u00f4\3\2\2"+
		"\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9!"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\5\b\5\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105#\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u0112\5&\24\2\u0108\u0112\5(\25\2\u0109\u0112"+
		"\5*\26\2\u010a\u0112\5,\27\2\u010b\u0112\5.\30\2\u010c\u0112\5\60\31\2"+
		"\u010d\u0112\5\62\32\2\u010e\u0112\5\64\33\2\u010f\u0112\5\66\34\2\u0110"+
		"\u0112\58\35\2\u0111\u0107\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109\3\2"+
		"\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112%\3\2\2\2\u0113\u0114\7\n\2\2\u0114\u0116\7@\2\2\u0115\u0117"+
		"\7\67\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u0120\5\f\7\2\u0119\u011b\7:\2\2\u011a\u011c\7\67\2\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\5\f\7\2\u011e"+
		"\u0119\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\79\2\2\u0124"+
		"\'\3\2\2\2\u0125\u0126\7\13\2\2\u0126\u0127\7@\2\2\u0127\u012c\5Z.\2\u0128"+
		"\u0129\7:\2\2\u0129\u012b\5Z.\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0130\79\2\2\u0130)\3\2\2\2\u0131\u0132\7\34\2\2\u0132"+
		"\u0133\5Z.\2\u0133\u0137\7\37\2\2\u0134\u0136\5$\23\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0141\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013e\7\35\2\2\u013b\u013d\5"+
		"$\23\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u013a\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\36\2\2\u0144"+
		"+\3\2\2\2\u0145\u0146\7\32\2\2\u0146\u0147\5D#\2\u0147\u0148\7 \2\2\u0148"+
		"\u0150\5:\36\2\u0149\u014d\7\35\2\2\u014a\u014c\5$\23\2\u014b\u014a\3"+
		"\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\33\2\2\u0153-\3\2\2\2\u0154\u0155"+
		"\7#\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7+\2\2\u0157\u0158\5D#\2\u0158"+
		"\u0159\7%\2\2\u0159\u015a\5D#\2\u015a\u015e\7\17\2\2\u015b\u015d\5$\23"+
		"\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7$\2\2\u0162"+
		"/\3\2\2\2\u0163\u0164\7!\2\2\u0164\u0165\5Z.\2\u0165\u0169\7\17\2\2\u0166"+
		"\u0168\5$\23\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\7\"\2\2\u016d\61\3\2\2\2\u016e\u0172\7\17\2\2\u016f\u0171\5$\23"+
		"\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7%\2\2\u0176"+
		"\u0177\5Z.\2\u0177\63\3\2\2\2\u0178\u017a\78\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\f\7\2\u017c\u017d\7+"+
		"\2\2\u017d\u017e\5Z.\2\u017e\65\3\2\2\2\u017f\u0180\7\61\2\2\u0180\u0181"+
		"\7@\2\2\u0181\u0186\5Z.\2\u0182\u0183\7:\2\2\u0183\u0185\5Z.\2\u0184\u0182"+
		"\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\79\2\2\u018a\67\3\2\2\2"+
		"\u018b\u018c\7\16\2\2\u018c\u018d\5Z.\2\u018d9\3\2\2\2\u018e\u0190\5<"+
		"\37\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192;\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5> \2\u0195"+
		"\u0199\7?\2\2\u0196\u0198\5$\23\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a=\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u01a1\5@!\2\u019d\u019e\7:\2\2\u019e\u01a0\5@!\2\u019f"+
		"\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2?\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5B\"\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ad\7\60\2\2"+
		"\u01a8\u01aa\7>\2\2\u01a9\u01ab\5B\"\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\7\60\2\2\u01ad\u01a8\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01aeA\3\2\2\2\u01af\u01b0\7\64\2\2\u01b0C\3\2\2"+
		"\2\u01b1\u01b7\5F$\2\u01b2\u01b3\5J&\2\u01b3\u01b4\5F$\2\u01b4\u01b6\3"+
		"\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8E\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01c0\5H%\2\u01bb"+
		"\u01bc\5L\'\2\u01bc\u01bd\5H%\2\u01bd\u01bf\3\2\2\2\u01be\u01bb\3\2\2"+
		"\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1G"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c9\5P)\2\u01c4\u01c5\5N(\2\u01c5"+
		"\u01c6\5P)\2\u01c6\u01c8\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c8\u01cb\3\2\2"+
		"\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caI\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01cd\t\4\2\2\u01cdK\3\2\2\2\u01ce\u01cf\t\5\2\2\u01cf"+
		"M\3\2\2\2\u01d0\u01d1\7\63\2\2\u01d1O\3\2\2\2\u01d2\u01d4\5B\"\2\u01d3"+
		"\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\5R"+
		"*\2\u01d6\u01d8\5T+\2\u01d7\u01d3\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8Q\3"+
		"\2\2\2\u01d9\u01db\78\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01f0\5\f\7\2\u01dd\u01de\7\61\2\2\u01de\u01df\7"+
		"@\2\2\u01df\u01e4\5Z.\2\u01e0\u01e1\7:\2\2\u01e1\u01e3\5Z.\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\79\2\2\u01e8\u01f0\3\2"+
		"\2\2\u01e9\u01f0\7\60\2\2\u01ea\u01f0\7/\2\2\u01eb\u01ec\7@\2\2\u01ec"+
		"\u01ed\5Z.\2\u01ed\u01ee\79\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01da\3\2\2"+
		"\2\u01ef\u01dd\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01eb"+
		"\3\2\2\2\u01f0S\3\2\2\2\u01f1\u01f4\5\f\7\2\u01f2\u01f4\7A\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4U\3\2\2\2\u01f5\u01f9\5D#\2\u01f6\u01f7"+
		"\5X-\2\u01f7\u01f8\5D#\2\u01f8\u01fa\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01faW\3\2\2\2\u01fb\u01fc\t\6\2\2\u01fcY\3\2\2\2\u01fd"+
		"\u0203\5\\/\2\u01fe\u01ff\5b\62\2\u01ff\u0200\5\\/\2\u0200\u0202\3\2\2"+
		"\2\u0201\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204[\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u020c\5^\60\2\u0207"+
		"\u0208\5d\63\2\u0208\u0209\5^\60\2\u0209\u020b\3\2\2\2\u020a\u0207\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"]\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\7\7\2\2\u0210\u020f\3\2\2\2"+
		"\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5`\61\2\u0213_\3"+
		"\2\2\2\u0214\u0218\7\6\2\2\u0215\u0218\7\5\2\2\u0216\u0218\5V,\2\u0217"+
		"\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218a\3\2\2\2"+
		"\u0219\u021a\7*\2\2\u021ac\3\2\2\2\u021b\u021c\7)\2\2\u021ce\3\2\2\2;"+
		"ns\u0082\u0089\u0094\u0098\u00a0\u00a6\u00a9\u00b3\u00bc\u00c2\u00c8\u00d0"+
		"\u00d8\u00de\u00e3\u00e6\u00ed\u00f8\u00fe\u0104\u0111\u0116\u011b\u0120"+
		"\u012c\u0137\u013e\u0141\u014d\u0150\u015e\u0169\u0172\u0179\u0186\u0191"+
		"\u0199\u01a1\u01a5\u01aa\u01ad\u01b7\u01c0\u01c9\u01d3\u01d7\u01da\u01e4"+
		"\u01ef\u01f3\u01f9\u0203\u020c\u0210\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}