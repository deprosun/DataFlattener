// Generated from /Users/mm10444/Projects/streaming-platform/DataFlattener/src/main/antlr/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlattenerParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, ID = 29, SPACE = 30, COMMENT = 31, LINE_COMMENT = 32;
    public static final int
            RULE_mappers = 0, RULE_mapper = 1, RULE_child_mapper = 2, RULE_mapping = 3,
            RULE_object_mapping = 4, RULE_list_mapping = 5, RULE_explode_mapping = 6,
            RULE_with = 7, RULE_from = 8, RULE_broadcast = 9, RULE_alias_json_path = 10,
            RULE_as = 11, RULE_straight_mapping = 12, RULE_precision = 13, RULE_attribute = 14,
            RULE_reference = 15, RULE_copy = 16, RULE_data_type = 17, RULE_table_name = 18,
            RULE_schema = 19, RULE_fromField = 20, RULE_filter = 21, RULE_literal = 22,
            RULE_mappingAlias = 23, RULE_json_path = 24, RULE_map_func = 25, RULE_concat_func = 26,
            RULE_simple_json_path = 27, RULE_first_field_name = 28, RULE_column_name = 29,
            RULE_middle_field_name = 30, RULE_pk_fk = 31, RULE_list_index = 32, RULE_null_notnull = 33,
            RULE_pk = 34, RULE_fk = 35, RULE_id = 36;

    private static String[] makeRuleNames() {
        return new String[]{
                "mappers", "mapper", "child_mapper", "mapping", "object_mapping", "list_mapping",
                "explode_mapping", "with", "from", "broadcast", "alias_json_path", "as",
                "straight_mapping", "precision", "attribute", "reference", "copy", "data_type",
                "table_name", "schema", "fromField", "filter", "literal", "mappingAlias",
                "json_path", "map_func", "concat_func", "simple_json_path", "first_field_name",
                "column_name", "middle_field_name", "pk_fk", "list_index", "null_notnull",
                "pk", "fk", "id"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'TABLE'", "'FROM'", "'FILTER'", "'('", "'MAPPING'", "')'", "'OBJECT'",
                "'LIST'", "'explode('", "'WITH'", "','", "'BROADCAST'", "'AS'", "'Reference'",
                "'copy'", "'.'", "'='", "'literal('", "'lit('", "'CONCAT'", "'['", "']'",
                "'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, "ID", "SPACE", "COMMENT", "LINE_COMMENT"
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
    public String getGrammarFileName() {
        return "Flattener.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public FlattenerParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class MappersContext extends ParserRuleContext {
        public List<MapperContext> mapper() {
            return getRuleContexts(MapperContext.class);
        }

        public MapperContext mapper(int i) {
            return getRuleContext(MapperContext.class, i);
        }

        public MappersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mappers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMappers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMappers(this);
        }
    }

    public final MappersContext mappers() throws RecognitionException {
        MappersContext _localctx = new MappersContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_mappers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(74);
                            mapper();
                        }
                    }
                    setState(79);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MapperContext extends ParserRuleContext {
        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public FromFieldContext fromField() {
            return getRuleContext(FromFieldContext.class, 0);
        }

        public FilterContext filter() {
            return getRuleContext(FilterContext.class, 0);
        }

        public WithContext with() {
            return getRuleContext(WithContext.class, 0);
        }

        public List<MappingContext> mapping() {
            return getRuleContexts(MappingContext.class);
        }

        public MappingContext mapping(int i) {
            return getRuleContext(MappingContext.class, i);
        }

        public List<Child_mapperContext> child_mapper() {
            return getRuleContexts(Child_mapperContext.class);
        }

        public Child_mapperContext child_mapper(int i) {
            return getRuleContext(Child_mapperContext.class, i);
        }

        public MapperContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapper;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMapper(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMapper(this);
        }
    }

    public final MapperContext mapper() throws RecognitionException {
        MapperContext _localctx = new MapperContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_mapper);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(80);
                match(T__0);
                setState(81);
                table_name();
                setState(84);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(82);
                        match(T__1);
                        setState(83);
                        fromField();
                    }
                }

                setState(88);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(86);
                        match(T__2);
                        setState(87);
                        filter();
                    }
                }

                setState(91);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__9) {
                    {
                        setState(90);
                        with();
                    }
                }

                setState(93);
                match(T__3);
                setState(94);
                match(T__4);
                setState(95);
                match(T__3);
                setState(97);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(96);
                            mapping();
                        }
                    }
                    setState(99);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << ID))) != 0));
                setState(101);
                match(T__5);
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(102);
                            child_mapper();
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(108);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Child_mapperContext extends ParserRuleContext {
        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public FromFieldContext fromField() {
            return getRuleContext(FromFieldContext.class, 0);
        }

        public FilterContext filter() {
            return getRuleContext(FilterContext.class, 0);
        }

        public WithContext with() {
            return getRuleContext(WithContext.class, 0);
        }

        public List<MappingContext> mapping() {
            return getRuleContexts(MappingContext.class);
        }

        public MappingContext mapping(int i) {
            return getRuleContext(MappingContext.class, i);
        }

        public List<Child_mapperContext> child_mapper() {
            return getRuleContexts(Child_mapperContext.class);
        }

        public Child_mapperContext child_mapper(int i) {
            return getRuleContext(Child_mapperContext.class, i);
        }

        public Child_mapperContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_child_mapper;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterChild_mapper(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitChild_mapper(this);
        }
    }

    public final Child_mapperContext child_mapper() throws RecognitionException {
        Child_mapperContext _localctx = new Child_mapperContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_child_mapper);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(T__0);
                setState(111);
                table_name();
                setState(112);
                match(T__1);
                setState(113);
                fromField();
                setState(116);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(114);
                        match(T__2);
                        setState(115);
                        filter();
                    }
                }

                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__9) {
                    {
                        setState(118);
                        with();
                    }
                }

                setState(121);
                match(T__3);
                setState(122);
                match(T__4);
                setState(123);
                match(T__3);
                setState(125);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(124);
                            mapping();
                        }
                    }
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << ID))) != 0));
                setState(129);
                match(T__5);
                setState(133);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(130);
                            child_mapper();
                        }
                    }
                    setState(135);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(136);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MappingContext extends ParserRuleContext {
        public Straight_mappingContext straight_mapping() {
            return getRuleContext(Straight_mappingContext.class, 0);
        }

        public Explode_mappingContext explode_mapping() {
            return getRuleContext(Explode_mappingContext.class, 0);
        }

        public Object_mappingContext object_mapping() {
            return getRuleContext(Object_mappingContext.class, 0);
        }

        public List_mappingContext list_mapping() {
            return getRuleContext(List_mappingContext.class, 0);
        }

        public MappingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapping;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMapping(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMapping(this);
        }
    }

    public final MappingContext mapping() throws RecognitionException {
        MappingContext _localctx = new MappingContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_mapping);
        try {
            setState(142);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__19:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    straight_mapping();
                }
                break;
                case T__8:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(139);
                    explode_mapping();
                }
                break;
                case T__6:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(140);
                    object_mapping();
                }
                break;
                case T__7:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(141);
                    list_mapping();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Object_mappingContext extends ParserRuleContext {
        public Column_nameContext column_name() {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public FromContext from() {
            return getRuleContext(FromContext.class, 0);
        }

        public List<MappingContext> mapping() {
            return getRuleContexts(MappingContext.class);
        }

        public MappingContext mapping(int i) {
            return getRuleContext(MappingContext.class, i);
        }

        public Object_mappingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_object_mapping;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterObject_mapping(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitObject_mapping(this);
        }
    }

    public final Object_mappingContext object_mapping() throws RecognitionException {
        Object_mappingContext _localctx = new Object_mappingContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_object_mapping);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(144);
                match(T__6);
                setState(145);
                column_name();
                setState(146);
                from();
                setState(147);
                match(T__3);
                setState(149);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(148);
                            mapping();
                        }
                    }
                    setState(151);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << ID))) != 0));
                setState(153);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class List_mappingContext extends ParserRuleContext {
        public Column_nameContext column_name() {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public Json_pathContext json_path() {
            return getRuleContext(Json_pathContext.class, 0);
        }

        public BroadcastContext broadcast() {
            return getRuleContext(BroadcastContext.class, 0);
        }

        public List<MappingContext> mapping() {
            return getRuleContexts(MappingContext.class);
        }

        public MappingContext mapping(int i) {
            return getRuleContext(MappingContext.class, i);
        }

        public List_mappingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list_mapping;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterList_mapping(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitList_mapping(this);
        }
    }

    public final List_mappingContext list_mapping() throws RecognitionException {
        List_mappingContext _localctx = new List_mappingContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_list_mapping);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(155);
                match(T__7);
                setState(156);
                column_name();
                setState(157);
                match(T__1);
                setState(158);
                json_path();
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__11) {
                    {
                        setState(159);
                        broadcast();
                    }
                }

                setState(162);
                match(T__3);
                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(163);
                            mapping();
                        }
                    }
                    setState(166);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << ID))) != 0));
                setState(168);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Explode_mappingContext extends ParserRuleContext {
        public Json_pathContext json_path() {
            return getRuleContext(Json_pathContext.class, 0);
        }

        public WithContext with() {
            return getRuleContext(WithContext.class, 0);
        }

        public List<MappingContext> mapping() {
            return getRuleContexts(MappingContext.class);
        }

        public MappingContext mapping(int i) {
            return getRuleContext(MappingContext.class, i);
        }

        public Explode_mappingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explode_mapping;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterExplode_mapping(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitExplode_mapping(this);
        }
    }

    public final Explode_mappingContext explode_mapping() throws RecognitionException {
        Explode_mappingContext _localctx = new Explode_mappingContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_explode_mapping);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                match(T__8);
                setState(171);
                json_path();
                setState(172);
                match(T__5);
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__9) {
                    {
                        setState(173);
                        with();
                    }
                }

                setState(176);
                match(T__3);
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(177);
                            mapping();
                        }
                    }
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << ID))) != 0));
                setState(182);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WithContext extends ParserRuleContext {
        public List<MappingAliasContext> mappingAlias() {
            return getRuleContexts(MappingAliasContext.class);
        }

        public MappingAliasContext mappingAlias(int i) {
            return getRuleContext(MappingAliasContext.class, i);
        }

        public WithContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_with;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterWith(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitWith(this);
        }
    }

    public final WithContext with() throws RecognitionException {
        WithContext _localctx = new WithContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_with);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                match(T__9);
                setState(185);
                match(T__3);
                setState(186);
                mappingAlias();
                setState(191);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(187);
                            match(T__10);
                            setState(188);
                            mappingAlias();
                        }
                    }
                    setState(193);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(194);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FromContext extends ParserRuleContext {
        public List<Alias_json_pathContext> alias_json_path() {
            return getRuleContexts(Alias_json_pathContext.class);
        }

        public Alias_json_pathContext alias_json_path(int i) {
            return getRuleContext(Alias_json_pathContext.class, i);
        }

        public FromContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterFrom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitFrom(this);
        }
    }

    public final FromContext from() throws RecognitionException {
        FromContext _localctx = new FromContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_from);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                match(T__1);
                setState(197);
                match(T__3);
                setState(198);
                alias_json_path();
                setState(203);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(199);
                            match(T__10);
                            setState(200);
                            alias_json_path();
                        }
                    }
                    setState(205);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(206);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BroadcastContext extends ParserRuleContext {
        public List<Alias_json_pathContext> alias_json_path() {
            return getRuleContexts(Alias_json_pathContext.class);
        }

        public Alias_json_pathContext alias_json_path(int i) {
            return getRuleContext(Alias_json_pathContext.class, i);
        }

        public BroadcastContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_broadcast;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterBroadcast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitBroadcast(this);
        }
    }

    public final BroadcastContext broadcast() throws RecognitionException {
        BroadcastContext _localctx = new BroadcastContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_broadcast);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                match(T__11);
                setState(209);
                match(T__3);
                setState(210);
                alias_json_path();
                setState(215);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(211);
                            match(T__10);
                            setState(212);
                            alias_json_path();
                        }
                    }
                    setState(217);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(218);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Alias_json_pathContext extends ParserRuleContext {
        public Json_pathContext json_path() {
            return getRuleContext(Json_pathContext.class, 0);
        }

        public AsContext as() {
            return getRuleContext(AsContext.class, 0);
        }

        public Alias_json_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alias_json_path;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterAlias_json_path(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitAlias_json_path(this);
        }
    }

    public final Alias_json_pathContext alias_json_path() throws RecognitionException {
        Alias_json_pathContext _localctx = new Alias_json_pathContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_alias_json_path);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
                json_path();
                setState(222);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__12) {
                    {
                        setState(221);
                        as();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AsContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public AsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_as;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterAs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitAs(this);
        }
    }

    public final AsContext as() throws RecognitionException {
        AsContext _localctx = new AsContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_as);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                match(T__12);
                setState(225);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Straight_mappingContext extends ParserRuleContext {
        public MappingAliasContext mappingAlias() {
            return getRuleContext(MappingAliasContext.class, 0);
        }

        public Data_typeContext data_type() {
            return getRuleContext(Data_typeContext.class, 0);
        }

        public Null_notnullContext null_notnull() {
            return getRuleContext(Null_notnullContext.class, 0);
        }

        public PrecisionContext precision() {
            return getRuleContext(PrecisionContext.class, 0);
        }

        public List<AttributeContext> attribute() {
            return getRuleContexts(AttributeContext.class);
        }

        public AttributeContext attribute(int i) {
            return getRuleContext(AttributeContext.class, i);
        }

        public Straight_mappingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_straight_mapping;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterStraight_mapping(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitStraight_mapping(this);
        }
    }

    public final Straight_mappingContext straight_mapping() throws RecognitionException {
        Straight_mappingContext _localctx = new Straight_mappingContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_straight_mapping);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(227);
                mappingAlias();
                setState(228);
                data_type();
                setState(230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__3) {
                    {
                        setState(229);
                        precision();
                    }
                }

                setState(232);
                null_notnull();
                setState(236);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__25) | (1L << T__26))) != 0)) {
                    {
                        {
                            setState(233);
                            attribute();
                        }
                    }
                    setState(238);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrecisionContext extends ParserRuleContext {
        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public PrecisionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_precision;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterPrecision(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitPrecision(this);
        }
    }

    public final PrecisionContext precision() throws RecognitionException {
        PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_precision);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(T__3);
                setState(240);
                id();
                setState(247);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10 || _la == ID) {
                    {
                        {
                            setState(242);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == T__10) {
                                {
                                    setState(241);
                                    match(T__10);
                                }
                            }

                            setState(244);
                            id();
                        }
                    }
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(250);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AttributeContext extends ParserRuleContext {
        public ReferenceContext reference() {
            return getRuleContext(ReferenceContext.class, 0);
        }

        public Pk_fkContext pk_fk() {
            return getRuleContext(Pk_fkContext.class, 0);
        }

        public AttributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attribute;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterAttribute(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitAttribute(this);
        }
    }

    public final AttributeContext attribute() throws RecognitionException {
        AttributeContext _localctx = new AttributeContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_attribute);
        try {
            setState(254);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__13:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(252);
                    reference();
                }
                break;
                case T__25:
                case T__26:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(253);
                    pk_fk();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReferenceContext extends ParserRuleContext {
        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public ReferenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_reference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitReference(this);
        }
    }

    public final ReferenceContext reference() throws RecognitionException {
        ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_reference);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(256);
                match(T__13);
                setState(257);
                match(T__3);
                setState(258);
                table_name();
                setState(261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__10) {
                    {
                        setState(259);
                        match(T__10);
                        setState(260);
                        id();
                    }
                }

                setState(263);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CopyContext extends ParserRuleContext {
        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public CopyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_copy;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterCopy(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitCopy(this);
        }
    }

    public final CopyContext copy() throws RecognitionException {
        CopyContext _localctx = new CopyContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_copy);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(265);
                match(T__14);
                setState(266);
                match(T__3);
                setState(267);
                id();
                setState(272);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(268);
                            match(T__10);
                            setState(269);
                            id();
                        }
                    }
                    setState(274);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(275);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Data_typeContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Data_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_data_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterData_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitData_type(this);
        }
    }

    public final Data_typeContext data_type() throws RecognitionException {
        Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_data_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_nameContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public SchemaContext schema() {
            return getRuleContext(SchemaContext.class, 0);
        }

        public Table_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterTable_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitTable_name(this);
        }
    }

    public final Table_nameContext table_name() throws RecognitionException {
        Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_table_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        setState(279);
                        schema();
                        setState(280);
                        match(T__15);
                    }
                    break;
                }
                setState(284);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SchemaContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public SchemaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_schema;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterSchema(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitSchema(this);
        }
    }

    public final SchemaContext schema() throws RecognitionException {
        SchemaContext _localctx = new SchemaContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_schema);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FromFieldContext extends ParserRuleContext {
        public Simple_json_pathContext simple_json_path() {
            return getRuleContext(Simple_json_pathContext.class, 0);
        }

        public FromFieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromField;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterFromField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitFromField(this);
        }
    }

    public final FromFieldContext fromField() throws RecognitionException {
        FromFieldContext _localctx = new FromFieldContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_fromField);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(288);
                simple_json_path();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FilterContext extends ParserRuleContext {
        public List<LiteralContext> literal() {
            return getRuleContexts(LiteralContext.class);
        }

        public LiteralContext literal(int i) {
            return getRuleContext(LiteralContext.class, i);
        }

        public List<Json_pathContext> json_path() {
            return getRuleContexts(Json_pathContext.class);
        }

        public Json_pathContext json_path(int i) {
            return getRuleContext(Json_pathContext.class, i);
        }

        public FilterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_filter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitFilter(this);
        }
    }

    public final FilterContext filter() throws RecognitionException {
        FilterContext _localctx = new FilterContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_filter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(292);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__17:
                    case T__18: {
                        setState(290);
                        literal();
                    }
                    break;
                    case T__19:
                    case ID: {
                        setState(291);
                        json_path();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(294);
                match(T__16);
                setState(297);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__17:
                    case T__18: {
                        setState(295);
                        literal();
                    }
                    break;
                    case T__19:
                    case ID: {
                        setState(296);
                        json_path();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitLiteral(this);
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                _la = _input.LA(1);
                if (!(_la == T__17 || _la == T__18)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(300);
                id();
                setState(301);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MappingAliasContext extends ParserRuleContext {
        public Json_pathContext json_path() {
            return getRuleContext(Json_pathContext.class, 0);
        }

        public Column_nameContext column_name() {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public MappingAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mappingAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMappingAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMappingAlias(this);
        }
    }

    public final MappingAliasContext mappingAlias() throws RecognitionException {
        MappingAliasContext _localctx = new MappingAliasContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_mappingAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                json_path();
                setState(304);
                match(T__16);
                setState(305);
                column_name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Json_pathContext extends ParserRuleContext {
        public Map_funcContext map_func() {
            return getRuleContext(Map_funcContext.class, 0);
        }

        public Simple_json_pathContext simple_json_path() {
            return getRuleContext(Simple_json_pathContext.class, 0);
        }

        public Concat_funcContext concat_func() {
            return getRuleContext(Concat_funcContext.class, 0);
        }

        public Json_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_json_path;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterJson_path(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitJson_path(this);
        }
    }

    public final Json_pathContext json_path() throws RecognitionException {
        Json_pathContext _localctx = new Json_pathContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_json_path);
        try {
            setState(310);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(307);
                    map_func();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(308);
                    simple_json_path();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(309);
                    concat_func();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Map_funcContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public List<Json_pathContext> json_path() {
            return getRuleContexts(Json_pathContext.class);
        }

        public Json_pathContext json_path(int i) {
            return getRuleContext(Json_pathContext.class, i);
        }

        public Map_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_map_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMap_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMap_func(this);
        }
    }

    public final Map_funcContext map_func() throws RecognitionException {
        Map_funcContext _localctx = new Map_funcContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_map_func);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(312);
                id();
                setState(313);
                match(T__3);
                setState(315);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19 || _la == ID) {
                    {
                        setState(314);
                        json_path();
                    }
                }

                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(317);
                            match(T__10);
                            setState(318);
                            json_path();
                        }
                    }
                    setState(323);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(324);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Concat_funcContext extends ParserRuleContext {
        public Simple_json_pathContext simple_json_path() {
            return getRuleContext(Simple_json_pathContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Concat_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_concat_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterConcat_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitConcat_func(this);
        }
    }

    public final Concat_funcContext concat_func() throws RecognitionException {
        Concat_funcContext _localctx = new Concat_funcContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_concat_func);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(326);
                match(T__19);
                setState(327);
                match(T__3);
                setState(328);
                simple_json_path();
                setState(329);
                match(T__10);
                setState(330);
                id();
                setState(331);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_json_pathContext extends ParserRuleContext {
        public First_field_nameContext first_field_name() {
            return getRuleContext(First_field_nameContext.class, 0);
        }

        public List<Middle_field_nameContext> middle_field_name() {
            return getRuleContexts(Middle_field_nameContext.class);
        }

        public Middle_field_nameContext middle_field_name(int i) {
            return getRuleContext(Middle_field_nameContext.class, i);
        }

        public Simple_json_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_json_path;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterSimple_json_path(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitSimple_json_path(this);
        }
    }

    public final Simple_json_pathContext simple_json_path() throws RecognitionException {
        Simple_json_pathContext _localctx = new Simple_json_pathContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_simple_json_path);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(333);
                first_field_name();
                setState(338);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__15) {
                    {
                        {
                            setState(334);
                            match(T__15);
                            setState(335);
                            middle_field_name();
                        }
                    }
                    setState(340);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class First_field_nameContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public First_field_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_first_field_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterFirst_field_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitFirst_field_name(this);
        }
    }

    public final First_field_nameContext first_field_name() throws RecognitionException {
        First_field_nameContext _localctx = new First_field_nameContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_first_field_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(341);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Column_nameContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Column_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_column_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterColumn_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitColumn_name(this);
        }
    }

    public final Column_nameContext column_name() throws RecognitionException {
        Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_column_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(343);
                id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Middle_field_nameContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public List_indexContext list_index() {
            return getRuleContext(List_indexContext.class, 0);
        }

        public Middle_field_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_middle_field_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterMiddle_field_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitMiddle_field_name(this);
        }
    }

    public final Middle_field_nameContext middle_field_name() throws RecognitionException {
        Middle_field_nameContext _localctx = new Middle_field_nameContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_middle_field_name);
        try {
            setState(347);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(345);
                    id();
                }
                break;
                case T__20:
                case T__22:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(346);
                    list_index();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pk_fkContext extends ParserRuleContext {
        public PkContext pk() {
            return getRuleContext(PkContext.class, 0);
        }

        public FkContext fk() {
            return getRuleContext(FkContext.class, 0);
        }

        public Pk_fkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pk_fk;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterPk_fk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitPk_fk(this);
        }
    }

    public final Pk_fkContext pk_fk() throws RecognitionException {
        Pk_fkContext _localctx = new Pk_fkContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_pk_fk);
        try {
            setState(351);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__25:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(349);
                    pk();
                }
                break;
                case T__26:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(350);
                    fk();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class List_indexContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(FlattenerParser.ID, 0);
        }

        public List_indexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list_index;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterList_index(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitList_index(this);
        }
    }

    public final List_indexContext list_index() throws RecognitionException {
        List_indexContext _localctx = new List_indexContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_list_index);
        try {
            setState(357);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__20:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(353);
                    match(T__20);
                    setState(354);
                    match(ID);
                    setState(355);
                    match(T__21);
                }
                break;
                case T__22:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(356);
                    match(T__22);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Null_notnullContext extends ParserRuleContext {
        public Null_notnullContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_null_notnull;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterNull_notnull(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitNull_notnull(this);
        }
    }

    public final Null_notnullContext null_notnull() throws RecognitionException {
        Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_null_notnull);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(360);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__23) {
                    {
                        setState(359);
                        match(T__23);
                    }
                }

                setState(362);
                match(T__24);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PkContext extends ParserRuleContext {
        public PkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pk;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterPk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitPk(this);
        }
    }

    public final PkContext pk() throws RecognitionException {
        PkContext _localctx = new PkContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_pk);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(364);
                match(T__25);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FkContext extends ParserRuleContext {
        public FkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fk;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterFk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitFk(this);
        }
    }

    public final FkContext fk() throws RecognitionException {
        FkContext _localctx = new FkContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_fk);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(366);
                match(T__26);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(FlattenerParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(FlattenerParser.ID, i);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof FlattenerListener) ((FlattenerListener) listener).exitId(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_id);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(368);
                match(ID);
                setState(373);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__27) {
                    {
                        {
                            setState(369);
                            match(T__27);
                            setState(370);
                            match(ID);
                        }
                    }
                    setState(375);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u017b\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3" +
                    "\3\3\3\3\3\5\3W\n\3\3\3\3\3\5\3[\n\3\3\3\5\3^\n\3\3\3\3\3\3\3\3\3\6\3" +
                    "d\n\3\r\3\16\3e\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\5\4w\n\4\3\4\5\4z\n\4\3\4\3\4\3\4\3\4\6\4\u0080\n\4\r\4\16" +
                    "\4\u0081\3\4\3\4\7\4\u0086\n\4\f\4\16\4\u0089\13\4\3\4\3\4\3\5\3\5\3\5" +
                    "\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\3\6\6\6\u0098\n\6\r\6\16\6\u0099\3" +
                    "\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\7\3\7\6\7\u00a7\n\7\r\7\16" +
                    "\7\u00a8\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\6\b\u00b5\n\b\r" +
                    "\b\16\b\u00b6\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00c0\n\t\f\t\16\t\u00c3" +
                    "\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3" +
                    "\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00d8\n\13\f\13\16\13\u00db\13\13" +
                    "\3\13\3\13\3\f\3\f\5\f\u00e1\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00e9" +
                    "\n\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\17\3\17\3\17" +
                    "\5\17\u00f5\n\17\3\17\7\17\u00f8\n\17\f\17\16\17\u00fb\13\17\3\17\3\17" +
                    "\3\20\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3" +
                    "\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13" +
                    "\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u011d\n\24\3\24\3\24\3\25" +
                    "\3\25\3\26\3\26\3\27\3\27\5\27\u0127\n\27\3\27\3\27\3\27\5\27\u012c\n" +
                    "\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0139" +
                    "\n\32\3\33\3\33\3\33\5\33\u013e\n\33\3\33\3\33\7\33\u0142\n\33\f\33\16" +
                    "\33\u0145\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35" +
                    "\3\35\7\35\u0153\n\35\f\35\16\35\u0156\13\35\3\36\3\36\3\37\3\37\3 \3" +
                    " \5 \u015e\n \3!\3!\5!\u0162\n!\3\"\3\"\3\"\3\"\5\"\u0168\n\"\3#\5#\u016b" +
                    "\n#\3#\3#\3$\3$\3%\3%\3&\3&\3&\7&\u0176\n&\f&\16&\u0179\13&\3&\2\2\'\2" +
                    "\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2" +
                    "\3\3\2\24\25\2\u017f\2O\3\2\2\2\4R\3\2\2\2\6p\3\2\2\2\b\u0090\3\2\2\2" +
                    "\n\u0092\3\2\2\2\f\u009d\3\2\2\2\16\u00ac\3\2\2\2\20\u00ba\3\2\2\2\22" +
                    "\u00c6\3\2\2\2\24\u00d2\3\2\2\2\26\u00de\3\2\2\2\30\u00e2\3\2\2\2\32\u00e5" +
                    "\3\2\2\2\34\u00f1\3\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\"\u010b\3\2" +
                    "\2\2$\u0117\3\2\2\2&\u011c\3\2\2\2(\u0120\3\2\2\2*\u0122\3\2\2\2,\u0126" +
                    "\3\2\2\2.\u012d\3\2\2\2\60\u0131\3\2\2\2\62\u0138\3\2\2\2\64\u013a\3\2" +
                    "\2\2\66\u0148\3\2\2\28\u014f\3\2\2\2:\u0157\3\2\2\2<\u0159\3\2\2\2>\u015d" +
                    "\3\2\2\2@\u0161\3\2\2\2B\u0167\3\2\2\2D\u016a\3\2\2\2F\u016e\3\2\2\2H" +
                    "\u0170\3\2\2\2J\u0172\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2" +
                    "OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RS\7\3\2\2SV\5&\24\2TU\7\4\2\2UW\5*\26" +
                    "\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XY\7\5\2\2Y[\5,\27\2ZX\3\2\2\2Z[\3\2\2" +
                    "\2[]\3\2\2\2\\^\5\20\t\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\6\2\2`a\7" +
                    "\7\2\2ac\7\6\2\2bd\5\b\5\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3" +
                    "\2\2\2gk\7\b\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3" +
                    "\2\2\2mk\3\2\2\2no\7\b\2\2o\5\3\2\2\2pq\7\3\2\2qr\5&\24\2rs\7\4\2\2sv" +
                    "\5*\26\2tu\7\5\2\2uw\5,\27\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\5\20\t\2" +
                    "yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\6\2\2|}\7\7\2\2}\177\7\6\2\2~\u0080" +
                    "\5\b\5\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082" +
                    "\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\7\b\2\2\u0084\u0086\5\6\4\2\u0085" +
                    "\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2" +
                    "\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\b\2\2\u008b" +
                    "\7\3\2\2\2\u008c\u0091\5\32\16\2\u008d\u0091\5\16\b\2\u008e\u0091\5\n" +
                    "\6\2\u008f\u0091\5\f\7\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090" +
                    "\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7\t\2\2" +
                    "\u0093\u0094\5<\37\2\u0094\u0095\5\22\n\2\u0095\u0097\7\6\2\2\u0096\u0098" +
                    "\5\b\5\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099" +
                    "\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\b\2\2\u009c\13\3\2\2" +
                    "\2\u009d\u009e\7\n\2\2\u009e\u009f\5<\37\2\u009f\u00a0\7\4\2\2\u00a0\u00a2" +
                    "\5\62\32\2\u00a1\u00a3\5\24\13\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2" +
                    "\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\6\2\2\u00a5\u00a7\5\b\5\2\u00a6\u00a5" +
                    "\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9" +
                    "\u00aa\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\7\13\2" +
                    "\2\u00ad\u00ae\5\62\32\2\u00ae\u00b0\7\b\2\2\u00af\u00b1\5\20\t\2\u00b0" +
                    "\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\6" +
                    "\2\2\u00b3\u00b5\5\b\5\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6" +
                    "\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\b" +
                    "\2\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00c1" +
                    "\5\60\31\2\u00bd\u00be\7\r\2\2\u00be\u00c0\5\60\31\2\u00bf\u00bd\3\2\2" +
                    "\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4" +
                    "\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\21\3\2\2\2\u00c6" +
                    "\u00c7\7\4\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00cd\5\26\f\2\u00c9\u00ca\7" +
                    "\r\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd" +
                    "\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2" +
                    "\2\2\u00d0\u00d1\7\b\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4" +
                    "\7\6\2\2\u00d4\u00d9\5\26\f\2\u00d5\u00d6\7\r\2\2\u00d6\u00d8\5\26\f\2" +
                    "\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da" +
                    "\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd" +
                    "\25\3\2\2\2\u00de\u00e0\5\62\32\2\u00df\u00e1\5\30\r\2\u00e0\u00df\3\2" +
                    "\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4" +
                    "\5J&\2\u00e4\31\3\2\2\2\u00e5\u00e6\5\60\31\2\u00e6\u00e8\5$\23\2\u00e7" +
                    "\u00e9\5\34\17\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3" +
                    "\2\2\2\u00ea\u00ee\5D#\2\u00eb\u00ed\5\36\20\2\u00ec\u00eb\3\2\2\2\u00ed" +
                    "\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\33\3\2\2" +
                    "\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f9\5J&\2\u00f3\u00f5" +
                    "\7\r\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6" +
                    "\u00f8\5J&\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2" +
                    "\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd" +
                    "\7\b\2\2\u00fd\35\3\2\2\2\u00fe\u0101\5 \21\2\u00ff\u0101\5@!\2\u0100" +
                    "\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\37\3\2\2\2\u0102\u0103\7\20\2" +
                    "\2\u0103\u0104\7\6\2\2\u0104\u0107\5&\24\2\u0105\u0106\7\r\2\2\u0106\u0108" +
                    "\5J&\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109" +
                    "\u010a\7\b\2\2\u010a!\3\2\2\2\u010b\u010c\7\21\2\2\u010c\u010d\7\6\2\2" +
                    "\u010d\u0112\5J&\2\u010e\u010f\7\r\2\2\u010f\u0111\5J&\2\u0110\u010e\3" +
                    "\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113" +
                    "\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\b\2\2\u0116#\3\2\2\2" +
                    "\u0117\u0118\5J&\2\u0118%\3\2\2\2\u0119\u011a\5(\25\2\u011a\u011b\7\22" +
                    "\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d" +
                    "\u011e\3\2\2\2\u011e\u011f\5J&\2\u011f\'\3\2\2\2\u0120\u0121\5J&\2\u0121" +
                    ")\3\2\2\2\u0122\u0123\58\35\2\u0123+\3\2\2\2\u0124\u0127\5.\30\2\u0125" +
                    "\u0127\5\62\32\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3" +
                    "\2\2\2\u0128\u012b\7\23\2\2\u0129\u012c\5.\30\2\u012a\u012c\5\62\32\2" +
                    "\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c-\3\2\2\2\u012d\u012e\t" +
                    "\2\2\2\u012e\u012f\5J&\2\u012f\u0130\7\b\2\2\u0130/\3\2\2\2\u0131\u0132" +
                    "\5\62\32\2\u0132\u0133\7\23\2\2\u0133\u0134\5<\37\2\u0134\61\3\2\2\2\u0135" +
                    "\u0139\5\64\33\2\u0136\u0139\58\35\2\u0137\u0139\5\66\34\2\u0138\u0135" +
                    "\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\63\3\2\2\2\u013a" +
                    "\u013b\5J&\2\u013b\u013d\7\6\2\2\u013c\u013e\5\62\32\2\u013d\u013c\3\2" +
                    "\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u0140\7\r\2\2\u0140" +
                    "\u0142\5\62\32\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3" +
                    "\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146" +
                    "\u0147\7\b\2\2\u0147\65\3\2\2\2\u0148\u0149\7\26\2\2\u0149\u014a\7\6\2" +
                    "\2\u014a\u014b\58\35\2\u014b\u014c\7\r\2\2\u014c\u014d\5J&\2\u014d\u014e" +
                    "\7\b\2\2\u014e\67\3\2\2\2\u014f\u0154\5:\36\2\u0150\u0151\7\22\2\2\u0151" +
                    "\u0153\5> \2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2" +
                    "\2\u0154\u0155\3\2\2\2\u01559\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158" +
                    "\5J&\2\u0158;\3\2\2\2\u0159\u015a\5J&\2\u015a=\3\2\2\2\u015b\u015e\5J" +
                    "&\2\u015c\u015e\5B\"\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e?" +
                    "\3\2\2\2\u015f\u0162\5F$\2\u0160\u0162\5H%\2\u0161\u015f\3\2\2\2\u0161" +
                    "\u0160\3\2\2\2\u0162A\3\2\2\2\u0163\u0164\7\27\2\2\u0164\u0165\7\37\2" +
                    "\2\u0165\u0168\7\30\2\2\u0166\u0168\7\31\2\2\u0167\u0163\3\2\2\2\u0167" +
                    "\u0166\3\2\2\2\u0168C\3\2\2\2\u0169\u016b\7\32\2\2\u016a\u0169\3\2\2\2" +
                    "\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\33\2\2\u016dE\3" +
                    "\2\2\2\u016e\u016f\7\34\2\2\u016fG\3\2\2\2\u0170\u0171\7\35\2\2\u0171" +
                    "I\3\2\2\2\u0172\u0177\7\37\2\2\u0173\u0174\7\36\2\2\u0174\u0176\7\37\2" +
                    "\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178" +
                    "\3\2\2\2\u0178K\3\2\2\2\u0179\u0177\3\2\2\2)OVZ]ekvy\u0081\u0087\u0090" +
                    "\u0099\u00a2\u00a8\u00b0\u00b6\u00c1\u00cd\u00d9\u00e0\u00e8\u00ee\u00f4" +
                    "\u00f9\u0100\u0107\u0112\u011c\u0126\u012b\u0138\u013d\u0143\u0154\u015d" +
                    "\u0161\u0167\u016a\u0177";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}