// Generated from /Users/kgupta/projects/DataFlattener/src/main/antlr/Flattener.g4 by ANTLR 4.7.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, SPACE=24, COMMENT=25, 
		LINE_COMMENT=26;
	public static final int
		RULE_mappers = 0, RULE_mapper = 1, RULE_child_mapper = 2, RULE_mapping = 3, 
		RULE_explode_mapping = 4, RULE_with = 5, RULE_straight_mapping = 6, RULE_precision = 7, 
		RULE_attribute = 8, RULE_reference = 9, RULE_copy = 10, RULE_data_type = 11, 
		RULE_table_name = 12, RULE_schema = 13, RULE_fromField = 14, RULE_filter = 15, 
		RULE_mappingAlias = 16, RULE_json_path = 17, RULE_map_func = 18, RULE_concat_func = 19, 
		RULE_simple_json_path = 20, RULE_first_field_name = 21, RULE_column_name = 22, 
		RULE_middle_field_name = 23, RULE_pk_fk = 24, RULE_list_index = 25, RULE_null_notnull = 26, 
		RULE_pk = 27, RULE_fk = 28, RULE_id = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"mappers", "mapper", "child_mapper", "mapping", "explode_mapping", "with", 
			"straight_mapping", "precision", "attribute", "reference", "copy", "data_type", 
			"table_name", "schema", "fromField", "filter", "mappingAlias", "json_path", 
			"map_func", "concat_func", "simple_json_path", "first_field_name", "column_name", 
			"middle_field_name", "pk_fk", "list_index", "null_notnull", "pk", "fk", 
			"id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'FILTER'", "'('", "'MAPPING'", "')'", "'explode('", 
			"'WITH'", "','", "'Reference'", "'copy'", "'.'", "'='", "'CONCAT'", "'['", 
			"']'", "'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"SPACE", "COMMENT", "LINE_COMMENT"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(60);
				mapper();
				}
				}
				setState(65);
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
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public List<Child_mapperContext> child_mapper() {
			return getRuleContexts(Child_mapperContext.class);
		}
		public Child_mapperContext child_mapper(int i) {
			return getRuleContext(Child_mapperContext.class,i);
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
			setState(66);
			match(T__0);
			setState(67);
			table_name();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(68);
				match(T__1);
				setState(69);
				fromField();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(72);
				match(T__2);
				setState(73);
				filter();
				}
			}

			setState(76);
			match(T__3);
			setState(77);
			match(T__4);
			setState(78);
			match(T__3);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << ID))) != 0) );
			setState(84);
			match(T__5);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(85);
				child_mapper();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__5);
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

	public static class Child_mapperContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public FromFieldContext fromField() {
			return getRuleContext(FromFieldContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public List<Child_mapperContext> child_mapper() {
			return getRuleContexts(Child_mapperContext.class);
		}
		public Child_mapperContext child_mapper(int i) {
			return getRuleContext(Child_mapperContext.class,i);
		}
		public Child_mapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child_mapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterChild_mapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitChild_mapper(this);
		}
	}

	public final Child_mapperContext child_mapper() throws RecognitionException {
		Child_mapperContext _localctx = new Child_mapperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_child_mapper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			table_name();
			setState(95);
			match(T__1);
			setState(96);
			fromField();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(97);
				match(T__2);
				setState(98);
				filter();
				}
			}

			setState(101);
			match(T__3);
			setState(102);
			match(T__4);
			setState(103);
			match(T__3);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				mapping();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << ID))) != 0) );
			setState(109);
			match(T__5);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				child_mapper();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__5);
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
		enterRule(_localctx, 6, RULE_mapping);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				straight_mapping();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
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
		enterRule(_localctx, 8, RULE_explode_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
			json_path();
			setState(124);
			match(T__5);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(125);
				with();
				}
			}

			setState(128);
			match(T__3);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				mapping();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << ID))) != 0) );
			setState(134);
			match(T__5);
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

	public static class WithContext extends ParserRuleContext {
		public List<MappingAliasContext> mappingAlias() {
			return getRuleContexts(MappingAliasContext.class);
		}
		public MappingAliasContext mappingAlias(int i) {
			return getRuleContext(MappingAliasContext.class,i);
		}
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitWith(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__7);
			setState(137);
			match(T__3);
			setState(138);
			mappingAlias();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(139);
				match(T__8);
				setState(140);
				mappingAlias();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__5);
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
		public MappingAliasContext mappingAlias() {
			return getRuleContext(MappingAliasContext.class,0);
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
		enterRule(_localctx, 12, RULE_straight_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			mappingAlias();
			setState(149);
			data_type();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(150);
				precision();
				}
			}

			setState(153);
			null_notnull();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(154);
				attribute();
				}
				}
				setState(159);
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
		enterRule(_localctx, 14, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__3);
			setState(161);
			id();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==ID) {
				{
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(162);
					match(T__8);
					}
				}

				setState(165);
				id();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__5);
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
		enterRule(_localctx, 16, RULE_attribute);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				reference();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		enterRule(_localctx, 18, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__9);
			setState(178);
			match(T__3);
			setState(179);
			table_name();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(180);
				match(T__8);
				setState(181);
				id();
				}
			}

			setState(184);
			match(T__5);
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

	public static class CopyContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterCopy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitCopy(this);
		}
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__10);
			setState(187);
			match(T__3);
			setState(188);
			id();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(189);
				match(T__8);
				setState(190);
				id();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__5);
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
		enterRule(_localctx, 22, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 24, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(200);
				schema();
				setState(201);
				match(T__11);
				}
				break;
			}
			setState(205);
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
		enterRule(_localctx, 26, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 28, RULE_fromField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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

	public static class FilterContext extends ParserRuleContext {
		public List<Json_pathContext> json_path() {
			return getRuleContexts(Json_pathContext.class);
		}
		public Json_pathContext json_path(int i) {
			return getRuleContext(Json_pathContext.class,i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			json_path();
			setState(212);
			match(T__12);
			setState(213);
			json_path();
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

	public static class MappingAliasContext extends ParserRuleContext {
		public Json_pathContext json_path() {
			return getRuleContext(Json_pathContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public MappingAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMappingAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMappingAlias(this);
		}
	}

	public final MappingAliasContext mappingAlias() throws RecognitionException {
		MappingAliasContext _localctx = new MappingAliasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mappingAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			json_path();
			setState(216);
			match(T__12);
			setState(217);
			column_name();
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
		public Map_funcContext map_func() {
			return getRuleContext(Map_funcContext.class,0);
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
		enterRule(_localctx, 34, RULE_json_path);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				map_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				simple_json_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				concat_func();
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

	public static class Map_funcContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Json_pathContext> json_path() {
			return getRuleContexts(Json_pathContext.class);
		}
		public Json_pathContext json_path(int i) {
			return getRuleContext(Json_pathContext.class,i);
		}
		public Map_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterMap_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitMap_func(this);
		}
	}

	public final Map_funcContext map_func() throws RecognitionException {
		Map_funcContext _localctx = new Map_funcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_map_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			id();
			setState(225);
			match(T__3);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==ID) {
				{
				setState(226);
				json_path();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(229);
				match(T__8);
				setState(230);
				json_path();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__5);
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
		enterRule(_localctx, 38, RULE_concat_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__13);
			setState(239);
			match(T__3);
			setState(240);
			simple_json_path();
			setState(241);
			match(T__8);
			setState(242);
			id();
			setState(243);
			match(T__5);
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
		enterRule(_localctx, 40, RULE_simple_json_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			first_field_name();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(246);
				match(T__11);
				setState(247);
				middle_field_name();
				}
				}
				setState(252);
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
		enterRule(_localctx, 42, RULE_first_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 46, RULE_middle_field_name);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				id();
				}
				break;
			case T__14:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
		enterRule(_localctx, 48, RULE_pk_fk);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				pk();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		enterRule(_localctx, 50, RULE_list_index);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__14);
				setState(266);
				match(ID);
				setState(267);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__16);
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
		enterRule(_localctx, 52, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(271);
				match(T__17);
				}
			}

			setState(274);
			match(T__18);
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
		enterRule(_localctx, 54, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__19);
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
		enterRule(_localctx, 56, RULE_fk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__20);
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
		enterRule(_localctx, 58, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ID);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(281);
				match(T__21);
				setState(282);
				match(ID);
				}
				}
				setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0123\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\5\3M\n\3\3\3\3\3"+
		"\3\3\3\3\6\3S\n\3\r\3\16\3T\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\6\4l\n\4\r\4\16\4m\3\4"+
		"\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4\3\4\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6"+
		"\5\6\u0081\n\6\3\6\3\6\6\6\u0085\n\6\r\6\16\6\u0086\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u009a"+
		"\n\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\t\3\t\3\t\5\t\u00a6\n"+
		"\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\t\3\t\3\n\3\n\5\n\u00b2\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5"+
		"\16\u00ce\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00e1\n\23\3\24\3\24\3\24\5\24\u00e6"+
		"\n\24\3\24\3\24\7\24\u00ea\n\24\f\24\16\24\u00ed\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00fb\n\26\f\26\16"+
		"\26\u00fe\13\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0106\n\31\3\32\3\32"+
		"\5\32\u010a\n\32\3\33\3\33\3\33\3\33\5\33\u0110\n\33\3\34\5\34\u0113\n"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u011e\n\37\f\37"+
		"\16\37\u0121\13\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<\2\2\2\u0122\2A\3\2\2\2\4D\3\2\2\2\6_\3\2\2\2\bz"+
		"\3\2\2\2\n|\3\2\2\2\f\u008a\3\2\2\2\16\u0096\3\2\2\2\20\u00a2\3\2\2\2"+
		"\22\u00b1\3\2\2\2\24\u00b3\3\2\2\2\26\u00bc\3\2\2\2\30\u00c8\3\2\2\2\32"+
		"\u00cd\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2\2\"\u00d9"+
		"\3\2\2\2$\u00e0\3\2\2\2&\u00e2\3\2\2\2(\u00f0\3\2\2\2*\u00f7\3\2\2\2,"+
		"\u00ff\3\2\2\2.\u0101\3\2\2\2\60\u0105\3\2\2\2\62\u0109\3\2\2\2\64\u010f"+
		"\3\2\2\2\66\u0112\3\2\2\28\u0116\3\2\2\2:\u0118\3\2\2\2<\u011a\3\2\2\2"+
		">@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2"+
		"\2DE\7\3\2\2EH\5\32\16\2FG\7\4\2\2GI\5\36\20\2HF\3\2\2\2HI\3\2\2\2IL\3"+
		"\2\2\2JK\7\5\2\2KM\5 \21\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\6\2\2OP\7"+
		"\7\2\2PR\7\6\2\2QS\5\b\5\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3"+
		"\2\2\2VZ\7\b\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]"+
		"\3\2\2\2\\Z\3\2\2\2]^\7\b\2\2^\5\3\2\2\2_`\7\3\2\2`a\5\32\16\2ab\7\4\2"+
		"\2be\5\36\20\2cd\7\5\2\2df\5 \21\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\6"+
		"\2\2hi\7\7\2\2ik\7\6\2\2jl\5\b\5\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2os\7\b\2\2pr\5\6\4\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tv\3\2\2\2us\3\2\2\2vw\7\b\2\2w\7\3\2\2\2x{\5\16\b\2y{\5\n\6\2zx\3"+
		"\2\2\2zy\3\2\2\2{\t\3\2\2\2|}\7\t\2\2}~\5$\23\2~\u0080\7\b\2\2\177\u0081"+
		"\5\f\7\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\7\6\2\2\u0083\u0085\5\b\5\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\b\2\2\u0089\13\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7\6\2"+
		"\2\u008c\u0091\5\"\22\2\u008d\u008e\7\13\2\2\u008e\u0090\5\"\22\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\b\2\2\u0095"+
		"\r\3\2\2\2\u0096\u0097\5\"\22\2\u0097\u0099\5\30\r\2\u0098\u009a\5\20"+
		"\t\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009f\5\66\34\2\u009c\u009e\5\22\n\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\17\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00aa\5<\37\2\u00a4\u00a6\7\13"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\5<\37\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\b\2\2\u00ae\21\3\2\2\2\u00af\u00b2\5\24\13\2\u00b0\u00b2\5\62"+
		"\32\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4"+
		"\7\f\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b8\5\32\16\2\u00b6\u00b7\7\13\2"+
		"\2\u00b7\u00b9\5<\37\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\7\b\2\2\u00bb\25\3\2\2\2\u00bc\u00bd\7\r\2\2\u00bd"+
		"\u00be\7\6\2\2\u00be\u00c3\5<\37\2\u00bf\u00c0\7\13\2\2\u00c0\u00c2\5"+
		"<\37\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\b"+
		"\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5<\37\2\u00c9\31\3\2\2\2\u00ca\u00cb"+
		"\5\34\17\2\u00cb\u00cc\7\16\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5<\37\2\u00d0\33"+
		"\3\2\2\2\u00d1\u00d2\5<\37\2\u00d2\35\3\2\2\2\u00d3\u00d4\5*\26\2\u00d4"+
		"\37\3\2\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5$\23"+
		"\2\u00d8!\3\2\2\2\u00d9\u00da\5$\23\2\u00da\u00db\7\17\2\2\u00db\u00dc"+
		"\5.\30\2\u00dc#\3\2\2\2\u00dd\u00e1\5&\24\2\u00de\u00e1\5*\26\2\u00df"+
		"\u00e1\5(\25\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1%\3\2\2\2\u00e2\u00e3\5<\37\2\u00e3\u00e5\7\6\2\2\u00e4\u00e6"+
		"\5$\23\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7"+
		"\u00e8\7\13\2\2\u00e8\u00ea\5$\23\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\b\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\7\20\2"+
		"\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7\13\2\2\u00f4"+
		"\u00f5\5<\37\2\u00f5\u00f6\7\b\2\2\u00f6)\3\2\2\2\u00f7\u00fc\5,\27\2"+
		"\u00f8\u00f9\7\16\2\2\u00f9\u00fb\5\60\31\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd+\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0100\5<\37\2\u0100-\3\2\2\2\u0101\u0102\5"+
		"<\37\2\u0102/\3\2\2\2\u0103\u0106\5<\37\2\u0104\u0106\5\64\33\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\61\3\2\2\2\u0107\u010a\58\35"+
		"\2\u0108\u010a\5:\36\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\63"+
		"\3\2\2\2\u010b\u010c\7\21\2\2\u010c\u010d\7\31\2\2\u010d\u0110\7\22\2"+
		"\2\u010e\u0110\7\23\2\2\u010f\u010b\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\65\3\2\2\2\u0111\u0113\7\24\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0115\7\25\2\2\u0115\67\3\2\2\2\u0116\u0117"+
		"\7\26\2\2\u01179\3\2\2\2\u0118\u0119\7\27\2\2\u0119;\3\2\2\2\u011a\u011f"+
		"\7\31\2\2\u011b\u011c\7\30\2\2\u011c\u011e\7\31\2\2\u011d\u011b\3\2\2"+
		"\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120="+
		"\3\2\2\2\u0121\u011f\3\2\2\2\37AHLTZemsz\u0080\u0086\u0091\u0099\u009f"+
		"\u00a5\u00aa\u00b1\u00b8\u00c3\u00cd\u00e0\u00e5\u00eb\u00fc\u0105\u0109"+
		"\u010f\u0112\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}