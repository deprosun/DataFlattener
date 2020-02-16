// Generated from /Users/kgupta/projects/DataFlattener/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlattenerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ID=21, SPACE=22, COMMENT=23, LINE_COMMENT=24;
	public static final int
		RULE_mappers = 0, RULE_mapper = 1, RULE_child_mapper = 2, RULE_mapping = 3, 
		RULE_explode_mapping = 4, RULE_with = 5, RULE_straight_mapping = 6, RULE_precision = 7, 
		RULE_attribute = 8, RULE_reference = 9, RULE_copy = 10, RULE_data_type = 11, 
		RULE_table_name = 12, RULE_schema = 13, RULE_fromField = 14, RULE_mappingAlias = 15, 
		RULE_json_path = 16, RULE_map_func = 17, RULE_concat_func = 18, RULE_simple_json_path = 19, 
		RULE_first_field_name = 20, RULE_column_name = 21, RULE_middle_field_name = 22, 
		RULE_pk_fk = 23, RULE_list_index = 24, RULE_null_notnull = 25, RULE_pk = 26, 
		RULE_fk = 27, RULE_id = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"mappers", "mapper", "child_mapper", "mapping", "explode_mapping", "with", 
			"straight_mapping", "precision", "attribute", "reference", "copy", "data_type", 
			"table_name", "schema", "fromField", "mappingAlias", "json_path", "map_func", 
			"concat_func", "simple_json_path", "first_field_name", "column_name", 
			"middle_field_name", "pk_fk", "list_index", "null_notnull", "pk", "fk", 
			"id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'('", "'MAPPING'", "')'", "'['", "']'", "'WITH'", 
			"','", "'Reference'", "'copy'", "'.'", "'='", "'CONCAT'", "'[ALL]'", 
			"'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "SPACE", 
			"COMMENT", "LINE_COMMENT"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(58);
				mapper();
				}
				}
				setState(63);
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
			setState(64);
			match(T__0);
			setState(65);
			table_name();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(66);
				match(T__1);
				setState(67);
				fromField();
				}
			}

			setState(70);
			match(T__2);
			setState(71);
			match(T__3);
			setState(72);
			match(T__2);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				mapping();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__5 );
			setState(78);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(79);
				child_mapper();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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

	public static class Child_mapperContext extends ParserRuleContext {
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
			setState(87);
			match(T__0);
			setState(88);
			table_name();
			setState(89);
			match(T__1);
			setState(90);
			fromField();
			setState(91);
			match(T__2);
			setState(92);
			match(T__3);
			setState(93);
			match(T__2);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				mapping();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__5 );
			setState(99);
			match(T__4);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(100);
				child_mapper();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		enterRule(_localctx, 6, RULE_mapping);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				straight_mapping();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
			setState(112);
			match(T__5);
			setState(113);
			json_path();
			setState(114);
			match(T__6);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(115);
				with();
				}
			}

			setState(118);
			match(T__2);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				mapping();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__5 );
			setState(124);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					mappingAlias();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(132);
			mappingAlias();
			setState(133);
			data_type();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(134);
				precision();
				}
			}

			setState(137);
			null_notnull();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__17) | (1L << T__18))) != 0)) {
				{
				{
				setState(138);
				attribute();
				}
				}
				setState(143);
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
			setState(144);
			match(T__2);
			setState(145);
			id();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==ID) {
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(146);
					match(T__8);
					}
				}

				setState(149);
				id();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
		enterRule(_localctx, 16, RULE_attribute);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				reference();
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
			setState(161);
			match(T__9);
			setState(162);
			match(T__2);
			setState(163);
			table_name();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(164);
				match(T__8);
				setState(165);
				id();
				}
			}

			setState(168);
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
			setState(170);
			match(T__10);
			setState(171);
			match(T__2);
			setState(172);
			id();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(173);
				match(T__8);
				setState(174);
				id();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		enterRule(_localctx, 22, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(184);
				schema();
				setState(185);
				match(T__11);
				}
				break;
			}
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
			setState(191);
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
			setState(193);
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

	public static class MappingAliasContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Json_pathContext json_path() {
			return getRuleContext(Json_pathContext.class,0);
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
		enterRule(_localctx, 30, RULE_mappingAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__2);
			setState(196);
			column_name();
			setState(197);
			match(T__12);
			setState(198);
			json_path();
			setState(199);
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
		enterRule(_localctx, 32, RULE_json_path);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				map_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				simple_json_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
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
		enterRule(_localctx, 34, RULE_map_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			id();
			setState(207);
			match(T__2);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==ID) {
				{
				setState(208);
				json_path();
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(211);
				match(T__8);
				setState(212);
				json_path();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
		enterRule(_localctx, 36, RULE_concat_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__13);
			setState(221);
			match(T__2);
			setState(222);
			simple_json_path();
			setState(223);
			match(T__8);
			setState(224);
			id();
			setState(225);
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
		enterRule(_localctx, 38, RULE_simple_json_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			first_field_name();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(228);
				match(T__11);
				setState(229);
				middle_field_name();
				}
				}
				setState(234);
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
		enterRule(_localctx, 40, RULE_first_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 42, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 44, RULE_middle_field_name);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				id();
				}
				break;
			case T__5:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
		enterRule(_localctx, 46, RULE_pk_fk);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				pk();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
		enterRule(_localctx, 48, RULE_list_index);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__5);
				setState(248);
				match(ID);
				setState(249);
				match(T__6);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__14);
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
		enterRule(_localctx, 50, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(253);
				match(T__15);
				}
			}

			setState(256);
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
		enterRule(_localctx, 52, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 54, RULE_fk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 56, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(263);
				match(T__19);
				setState(264);
				match(ID);
				}
				}
				setState(269);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0111\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N\3"+
		"\3\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4b\n\4\r\4\16\4c\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\5"+
		"\5q\n\5\3\6\3\6\3\6\3\6\5\6w\n\6\3\6\3\6\6\6{\n\6\r\6\16\6|\3\6\3\6\3"+
		"\7\3\7\6\7\u0083\n\7\r\7\16\7\u0084\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b"+
		"\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\t\3\t\3\t\5\t\u0096\n\t\3\t\7\t\u0099"+
		"\n\t\f\t\16\t\u009c\13\t\3\t\3\t\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00a9\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b2\n\f"+
		"\f\f\16\f\u00b5\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u00be\n\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\5\22\u00cf\n\22\3\23\3\23\3\23\5\23\u00d4\n\23\3\23\3\23\7\23\u00d8"+
		"\n\23\f\23\16\23\u00db\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\5\30\u00f4\n\30\3\31\3\31\5\31\u00f8\n\31\3\32\3\32"+
		"\3\32\3\32\5\32\u00fe\n\32\3\33\5\33\u0101\n\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\7\36\u010c\n\36\f\36\16\36\u010f\13\36\3\36\2"+
		"\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2"+
		"\2\2\u010f\2?\3\2\2\2\4B\3\2\2\2\6Y\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u0086\3\2\2\2\20\u0092\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3"+
		"\2\2\2\26\u00ac\3\2\2\2\30\u00b8\3\2\2\2\32\u00bd\3\2\2\2\34\u00c1\3\2"+
		"\2\2\36\u00c3\3\2\2\2 \u00c5\3\2\2\2\"\u00ce\3\2\2\2$\u00d0\3\2\2\2&\u00de"+
		"\3\2\2\2(\u00e5\3\2\2\2*\u00ed\3\2\2\2,\u00ef\3\2\2\2.\u00f3\3\2\2\2\60"+
		"\u00f7\3\2\2\2\62\u00fd\3\2\2\2\64\u0100\3\2\2\2\66\u0104\3\2\2\28\u0106"+
		"\3\2\2\2:\u0108\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2A?\3\2\2\2BC\7\3\2\2CF\5\32\16\2DE\7\4\2\2EG\5\36\20\2"+
		"FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\5\2\2IJ\7\6\2\2JL\7\5\2\2KM\5\b\5\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7\7\2\2QS\5\6\4\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\7\2\2"+
		"X\5\3\2\2\2YZ\7\3\2\2Z[\5\32\16\2[\\\7\4\2\2\\]\5\36\20\2]^\7\5\2\2^_"+
		"\7\6\2\2_a\7\5\2\2`b\5\b\5\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d"+
		"e\3\2\2\2ei\7\7\2\2fh\5\6\4\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\7\7\2\2m\7\3\2\2\2nq\5\16\b\2oq\5\n\6\2pn\3\2\2"+
		"\2po\3\2\2\2q\t\3\2\2\2rs\7\b\2\2st\5\"\22\2tv\7\t\2\2uw\5\f\7\2vu\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xz\7\5\2\2y{\5\b\5\2zy\3\2\2\2{|\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\7\2\2\177\13\3\2\2\2\u0080\u0082\7\n\2"+
		"\2\u0081\u0083\5 \21\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\5 \21\2\u0087"+
		"\u0089\5\30\r\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\5\64\33\2\u008c\u008e\5\22\n\2"+
		"\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\17\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\5\2\2\u0093"+
		"\u009a\5:\36\2\u0094\u0096\7\13\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\5:\36\2\u0098\u0095\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\7\2\2\u009e\21\3\2\2\2\u009f\u00a2"+
		"\5\24\13\2\u00a0\u00a2\5\60\31\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\23\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a8"+
		"\5\32\16\2\u00a6\u00a7\7\13\2\2\u00a7\u00a9\5:\36\2\u00a8\u00a6\3\2\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\25"+
		"\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00b3\5:\36\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b2\5:\36\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\5:\36"+
		"\2\u00b9\31\3\2\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\16\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\5:\36\2\u00c0\33\3\2\2\2\u00c1\u00c2\5:\36\2\u00c2\35\3\2\2\2\u00c3"+
		"\u00c4\5(\25\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\5,\27"+
		"\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7\7\2\2\u00ca"+
		"!\3\2\2\2\u00cb\u00cf\5$\23\2\u00cc\u00cf\5(\25\2\u00cd\u00cf\5&\24\2"+
		"\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf#\3"+
		"\2\2\2\u00d0\u00d1\5:\36\2\u00d1\u00d3\7\5\2\2\u00d2\u00d4\5\"\22\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d6\7\13"+
		"\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\7\7\2\2\u00dd%\3\2\2\2\u00de\u00df\7\20\2\2\u00df\u00e0"+
		"\7\5\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5:\36\2"+
		"\u00e3\u00e4\7\7\2\2\u00e4\'\3\2\2\2\u00e5\u00ea\5*\26\2\u00e6\u00e7\7"+
		"\16\2\2\u00e7\u00e9\5.\30\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00ee\5:\36\2\u00ee+\3\2\2\2\u00ef\u00f0\5:\36\2\u00f0-\3\2\2\2"+
		"\u00f1\u00f4\5:\36\2\u00f2\u00f4\5\62\32\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4/\3\2\2\2\u00f5\u00f8\5\66\34\2\u00f6\u00f8\58\35\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\61\3\2\2\2\u00f9\u00fa\7\b\2"+
		"\2\u00fa\u00fb\7\27\2\2\u00fb\u00fe\7\t\2\2\u00fc\u00fe\7\21\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\63\3\2\2\2\u00ff\u0101\7\22\2"+
		"\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\7\23\2\2\u0103\65\3\2\2\2\u0104\u0105\7\24\2\2\u0105\67\3\2\2\2\u0106"+
		"\u0107\7\25\2\2\u01079\3\2\2\2\u0108\u010d\7\27\2\2\u0109\u010a\7\26\2"+
		"\2\u010a\u010c\7\27\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e;\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\35?FNTcipv|\u0084\u0089\u008f\u0095\u009a\u00a1\u00a8\u00b3\u00bd\u00ce"+
		"\u00d3\u00d9\u00ea\u00f3\u00f7\u00fd\u0100\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}