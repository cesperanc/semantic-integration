// Generated from SemanticIntegration.g4 by ANTLR 4.0

         package pt.ipleiria.estg.mei.rc.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SemanticIntegrationParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMATICA_E=1, GRAMATICA_COM=2, GRAMATICA_DISJUNCAO=3, GRAMATICA_PREPOSICAO=4, 
		PROPRIEDADE_ANO=5, PROPRIEDADE_ANOS=6, PROPRIEDADE_grandezaLIQUIDA=7, 
		PROPRIEDADE_grandezaSOLIDA=8, PROPRIEDADE_grandezaUNITARIA=9, PROPRIEDADE_ESTADOFISICO=10, 
		PROPRIEDADE_BEBIDAS=11, PROPRIEDADE_GERAL=12, PROPRIEDADE_GEOMETRIA=13, 
		PROPRIEDADE_COR=14, PROPRIEDADE_CORTE=15, PROPRIEDADE_PARTEDEANIMAL=16, 
		PROPRIEDADE_PARTEDEPRODUTO=17, PROPRIEDADE_CONFECAO=18, PROPRIEDADE_MARCA=19, 
		PROPRIEDADE_CLASSIFICACAODIETETICA=20, PROPRIEDADE_APRESENTACAO=21, PROPRIEDADE_TAMANHO=22, 
		PROPRIEDADE_EMBALAGEM=23, CLASSE_FRUTA=24, CLASSE_HORTICOLAS=25, CLASSE_LEGUMINOSAS=26, 
		CLASSE_LACTEOS=27, CLASSE_TODASASCLASSES=28, CLASSE_CARNE=29, CLASSE_CARNE_TRANSFORMADO=30, 
		CLASSE_PESCADO=31, CLASSE_OVOS=32, CLASSE_CEREAIS=33, CLASSE_CHOCOLATES=34, 
		CLASSE_SOBREMESAS=35, CLASSE_ACUCARADOS=36, CLASSE_BEBIDAS_ALCOOLICAS=37, 
		CLASSE_BEBIDAS_NAOALCOOLICAS=38, CLASSE_BEBIDAS_REFRIGERANTES=39, CLASSE_MOLHOS=40, 
		CLASSE_SOPAS=41, CLASSE_CONDIMENTO=42, CLASSE_ERVAAROMATICA=43, CLASSE_BEBIDA_COMCAFEINA=44, 
		CLASSE_AZEITES=45, CLASSE_GORDURAS=46, ALGEBRICO_INTEIRO=47, ALGEBRICO_DECIMAL=48, 
		ALGEBRICO_FRACAO=49, PROPRIEDADE_CONCENTRACAO=50, NOME_RECEITA=51, PALAVRA_DESCONHECIDA=52, 
		WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "GRAMATICA_E", "GRAMATICA_COM", "GRAMATICA_DISJUNCAO", "GRAMATICA_PREPOSICAO", 
		"PROPRIEDADE_ANO", "PROPRIEDADE_ANOS", "PROPRIEDADE_grandezaLIQUIDA", 
		"PROPRIEDADE_grandezaSOLIDA", "PROPRIEDADE_grandezaUNITARIA", "'liquido'", 
		"'gas'", "PROPRIEDADE_GERAL", "PROPRIEDADE_GEOMETRIA", "PROPRIEDADE_COR", 
		"PROPRIEDADE_CORTE", "PROPRIEDADE_PARTEDEANIMAL", "PROPRIEDADE_PARTEDEPRODUTO", 
		"PROPRIEDADE_CONFECAO", "PROPRIEDADE_MARCA", "PROPRIEDADE_CLASSIFICACAODIETETICA", 
		"PROPRIEDADE_APRESENTACAO", "PROPRIEDADE_TAMANHO", "PROPRIEDADE_EMBALAGEM", 
		"CLASSE_FRUTA", "CLASSE_HORTICOLAS", "CLASSE_LEGUMINOSAS", "CLASSE_LACTEOS", 
		"CLASSE_TODASASCLASSES", "CLASSE_CARNE", "CLASSE_CARNE_TRANSFORMADO", 
		"CLASSE_PESCADO", "CLASSE_OVOS", "CLASSE_CEREAIS", "CLASSE_CHOCOLATES", 
		"CLASSE_SOBREMESAS", "CLASSE_ACUCARADOS", "CLASSE_BEBIDAS_ALCOOLICAS", 
		"CLASSE_BEBIDAS_NAOALCOOLICAS", "CLASSE_BEBIDAS_REFRIGERANTES", "CLASSE_MOLHOS", 
		"CLASSE_SOPAS", "CLASSE_CONDIMENTO", "CLASSE_ERVAAROMATICA", "CLASSE_BEBIDA_COMCAFEINA", 
		"CLASSE_AZEITES", "CLASSE_GORDURAS", "ALGEBRICO_INTEIRO", "ALGEBRICO_DECIMAL", 
		"ALGEBRICO_FRACAO", "PROPRIEDADE_CONCENTRACAO", "NOME_RECEITA", "PALAVRA_DESCONHECIDA", 
		"WS"
	};
	public static final int
		RULE_descricao = 0, RULE_descricao_composta = 1, RULE_descricao_simples = 2, 
		RULE_descricao_simples_Com_Familia = 3, RULE_familia_na_descricao = 4, 
		RULE_descricao_simples_Sem_Familia = 5, RULE_quantidades = 6, RULE_quantidade = 7, 
		RULE_numero = 8, RULE_grandeza = 9, RULE_propriedades = 10, RULE_propriedadesSemprodutos = 11, 
		RULE_propriedade = 12, RULE_propriedade_receita = 13, RULE_contem = 14, 
		RULE_produto = 15, RULE_propriedade_desconhecida = 16, RULE_produto_desconhecido = 17, 
		RULE_desconhecido = 18;
	public static final String[] ruleNames = {
		"descricao", "descricao_composta", "descricao_simples", "descricao_simples_Com_Familia", 
		"familia_na_descricao", "descricao_simples_Sem_Familia", "quantidades", 
		"quantidade", "numero", "grandeza", "propriedades", "propriedadesSemprodutos", 
		"propriedade", "propriedade_receita", "contem", "produto", "propriedade_desconhecida", 
		"produto_desconhecido", "desconhecido"
	};

	@Override
	public String getGrammarFileName() { return "SemanticIntegration.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SemanticIntegrationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DescricaoContext extends ParserRuleContext {
		public String value;
		public Descricao_compostaContext descricao_composta;
		public Descricao_compostaContext descricao_composta() {
			return getRuleContext(Descricao_compostaContext.class,0);
		}
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38); ((DescricaoContext)_localctx).descricao_composta = descricao_composta(0);
			((DescricaoContext)_localctx).value = "<DESCRICAO_COMPOSTA valor=\""+(((DescricaoContext)_localctx).descricao_composta!=null?_input.getText(((DescricaoContext)_localctx).descricao_composta.start,((DescricaoContext)_localctx).descricao_composta.stop):null)+"\">"+((DescricaoContext)_localctx).descricao_composta.value+"</DESCRICAO_COMPOSTA>\n";
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

	public static class Descricao_compostaContext extends ParserRuleContext {
		public int _p;
		public String value;
		public Descricao_compostaContext left;
		public Descricao_simplesContext descricao_simples;
		public Descricao_compostaContext right;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public TerminalNode GRAMATICA_COM() { return getToken(SemanticIntegrationParser.GRAMATICA_COM, 0); }
		public Descricao_simplesContext descricao_simples() {
			return getRuleContext(Descricao_simplesContext.class,0);
		}
		public Descricao_compostaContext descricao_composta(int i) {
			return getRuleContext(Descricao_compostaContext.class,i);
		}
		public TerminalNode GRAMATICA_E() { return getToken(SemanticIntegrationParser.GRAMATICA_E, 0); }
		public TerminalNode GRAMATICA_DISJUNCAO() { return getToken(SemanticIntegrationParser.GRAMATICA_DISJUNCAO, 0); }
		public List<Descricao_compostaContext> descricao_composta() {
			return getRuleContexts(Descricao_compostaContext.class);
		}
		public Descricao_compostaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Descricao_compostaContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_descricao_composta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDescricao_composta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDescricao_composta(this);
		}
	}

	public final Descricao_compostaContext descricao_composta(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Descricao_compostaContext _localctx = new Descricao_compostaContext(_ctx, _parentState, _p);
		Descricao_compostaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_descricao_composta);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42); ((Descricao_compostaContext)_localctx).descricao_simples = descricao_simples();
			 ((Descricao_compostaContext)_localctx).value = "<DESCRICAO_SIMPLES>"+((Descricao_compostaContext)_localctx).descricao_simples.value+"</DESCRICAO_SIMPLES>"; 
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Descricao_compostaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_descricao_composta);
						setState(45);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(46); match(GRAMATICA_E);
						setState(47); ((Descricao_compostaContext)_localctx).right = descricao_composta(4);
						 ((Descricao_compostaContext)_localctx).value = ((Descricao_compostaContext)_localctx).left.value+((Descricao_compostaContext)_localctx).right.value; 
						}
						break;

					case 2:
						{
						_localctx = new Descricao_compostaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_descricao_composta);
						setState(50);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(51); match(GRAMATICA_PREPOSICAO);
						setState(52); ((Descricao_compostaContext)_localctx).right = descricao_composta(2);
						 ((Descricao_compostaContext)_localctx).value = ((Descricao_compostaContext)_localctx).left.value+((Descricao_compostaContext)_localctx).right.value; 
						}
						break;

					case 3:
						{
						_localctx = new Descricao_compostaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_descricao_composta);
						setState(55);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(56); match(GRAMATICA_COM);
						setState(57); ((Descricao_compostaContext)_localctx).descricao_simples = descricao_simples();
						 ((Descricao_compostaContext)_localctx).value = ((Descricao_compostaContext)_localctx).left.value+"<DESCRICAO_SIMPLES>"+((Descricao_compostaContext)_localctx).descricao_simples.value+"</DESCRICAO_SIMPLES>"; 
						}
						break;

					case 4:
						{
						_localctx = new Descricao_compostaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_descricao_composta);
						setState(60);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(61); match(GRAMATICA_DISJUNCAO);
						setState(62); ((Descricao_compostaContext)_localctx).descricao_simples = descricao_simples();
						 ((Descricao_compostaContext)_localctx).value = ((Descricao_compostaContext)_localctx).left.value+((Descricao_compostaContext)_localctx).descricao_simples.value; 
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Descricao_simplesContext extends ParserRuleContext {
		public String value;
		public Descricao_simples_Com_FamiliaContext descricao_simples_Com_Familia;
		public Descricao_simples_Sem_FamiliaContext descricao_simples_Sem_Familia;
		public Descricao_simples_Sem_FamiliaContext descricao_simples_Sem_Familia() {
			return getRuleContext(Descricao_simples_Sem_FamiliaContext.class,0);
		}
		public Descricao_simples_Com_FamiliaContext descricao_simples_Com_Familia() {
			return getRuleContext(Descricao_simples_Com_FamiliaContext.class,0);
		}
		public Descricao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDescricao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDescricao_simples(this);
		}
	}

	public final Descricao_simplesContext descricao_simples() throws RecognitionException {
		Descricao_simplesContext _localctx = new Descricao_simplesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descricao_simples);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case CLASSE_TODASASCLASSES:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); ((Descricao_simplesContext)_localctx).descricao_simples_Com_Familia = descricao_simples_Com_Familia();
				 ((Descricao_simplesContext)_localctx).value = ((Descricao_simplesContext)_localctx).descricao_simples_Com_Familia.value; 
				}
				break;
			case GRAMATICA_PREPOSICAO:
			case PROPRIEDADE_grandezaLIQUIDA:
			case PROPRIEDADE_grandezaSOLIDA:
			case PROPRIEDADE_grandezaUNITARIA:
			case PROPRIEDADE_ESTADOFISICO:
			case PROPRIEDADE_BEBIDAS:
			case PROPRIEDADE_GERAL:
			case PROPRIEDADE_GEOMETRIA:
			case PROPRIEDADE_CORTE:
			case PROPRIEDADE_PARTEDEANIMAL:
			case PROPRIEDADE_PARTEDEPRODUTO:
			case PROPRIEDADE_CONFECAO:
			case PROPRIEDADE_MARCA:
			case PROPRIEDADE_APRESENTACAO:
			case PROPRIEDADE_TAMANHO:
			case PROPRIEDADE_EMBALAGEM:
			case CLASSE_FRUTA:
			case CLASSE_HORTICOLAS:
			case CLASSE_LEGUMINOSAS:
			case CLASSE_LACTEOS:
			case CLASSE_CARNE:
			case CLASSE_CARNE_TRANSFORMADO:
			case CLASSE_PESCADO:
			case CLASSE_OVOS:
			case CLASSE_CEREAIS:
			case CLASSE_CHOCOLATES:
			case CLASSE_SOBREMESAS:
			case CLASSE_ACUCARADOS:
			case CLASSE_BEBIDAS_ALCOOLICAS:
			case CLASSE_BEBIDAS_NAOALCOOLICAS:
			case CLASSE_BEBIDAS_REFRIGERANTES:
			case CLASSE_MOLHOS:
			case CLASSE_SOPAS:
			case CLASSE_CONDIMENTO:
			case CLASSE_ERVAAROMATICA:
			case CLASSE_BEBIDA_COMCAFEINA:
			case CLASSE_AZEITES:
			case CLASSE_GORDURAS:
			case ALGEBRICO_INTEIRO:
			case ALGEBRICO_DECIMAL:
			case ALGEBRICO_FRACAO:
			case PROPRIEDADE_CONCENTRACAO:
			case PALAVRA_DESCONHECIDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); ((Descricao_simplesContext)_localctx).descricao_simples_Sem_Familia = descricao_simples_Sem_Familia();
				 ((Descricao_simplesContext)_localctx).value = ((Descricao_simplesContext)_localctx).descricao_simples_Sem_Familia.value; 
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

	public static class Descricao_simples_Com_FamiliaContext extends ParserRuleContext {
		public String value;
		public Familia_na_descricaoContext familia_na_descricao;
		public Descricao_simples_Sem_FamiliaContext descricao_simples_Sem_Familia;
		public PropriedadesContext propriedades;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public Descricao_simples_Sem_FamiliaContext descricao_simples_Sem_Familia() {
			return getRuleContext(Descricao_simples_Sem_FamiliaContext.class,0);
		}
		public Familia_na_descricaoContext familia_na_descricao() {
			return getRuleContext(Familia_na_descricaoContext.class,0);
		}
		public PropriedadesContext propriedades() {
			return getRuleContext(PropriedadesContext.class,0);
		}
		public Descricao_simples_Com_FamiliaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao_simples_Com_Familia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDescricao_simples_Com_Familia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDescricao_simples_Com_Familia(this);
		}
	}

	public final Descricao_simples_Com_FamiliaContext descricao_simples_Com_Familia() throws RecognitionException {
		Descricao_simples_Com_FamiliaContext _localctx = new Descricao_simples_Com_FamiliaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descricao_simples_Com_Familia);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao = familia_na_descricao();
				 ((Descricao_simples_Com_FamiliaContext)_localctx).value = ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao.value; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao = familia_na_descricao();
				setState(82); ((Descricao_simples_Com_FamiliaContext)_localctx).descricao_simples_Sem_Familia = descricao_simples_Sem_Familia();
				 ((Descricao_simples_Com_FamiliaContext)_localctx).value = ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao.value+((Descricao_simples_Com_FamiliaContext)_localctx).descricao_simples_Sem_Familia.value; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao = familia_na_descricao();
				setState(86); match(GRAMATICA_PREPOSICAO);
				setState(87); ((Descricao_simples_Com_FamiliaContext)_localctx).descricao_simples_Sem_Familia = descricao_simples_Sem_Familia();
				 ((Descricao_simples_Com_FamiliaContext)_localctx).value = ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao.value+((Descricao_simples_Com_FamiliaContext)_localctx).descricao_simples_Sem_Familia.value; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao = familia_na_descricao();
				setState(91); ((Descricao_simples_Com_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Com_FamiliaContext)_localctx).value = ((Descricao_simples_Com_FamiliaContext)_localctx).familia_na_descricao.value+((Descricao_simples_Com_FamiliaContext)_localctx).propriedades.value; 
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

	public static class Familia_na_descricaoContext extends ParserRuleContext {
		public String value;
		public Token CLASSE_TODASASCLASSES;
		public TerminalNode CLASSE_TODASASCLASSES() { return getToken(SemanticIntegrationParser.CLASSE_TODASASCLASSES, 0); }
		public Familia_na_descricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_familia_na_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterFamilia_na_descricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitFamilia_na_descricao(this);
		}
	}

	public final Familia_na_descricaoContext familia_na_descricao() throws RecognitionException {
		Familia_na_descricaoContext _localctx = new Familia_na_descricaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_familia_na_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((Familia_na_descricaoContext)_localctx).CLASSE_TODASASCLASSES = match(CLASSE_TODASASCLASSES);
			 ((Familia_na_descricaoContext)_localctx).value = "<CLASSE_TODASASCLASSES valor=\""+(((Familia_na_descricaoContext)_localctx).CLASSE_TODASASCLASSES!=null?((Familia_na_descricaoContext)_localctx).CLASSE_TODASASCLASSES.getText():null)+"\"/>"; 
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

	public static class Descricao_simples_Sem_FamiliaContext extends ParserRuleContext {
		public String value;
		public ProdutoContext produto;
		public PropriedadesContext propriedades;
		public QuantidadesContext quantidades;
		public PropriedadesContext lefts;
		public PropriedadesContext rights;
		public QuantidadesContext left;
		public QuantidadesContext right;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public ProdutoContext produto() {
			return getRuleContext(ProdutoContext.class,0);
		}
		public List<QuantidadesContext> quantidades() {
			return getRuleContexts(QuantidadesContext.class);
		}
		public PropriedadesContext propriedades(int i) {
			return getRuleContext(PropriedadesContext.class,i);
		}
		public QuantidadesContext quantidades(int i) {
			return getRuleContext(QuantidadesContext.class,i);
		}
		public List<PropriedadesContext> propriedades() {
			return getRuleContexts(PropriedadesContext.class);
		}
		public Descricao_simples_Sem_FamiliaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao_simples_Sem_Familia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDescricao_simples_Sem_Familia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDescricao_simples_Sem_Familia(this);
		}
	}

	public final Descricao_simples_Sem_FamiliaContext descricao_simples_Sem_Familia() throws RecognitionException {
		Descricao_simples_Sem_FamiliaContext _localctx = new Descricao_simples_Sem_FamiliaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_descricao_simples_Sem_Familia);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).produto.value; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(GRAMATICA_PREPOSICAO);
				setState(103); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(107); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(111); match(GRAMATICA_PREPOSICAO);
				setState(112); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value; 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(116); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				setState(117); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value; 
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(121); ((Descricao_simples_Sem_FamiliaContext)_localctx).lefts = propriedades(0);
				setState(122); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(123); ((Descricao_simples_Sem_FamiliaContext)_localctx).rights = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).lefts.value+((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).rights.value; 
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value; 
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(130); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+"<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"; 
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(134); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value; 
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(137); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(138); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(139); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+"<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value; 
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(142); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(143); ((Descricao_simples_Sem_FamiliaContext)_localctx).lefts = propriedades(0);
				setState(144); match(GRAMATICA_PREPOSICAO);
				setState(145); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(146); ((Descricao_simples_Sem_FamiliaContext)_localctx).rights = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).lefts.value+"<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).rights.value; 
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(149); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(150); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value; 
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(153); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(154); ((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades = quantidades();
				setState(155); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).quantidades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value; 
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(158); ((Descricao_simples_Sem_FamiliaContext)_localctx).produto = produto();
				setState(159); ((Descricao_simples_Sem_FamiliaContext)_localctx).left = quantidades();
				setState(160); ((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades = propriedades(0);
				setState(161); ((Descricao_simples_Sem_FamiliaContext)_localctx).right = quantidades();
				 ((Descricao_simples_Sem_FamiliaContext)_localctx).value = "<PRODUTO valor=\""+(((Descricao_simples_Sem_FamiliaContext)_localctx).produto!=null?_input.getText(((Descricao_simples_Sem_FamiliaContext)_localctx).produto.start,((Descricao_simples_Sem_FamiliaContext)_localctx).produto.stop):null)+"\"/>"+((Descricao_simples_Sem_FamiliaContext)_localctx).left.value+((Descricao_simples_Sem_FamiliaContext)_localctx).propriedades.value+((Descricao_simples_Sem_FamiliaContext)_localctx).right.value; 
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

	public static class QuantidadesContext extends ParserRuleContext {
		public String value;
		public GrandezaContext grandeza;
		public QuantidadeContext quantidade;
		public QuantidadeContext left;
		public QuantidadeContext right;
		public QuantidadesContext right1;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public List<QuantidadeContext> quantidade() {
			return getRuleContexts(QuantidadeContext.class);
		}
		public QuantidadesContext quantidades() {
			return getRuleContext(QuantidadesContext.class,0);
		}
		public QuantidadeContext quantidade(int i) {
			return getRuleContext(QuantidadeContext.class,i);
		}
		public GrandezaContext grandeza() {
			return getRuleContext(GrandezaContext.class,0);
		}
		public QuantidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantidades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterQuantidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitQuantidades(this);
		}
	}

	public final QuantidadesContext quantidades() throws RecognitionException {
		QuantidadesContext _localctx = new QuantidadesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantidades);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); ((QuantidadesContext)_localctx).grandeza = grandeza();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).grandeza.value; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); ((QuantidadesContext)_localctx).quantidade = quantidade();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); ((QuantidadesContext)_localctx).quantidade = quantidade();
				setState(173); match(GRAMATICA_PREPOSICAO);
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176); ((QuantidadesContext)_localctx).left = quantidade();
				setState(177); ((QuantidadesContext)_localctx).right = quantidade();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).left.value+((QuantidadesContext)_localctx).right.value; 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180); ((QuantidadesContext)_localctx).quantidade = quantidade();
				setState(181); ((QuantidadesContext)_localctx).grandeza = grandeza();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value+((QuantidadesContext)_localctx).grandeza.value; 
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184); ((QuantidadesContext)_localctx).quantidade = quantidade();
				setState(185); ((QuantidadesContext)_localctx).grandeza = grandeza();
				setState(186); match(GRAMATICA_PREPOSICAO);
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value+((QuantidadesContext)_localctx).grandeza.value; 
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189); ((QuantidadesContext)_localctx).quantidade = quantidade();
				setState(190); ((QuantidadesContext)_localctx).grandeza = grandeza();
				setState(191); ((QuantidadesContext)_localctx).right1 = quantidades();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value+((QuantidadesContext)_localctx).grandeza.value+((QuantidadesContext)_localctx).right1.value; 
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194); ((QuantidadesContext)_localctx).quantidade = quantidade();
				setState(195); ((QuantidadesContext)_localctx).grandeza = grandeza();
				setState(196); match(GRAMATICA_PREPOSICAO);
				setState(197); ((QuantidadesContext)_localctx).right1 = quantidades();
				 ((QuantidadesContext)_localctx).value = ((QuantidadesContext)_localctx).quantidade.value+((QuantidadesContext)_localctx).grandeza.value+((QuantidadesContext)_localctx).right1.value; 
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

	public static class QuantidadeContext extends ParserRuleContext {
		public String value;
		public NumeroContext numero;
		public Token PROPRIEDADE_TAMANHO;
		public Token PROPRIEDADE_grandezaUNITARIA;
		public Token PROPRIEDADE_ESTADOFISICO;
		public Token PROPRIEDADE_PARTEDEPRODUTO;
		public Token PROPRIEDADE_PARTEDEANIMAL;
		public Token PROPRIEDADE_CONCENTRACAO;
		public Token PROPRIEDADE_EMBALAGEM;
		public Token PROPRIEDADE_GEOMETRIA;
		public Token PROPRIEDADE_APRESENTACAO;
		public Token PROPRIEDADE_CORTE;
		public Token PROPRIEDADE_CONFECAO;
		public Token PROPRIEDADE_BEBIDAS;
		public Token PROPRIEDADE_GERAL;
		public TerminalNode PROPRIEDADE_CONCENTRACAO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_CONCENTRACAO, 0); }
		public TerminalNode PROPRIEDADE_GEOMETRIA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_GEOMETRIA, 0); }
		public TerminalNode PROPRIEDADE_ESTADOFISICO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_ESTADOFISICO, 0); }
		public TerminalNode PROPRIEDADE_EMBALAGEM() { return getToken(SemanticIntegrationParser.PROPRIEDADE_EMBALAGEM, 0); }
		public TerminalNode PROPRIEDADE_CONFECAO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_CONFECAO, 0); }
		public TerminalNode PROPRIEDADE_CORTE() { return getToken(SemanticIntegrationParser.PROPRIEDADE_CORTE, 0); }
		public TerminalNode PROPRIEDADE_grandezaUNITARIA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_grandezaUNITARIA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PROPRIEDADE_PARTEDEANIMAL() { return getToken(SemanticIntegrationParser.PROPRIEDADE_PARTEDEANIMAL, 0); }
		public TerminalNode PROPRIEDADE_TAMANHO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_TAMANHO, 0); }
		public TerminalNode PROPRIEDADE_BEBIDAS() { return getToken(SemanticIntegrationParser.PROPRIEDADE_BEBIDAS, 0); }
		public TerminalNode PROPRIEDADE_GERAL() { return getToken(SemanticIntegrationParser.PROPRIEDADE_GERAL, 0); }
		public TerminalNode PROPRIEDADE_PARTEDEPRODUTO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_PARTEDEPRODUTO, 0); }
		public TerminalNode PROPRIEDADE_APRESENTACAO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_APRESENTACAO, 0); }
		public QuantidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterQuantidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitQuantidade(this);
		}
	}

	public final QuantidadeContext quantidade() throws RecognitionException {
		QuantidadeContext _localctx = new QuantidadeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quantidade);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case ALGEBRICO_INTEIRO:
			case ALGEBRICO_DECIMAL:
			case ALGEBRICO_FRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); ((QuantidadeContext)_localctx).numero = numero();
				 ((QuantidadeContext)_localctx).value = ((QuantidadeContext)_localctx).numero.value; 
				}
				break;
			case PROPRIEDADE_TAMANHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); ((QuantidadeContext)_localctx).PROPRIEDADE_TAMANHO = match(PROPRIEDADE_TAMANHO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_TAMANHO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_TAMANHO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_TAMANHO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_grandezaUNITARIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); ((QuantidadeContext)_localctx).PROPRIEDADE_grandezaUNITARIA = match(PROPRIEDADE_grandezaUNITARIA);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_GRANDEZAUNITARIA valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_grandezaUNITARIA!=null?((QuantidadeContext)_localctx).PROPRIEDADE_grandezaUNITARIA.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_ESTADOFISICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); ((QuantidadeContext)_localctx).PROPRIEDADE_ESTADOFISICO = match(PROPRIEDADE_ESTADOFISICO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_ESTADOFISICO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_ESTADOFISICO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_ESTADOFISICO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_PARTEDEPRODUTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(211); ((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEPRODUTO = match(PROPRIEDADE_PARTEDEPRODUTO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_PARTEDEPRODUTO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEPRODUTO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEPRODUTO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_PARTEDEANIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(213); ((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL = match(PROPRIEDADE_PARTEDEANIMAL);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_PARTEDEANIMAL valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL!=null?((QuantidadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_CONCENTRACAO:
				enterOuterAlt(_localctx, 7);
				{
				setState(215); ((QuantidadeContext)_localctx).PROPRIEDADE_CONCENTRACAO = match(PROPRIEDADE_CONCENTRACAO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_CONCENTRACAO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_CONCENTRACAO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_CONCENTRACAO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_EMBALAGEM:
				enterOuterAlt(_localctx, 8);
				{
				setState(217); ((QuantidadeContext)_localctx).PROPRIEDADE_EMBALAGEM = match(PROPRIEDADE_EMBALAGEM);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_EMBALAGEM valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_EMBALAGEM!=null?((QuantidadeContext)_localctx).PROPRIEDADE_EMBALAGEM.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_GEOMETRIA:
				enterOuterAlt(_localctx, 9);
				{
				setState(219); ((QuantidadeContext)_localctx).PROPRIEDADE_GEOMETRIA = match(PROPRIEDADE_GEOMETRIA);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_GEOMETRIA valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_GEOMETRIA!=null?((QuantidadeContext)_localctx).PROPRIEDADE_GEOMETRIA.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_APRESENTACAO:
				enterOuterAlt(_localctx, 10);
				{
				setState(221); ((QuantidadeContext)_localctx).PROPRIEDADE_APRESENTACAO = match(PROPRIEDADE_APRESENTACAO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_APRESENTACAO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_APRESENTACAO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_APRESENTACAO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_CORTE:
				enterOuterAlt(_localctx, 11);
				{
				setState(223); ((QuantidadeContext)_localctx).PROPRIEDADE_CORTE = match(PROPRIEDADE_CORTE);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_CORTE valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_CORTE!=null?((QuantidadeContext)_localctx).PROPRIEDADE_CORTE.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_CONFECAO:
				enterOuterAlt(_localctx, 12);
				{
				setState(225); ((QuantidadeContext)_localctx).PROPRIEDADE_CONFECAO = match(PROPRIEDADE_CONFECAO);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_CONFECAO valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_CONFECAO!=null?((QuantidadeContext)_localctx).PROPRIEDADE_CONFECAO.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_BEBIDAS:
				enterOuterAlt(_localctx, 13);
				{
				setState(227); ((QuantidadeContext)_localctx).PROPRIEDADE_BEBIDAS = match(PROPRIEDADE_BEBIDAS);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_BEBIDAS valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_BEBIDAS!=null?((QuantidadeContext)_localctx).PROPRIEDADE_BEBIDAS.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_GERAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(229); ((QuantidadeContext)_localctx).PROPRIEDADE_GERAL = match(PROPRIEDADE_GERAL);
				 ((QuantidadeContext)_localctx).value = "<PROPRIEDADE_GERAL valor=\""+(((QuantidadeContext)_localctx).PROPRIEDADE_GERAL!=null?((QuantidadeContext)_localctx).PROPRIEDADE_GERAL.getText():null)+"\"/>"; 
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

	public static class NumeroContext extends ParserRuleContext {
		public String value;
		public Token ALGEBRICO_INTEIRO;
		public Token ALGEBRICO_DECIMAL;
		public Token ALGEBRICO_FRACAO;
		public TerminalNode ALGEBRICO_DECIMAL() { return getToken(SemanticIntegrationParser.ALGEBRICO_DECIMAL, 0); }
		public TerminalNode ALGEBRICO_INTEIRO() { return getToken(SemanticIntegrationParser.ALGEBRICO_INTEIRO, 0); }
		public TerminalNode ALGEBRICO_FRACAO() { return getToken(SemanticIntegrationParser.ALGEBRICO_FRACAO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numero);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case ALGEBRICO_INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); ((NumeroContext)_localctx).ALGEBRICO_INTEIRO = match(ALGEBRICO_INTEIRO);
				 ((NumeroContext)_localctx).value = "<ALGEBRICO_INTEIRO valor=\""+(((NumeroContext)_localctx).ALGEBRICO_INTEIRO!=null?((NumeroContext)_localctx).ALGEBRICO_INTEIRO.getText():null)+"\"/>"; 
				}
				break;
			case ALGEBRICO_DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); ((NumeroContext)_localctx).ALGEBRICO_DECIMAL = match(ALGEBRICO_DECIMAL);
				 ((NumeroContext)_localctx).value = "<ALGEBRICO_DECIMAL valor=\""+(((NumeroContext)_localctx).ALGEBRICO_DECIMAL!=null?((NumeroContext)_localctx).ALGEBRICO_DECIMAL.getText():null)+"\"/>"; 
				}
				break;
			case ALGEBRICO_FRACAO:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); ((NumeroContext)_localctx).ALGEBRICO_FRACAO = match(ALGEBRICO_FRACAO);
				 ((NumeroContext)_localctx).value = "<ALGEBRICO_FRACAO valor=\""+(((NumeroContext)_localctx).ALGEBRICO_FRACAO!=null?((NumeroContext)_localctx).ALGEBRICO_FRACAO.getText():null)+"\"/>"; 
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

	public static class GrandezaContext extends ParserRuleContext {
		public String value;
		public Token PROPRIEDADE_grandezaLIQUIDA;
		public Token PROPRIEDADE_grandezaSOLIDA;
		public Token PROPRIEDADE_grandezaUNITARIA;
		public TerminalNode PROPRIEDADE_grandezaUNITARIA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_grandezaUNITARIA, 0); }
		public TerminalNode PROPRIEDADE_grandezaLIQUIDA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_grandezaLIQUIDA, 0); }
		public TerminalNode PROPRIEDADE_grandezaSOLIDA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_grandezaSOLIDA, 0); }
		public GrandezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grandeza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterGrandeza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitGrandeza(this);
		}
	}

	public final GrandezaContext grandeza() throws RecognitionException {
		GrandezaContext _localctx = new GrandezaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_grandeza);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case PROPRIEDADE_grandezaLIQUIDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); ((GrandezaContext)_localctx).PROPRIEDADE_grandezaLIQUIDA = match(PROPRIEDADE_grandezaLIQUIDA);
				 ((GrandezaContext)_localctx).value = "<PROPRIEDADE_GRANDEZALIQUIDA valor=\""+(((GrandezaContext)_localctx).PROPRIEDADE_grandezaLIQUIDA!=null?((GrandezaContext)_localctx).PROPRIEDADE_grandezaLIQUIDA.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_grandezaSOLIDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((GrandezaContext)_localctx).PROPRIEDADE_grandezaSOLIDA = match(PROPRIEDADE_grandezaSOLIDA);
				 ((GrandezaContext)_localctx).value = "<PROPRIEDADE_GRANDEZASOLIDA valor=\""+(((GrandezaContext)_localctx).PROPRIEDADE_grandezaSOLIDA!=null?((GrandezaContext)_localctx).PROPRIEDADE_grandezaSOLIDA.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_grandezaUNITARIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); ((GrandezaContext)_localctx).PROPRIEDADE_grandezaUNITARIA = match(PROPRIEDADE_grandezaUNITARIA);
				 ((GrandezaContext)_localctx).value = "<PROPRIEDADE_GRANDEZAUNITARIA valor=\""+(((GrandezaContext)_localctx).PROPRIEDADE_grandezaUNITARIA!=null?((GrandezaContext)_localctx).PROPRIEDADE_grandezaUNITARIA.getText():null)+"\"/>"; 
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

	public static class PropriedadesContext extends ParserRuleContext {
		public int _p;
		public String value;
		public PropriedadesContext left;
		public PropriedadeContext propriedade;
		public ContemContext contem;
		public PropriedadesContext right;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public TerminalNode GRAMATICA_E() { return getToken(SemanticIntegrationParser.GRAMATICA_E, 0); }
		public PropriedadesContext propriedades(int i) {
			return getRuleContext(PropriedadesContext.class,i);
		}
		public ContemContext contem() {
			return getRuleContext(ContemContext.class,0);
		}
		public PropriedadeContext propriedade() {
			return getRuleContext(PropriedadeContext.class,0);
		}
		public List<PropriedadesContext> propriedades() {
			return getRuleContexts(PropriedadesContext.class);
		}
		public PropriedadesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PropriedadesContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_propriedades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterPropriedades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitPropriedades(this);
		}
	}

	public final PropriedadesContext propriedades(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropriedadesContext _localctx = new PropriedadesContext(_ctx, _parentState, _p);
		PropriedadesContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_propriedades);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(250); ((PropriedadesContext)_localctx).propriedade = propriedade();
				 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).propriedade.value; 
				}
				break;

			case 2:
				{
				setState(253); ((PropriedadesContext)_localctx).contem = contem();
				 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).contem.value; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PropriedadesContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedades);
						setState(258);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(259); match(GRAMATICA_E);
						setState(260); ((PropriedadesContext)_localctx).right = propriedades(3);
						 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).left.value+((PropriedadesContext)_localctx).right.value; 
						}
						break;

					case 2:
						{
						_localctx = new PropriedadesContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedades);
						setState(263);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(264); match(GRAMATICA_PREPOSICAO);
						setState(265); ((PropriedadesContext)_localctx).right = propriedades(2);
						 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).left.value+((PropriedadesContext)_localctx).right.value; 
						}
						break;

					case 3:
						{
						_localctx = new PropriedadesContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedades);
						setState(268);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(269); ((PropriedadesContext)_localctx).contem = contem();
						 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).left.value+((PropriedadesContext)_localctx).contem.value; 
						}
						break;

					case 4:
						{
						_localctx = new PropriedadesContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedades);
						setState(272);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(273); ((PropriedadesContext)_localctx).propriedade = propriedade();
						 ((PropriedadesContext)_localctx).value = ((PropriedadesContext)_localctx).left.value+((PropriedadesContext)_localctx).propriedade.value; 
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropriedadesSemprodutosContext extends ParserRuleContext {
		public int _p;
		public String value;
		public PropriedadesSemprodutosContext left;
		public PropriedadeContext propriedade;
		public PropriedadesSemprodutosContext propriedadesSemprodutos() {
			return getRuleContext(PropriedadesSemprodutosContext.class,0);
		}
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public TerminalNode GRAMATICA_E() { return getToken(SemanticIntegrationParser.GRAMATICA_E, 0); }
		public PropriedadeContext propriedade() {
			return getRuleContext(PropriedadeContext.class,0);
		}
		public PropriedadesSemprodutosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PropriedadesSemprodutosContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_propriedadesSemprodutos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterPropriedadesSemprodutos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitPropriedadesSemprodutos(this);
		}
	}

	public final PropriedadesSemprodutosContext propriedadesSemprodutos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropriedadesSemprodutosContext _localctx = new PropriedadesSemprodutosContext(_ctx, _parentState, _p);
		PropriedadesSemprodutosContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_propriedadesSemprodutos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282); ((PropriedadesSemprodutosContext)_localctx).propriedade = propriedade();
			 ((PropriedadesSemprodutosContext)_localctx).value = "<PROPRIEDADE valor=\""+(((PropriedadesSemprodutosContext)_localctx).propriedade!=null?_input.getText(((PropriedadesSemprodutosContext)_localctx).propriedade.start,((PropriedadesSemprodutosContext)_localctx).propriedade.stop):null)+"\"/>"; 
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PropriedadesSemprodutosContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedadesSemprodutos);
						setState(285);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(286); ((PropriedadesSemprodutosContext)_localctx).propriedade = propriedade();
						 ((PropriedadesSemprodutosContext)_localctx).value = "<PROPRIEDADESSEMPRODUTOS valor=\""+(((PropriedadesSemprodutosContext)_localctx).left!=null?_input.getText(((PropriedadesSemprodutosContext)_localctx).left.start,((PropriedadesSemprodutosContext)_localctx).left.stop):null)+"' />"+((PropriedadesSemprodutosContext)_localctx).propriedade.value; 
						}
						break;

					case 2:
						{
						_localctx = new PropriedadesSemprodutosContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedadesSemprodutos);
						setState(289);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(290); match(GRAMATICA_E);
						setState(291); ((PropriedadesSemprodutosContext)_localctx).propriedade = propriedade();
						 ((PropriedadesSemprodutosContext)_localctx).value = "<PROPRIEDADESSEMPRODUTOS valor=\""+(((PropriedadesSemprodutosContext)_localctx).left!=null?_input.getText(((PropriedadesSemprodutosContext)_localctx).left.start,((PropriedadesSemprodutosContext)_localctx).left.stop):null)+"' />"+((PropriedadesSemprodutosContext)_localctx).propriedade.value; 
						}
						break;

					case 3:
						{
						_localctx = new PropriedadesSemprodutosContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedadesSemprodutos);
						setState(294);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(295); match(GRAMATICA_PREPOSICAO);
						setState(296); ((PropriedadesSemprodutosContext)_localctx).propriedade = propriedade();
						 ((PropriedadesSemprodutosContext)_localctx).value = "<PROPRIEDADESSEMPRODUTOS valor=\""+(((PropriedadesSemprodutosContext)_localctx).left!=null?_input.getText(((PropriedadesSemprodutosContext)_localctx).left.start,((PropriedadesSemprodutosContext)_localctx).left.stop):null)+"' />"+((PropriedadesSemprodutosContext)_localctx).propriedade.value; 
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropriedadeContext extends ParserRuleContext {
		public String value;
		public Token PROPRIEDADE_BEBIDAS;
		public Token PROPRIEDADE_GERAL;
		public Token PROPRIEDADE_CONFECAO;
		public Token PROPRIEDADE_COR;
		public Token PROPRIEDADE_CLASSIFICACAODIETETICA;
		public Token PROPRIEDADE_ANO;
		public Token PROPRIEDADE_ANOS;
		public Token PROPRIEDADE_GEOMETRIA;
		public Token PROPRIEDADE_TAMANHO;
		public Propriedade_receitaContext propriedade_receita;
		public Token PROPRIEDADE_PARTEDEANIMAL;
		public QuantidadesContext quantidades;
		public Familia_na_descricaoContext familia_na_descricao;
		public Propriedade_desconhecidaContext propriedade_desconhecida;
		public TerminalNode PROPRIEDADE_GEOMETRIA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_GEOMETRIA, 0); }
		public TerminalNode PROPRIEDADE_CONFECAO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_CONFECAO, 0); }
		public TerminalNode PROPRIEDADE_ANOS() { return getToken(SemanticIntegrationParser.PROPRIEDADE_ANOS, 0); }
		public Familia_na_descricaoContext familia_na_descricao() {
			return getRuleContext(Familia_na_descricaoContext.class,0);
		}
		public TerminalNode PROPRIEDADE_COR() { return getToken(SemanticIntegrationParser.PROPRIEDADE_COR, 0); }
		public TerminalNode PROPRIEDADE_PARTEDEANIMAL() { return getToken(SemanticIntegrationParser.PROPRIEDADE_PARTEDEANIMAL, 0); }
		public TerminalNode PROPRIEDADE_TAMANHO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_TAMANHO, 0); }
		public TerminalNode PROPRIEDADE_BEBIDAS() { return getToken(SemanticIntegrationParser.PROPRIEDADE_BEBIDAS, 0); }
		public TerminalNode PROPRIEDADE_CLASSIFICACAODIETETICA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_CLASSIFICACAODIETETICA, 0); }
		public QuantidadesContext quantidades() {
			return getRuleContext(QuantidadesContext.class,0);
		}
		public TerminalNode PROPRIEDADE_ANO() { return getToken(SemanticIntegrationParser.PROPRIEDADE_ANO, 0); }
		public Propriedade_desconhecidaContext propriedade_desconhecida() {
			return getRuleContext(Propriedade_desconhecidaContext.class,0);
		}
		public TerminalNode PROPRIEDADE_GERAL() { return getToken(SemanticIntegrationParser.PROPRIEDADE_GERAL, 0); }
		public Propriedade_receitaContext propriedade_receita() {
			return getRuleContext(Propriedade_receitaContext.class,0);
		}
		public PropriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterPropriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitPropriedade(this);
		}
	}

	public final PropriedadeContext propriedade() throws RecognitionException {
		PropriedadeContext _localctx = new PropriedadeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propriedade);
		try {
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); ((PropriedadeContext)_localctx).PROPRIEDADE_BEBIDAS = match(PROPRIEDADE_BEBIDAS);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_BEBIDAS valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_BEBIDAS!=null?((PropriedadeContext)_localctx).PROPRIEDADE_BEBIDAS.getText():null)+"\"/>"; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); ((PropriedadeContext)_localctx).PROPRIEDADE_GERAL = match(PROPRIEDADE_GERAL);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_GERAL valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_GERAL!=null?((PropriedadeContext)_localctx).PROPRIEDADE_GERAL.getText():null)+"\"/>"; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); ((PropriedadeContext)_localctx).PROPRIEDADE_CONFECAO = match(PROPRIEDADE_CONFECAO);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_CONFECAO valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_CONFECAO!=null?((PropriedadeContext)_localctx).PROPRIEDADE_CONFECAO.getText():null)+"\"/>"; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310); ((PropriedadeContext)_localctx).PROPRIEDADE_COR = match(PROPRIEDADE_COR);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_COR valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_COR!=null?((PropriedadeContext)_localctx).PROPRIEDADE_COR.getText():null)+"\"/>"; 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312); ((PropriedadeContext)_localctx).PROPRIEDADE_CLASSIFICACAODIETETICA = match(PROPRIEDADE_CLASSIFICACAODIETETICA);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_CLASSIFICACAODIETETICA valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_CLASSIFICACAODIETETICA!=null?((PropriedadeContext)_localctx).PROPRIEDADE_CLASSIFICACAODIETETICA.getText():null)+"\"/>"; 
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314); ((PropriedadeContext)_localctx).PROPRIEDADE_ANO = match(PROPRIEDADE_ANO);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_ANO valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_ANO!=null?((PropriedadeContext)_localctx).PROPRIEDADE_ANO.getText():null)+"\"/>"; 
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316); ((PropriedadeContext)_localctx).PROPRIEDADE_ANOS = match(PROPRIEDADE_ANOS);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_ANOS valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_ANOS!=null?((PropriedadeContext)_localctx).PROPRIEDADE_ANOS.getText():null)+"\"/>"; 
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(318); ((PropriedadeContext)_localctx).PROPRIEDADE_GEOMETRIA = match(PROPRIEDADE_GEOMETRIA);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_GEOMETRIA valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_GEOMETRIA!=null?((PropriedadeContext)_localctx).PROPRIEDADE_GEOMETRIA.getText():null)+"\"/>"; 
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320); ((PropriedadeContext)_localctx).PROPRIEDADE_TAMANHO = match(PROPRIEDADE_TAMANHO);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_TAMANHO valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_TAMANHO!=null?((PropriedadeContext)_localctx).PROPRIEDADE_TAMANHO.getText():null)+"\"/>"; 
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(322); ((PropriedadeContext)_localctx).propriedade_receita = propriedade_receita(0);
				 ((PropriedadeContext)_localctx).value = ((PropriedadeContext)_localctx).propriedade_receita.value; 
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(325); ((PropriedadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL = match(PROPRIEDADE_PARTEDEANIMAL);
				 ((PropriedadeContext)_localctx).value = "<PROPRIEDADE_PARTEDEANIMAL valor=\""+(((PropriedadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL!=null?((PropriedadeContext)_localctx).PROPRIEDADE_PARTEDEANIMAL.getText():null)+"\"/>"; 
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(327); ((PropriedadeContext)_localctx).quantidades = quantidades();
				 ((PropriedadeContext)_localctx).value = ((PropriedadeContext)_localctx).quantidades.value; 
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(330); ((PropriedadeContext)_localctx).familia_na_descricao = familia_na_descricao();
				 ((PropriedadeContext)_localctx).value = ((PropriedadeContext)_localctx).familia_na_descricao.value; 
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(333); ((PropriedadeContext)_localctx).propriedade_desconhecida = propriedade_desconhecida();
				 ((PropriedadeContext)_localctx).value = ((PropriedadeContext)_localctx).propriedade_desconhecida.value; 
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

	public static class Propriedade_receitaContext extends ParserRuleContext {
		public int _p;
		public String value;
		public Propriedade_receitaContext left;
		public Token NOME_RECEITA;
		public Token PALAVRA_DESCONHECIDA;
		public TerminalNode GRAMATICA_PREPOSICAO() { return getToken(SemanticIntegrationParser.GRAMATICA_PREPOSICAO, 0); }
		public TerminalNode NOME_RECEITA() { return getToken(SemanticIntegrationParser.NOME_RECEITA, 0); }
		public TerminalNode PALAVRA_DESCONHECIDA() { return getToken(SemanticIntegrationParser.PALAVRA_DESCONHECIDA, 0); }
		public Propriedade_receitaContext propriedade_receita() {
			return getRuleContext(Propriedade_receitaContext.class,0);
		}
		public Propriedade_receitaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Propriedade_receitaContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_propriedade_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterPropriedade_receita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitPropriedade_receita(this);
		}
	}

	public final Propriedade_receitaContext propriedade_receita(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Propriedade_receitaContext _localctx = new Propriedade_receitaContext(_ctx, _parentState, _p);
		Propriedade_receitaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_propriedade_receita);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(339); ((Propriedade_receitaContext)_localctx).NOME_RECEITA = match(NOME_RECEITA);
			 ((Propriedade_receitaContext)_localctx).value = "<NOME_RECEITA valor=\""+(((Propriedade_receitaContext)_localctx).NOME_RECEITA!=null?((Propriedade_receitaContext)_localctx).NOME_RECEITA.getText():null)+"\"/>"; 
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Propriedade_receitaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedade_receita);
						setState(342);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(343); ((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA = match(PALAVRA_DESCONHECIDA);
						 ((Propriedade_receitaContext)_localctx).value = ((Propriedade_receitaContext)_localctx).left.value+"<PALAVRA_DESCONHECIDA valor=\""+(((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA!=null?((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA.getText():null)+"\"/>"; 
						}
						break;

					case 2:
						{
						_localctx = new Propriedade_receitaContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_propriedade_receita);
						setState(345);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(346); match(GRAMATICA_PREPOSICAO);
						setState(347); ((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA = match(PALAVRA_DESCONHECIDA);
						 ((Propriedade_receitaContext)_localctx).value = ((Propriedade_receitaContext)_localctx).left.value+"<PALAVRA_DESCONHECIDA valor=\""+(((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA!=null?((Propriedade_receitaContext)_localctx).PALAVRA_DESCONHECIDA.getText():null)+"\"/>"; 
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ContemContext extends ParserRuleContext {
		public String value;
		public ProdutoContext produto;
		public ProdutoContext produto() {
			return getRuleContext(ProdutoContext.class,0);
		}
		public ContemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterContem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitContem(this);
		}
	}

	public final ContemContext contem() throws RecognitionException {
		ContemContext _localctx = new ContemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((ContemContext)_localctx).produto = produto();
			 ((ContemContext)_localctx).value = ((ContemContext)_localctx).produto.value; 
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

	public static class ProdutoContext extends ParserRuleContext {
		public String value;
		public Token CLASSE_SOPAS;
		public Token CLASSE_CEREAIS;
		public Token CLASSE_LEGUMINOSAS;
		public Token CLASSE_HORTICOLAS;
		public Token CLASSE_FRUTA;
		public Token CLASSE_LACTEOS;
		public Token CLASSE_CHOCOLATES;
		public Token CLASSE_ERVAAROMATICA;
		public Token PROPRIEDADE_MARCA;
		public Token CLASSE_CONDIMENTO;
		public Token CLASSE_BEBIDA_COMCAFEINA;
		public Token CLASSE_BEBIDAS_ALCOOLICAS;
		public Token CLASSE_BEBIDAS_NAOALCOOLICAS;
		public Token CLASSE_BEBIDAS_REFRIGERANTES;
		public Token CLASSE_ACUCARADOS;
		public Token CLASSE_CARNE;
		public Token CLASSE_PESCADO;
		public Token CLASSE_CARNE_TRANSFORMADO;
		public Token CLASSE_OVOS;
		public Token CLASSE_SOBREMESAS;
		public Token CLASSE_MOLHOS;
		public Token CLASSE_AZEITES;
		public Token CLASSE_GORDURAS;
		public Produto_desconhecidoContext produto_desconhecido;
		public TerminalNode CLASSE_FRUTA() { return getToken(SemanticIntegrationParser.CLASSE_FRUTA, 0); }
		public TerminalNode CLASSE_CEREAIS() { return getToken(SemanticIntegrationParser.CLASSE_CEREAIS, 0); }
		public TerminalNode CLASSE_BEBIDAS_ALCOOLICAS() { return getToken(SemanticIntegrationParser.CLASSE_BEBIDAS_ALCOOLICAS, 0); }
		public TerminalNode CLASSE_ERVAAROMATICA() { return getToken(SemanticIntegrationParser.CLASSE_ERVAAROMATICA, 0); }
		public TerminalNode CLASSE_CARNE_TRANSFORMADO() { return getToken(SemanticIntegrationParser.CLASSE_CARNE_TRANSFORMADO, 0); }
		public TerminalNode CLASSE_SOPAS() { return getToken(SemanticIntegrationParser.CLASSE_SOPAS, 0); }
		public TerminalNode CLASSE_LACTEOS() { return getToken(SemanticIntegrationParser.CLASSE_LACTEOS, 0); }
		public TerminalNode CLASSE_BEBIDA_COMCAFEINA() { return getToken(SemanticIntegrationParser.CLASSE_BEBIDA_COMCAFEINA, 0); }
		public TerminalNode CLASSE_LEGUMINOSAS() { return getToken(SemanticIntegrationParser.CLASSE_LEGUMINOSAS, 0); }
		public TerminalNode CLASSE_CONDIMENTO() { return getToken(SemanticIntegrationParser.CLASSE_CONDIMENTO, 0); }
		public TerminalNode CLASSE_CHOCOLATES() { return getToken(SemanticIntegrationParser.CLASSE_CHOCOLATES, 0); }
		public TerminalNode CLASSE_BEBIDAS_REFRIGERANTES() { return getToken(SemanticIntegrationParser.CLASSE_BEBIDAS_REFRIGERANTES, 0); }
		public TerminalNode CLASSE_AZEITES() { return getToken(SemanticIntegrationParser.CLASSE_AZEITES, 0); }
		public TerminalNode CLASSE_MOLHOS() { return getToken(SemanticIntegrationParser.CLASSE_MOLHOS, 0); }
		public TerminalNode CLASSE_OVOS() { return getToken(SemanticIntegrationParser.CLASSE_OVOS, 0); }
		public TerminalNode CLASSE_GORDURAS() { return getToken(SemanticIntegrationParser.CLASSE_GORDURAS, 0); }
		public TerminalNode CLASSE_ACUCARADOS() { return getToken(SemanticIntegrationParser.CLASSE_ACUCARADOS, 0); }
		public TerminalNode CLASSE_PESCADO() { return getToken(SemanticIntegrationParser.CLASSE_PESCADO, 0); }
		public Produto_desconhecidoContext produto_desconhecido() {
			return getRuleContext(Produto_desconhecidoContext.class,0);
		}
		public TerminalNode CLASSE_SOBREMESAS() { return getToken(SemanticIntegrationParser.CLASSE_SOBREMESAS, 0); }
		public TerminalNode CLASSE_CARNE() { return getToken(SemanticIntegrationParser.CLASSE_CARNE, 0); }
		public TerminalNode CLASSE_HORTICOLAS() { return getToken(SemanticIntegrationParser.CLASSE_HORTICOLAS, 0); }
		public TerminalNode PROPRIEDADE_MARCA() { return getToken(SemanticIntegrationParser.PROPRIEDADE_MARCA, 0); }
		public TerminalNode CLASSE_BEBIDAS_NAOALCOOLICAS() { return getToken(SemanticIntegrationParser.CLASSE_BEBIDAS_NAOALCOOLICAS, 0); }
		public ProdutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_produto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterProduto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitProduto(this);
		}
	}

	public final ProdutoContext produto() throws RecognitionException {
		ProdutoContext _localctx = new ProdutoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_produto);
		try {
			setState(406);
			switch (_input.LA(1)) {
			case CLASSE_SOPAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); ((ProdutoContext)_localctx).CLASSE_SOPAS = match(CLASSE_SOPAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_SOPAS valor=\""+(((ProdutoContext)_localctx).CLASSE_SOPAS!=null?((ProdutoContext)_localctx).CLASSE_SOPAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_CEREAIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); ((ProdutoContext)_localctx).CLASSE_CEREAIS = match(CLASSE_CEREAIS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_CEREAIS valor=\""+(((ProdutoContext)_localctx).CLASSE_CEREAIS!=null?((ProdutoContext)_localctx).CLASSE_CEREAIS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_LEGUMINOSAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(361); ((ProdutoContext)_localctx).CLASSE_LEGUMINOSAS = match(CLASSE_LEGUMINOSAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_LEGUMINOSAS valor=\""+(((ProdutoContext)_localctx).CLASSE_LEGUMINOSAS!=null?((ProdutoContext)_localctx).CLASSE_LEGUMINOSAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_HORTICOLAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(363); ((ProdutoContext)_localctx).CLASSE_HORTICOLAS = match(CLASSE_HORTICOLAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_HORTICOLAS valor=\""+(((ProdutoContext)_localctx).CLASSE_HORTICOLAS!=null?((ProdutoContext)_localctx).CLASSE_HORTICOLAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_FRUTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); ((ProdutoContext)_localctx).CLASSE_FRUTA = match(CLASSE_FRUTA);
				 ((ProdutoContext)_localctx).value = "<CLASSE_FRUTA valor=\""+(((ProdutoContext)_localctx).CLASSE_FRUTA!=null?((ProdutoContext)_localctx).CLASSE_FRUTA.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_LACTEOS:
				enterOuterAlt(_localctx, 6);
				{
				setState(367); ((ProdutoContext)_localctx).CLASSE_LACTEOS = match(CLASSE_LACTEOS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_LACTEOS valor=\""+(((ProdutoContext)_localctx).CLASSE_LACTEOS!=null?((ProdutoContext)_localctx).CLASSE_LACTEOS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_CHOCOLATES:
				enterOuterAlt(_localctx, 7);
				{
				setState(369); ((ProdutoContext)_localctx).CLASSE_CHOCOLATES = match(CLASSE_CHOCOLATES);
				 ((ProdutoContext)_localctx).value = "<CLASSE_CHOCOLATES valor=\""+(((ProdutoContext)_localctx).CLASSE_CHOCOLATES!=null?((ProdutoContext)_localctx).CLASSE_CHOCOLATES.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_ERVAAROMATICA:
				enterOuterAlt(_localctx, 8);
				{
				setState(371); ((ProdutoContext)_localctx).CLASSE_ERVAAROMATICA = match(CLASSE_ERVAAROMATICA);
				 ((ProdutoContext)_localctx).value = "<CLASSE_ERVAAROMATICA valor=\""+(((ProdutoContext)_localctx).CLASSE_ERVAAROMATICA!=null?((ProdutoContext)_localctx).CLASSE_ERVAAROMATICA.getText():null)+"\"/>"; 
				}
				break;
			case PROPRIEDADE_MARCA:
				enterOuterAlt(_localctx, 9);
				{
				setState(373); ((ProdutoContext)_localctx).PROPRIEDADE_MARCA = match(PROPRIEDADE_MARCA);
				 ((ProdutoContext)_localctx).value = "<PROPRIEDADE_MARCA valor=\""+(((ProdutoContext)_localctx).PROPRIEDADE_MARCA!=null?((ProdutoContext)_localctx).PROPRIEDADE_MARCA.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_CONDIMENTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(375); ((ProdutoContext)_localctx).CLASSE_CONDIMENTO = match(CLASSE_CONDIMENTO);
				 ((ProdutoContext)_localctx).value = "<CLASSE_CONDIMENTO valor=\""+(((ProdutoContext)_localctx).CLASSE_CONDIMENTO!=null?((ProdutoContext)_localctx).CLASSE_CONDIMENTO.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_BEBIDA_COMCAFEINA:
				enterOuterAlt(_localctx, 11);
				{
				setState(377); ((ProdutoContext)_localctx).CLASSE_BEBIDA_COMCAFEINA = match(CLASSE_BEBIDA_COMCAFEINA);
				 ((ProdutoContext)_localctx).value = "<CLASSE_BEBIDA_COMCAFEINA valor=\""+(((ProdutoContext)_localctx).CLASSE_BEBIDA_COMCAFEINA!=null?((ProdutoContext)_localctx).CLASSE_BEBIDA_COMCAFEINA.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_BEBIDAS_ALCOOLICAS:
				enterOuterAlt(_localctx, 12);
				{
				setState(379); ((ProdutoContext)_localctx).CLASSE_BEBIDAS_ALCOOLICAS = match(CLASSE_BEBIDAS_ALCOOLICAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_BEBIDAS_ALCOOLICAS valor=\""+(((ProdutoContext)_localctx).CLASSE_BEBIDAS_ALCOOLICAS!=null?((ProdutoContext)_localctx).CLASSE_BEBIDAS_ALCOOLICAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_BEBIDAS_NAOALCOOLICAS:
				enterOuterAlt(_localctx, 13);
				{
				setState(381); ((ProdutoContext)_localctx).CLASSE_BEBIDAS_NAOALCOOLICAS = match(CLASSE_BEBIDAS_NAOALCOOLICAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_BEBIDAS_NAOALCOOLICAS valor=\""+(((ProdutoContext)_localctx).CLASSE_BEBIDAS_NAOALCOOLICAS!=null?((ProdutoContext)_localctx).CLASSE_BEBIDAS_NAOALCOOLICAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_BEBIDAS_REFRIGERANTES:
				enterOuterAlt(_localctx, 14);
				{
				setState(383); ((ProdutoContext)_localctx).CLASSE_BEBIDAS_REFRIGERANTES = match(CLASSE_BEBIDAS_REFRIGERANTES);
				 ((ProdutoContext)_localctx).value = "<CLASSE_BEBIDAS_REFRIGERANTES valor=\""+(((ProdutoContext)_localctx).CLASSE_BEBIDAS_REFRIGERANTES!=null?((ProdutoContext)_localctx).CLASSE_BEBIDAS_REFRIGERANTES.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_ACUCARADOS:
				enterOuterAlt(_localctx, 15);
				{
				setState(385); ((ProdutoContext)_localctx).CLASSE_ACUCARADOS = match(CLASSE_ACUCARADOS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_ACUCARADOS valor=\""+(((ProdutoContext)_localctx).CLASSE_ACUCARADOS!=null?((ProdutoContext)_localctx).CLASSE_ACUCARADOS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_CARNE:
				enterOuterAlt(_localctx, 16);
				{
				setState(387); ((ProdutoContext)_localctx).CLASSE_CARNE = match(CLASSE_CARNE);
				 ((ProdutoContext)_localctx).value = "<CLASSE_CARNE valor=\""+(((ProdutoContext)_localctx).CLASSE_CARNE!=null?((ProdutoContext)_localctx).CLASSE_CARNE.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_PESCADO:
				enterOuterAlt(_localctx, 17);
				{
				setState(389); ((ProdutoContext)_localctx).CLASSE_PESCADO = match(CLASSE_PESCADO);
				 ((ProdutoContext)_localctx).value = "<CLASSE_PESCADO valor=\""+(((ProdutoContext)_localctx).CLASSE_PESCADO!=null?((ProdutoContext)_localctx).CLASSE_PESCADO.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_CARNE_TRANSFORMADO:
				enterOuterAlt(_localctx, 18);
				{
				setState(391); ((ProdutoContext)_localctx).CLASSE_CARNE_TRANSFORMADO = match(CLASSE_CARNE_TRANSFORMADO);
				 ((ProdutoContext)_localctx).value = "<CLASSE_CARNE_TRANSFORMADO valor=\""+(((ProdutoContext)_localctx).CLASSE_CARNE_TRANSFORMADO!=null?((ProdutoContext)_localctx).CLASSE_CARNE_TRANSFORMADO.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_OVOS:
				enterOuterAlt(_localctx, 19);
				{
				setState(393); ((ProdutoContext)_localctx).CLASSE_OVOS = match(CLASSE_OVOS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_OVOS valor=\""+(((ProdutoContext)_localctx).CLASSE_OVOS!=null?((ProdutoContext)_localctx).CLASSE_OVOS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_SOBREMESAS:
				enterOuterAlt(_localctx, 20);
				{
				setState(395); ((ProdutoContext)_localctx).CLASSE_SOBREMESAS = match(CLASSE_SOBREMESAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_SOBREMESAS valor=\""+(((ProdutoContext)_localctx).CLASSE_SOBREMESAS!=null?((ProdutoContext)_localctx).CLASSE_SOBREMESAS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_MOLHOS:
				enterOuterAlt(_localctx, 21);
				{
				setState(397); ((ProdutoContext)_localctx).CLASSE_MOLHOS = match(CLASSE_MOLHOS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_MOLHOS valor=\""+(((ProdutoContext)_localctx).CLASSE_MOLHOS!=null?((ProdutoContext)_localctx).CLASSE_MOLHOS.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_AZEITES:
				enterOuterAlt(_localctx, 22);
				{
				setState(399); ((ProdutoContext)_localctx).CLASSE_AZEITES = match(CLASSE_AZEITES);
				 ((ProdutoContext)_localctx).value = "<CLASSE_AZEITES valor=\""+(((ProdutoContext)_localctx).CLASSE_AZEITES!=null?((ProdutoContext)_localctx).CLASSE_AZEITES.getText():null)+"\"/>"; 
				}
				break;
			case CLASSE_GORDURAS:
				enterOuterAlt(_localctx, 23);
				{
				setState(401); ((ProdutoContext)_localctx).CLASSE_GORDURAS = match(CLASSE_GORDURAS);
				 ((ProdutoContext)_localctx).value = "<CLASSE_GORDURAS valor=\""+(((ProdutoContext)_localctx).CLASSE_GORDURAS!=null?((ProdutoContext)_localctx).CLASSE_GORDURAS.getText():null)+"\"/>"; 
				}
				break;
			case PALAVRA_DESCONHECIDA:
				enterOuterAlt(_localctx, 24);
				{
				setState(403); ((ProdutoContext)_localctx).produto_desconhecido = produto_desconhecido();
				 ((ProdutoContext)_localctx).value = ((ProdutoContext)_localctx).produto_desconhecido.value; 
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

	public static class Propriedade_desconhecidaContext extends ParserRuleContext {
		public String value;
		public DesconhecidoContext desconhecido;
		public DesconhecidoContext desconhecido() {
			return getRuleContext(DesconhecidoContext.class,0);
		}
		public Propriedade_desconhecidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propriedade_desconhecida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterPropriedade_desconhecida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitPropriedade_desconhecida(this);
		}
	}

	public final Propriedade_desconhecidaContext propriedade_desconhecida() throws RecognitionException {
		Propriedade_desconhecidaContext _localctx = new Propriedade_desconhecidaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propriedade_desconhecida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); ((Propriedade_desconhecidaContext)_localctx).desconhecido = desconhecido(0);
			 ((Propriedade_desconhecidaContext)_localctx).value = "<PROPRIEDADE_DESCONHECIDA valor=\""+(((Propriedade_desconhecidaContext)_localctx).desconhecido!=null?_input.getText(((Propriedade_desconhecidaContext)_localctx).desconhecido.start,((Propriedade_desconhecidaContext)_localctx).desconhecido.stop):null)+"\"/>"; 
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

	public static class Produto_desconhecidoContext extends ParserRuleContext {
		public String value;
		public DesconhecidoContext desconhecido;
		public DesconhecidoContext desconhecido() {
			return getRuleContext(DesconhecidoContext.class,0);
		}
		public Produto_desconhecidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_produto_desconhecido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterProduto_desconhecido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitProduto_desconhecido(this);
		}
	}

	public final Produto_desconhecidoContext produto_desconhecido() throws RecognitionException {
		Produto_desconhecidoContext _localctx = new Produto_desconhecidoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_produto_desconhecido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); ((Produto_desconhecidoContext)_localctx).desconhecido = desconhecido(0);
			 ((Produto_desconhecidoContext)_localctx).value = "<PRODUTO_DESCONHECIDO valor=\""+(((Produto_desconhecidoContext)_localctx).desconhecido!=null?_input.getText(((Produto_desconhecidoContext)_localctx).desconhecido.start,((Produto_desconhecidoContext)_localctx).desconhecido.stop):null)+"\"/>"; 
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

	public static class DesconhecidoContext extends ParserRuleContext {
		public int _p;
		public String value;
		public DesconhecidoContext left;
		public Token PALAVRA_DESCONHECIDA;
		public DesconhecidoContext desconhecido() {
			return getRuleContext(DesconhecidoContext.class,0);
		}
		public TerminalNode PALAVRA_DESCONHECIDA() { return getToken(SemanticIntegrationParser.PALAVRA_DESCONHECIDA, 0); }
		public DesconhecidoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DesconhecidoContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_desconhecido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).enterDesconhecido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemanticIntegrationListener ) ((SemanticIntegrationListener)listener).exitDesconhecido(this);
		}
	}

	public final DesconhecidoContext desconhecido(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesconhecidoContext _localctx = new DesconhecidoContext(_ctx, _parentState, _p);
		DesconhecidoContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_desconhecido);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415); ((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA = match(PALAVRA_DESCONHECIDA);
			 ((DesconhecidoContext)_localctx).value = "<PALAVRA_DESCONHECIDA valor=\""+(((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA!=null?((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA.getText():null)+"\"/>"; 
			}
			_ctx.stop = _input.LT(-1);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesconhecidoContext(_parentctx, _parentState, _p);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_desconhecido);
					setState(418);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(419); ((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA = match(PALAVRA_DESCONHECIDA);
					 ((DesconhecidoContext)_localctx).value = ((DesconhecidoContext)_localctx).left.value+"<PALAVRA_DESCONHECIDA valor=\""+(((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA!=null?((DesconhecidoContext)_localctx).PALAVRA_DESCONHECIDA.getText():null)+"\"/>"; 
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return descricao_composta_sempred((Descricao_compostaContext)_localctx, predIndex);

		case 10: return propriedades_sempred((PropriedadesContext)_localctx, predIndex);

		case 11: return propriedadesSemprodutos_sempred((PropriedadesSemprodutosContext)_localctx, predIndex);

		case 13: return propriedade_receita_sempred((Propriedade_receitaContext)_localctx, predIndex);

		case 18: return desconhecido_sempred((DesconhecidoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean desconhecido_sempred(DesconhecidoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean propriedadesSemprodutos_sempred(PropriedadesSemprodutosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 3 >= _localctx._p;

		case 9: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean descricao_composta_sempred(Descricao_compostaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 1 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean propriedade_receita_sempred(Propriedade_receitaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return 2 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean propriedades_sempred(PropriedadesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\67\u01ad\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00a7\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00cb\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00ea\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00fa\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0117\n\f\f\f\16\f\u011a\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0153\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0160\n\17\f\17\16\17\u0163\13\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0199\n\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01a8\n\24\f\24"+
		"\16\24\u01ab\13\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\2\u01f5\2(\3\2\2\2\4+\3\2\2\2\6N\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2\f"+
		"\u00a6\3\2\2\2\16\u00ca\3\2\2\2\20\u00e9\3\2\2\2\22\u00f1\3\2\2\2\24\u00f9"+
		"\3\2\2\2\26\u0102\3\2\2\2\30\u011b\3\2\2\2\32\u0152\3\2\2\2\34\u0154\3"+
		"\2\2\2\36\u0164\3\2\2\2 \u0198\3\2\2\2\"\u019a\3\2\2\2$\u019d\3\2\2\2"+
		"&\u01a0\3\2\2\2()\5\4\3\2)*\b\2\1\2*\3\3\2\2\2+,\b\3\1\2,-\5\6\4\2-.\b"+
		"\3\1\2.E\3\2\2\2/\60\6\3\2\3\60\61\7\3\2\2\61\62\5\4\3\2\62\63\b\3\1\2"+
		"\63D\3\2\2\2\64\65\6\3\3\3\65\66\7\6\2\2\66\67\5\4\3\2\678\b\3\1\28D\3"+
		"\2\2\29:\6\3\4\3:;\7\4\2\2;<\5\6\4\2<=\b\3\1\2=D\3\2\2\2>?\6\3\5\3?@\7"+
		"\5\2\2@A\5\6\4\2AB\b\3\1\2BD\3\2\2\2C/\3\2\2\2C\64\3\2\2\2C9\3\2\2\2C"+
		">\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\5\b\5\2"+
		"IJ\b\4\1\2JO\3\2\2\2KL\5\f\7\2LM\b\4\1\2MO\3\2\2\2NH\3\2\2\2NK\3\2\2\2"+
		"O\7\3\2\2\2PQ\5\n\6\2QR\b\5\1\2Ra\3\2\2\2ST\5\n\6\2TU\5\f\7\2UV\b\5\1"+
		"\2Va\3\2\2\2WX\5\n\6\2XY\7\6\2\2YZ\5\f\7\2Z[\b\5\1\2[a\3\2\2\2\\]\5\n"+
		"\6\2]^\5\26\f\2^_\b\5\1\2_a\3\2\2\2`P\3\2\2\2`S\3\2\2\2`W\3\2\2\2`\\\3"+
		"\2\2\2a\t\3\2\2\2bc\7\36\2\2cd\b\6\1\2d\13\3\2\2\2ef\5 \21\2fg\b\7\1\2"+
		"g\u00a7\3\2\2\2hi\7\6\2\2ij\5 \21\2jk\b\7\1\2k\u00a7\3\2\2\2lm\5 \21\2"+
		"mn\5\26\f\2no\b\7\1\2o\u00a7\3\2\2\2pq\5 \21\2qr\7\6\2\2rs\5\26\f\2st"+
		"\b\7\1\2t\u00a7\3\2\2\2uv\5 \21\2vw\5\26\f\2wx\5\16\b\2xy\b\7\1\2y\u00a7"+
		"\3\2\2\2z{\5 \21\2{|\5\26\f\2|}\5\16\b\2}~\5\26\f\2~\177\b\7\1\2\177\u00a7"+
		"\3\2\2\2\u0080\u0081\5\16\b\2\u0081\u0082\b\7\1\2\u0082\u00a7\3\2\2\2"+
		"\u0083\u0084\5\16\b\2\u0084\u0085\5 \21\2\u0085\u0086\b\7\1\2\u0086\u00a7"+
		"\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u0089\5\26\f\2\u0089\u008a\b\7\1\2"+
		"\u008a\u00a7\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\5 \21\2\u008d\u008e"+
		"\5\26\f\2\u008e\u008f\b\7\1\2\u008f\u00a7\3\2\2\2\u0090\u0091\5\16\b\2"+
		"\u0091\u0092\5\26\f\2\u0092\u0093\7\6\2\2\u0093\u0094\5 \21\2\u0094\u0095"+
		"\5\26\f\2\u0095\u0096\b\7\1\2\u0096\u00a7\3\2\2\2\u0097\u0098\5 \21\2"+
		"\u0098\u0099\5\16\b\2\u0099\u009a\b\7\1\2\u009a\u00a7\3\2\2\2\u009b\u009c"+
		"\5 \21\2\u009c\u009d\5\16\b\2\u009d\u009e\5\26\f\2\u009e\u009f\b\7\1\2"+
		"\u009f\u00a7\3\2\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3"+
		"\5\26\f\2\u00a3\u00a4\5\16\b\2\u00a4\u00a5\b\7\1\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6e\3\2\2\2\u00a6h\3\2\2\2\u00a6l\3\2\2\2\u00a6p\3\2\2\2\u00a6u\3"+
		"\2\2\2\u00a6z\3\2\2\2\u00a6\u0080\3\2\2\2\u00a6\u0083\3\2\2\2\u00a6\u0087"+
		"\3\2\2\2\u00a6\u008b\3\2\2\2\u00a6\u0090\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6"+
		"\u009b\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\5\24\13"+
		"\2\u00a9\u00aa\b\b\1\2\u00aa\u00cb\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac"+
		"\u00ad\b\b\1\2\u00ad\u00cb\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\7"+
		"\6\2\2\u00b0\u00b1\b\b\1\2\u00b1\u00cb\3\2\2\2\u00b2\u00b3\5\20\t\2\u00b3"+
		"\u00b4\5\20\t\2\u00b4\u00b5\b\b\1\2\u00b5\u00cb\3\2\2\2\u00b6\u00b7\5"+
		"\20\t\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\b\b\1\2\u00b9\u00cb\3\2\2\2"+
		"\u00ba\u00bb\5\20\t\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\7\6\2\2\u00bd"+
		"\u00be\b\b\1\2\u00be\u00cb\3\2\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\5"+
		"\24\13\2\u00c1\u00c2\5\16\b\2\u00c2\u00c3\b\b\1\2\u00c3\u00cb\3\2\2\2"+
		"\u00c4\u00c5\5\20\t\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7\6\2\2\u00c7"+
		"\u00c8\5\16\b\2\u00c8\u00c9\b\b\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00a8\3"+
		"\2\2\2\u00ca\u00ab\3\2\2\2\u00ca\u00ae\3\2\2\2\u00ca\u00b2\3\2\2\2\u00ca"+
		"\u00b6\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c4\3\2"+
		"\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\5\22\n\2\u00cd\u00ce\b\t\1\2\u00ce\u00ea"+
		"\3\2\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00ea\b\t\1\2\u00d1\u00d2\7\13\2\2"+
		"\u00d2\u00ea\b\t\1\2\u00d3\u00d4\7\f\2\2\u00d4\u00ea\b\t\1\2\u00d5\u00d6"+
		"\7\23\2\2\u00d6\u00ea\b\t\1\2\u00d7\u00d8\7\22\2\2\u00d8\u00ea\b\t\1\2"+
		"\u00d9\u00da\7\64\2\2\u00da\u00ea\b\t\1\2\u00db\u00dc\7\31\2\2\u00dc\u00ea"+
		"\b\t\1\2\u00dd\u00de\7\17\2\2\u00de\u00ea\b\t\1\2\u00df\u00e0\7\27\2\2"+
		"\u00e0\u00ea\b\t\1\2\u00e1\u00e2\7\21\2\2\u00e2\u00ea\b\t\1\2\u00e3\u00e4"+
		"\7\24\2\2\u00e4\u00ea\b\t\1\2\u00e5\u00e6\7\r\2\2\u00e6\u00ea\b\t\1\2"+
		"\u00e7\u00e8\7\16\2\2\u00e8\u00ea\b\t\1\2\u00e9\u00cc\3\2\2\2\u00e9\u00cf"+
		"\3\2\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00d3\3\2\2\2\u00e9\u00d5\3\2\2\2\u00e9"+
		"\u00d7\3\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00dd\3\2"+
		"\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\21\3\2\2\2\u00eb\u00ec\7\61\2"+
		"\2\u00ec\u00f2\b\n\1\2\u00ed\u00ee\7\62\2\2\u00ee\u00f2\b\n\1\2\u00ef"+
		"\u00f0\7\63\2\2\u00f0\u00f2\b\n\1\2\u00f1\u00eb\3\2\2\2\u00f1\u00ed\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4"+
		"\u00fa\b\13\1\2\u00f5\u00f6\7\n\2\2\u00f6\u00fa\b\13\1\2\u00f7\u00f8\7"+
		"\13\2\2\u00f8\u00fa\b\13\1\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\25\3\2\2\2\u00fb\u00fc\b\f\1\2\u00fc\u00fd\5\32\16"+
		"\2\u00fd\u00fe\b\f\1\2\u00fe\u0103\3\2\2\2\u00ff\u0100\5\36\20\2\u0100"+
		"\u0101\b\f\1\2\u0101\u0103\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00ff\3\2"+
		"\2\2\u0103\u0118\3\2\2\2\u0104\u0105\6\f\6\3\u0105\u0106\7\3\2\2\u0106"+
		"\u0107\5\26\f\2\u0107\u0108\b\f\1\2\u0108\u0117\3\2\2\2\u0109\u010a\6"+
		"\f\7\3\u010a\u010b\7\6\2\2\u010b\u010c\5\26\f\2\u010c\u010d\b\f\1\2\u010d"+
		"\u0117\3\2\2\2\u010e\u010f\6\f\b\3\u010f\u0110\5\36\20\2\u0110\u0111\b"+
		"\f\1\2\u0111\u0117\3\2\2\2\u0112\u0113\6\f\t\3\u0113\u0114\5\32\16\2\u0114"+
		"\u0115\b\f\1\2\u0115\u0117\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0109\3\2"+
		"\2\2\u0116\u010e\3\2\2\2\u0116\u0112\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\27\3\2\2\2\u011a\u0118\3\2\2"+
		"\2\u011b\u011c\b\r\1\2\u011c\u011d\5\32\16\2\u011d\u011e\b\r\1\2\u011e"+
		"\u012f\3\2\2\2\u011f\u0120\6\r\n\3\u0120\u0121\5\32\16\2\u0121\u0122\b"+
		"\r\1\2\u0122\u012e\3\2\2\2\u0123\u0124\6\r\13\3\u0124\u0125\7\3\2\2\u0125"+
		"\u0126\5\32\16\2\u0126\u0127\b\r\1\2\u0127\u012e\3\2\2\2\u0128\u0129\6"+
		"\r\f\3\u0129\u012a\7\6\2\2\u012a\u012b\5\32\16\2\u012b\u012c\b\r\1\2\u012c"+
		"\u012e\3\2\2\2\u012d\u011f\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0128\3\2"+
		"\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\31\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\r\2\2\u0133\u0153\b\16\1"+
		"\2\u0134\u0135\7\16\2\2\u0135\u0153\b\16\1\2\u0136\u0137\7\24\2\2\u0137"+
		"\u0153\b\16\1\2\u0138\u0139\7\20\2\2\u0139\u0153\b\16\1\2\u013a\u013b"+
		"\7\26\2\2\u013b\u0153\b\16\1\2\u013c\u013d\7\7\2\2\u013d\u0153\b\16\1"+
		"\2\u013e\u013f\7\b\2\2\u013f\u0153\b\16\1\2\u0140\u0141\7\17\2\2\u0141"+
		"\u0153\b\16\1\2\u0142\u0143\7\30\2\2\u0143\u0153\b\16\1\2\u0144\u0145"+
		"\5\34\17\2\u0145\u0146\b\16\1\2\u0146\u0153\3\2\2\2\u0147\u0148\7\22\2"+
		"\2\u0148\u0153\b\16\1\2\u0149\u014a\5\16\b\2\u014a\u014b\b\16\1\2\u014b"+
		"\u0153\3\2\2\2\u014c\u014d\5\n\6\2\u014d\u014e\b\16\1\2\u014e\u0153\3"+
		"\2\2\2\u014f\u0150\5\"\22\2\u0150\u0151\b\16\1\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0132\3\2\2\2\u0152\u0134\3\2\2\2\u0152\u0136\3\2\2\2\u0152\u0138\3\2"+
		"\2\2\u0152\u013a\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u013e\3\2\2\2\u0152"+
		"\u0140\3\2\2\2\u0152\u0142\3\2\2\2\u0152\u0144\3\2\2\2\u0152\u0147\3\2"+
		"\2\2\u0152\u0149\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014f\3\2\2\2\u0153"+
		"\33\3\2\2\2\u0154\u0155\b\17\1\2\u0155\u0156\7\65\2\2\u0156\u0157\b\17"+
		"\1\2\u0157\u0161\3\2\2\2\u0158\u0159\6\17\r\3\u0159\u015a\7\66\2\2\u015a"+
		"\u0160\b\17\1\2\u015b\u015c\6\17\16\3\u015c\u015d\7\6\2\2\u015d\u015e"+
		"\7\66\2\2\u015e\u0160\b\17\1\2\u015f\u0158\3\2\2\2\u015f\u015b\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\35"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5 \21\2\u0165\u0166\b\20\1\2"+
		"\u0166\37\3\2\2\2\u0167\u0168\7+\2\2\u0168\u0199\b\21\1\2\u0169\u016a"+
		"\7#\2\2\u016a\u0199\b\21\1\2\u016b\u016c\7\34\2\2\u016c\u0199\b\21\1\2"+
		"\u016d\u016e\7\33\2\2\u016e\u0199\b\21\1\2\u016f\u0170\7\32\2\2\u0170"+
		"\u0199\b\21\1\2\u0171\u0172\7\35\2\2\u0172\u0199\b\21\1\2\u0173\u0174"+
		"\7$\2\2\u0174\u0199\b\21\1\2\u0175\u0176\7-\2\2\u0176\u0199\b\21\1\2\u0177"+
		"\u0178\7\25\2\2\u0178\u0199\b\21\1\2\u0179\u017a\7,\2\2\u017a\u0199\b"+
		"\21\1\2\u017b\u017c\7.\2\2\u017c\u0199\b\21\1\2\u017d\u017e\7\'\2\2\u017e"+
		"\u0199\b\21\1\2\u017f\u0180\7(\2\2\u0180\u0199\b\21\1\2\u0181\u0182\7"+
		")\2\2\u0182\u0199\b\21\1\2\u0183\u0184\7&\2\2\u0184\u0199\b\21\1\2\u0185"+
		"\u0186\7\37\2\2\u0186\u0199\b\21\1\2\u0187\u0188\7!\2\2\u0188\u0199\b"+
		"\21\1\2\u0189\u018a\7 \2\2\u018a\u0199\b\21\1\2\u018b\u018c\7\"\2\2\u018c"+
		"\u0199\b\21\1\2\u018d\u018e\7%\2\2\u018e\u0199\b\21\1\2\u018f\u0190\7"+
		"*\2\2\u0190\u0199\b\21\1\2\u0191\u0192\7/\2\2\u0192\u0199\b\21\1\2\u0193"+
		"\u0194\7\60\2\2\u0194\u0199\b\21\1\2\u0195\u0196\5$\23\2\u0196\u0197\b"+
		"\21\1\2\u0197\u0199\3\2\2\2\u0198\u0167\3\2\2\2\u0198\u0169\3\2\2\2\u0198"+
		"\u016b\3\2\2\2\u0198\u016d\3\2\2\2\u0198\u016f\3\2\2\2\u0198\u0171\3\2"+
		"\2\2\u0198\u0173\3\2\2\2\u0198\u0175\3\2\2\2\u0198\u0177\3\2\2\2\u0198"+
		"\u0179\3\2\2\2\u0198\u017b\3\2\2\2\u0198\u017d\3\2\2\2\u0198\u017f\3\2"+
		"\2\2\u0198\u0181\3\2\2\2\u0198\u0183\3\2\2\2\u0198\u0185\3\2\2\2\u0198"+
		"\u0187\3\2\2\2\u0198\u0189\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u018d\3\2"+
		"\2\2\u0198\u018f\3\2\2\2\u0198\u0191\3\2\2\2\u0198\u0193\3\2\2\2\u0198"+
		"\u0195\3\2\2\2\u0199!\3\2\2\2\u019a\u019b\5&\24\2\u019b\u019c\b\22\1\2"+
		"\u019c#\3\2\2\2\u019d\u019e\5&\24\2\u019e\u019f\b\23\1\2\u019f%\3\2\2"+
		"\2\u01a0\u01a1\b\24\1\2\u01a1\u01a2\7\66\2\2\u01a2\u01a3\b\24\1\2\u01a3"+
		"\u01a9\3\2\2\2\u01a4\u01a5\6\24\17\3\u01a5\u01a6\7\66\2\2\u01a6\u01a8"+
		"\b\24\1\2\u01a7\u01a4\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01a9\u01aa\3\2\2\2\u01aa\'\3\2\2\2\u01ab\u01a9\3\2\2\2\25CEN`\u00a6"+
		"\u00ca\u00e9\u00f1\u00f9\u0102\u0116\u0118\u012d\u012f\u0152\u015f\u0161"+
		"\u0198\u01a9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}