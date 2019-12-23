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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, SPACE=32, 
		COMMENT=33, LINE_COMMENT=34;
	public static final int
		RULE_mappers = 0, RULE_mapper = 1, RULE_mapping = 2, RULE_explode_mapping = 3, 
		RULE_straight_mapping = 4, RULE_precision = 5, RULE_attribute = 6, RULE_reference = 7, 
		RULE_data_type = 8, RULE_table_name = 9, RULE_schema = 10, RULE_fromField = 11, 
		RULE_json_path = 12, RULE_uuid_func = 13, RULE_concat_func = 14, RULE_simple_json_path = 15, 
		RULE_first_field_name = 16, RULE_column_name = 17, RULE_middle_field_name = 18, 
		RULE_pk_fk = 19, RULE_equals = 20, RULE_less_than = 21, RULE_greater_than = 22, 
		RULE_less_than_equal_to = 23, RULE_greater_than_equal_to = 24, RULE_and = 25, 
		RULE_or = 26, RULE_list_index = 27, RULE_null_notnull = 28, RULE_pk = 29, 
		RULE_fk = 30, RULE_id = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"mappers", "mapper", "mapping", "explode_mapping", "straight_mapping", 
			"precision", "attribute", "reference", "data_type", "table_name", "schema", 
			"fromField", "json_path", "uuid_func", "concat_func", "simple_json_path", 
			"first_field_name", "column_name", "middle_field_name", "pk_fk", "equals", 
			"less_than", "greater_than", "less_than_equal_to", "greater_than_equal_to", 
			"and", "or", "list_index", "null_notnull", "pk", "fk", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'('", "'MAPPING'", "')'", "'explode'", "'='", 
			"','", "'Reference'", "'.'", "'TO_UUID'", "'CONCAT'", "'<'", "'>'", "'<='", 
			"'>='", "'and'", "'AND'", "'&&'", "'or'", "'OR'", "'||'", "'['", "']'", 
			"'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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

	public static class MappersContext extends ParserRuleContext {
		public List<MapperContext> mapper() {
			return getRuleContexts(MapperContext.class);
		}
		public MapperContext mapper(int i) {
			return getRuleContext(MapperContext.class,i);
		}
		public MappersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMappers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMappers(this);
		}
	}

	public final MappersContext mappers() throws RecognitionException {
		MappersContext _localctx = new MappersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mappers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(64);
				mapper();
				}
				}
				setState(69);
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

	public static class MapperContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public FromFieldContext fromField() {
			return getRuleContext(FromFieldContext.class,0);
		}
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
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
		enterRule(_localctx, 2, RULE_mapper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			table_name();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(72);
				match(T__1);
				setState(73);
				fromField();
				}
			}

			setState(76);
			match(T__2);
			setState(77);
			match(T__3);
			setState(78);
			match(T__2);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				mapping();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(84);
			match(T__4);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(85);
				mapper();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__4);
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
		public Straight_mappingContext straight_mapping() {
			return getRuleContext(Straight_mappingContext.class,0);
		}
		public Explode_mappingContext explode_mapping() {
			return getRuleContext(Explode_mappingContext.class,0);
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
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				straight_mapping();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				explode_mapping();
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

	public static class Explode_mappingContext extends ParserRuleContext {
		public Json_pathContext json_path() {
			return getRuleContext(Json_pathContext.class,0);
		}
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public Explode_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explode_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterExplode_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitExplode_mapping(this);
		}
	}

	public final Explode_mappingContext explode_mapping() throws RecognitionException {
		Explode_mappingContext _localctx = new Explode_mappingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explode_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__5);
			setState(98);
			match(T__2);
			setState(99);
			json_path();
			setState(100);
			match(T__4);
			setState(101);
			match(T__2);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				mapping();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(107);
			match(T__4);
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

	public static class Straight_mappingContext extends ParserRuleContext {
		public Json_pathContext json_path() {
			return getRuleContext(Json_pathContext.class,0);
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
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Straight_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_straight_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterStraight_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitStraight_mapping(this);
		}
	}

	public final Straight_mappingContext straight_mapping() throws RecognitionException {
		Straight_mappingContext _localctx = new Straight_mappingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_straight_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			json_path();
			setState(110);
			match(T__6);
			setState(111);
			column_name();
			setState(112);
			data_type();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(113);
				precision();
				}
			}

			setState(116);
			null_notnull();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__27) | (1L << T__28))) != 0)) {
				{
				{
				setState(117);
				attribute();
				}
				}
				setState(122);
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
		enterRule(_localctx, 10, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__2);
			setState(124);
			id();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==ID) {
				{
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(125);
					match(T__7);
					}
				}

				setState(128);
				id();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__4);
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
		enterRule(_localctx, 12, RULE_attribute);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				reference();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				pk_fk();
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 14, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__8);
			setState(141);
			match(T__2);
			setState(142);
			table_name();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(143);
				match(T__7);
				setState(144);
				id();
				}
			}

			setState(147);
			match(T__4);
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
		enterRule(_localctx, 16, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
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
		enterRule(_localctx, 18, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(151);
				schema();
				setState(152);
				match(T__9);
				}
				break;
			}
			setState(156);
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

	public static class SchemaContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_schema);
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

	public static class FromFieldContext extends ParserRuleContext {
		public Simple_json_pathContext simple_json_path() {
			return getRuleContext(Simple_json_pathContext.class,0);
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
		enterRule(_localctx, 22, RULE_fromField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			simple_json_path();
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

	public static class Json_pathContext extends ParserRuleContext {
		public Uuid_funcContext uuid_func() {
			return getRuleContext(Uuid_funcContext.class,0);
		}
		public Simple_json_pathContext simple_json_path() {
			return getRuleContext(Simple_json_pathContext.class,0);
		}
		public Concat_funcContext concat_func() {
			return getRuleContext(Concat_funcContext.class,0);
		}
		public Json_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterJson_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitJson_path(this);
		}
	}

	public final Json_pathContext json_path() throws RecognitionException {
		Json_pathContext _localctx = new Json_pathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_json_path);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				uuid_func();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				simple_json_path();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				concat_func();
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

	public static class Uuid_funcContext extends ParserRuleContext {
		public Simple_json_pathContext simple_json_path() {
			return getRuleContext(Simple_json_pathContext.class,0);
		}
		public Uuid_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuid_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterUuid_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitUuid_func(this);
		}
	}

	public final Uuid_funcContext uuid_func() throws RecognitionException {
		Uuid_funcContext _localctx = new Uuid_funcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_uuid_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__10);
			setState(168);
			match(T__2);
			setState(169);
			simple_json_path();
			setState(170);
			match(T__4);
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

	public static class Concat_funcContext extends ParserRuleContext {
		public Simple_json_pathContext simple_json_path() {
			return getRuleContext(Simple_json_pathContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Concat_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterConcat_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitConcat_func(this);
		}
	}

	public final Concat_funcContext concat_func() throws RecognitionException {
		Concat_funcContext _localctx = new Concat_funcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_concat_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__11);
			setState(173);
			match(T__2);
			setState(174);
			simple_json_path();
			setState(175);
			match(T__7);
			setState(176);
			id();
			setState(177);
			match(T__4);
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

	public static class Simple_json_pathContext extends ParserRuleContext {
		public First_field_nameContext first_field_name() {
			return getRuleContext(First_field_nameContext.class,0);
		}
		public List<Middle_field_nameContext> middle_field_name() {
			return getRuleContexts(Middle_field_nameContext.class);
		}
		public Middle_field_nameContext middle_field_name(int i) {
			return getRuleContext(Middle_field_nameContext.class,i);
		}
		public Simple_json_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_json_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterSimple_json_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitSimple_json_path(this);
		}
	}

	public final Simple_json_pathContext simple_json_path() throws RecognitionException {
		Simple_json_pathContext _localctx = new Simple_json_pathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_json_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			first_field_name();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(180);
				match(T__9);
				setState(181);
				middle_field_name();
				}
				}
				setState(186);
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
		enterRule(_localctx, 32, RULE_first_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 34, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 36, RULE_middle_field_name);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				id();
				}
				break;
			case T__22:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
		enterRule(_localctx, 38, RULE_pk_fk);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				pk();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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

	public static class EqualsContext extends ParserRuleContext {
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__6);
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

	public static class Less_thanContext extends ParserRuleContext {
		public Less_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterLess_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitLess_than(this);
		}
	}

	public final Less_thanContext less_than() throws RecognitionException {
		Less_thanContext _localctx = new Less_thanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_less_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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

	public static class Greater_thanContext extends ParserRuleContext {
		public Greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterGreater_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitGreater_than(this);
		}
	}

	public final Greater_thanContext greater_than() throws RecognitionException {
		Greater_thanContext _localctx = new Greater_thanContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__13);
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

	public static class Less_than_equal_toContext extends ParserRuleContext {
		public Less_than_equal_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than_equal_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterLess_than_equal_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitLess_than_equal_to(this);
		}
	}

	public final Less_than_equal_toContext less_than_equal_to() throws RecognitionException {
		Less_than_equal_toContext _localctx = new Less_than_equal_toContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_less_than_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__14);
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

	public static class Greater_than_equal_toContext extends ParserRuleContext {
		public Greater_than_equal_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than_equal_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterGreater_than_equal_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitGreater_than_equal_to(this);
		}
	}

	public final Greater_than_equal_toContext greater_than_equal_to() throws RecognitionException {
		Greater_than_equal_toContext _localctx = new Greater_than_equal_toContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_greater_than_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_list_index);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__22);
				setState(214);
				match(ID);
				setState(215);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__24);
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
		enterRule(_localctx, 56, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(219);
				match(T__25);
				}
			}

			setState(222);
			match(T__26);
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
		enterRule(_localctx, 58, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__27);
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
		enterRule(_localctx, 60, RULE_fk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__28);
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
		public List<TerminalNode> ID() { return getTokens(FlattenerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FlattenerParser.ID, i);
		}
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
		enterRule(_localctx, 62, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(229);
				match(T__29);
				setState(230);
				match(ID);
				}
				}
				setState(235);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3\3"+
		"\3\6\3S\n\3\r\3\16\3T\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\4\3\4"+
		"\5\4b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6u\n\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\3\7\3\b\3\b\5\b\u008d\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u009d\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u00a8\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u00b9\n\21\f\21\16\21\u00bc\13\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\5\24\u00c4\n\24\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5"+
		"\35\u00dc\n\35\3\36\5\36\u00df\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\7!\u00ea\n!\f!\16!\u00ed\13!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\3\2\23\25\3\2\26\30\2\u00e3\2"+
		"E\3\2\2\2\4H\3\2\2\2\6a\3\2\2\2\bc\3\2\2\2\no\3\2\2\2\f}\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u008e\3\2\2\2\22\u0097\3\2\2\2\24\u009c\3\2\2\2\26\u00a0\3"+
		"\2\2\2\30\u00a2\3\2\2\2\32\u00a7\3\2\2\2\34\u00a9\3\2\2\2\36\u00ae\3\2"+
		"\2\2 \u00b5\3\2\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c3\3\2\2\2(\u00c7"+
		"\3\2\2\2*\u00c9\3\2\2\2,\u00cb\3\2\2\2.\u00cd\3\2\2\2\60\u00cf\3\2\2\2"+
		"\62\u00d1\3\2\2\2\64\u00d3\3\2\2\2\66\u00d5\3\2\2\28\u00db\3\2\2\2:\u00de"+
		"\3\2\2\2<\u00e2\3\2\2\2>\u00e4\3\2\2\2@\u00e6\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\7\3\2\2IL\5"+
		"\24\13\2JK\7\4\2\2KM\5\30\r\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\5\2\2"+
		"OP\7\6\2\2PR\7\5\2\2QS\5\6\4\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VZ\7\7\2\2WY\5\4\3\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[]\3\2\2\2\\Z\3\2\2\2]^\7\7\2\2^\5\3\2\2\2_b\5\n\6\2`b\5\b\5\2a_\3\2"+
		"\2\2a`\3\2\2\2b\7\3\2\2\2cd\7\b\2\2de\7\5\2\2ef\5\32\16\2fg\7\7\2\2gi"+
		"\7\5\2\2hj\5\6\4\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2m"+
		"n\7\7\2\2n\t\3\2\2\2op\5\32\16\2pq\7\t\2\2qr\5$\23\2rt\5\22\n\2su\5\f"+
		"\7\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vz\5:\36\2wy\5\16\b\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2}~\7\5\2\2~\u0085\5@!"+
		"\2\177\u0081\7\n\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\5@!\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7\7\2\2\u0089\r\3\2\2\2\u008a\u008d\5\20\t\2\u008b\u008d"+
		"\5(\25\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e"+
		"\u008f\7\13\2\2\u008f\u0090\7\5\2\2\u0090\u0093\5\24\13\2\u0091\u0092"+
		"\7\n\2\2\u0092\u0094\5@!\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\7\2\2\u0096\21\3\2\2\2\u0097\u0098\5@!\2"+
		"\u0098\23\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\f\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\5@!\2\u009f\25\3\2\2\2\u00a0\u00a1\5@!\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\31\3\2\2\2\u00a4\u00a8\5\34\17\2\u00a5\u00a8\5 \21"+
		"\2\u00a6\u00a8\5\36\20\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\7\5\2"+
		"\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\7\7\2\2\u00ad\35\3\2\2\2\u00ae\u00af"+
		"\7\16\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\n\2\2"+
		"\u00b2\u00b3\5@!\2\u00b3\u00b4\7\7\2\2\u00b4\37\3\2\2\2\u00b5\u00ba\5"+
		"\"\22\2\u00b6\u00b7\7\f\2\2\u00b7\u00b9\5&\24\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb!\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00be\5@!\2\u00be#\3\2\2\2\u00bf\u00c0\5@!"+
		"\2\u00c0%\3\2\2\2\u00c1\u00c4\5@!\2\u00c2\u00c4\58\35\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\'\3\2\2\2\u00c5\u00c8\5<\37\2\u00c6\u00c8"+
		"\5> \2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00ca"+
		"\7\t\2\2\u00ca+\3\2\2\2\u00cb\u00cc\7\17\2\2\u00cc-\3\2\2\2\u00cd\u00ce"+
		"\7\20\2\2\u00ce/\3\2\2\2\u00cf\u00d0\7\21\2\2\u00d0\61\3\2\2\2\u00d1\u00d2"+
		"\7\22\2\2\u00d2\63\3\2\2\2\u00d3\u00d4\t\2\2\2\u00d4\65\3\2\2\2\u00d5"+
		"\u00d6\t\3\2\2\u00d6\67\3\2\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\7!\2"+
		"\2\u00d9\u00dc\7\32\2\2\u00da\u00dc\7\33\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc9\3\2\2\2\u00dd\u00df\7\34\2\2\u00de\u00dd\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\35\2\2\u00e1;\3"+
		"\2\2\2\u00e2\u00e3\7\36\2\2\u00e3=\3\2\2\2\u00e4\u00e5\7\37\2\2\u00e5"+
		"?\3\2\2\2\u00e6\u00eb\7!\2\2\u00e7\u00e8\7 \2\2\u00e8\u00ea\7!\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ecA\3\2\2\2\u00ed\u00eb\3\2\2\2\26ELTZaktz\u0080\u0085\u008c\u0093"+
		"\u009c\u00a7\u00ba\u00c3\u00c7\u00db\u00de\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}