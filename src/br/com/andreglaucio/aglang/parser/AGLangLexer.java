// Generated from AGLang.opl by ANTLR 4.7.1
package br.com.andreglaucio.aglang.parser;

	import br.com.andreglaucio.aglang.datastructure.*;
	import br.com.andreglaucio.aglang.exceptions.AGLSemanticException;
	import br.com.andreglaucio.aglang.ast.*;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AGLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AP=9, 
		FP=10, SC=11, OP=12, ATTR=13, VIR=14, ACH=15, FCH=16, OPREL=17, ID=18, 
		NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AP", 
		"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INICIO'", "'FIM;'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'se'", "'senao'", "'('", "')'", "';'", null, "'='", "','", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "AP", "FP", "SC", 
		"OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
	};
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


		private int _tipo;
		private String _varName;
		private String _varValue;
		private AGLSymbolTable symbolTable = new AGLSymbolTable();
		private AGLSymbol symbol;
		private AGLProgram program = new AGLProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		
		// Método para verificar se um ID existe na tabela de símbolos
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new AGLSemanticException("Símbolo '"+id+"' não declarado");
			}
		}
		
		// Método para exibir os comandos do programa
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		// Método para gerar o código alvo do programa
		public void generateCode(){
			program.generateTarget();
		}	


	public AGLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AGLang.opl"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22t"+
		"\n\22\3\23\3\23\7\23x\n\23\f\23\16\23{\13\23\3\24\6\24~\n\24\r\24\16\24"+
		"\177\3\24\3\24\6\24\u0084\n\24\r\24\16\24\u0085\5\24\u0088\n\24\3\25\3"+
		"\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b\5\2,-//\61\61\4"+
		"\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0094\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t>\3"+
		"\2\2\2\13D\3\2\2\2\rI\3\2\2\2\17Q\3\2\2\2\21T\3\2\2\2\23Z\3\2\2\2\25\\"+
		"\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!"+
		"h\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'}\3\2\2\2)\u0089\3\2\2\2+,\7K\2\2,-\7P"+
		"\2\2-.\7K\2\2./\7E\2\2/\60\7K\2\2\60\61\7Q\2\2\61\4\3\2\2\2\62\63\7H\2"+
		"\2\63\64\7K\2\2\64\65\7O\2\2\65\66\7=\2\2\66\6\3\2\2\2\678\7p\2\289\7"+
		"w\2\29:\7o\2\2:;\7g\2\2;<\7t\2\2<=\7q\2\2=\b\3\2\2\2>?\7v\2\2?@\7g\2\2"+
		"@A\7z\2\2AB\7v\2\2BC\7q\2\2C\n\3\2\2\2DE\7n\2\2EF\7g\2\2FG\7k\2\2GH\7"+
		"c\2\2H\f\3\2\2\2IJ\7g\2\2JK\7u\2\2KL\7e\2\2LM\7t\2\2MN\7g\2\2NO\7x\2\2"+
		"OP\7c\2\2P\16\3\2\2\2QR\7u\2\2RS\7g\2\2S\20\3\2\2\2TU\7u\2\2UV\7g\2\2"+
		"VW\7p\2\2WX\7c\2\2XY\7q\2\2Y\22\3\2\2\2Z[\7*\2\2[\24\3\2\2\2\\]\7+\2\2"+
		"]\26\3\2\2\2^_\7=\2\2_\30\3\2\2\2`a\t\2\2\2a\32\3\2\2\2bc\7?\2\2c\34\3"+
		"\2\2\2de\7.\2\2e\36\3\2\2\2fg\7}\2\2g \3\2\2\2hi\7\177\2\2i\"\3\2\2\2"+
		"jt\t\3\2\2kl\7@\2\2lt\7?\2\2mn\7>\2\2nt\7?\2\2op\7?\2\2pt\7?\2\2qr\7#"+
		"\2\2rt\7?\2\2sj\3\2\2\2sk\3\2\2\2sm\3\2\2\2so\3\2\2\2sq\3\2\2\2t$\3\2"+
		"\2\2uy\t\4\2\2vx\t\5\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z&\3\2"+
		"\2\2{y\3\2\2\2|~\t\6\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0087\3\2\2\2\u0081\u0083\7\60\2\2\u0082\u0084\t\6\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"(\3\2\2\2\u0089\u008a\t\7\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\25\2\2"+
		"\u008c*\3\2\2\2\t\2swy\177\u0085\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}