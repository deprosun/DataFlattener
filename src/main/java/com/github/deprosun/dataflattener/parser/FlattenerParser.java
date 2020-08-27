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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, SPACE=29, COMMENT=30, LINE_COMMENT=31;
	public static final int
		RULE_mappers = 0, RULE_mapper = 1, RULE_child_mapper = 2, RULE_mapping = 3, 
		RULE_internal_mapping = 4, RULE_explode_mapping = 5, RULE_with = 6, RULE_broadcast = 7, 
		RULE_as = 8, RULE_straight_mapping = 9, RULE_precision = 10, RULE_attribute = 11, 
		RULE_reference = 12, RULE_copy = 13, RULE_data_type = 14, RULE_table_name = 15, 
		RULE_schema = 16, RULE_fromField = 17, RULE_filter = 18, RULE_literal = 19, 
		RULE_mappingAlias = 20, RULE_json_path = 21, RULE_map_func = 22, RULE_concat_func = 23, 
		RULE_simple_json_path = 24, RULE_first_field_name = 25, RULE_column_name = 26, 
		RULE_middle_field_name = 27, RULE_pk_fk = 28, RULE_list_index = 29, RULE_null_notnull = 30, 
		RULE_pk = 31, RULE_fk = 32, RULE_id = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"mappers", "mapper", "child_mapper", "mapping", "internal_mapping", "explode_mapping", 
			"with", "broadcast", "as", "straight_mapping", "precision", "attribute", 
			"reference", "copy", "data_type", "table_name", "schema", "fromField", 
			"filter", "literal", "mappingAlias", "json_path", "map_func", "concat_func", 
			"simple_json_path", "first_field_name", "column_name", "middle_field_name", 
			"pk_fk", "list_index", "null_notnull", "pk", "fk", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'FILTER'", "'('", "'MAPPING'", "')'", "'INTERNAL'", 
			"'='", "'explode('", "'WITH'", "','", "'BROADCAST'", "'AS'", "'Reference'", 
			"'copy'", "'.'", "'literal('", "'lit('", "'CONCAT'", "'['", "']'", "'[ALL]'", 
			"'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "SPACE", "COMMENT", "LINE_COMMENT"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(68);
				mapper();
				}
				}
				setState(73);
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
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
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
			setState(74);
			match(T__0);
			setState(75);
			table_name();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(76);
				match(T__1);
				setState(77);
				fromField();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				match(T__2);
				setState(81);
				filter();
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(84);
				with();
				}
			}

			setState(87);
			match(T__3);
			setState(88);
			match(T__4);
			setState(89);
			match(T__3);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				mapping();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__18) | (1L << ID))) != 0) );
			setState(95);
			match(T__5);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(96);
				child_mapper();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
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
			setState(104);
			match(T__0);
			setState(105);
			table_name();
			setState(106);
			match(T__1);
			setState(107);
			fromField();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(108);
				match(T__2);
				setState(109);
				filter();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(112);
				with();
				}
			}

			setState(115);
			match(T__3);
			setState(116);
			match(T__4);
			setState(117);
			match(T__3);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				mapping();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__18) | (1L << ID))) != 0) );
			setState(123);
			match(T__5);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(124);
				child_mapper();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		public Internal_mappingContext internal_mapping() {
			return getRuleContext(Internal_mappingContext.class,0);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				straight_mapping();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				explode_mapping();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				internal_mapping();
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

	public static class Internal_mappingContext extends ParserRuleContext {
		public Json_pathContext json_path() {
			return getRuleContext(Json_pathContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public BroadcastContext broadcast() {
			return getRuleContext(BroadcastContext.class,0);
		}
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public Internal_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internal_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterInternal_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitInternal_mapping(this);
		}
	}

	public final Internal_mappingContext internal_mapping() throws RecognitionException {
		Internal_mappingContext _localctx = new Internal_mappingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_internal_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__6);
			setState(138);
			json_path();
			setState(139);
			match(T__7);
			setState(140);
			column_name();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(141);
				broadcast();
				}
			}

			setState(144);
			match(T__3);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				mapping();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__18) | (1L << ID))) != 0) );
			setState(150);
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
		enterRule(_localctx, 10, RULE_explode_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__8);
			setState(153);
			json_path();
			setState(154);
			match(T__5);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(155);
				with();
				}
			}

			setState(158);
			match(T__3);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				mapping();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__18) | (1L << ID))) != 0) );
			setState(164);
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
		enterRule(_localctx, 12, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__9);
			setState(167);
			match(T__3);
			setState(168);
			mappingAlias();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(169);
				match(T__10);
				setState(170);
				mappingAlias();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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

	public static class BroadcastContext extends ParserRuleContext {
		public List<Json_pathContext> json_path() {
			return getRuleContexts(Json_pathContext.class);
		}
		public Json_pathContext json_path(int i) {
			return getRuleContext(Json_pathContext.class,i);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public BroadcastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broadcast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterBroadcast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitBroadcast(this);
		}
	}

	public final BroadcastContext broadcast() throws RecognitionException {
		BroadcastContext _localctx = new BroadcastContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_broadcast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__11);
			setState(179);
			match(T__3);
			setState(180);
			json_path();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(181);
				match(T__10);
				setState(182);
				json_path();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__5);
			setState(189);
			as();
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

	public static class AsContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitAs(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__12);
			setState(192);
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
		enterRule(_localctx, 18, RULE_straight_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			mappingAlias();
			setState(195);
			data_type();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(196);
				precision();
				}
			}

			setState(199);
			null_notnull();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(200);
				attribute();
				}
				}
				setState(205);
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
		enterRule(_localctx, 20, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__3);
			setState(207);
			id();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==ID) {
				{
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(208);
					match(T__10);
					}
				}

				setState(211);
				id();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
		enterRule(_localctx, 22, RULE_attribute);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				reference();
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
		enterRule(_localctx, 24, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__13);
			setState(224);
			match(T__3);
			setState(225);
			table_name();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(226);
				match(T__10);
				setState(227);
				id();
				}
			}

			setState(230);
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
		enterRule(_localctx, 26, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__14);
			setState(233);
			match(T__3);
			setState(234);
			id();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(235);
				match(T__10);
				setState(236);
				id();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
		enterRule(_localctx, 28, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 30, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(246);
				schema();
				setState(247);
				match(T__15);
				}
				break;
			}
			setState(251);
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
		enterRule(_localctx, 32, RULE_schema);
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
		enterRule(_localctx, 34, RULE_fromField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				{
				setState(257);
				literal();
				}
				break;
			case T__18:
			case ID:
				{
				setState(258);
				json_path();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(261);
			match(T__7);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				{
				setState(262);
				literal();
				}
				break;
			case T__18:
			case ID:
				{
				setState(263);
				json_path();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlattenerListener ) ((FlattenerListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			id();
			setState(268);
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
		enterRule(_localctx, 40, RULE_mappingAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			json_path();
			setState(271);
			match(T__7);
			setState(272);
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
		enterRule(_localctx, 42, RULE_json_path);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				map_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				simple_json_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
		enterRule(_localctx, 44, RULE_map_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			id();
			setState(280);
			match(T__3);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==ID) {
				{
				setState(281);
				json_path();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(284);
				match(T__10);
				setState(285);
				json_path();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		enterRule(_localctx, 46, RULE_concat_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__18);
			setState(294);
			match(T__3);
			setState(295);
			simple_json_path();
			setState(296);
			match(T__10);
			setState(297);
			id();
			setState(298);
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
		enterRule(_localctx, 48, RULE_simple_json_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			first_field_name();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(301);
				match(T__15);
				setState(302);
				middle_field_name();
				}
				}
				setState(307);
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
		enterRule(_localctx, 50, RULE_first_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 52, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 54, RULE_middle_field_name);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				id();
				}
				break;
			case T__19:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
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
		enterRule(_localctx, 56, RULE_pk_fk);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				pk();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
		enterRule(_localctx, 58, RULE_list_index);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__19);
				setState(321);
				match(ID);
				setState(322);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(T__21);
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
		enterRule(_localctx, 60, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(326);
				match(T__22);
				}
			}

			setState(329);
			match(T__23);
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
		enterRule(_localctx, 62, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__24);
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
		enterRule(_localctx, 64, RULE_fk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__25);
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
		enterRule(_localctx, 66, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(336);
				match(T__26);
				setState(337);
				match(ID);
				}
				}
				setState(342);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\3\3\3\5\3U\n\3\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\6\3^\n\3\r\3\16\3_\3\3"+
		"\3\3\7\3d\n\3\f\3\16\3g\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4"+
		"\3\4\5\4t\n\4\3\4\3\4\3\4\3\4\6\4z\n\4\r\4\16\4{\3\4\3\4\7\4\u0080\n\4"+
		"\f\4\16\4\u0083\13\4\3\4\3\4\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0091\n\6\3\6\3\6\6\6\u0095\n\6\r\6\16\6\u0096\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7\u009f\n\7\3\7\3\7\6\7\u00a3\n\7\r\7\16\7\u00a4\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u00ba\n\t\f\t\16\t\u00bd\13\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00c8\n\13\3\13\3\13\7\13\u00cc\n\13\f\13\16\13\u00cf"+
		"\13\13\3\f\3\f\3\f\5\f\u00d4\n\f\3\f\7\f\u00d7\n\f\f\f\16\f\u00da\13\f"+
		"\3\f\3\f\3\r\3\r\5\r\u00e0\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00f0\n\17\f\17\16\17\u00f3\13"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00fc\n\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\5\24\u0106\n\24\3\24\3\24\3\24\5\24\u010b\n"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0118"+
		"\n\27\3\30\3\30\3\30\5\30\u011d\n\30\3\30\3\30\7\30\u0121\n\30\f\30\16"+
		"\30\u0124\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u0132\n\32\f\32\16\32\u0135\13\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\5\35\u013d\n\35\3\36\3\36\5\36\u0141\n\36\3\37\3\37\3\37\3\37\5"+
		"\37\u0147\n\37\3 \5 \u014a\n \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\7#\u0155\n"+
		"#\f#\16#\u0158\13#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BD\2\3\3\2\23\24\2\u015d\2I\3\2\2\2\4L\3\2\2\2\6"+
		"j\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u009a\3\2\2\2\16\u00a8\3\2"+
		"\2\2\20\u00b4\3\2\2\2\22\u00c1\3\2\2\2\24\u00c4\3\2\2\2\26\u00d0\3\2\2"+
		"\2\30\u00df\3\2\2\2\32\u00e1\3\2\2\2\34\u00ea\3\2\2\2\36\u00f6\3\2\2\2"+
		" \u00fb\3\2\2\2\"\u00ff\3\2\2\2$\u0101\3\2\2\2&\u0105\3\2\2\2(\u010c\3"+
		"\2\2\2*\u0110\3\2\2\2,\u0117\3\2\2\2.\u0119\3\2\2\2\60\u0127\3\2\2\2\62"+
		"\u012e\3\2\2\2\64\u0136\3\2\2\2\66\u0138\3\2\2\28\u013c\3\2\2\2:\u0140"+
		"\3\2\2\2<\u0146\3\2\2\2>\u0149\3\2\2\2@\u014d\3\2\2\2B\u014f\3\2\2\2D"+
		"\u0151\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3"+
		"\2\2\2KI\3\2\2\2LM\7\3\2\2MP\5 \21\2NO\7\4\2\2OQ\5$\23\2PN\3\2\2\2PQ\3"+
		"\2\2\2QT\3\2\2\2RS\7\5\2\2SU\5&\24\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5"+
		"\16\b\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\6\2\2Z[\7\7\2\2[]\7\6\2\2\\"+
		"^\5\b\5\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\7\b\2\2"+
		"bd\5\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2"+
		"hi\7\b\2\2i\5\3\2\2\2jk\7\3\2\2kl\5 \21\2lm\7\4\2\2mp\5$\23\2no\7\5\2"+
		"\2oq\5&\24\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\16\b\2sr\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2uv\7\6\2\2vw\7\7\2\2wy\7\6\2\2xz\5\b\5\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7\b\2\2~\u0080\5\6\4\2\177~"+
		"\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\b\2\2\u0085\7\3\2\2\2"+
		"\u0086\u008a\5\24\13\2\u0087\u008a\5\f\7\2\u0088\u008a\5\n\6\2\u0089\u0086"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\t\3\2\2\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008d\5,\27\2\u008d\u008e\7\n\2\2\u008e\u0090\5\66"+
		"\34\2\u008f\u0091\5\20\t\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\7\6\2\2\u0093\u0095\5\b\5\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7\b\2\2\u0099\13\3\2\2\2\u009a\u009b\7\13\2"+
		"\2\u009b\u009c\5,\27\2\u009c\u009e\7\b\2\2\u009d\u009f\5\16\b\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\6"+
		"\2\2\u00a1\u00a3\5\b\5\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\b"+
		"\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00af"+
		"\5*\26\2\u00ab\u00ac\7\r\2\2\u00ac\u00ae\5*\26\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\17\3\2\2\2\u00b4\u00b5"+
		"\7\16\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00bb\5,\27\2\u00b7\u00b8\7\r\2\2"+
		"\u00b8\u00ba\5,\27\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7\b\2\2\u00bf\u00c0\5\22\n\2\u00c0\21\3\2\2\2\u00c1\u00c2\7\17"+
		"\2\2\u00c2\u00c3\5D#\2\u00c3\23\3\2\2\2\u00c4\u00c5\5*\26\2\u00c5\u00c7"+
		"\5\36\20\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\5> \2\u00ca\u00cc\5\30\r\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\25\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d8\5D#\2"+
		"\u00d2\u00d4\7\r\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\5D#\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\7\b\2\2\u00dc\27\3\2\2\2\u00dd\u00e0\5\32\16\2\u00de"+
		"\u00e0\5:\36\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\31\3\2\2"+
		"\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\7\6\2\2\u00e3\u00e6\5 \21\2\u00e4"+
		"\u00e5\7\r\2\2\u00e5\u00e7\5D#\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\b\2\2\u00e9\33\3\2\2\2\u00ea\u00eb"+
		"\7\21\2\2\u00eb\u00ec\7\6\2\2\u00ec\u00f1\5D#\2\u00ed\u00ee\7\r\2\2\u00ee"+
		"\u00f0\5D#\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\7\b\2\2\u00f5\35\3\2\2\2\u00f6\u00f7\5D#\2\u00f7\37\3\2\2\2\u00f8\u00f9"+
		"\5\"\22\2\u00f9\u00fa\7\22\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5D#\2\u00fe!\3\2"+
		"\2\2\u00ff\u0100\5D#\2\u0100#\3\2\2\2\u0101\u0102\5\62\32\2\u0102%\3\2"+
		"\2\2\u0103\u0106\5(\25\2\u0104\u0106\5,\27\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\7\n\2\2\u0108\u010b\5("+
		"\25\2\u0109\u010b\5,\27\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\'\3\2\2\2\u010c\u010d\t\2\2\2\u010d\u010e\5D#\2\u010e\u010f\7\b\2\2\u010f"+
		")\3\2\2\2\u0110\u0111\5,\27\2\u0111\u0112\7\n\2\2\u0112\u0113\5\66\34"+
		"\2\u0113+\3\2\2\2\u0114\u0118\5.\30\2\u0115\u0118\5\62\32\2\u0116\u0118"+
		"\5\60\31\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2"+
		"\u0118-\3\2\2\2\u0119\u011a\5D#\2\u011a\u011c\7\6\2\2\u011b\u011d\5,\27"+
		"\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e\u011f"+
		"\7\r\2\2\u011f\u0121\5,\27\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0126\7\b\2\2\u0126/\3\2\2\2\u0127\u0128\7\25\2\2\u0128\u0129"+
		"\7\6\2\2\u0129\u012a\5\62\32\2\u012a\u012b\7\r\2\2\u012b\u012c\5D#\2\u012c"+
		"\u012d\7\b\2\2\u012d\61\3\2\2\2\u012e\u0133\5\64\33\2\u012f\u0130\7\22"+
		"\2\2\u0130\u0132\58\35\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\63\3\2\2\2\u0135\u0133\3\2\2"+
		"\2\u0136\u0137\5D#\2\u0137\65\3\2\2\2\u0138\u0139\5D#\2\u0139\67\3\2\2"+
		"\2\u013a\u013d\5D#\2\u013b\u013d\5<\37\2\u013c\u013a\3\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013d9\3\2\2\2\u013e\u0141\5@!\2\u013f\u0141\5B\"\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141;\3\2\2\2\u0142\u0143\7\26\2\2\u0143"+
		"\u0144\7\36\2\2\u0144\u0147\7\27\2\2\u0145\u0147\7\30\2\2\u0146\u0142"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147=\3\2\2\2\u0148\u014a\7\31\2\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\32"+
		"\2\2\u014c?\3\2\2\2\u014d\u014e\7\33\2\2\u014eA\3\2\2\2\u014f\u0150\7"+
		"\34\2\2\u0150C\3\2\2\2\u0151\u0156\7\36\2\2\u0152\u0153\7\35\2\2\u0153"+
		"\u0155\7\36\2\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157E\3\2\2\2\u0158\u0156\3\2\2\2&IPTW_ep"+
		"s{\u0081\u0089\u0090\u0096\u009e\u00a4\u00af\u00bb\u00c7\u00cd\u00d3\u00d8"+
		"\u00df\u00e6\u00f1\u00fb\u0105\u010a\u0117\u011c\u0122\u0133\u013c\u0140"+
		"\u0146\u0149\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}