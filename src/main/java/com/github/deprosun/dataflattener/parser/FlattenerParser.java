// Generated from /Users/kgupta/projects/DataFlattener/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlattenerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, SPACE=20, COMMENT=21, LINE_COMMENT=22;
	public static final int
		RULE_mapper = 0, RULE_mappings = 1, RULE_mapping = 2, RULE_precision = 3, 
		RULE_attributes = 4, RULE_attribute = 5, RULE_reference = 6, RULE_concatBy = 7, 
		RULE_referenceType = 8, RULE_separator = 9, RULE_data_type = 10, RULE_table_name = 11, 
		RULE_fhirResource = 12, RULE_fromField = 13, RULE_first_field_name = 14, 
		RULE_column_name = 15, RULE_middle_field_name = 16, RULE_pk_fk = 17, RULE_list_index = 18, 
		RULE_null_notnull = 19, RULE_pk = 20, RULE_fk = 21, RULE_id = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapper", "mappings", "mapping", "precision", "attributes", "attribute", 
			"reference", "concatBy", "referenceType", "separator", "data_type", "table_name", 
			"fhirResource", "fromField", "first_field_name", "column_name", "middle_field_name", 
			"pk_fk", "list_index", "null_notnull", "pk", "fk", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SOURCE'", "'FROM'", "'('", "')'", "'MAPPING'", "','", "'.'", 
			"'='", "'Reference'", "'['", "']'", "'ConcatBy'", "'ReferenceType'", 
			"'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "SPACE", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Flattener.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlattenerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MapperContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public MappingsContext mappings() {
			return getRuleContext(MappingsContext.class,0);
		}
		public FromFieldContext fromField() {
			return getRuleContext(FromFieldContext.class,0);
		}
		public List<MapperContext> mapper() {
			return getRuleContexts(MapperContext.class);
		}
		public MapperContext mapper(int i) {
			return getRuleContext(MapperContext.class,i);
		}
		public MapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMapper(this);
		}
	}

	public final MapperContext mapper() throws RecognitionException {
		MapperContext _localctx = new MapperContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			table_name();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(48);
				match(T__1);
				setState(49);
				fromField();
				}
			}

			setState(52);
			match(T__2);
			setState(53);
			mappings();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(54);
				mapper();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__3);
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

	public static class MappingsContext extends ParserRuleContext {
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public MappingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMappings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMappings(this);
		}
	}

	public final MappingsContext mappings() throws RecognitionException {
		MappingsContext _localctx = new MappingsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mappings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__4);
			setState(63);
			match(T__2);
			setState(64);
			mapping();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(65);
						match(T__5);
						}
					}

					setState(68);
					mapping();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(74);
				match(T__5);
				}
			}

			setState(77);
			match(T__3);
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

	public static class MappingContext extends ParserRuleContext {
		public First_field_nameContext first_field_name() {
			return getRuleContext(First_field_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public List<Middle_field_nameContext> middle_field_name() {
			return getRuleContexts(Middle_field_nameContext.class);
		}
		public Middle_field_nameContext middle_field_name(int i) {
			return getRuleContext(Middle_field_nameContext.class,i);
		}
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			first_field_name();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(80);
				match(T__6);
				setState(81);
				middle_field_name();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__7);
			setState(88);
			column_name();
			setState(89);
			data_type();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(90);
				precision();
				}
			}

			setState(93);
			null_notnull();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(94);
				attributes();
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

	public static class PrecisionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitPrecision(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__2);
			setState(98);
			id();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==ID) {
				{
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(99);
					match(T__5);
					}
				}

				setState(102);
				id();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__3);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__2);
			setState(111);
			attribute();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(112);
				attribute();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__3);
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

	public static class AttributeContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Pk_fkContext pk_fk() {
			return getRuleContext(Pk_fkContext.class,0);
		}
		public ConcatByContext concatBy() {
			return getRuleContext(ConcatByContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				reference();
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				pk_fk();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				concatBy();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				referenceType();
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

	public static class ReferenceContext extends ParserRuleContext {
		public FhirResourceContext fhirResource() {
			return getRuleContext(FhirResourceContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(127);
			match(T__9);
			setState(128);
			fhirResource();
			setState(129);
			match(T__10);
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

	public static class ConcatByContext extends ParserRuleContext {
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public ConcatByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterConcatBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitConcatBy(this);
		}
	}

	public final ConcatByContext concatBy() throws RecognitionException {
		ConcatByContext _localctx = new ConcatByContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concatBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__11);
			setState(132);
			match(T__9);
			setState(133);
			separator();
			setState(134);
			match(T__10);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__12);
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

	public static class SeparatorContext extends ParserRuleContext {
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_separator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(138);
					matchWildcard();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Data_typeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			id();
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

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			id();
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

	public static class FhirResourceContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FhirResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fhirResource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterFhirResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitFhirResource(this);
		}
	}

	public final FhirResourceContext fhirResource() throws RecognitionException {
		FhirResourceContext _localctx = new FhirResourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fhirResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			id();
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

	public static class FromFieldContext extends ParserRuleContext {
		public First_field_nameContext first_field_name() {
			return getRuleContext(First_field_nameContext.class,0);
		}
		public List<Middle_field_nameContext> middle_field_name() {
			return getRuleContexts(Middle_field_nameContext.class);
		}
		public Middle_field_nameContext middle_field_name(int i) {
			return getRuleContext(Middle_field_nameContext.class,i);
		}
		public FromFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterFromField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitFromField(this);
		}
	}

	public final FromFieldContext fromField() throws RecognitionException {
		FromFieldContext _localctx = new FromFieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			first_field_name();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(151);
				match(T__6);
				setState(152);
				middle_field_name();
				}
				}
				setState(157);
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

	public static class First_field_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public First_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterFirst_field_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitFirst_field_name(this);
		}
	}

	public final First_field_nameContext first_field_name() throws RecognitionException {
		First_field_nameContext _localctx = new First_field_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_first_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			id();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			id();
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

	public static class Middle_field_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public Middle_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_middle_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMiddle_field_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMiddle_field_name(this);
		}
	}

	public final Middle_field_nameContext middle_field_name() throws RecognitionException {
		Middle_field_nameContext _localctx = new Middle_field_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_middle_field_name);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				id();
				}
				break;
			case T__9:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				list_index();
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

	public static class Pk_fkContext extends ParserRuleContext {
		public PkContext pk() {
			return getRuleContext(PkContext.class,0);
		}
		public FkContext fk() {
			return getRuleContext(FkContext.class,0);
		}
		public Pk_fkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pk_fk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterPk_fk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitPk_fk(this);
		}
	}

	public final Pk_fkContext pk_fk() throws RecognitionException {
		Pk_fkContext _localctx = new Pk_fkContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pk_fk);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				pk();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				fk();
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

	public static class List_indexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FlattenerParser.ID, 0); }
		public List_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterList_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitList_index(this);
		}
	}

	public final List_indexContext list_index() throws RecognitionException {
		List_indexContext _localctx = new List_indexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_index);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__9);
				setState(171);
				match(ID);
				setState(172);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__13);
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

	public static class Null_notnullContext extends ParserRuleContext {
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterNull_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitNull_notnull(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(176);
				match(T__14);
				}
			}

			setState(179);
			match(T__15);
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

	public static class PkContext extends ParserRuleContext {
		public PkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterPk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitPk(this);
		}
	}

	public final PkContext pk() throws RecognitionException {
		PkContext _localctx = new PkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__16);
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

	public static class FkContext extends ParserRuleContext {
		public FkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterFk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitFk(this);
		}
	}

	public final FkContext fk() throws RecognitionException {
		FkContext _localctx = new FkContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__17);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FlattenerParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\5\2\65\n\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3E\n\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\5\3N\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\5\4"+
		"b\n\4\3\5\3\5\3\5\5\5g\n\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\7\6t\n\6\f\6\16\6w\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\7\13\u008e\n\13\f\13\16"+
		"\13\u0091\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u009c\n"+
		"\17\f\17\16\17\u009f\13\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u00a7\n"+
		"\22\3\23\3\23\5\23\u00ab\n\23\3\24\3\24\3\24\3\24\5\24\u00b1\n\24\3\25"+
		"\5\25\u00b4\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\u008f"+
		"\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00ba\2\60"+
		"\3\2\2\2\4@\3\2\2\2\6Q\3\2\2\2\bc\3\2\2\2\np\3\2\2\2\f~\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u0085\3\2\2\2\22\u008a\3\2\2\2\24\u008f\3\2\2\2\26\u0092\3"+
		"\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2\36\u00a0\3\2"+
		"\2\2 \u00a2\3\2\2\2\"\u00a6\3\2\2\2$\u00aa\3\2\2\2&\u00b0\3\2\2\2(\u00b3"+
		"\3\2\2\2*\u00b7\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60\61\7\3\2\2\61"+
		"\64\5\30\r\2\62\63\7\4\2\2\63\65\5\34\17\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\7\5\2\2\67;\5\4\3\28:\5\2\2\298\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\6\2\2?\3\3\2\2\2@A\7\7\2"+
		"\2AB\7\5\2\2BI\5\6\4\2CE\7\b\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\5\6\4"+
		"\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\7\b\2"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2P\5\3\2\2\2QV\5\36\20\2RS\7"+
		"\t\2\2SU\5\"\22\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV"+
		"\3\2\2\2YZ\7\n\2\2Z[\5 \21\2[]\5\26\f\2\\^\5\b\5\2]\\\3\2\2\2]^\3\2\2"+
		"\2^_\3\2\2\2_a\5(\25\2`b\5\n\6\2a`\3\2\2\2ab\3\2\2\2b\7\3\2\2\2cd\7\5"+
		"\2\2dk\5.\30\2eg\7\b\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\5.\30\2if\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\6\2\2o\t\3"+
		"\2\2\2pq\7\5\2\2qu\5\f\7\2rt\5\f\7\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\6\2\2y\13\3\2\2\2z\177\5\16\b\2{\177\5"+
		"$\23\2|\177\5\20\t\2}\177\5\22\n\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2"+
		"\2\2\177\r\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7\f\2\2\u0082\u0083"+
		"\5\32\16\2\u0083\u0084\7\r\2\2\u0084\17\3\2\2\2\u0085\u0086\7\16\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0088\5\24\13\2\u0088\u0089\7\r\2\2\u0089\21\3\2"+
		"\2\2\u008a\u008b\7\17\2\2\u008b\23\3\2\2\2\u008c\u008e\13\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5.\30\2\u0093\27"+
		"\3\2\2\2\u0094\u0095\5.\30\2\u0095\31\3\2\2\2\u0096\u0097\5.\30\2\u0097"+
		"\33\3\2\2\2\u0098\u009d\5\36\20\2\u0099\u009a\7\t\2\2\u009a\u009c\5\""+
		"\22\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\35\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5.\30"+
		"\2\u00a1\37\3\2\2\2\u00a2\u00a3\5.\30\2\u00a3!\3\2\2\2\u00a4\u00a7\5."+
		"\30\2\u00a5\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"#\3\2\2\2\u00a8\u00ab\5*\26\2\u00a9\u00ab\5,\27\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\7"+
		"\25\2\2\u00ae\u00b1\7\r\2\2\u00af\u00b1\7\20\2\2\u00b0\u00ac\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\'\3\2\2\2\u00b2\u00b4\7\21\2\2\u00b3\u00b2\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6"+
		")\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8+\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba"+
		"-\3\2\2\2\u00bb\u00bc\7\25\2\2\u00bc/\3\2\2\2\24\64;DIMV]afku~\u008f\u009d"+
		"\u00a6\u00aa\u00b0\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}