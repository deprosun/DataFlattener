// Generated from /Users/mm10444/Projects/streaming-platform/DataFlattener/src/main/antlr/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlattenerParser}.
 */
public interface FlattenerListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link FlattenerParser#mappers}.
     *
     * @param ctx the parse tree
     */
    void enterMappers(FlattenerParser.MappersContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#mappers}.
     *
     * @param ctx the parse tree
     */
    void exitMappers(FlattenerParser.MappersContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#mapper}.
     *
     * @param ctx the parse tree
     */
    void enterMapper(FlattenerParser.MapperContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#mapper}.
     *
     * @param ctx the parse tree
     */
    void exitMapper(FlattenerParser.MapperContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#child_mapper}.
     *
     * @param ctx the parse tree
     */
    void enterChild_mapper(FlattenerParser.Child_mapperContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#child_mapper}.
     *
     * @param ctx the parse tree
     */
    void exitChild_mapper(FlattenerParser.Child_mapperContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#mapping}.
     *
     * @param ctx the parse tree
     */
    void enterMapping(FlattenerParser.MappingContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#mapping}.
     *
     * @param ctx the parse tree
     */
    void exitMapping(FlattenerParser.MappingContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#object_mapping}.
     *
     * @param ctx the parse tree
     */
    void enterObject_mapping(FlattenerParser.Object_mappingContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#object_mapping}.
     *
     * @param ctx the parse tree
     */
    void exitObject_mapping(FlattenerParser.Object_mappingContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#list_mapping}.
     *
     * @param ctx the parse tree
     */
    void enterList_mapping(FlattenerParser.List_mappingContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#list_mapping}.
     *
     * @param ctx the parse tree
     */
    void exitList_mapping(FlattenerParser.List_mappingContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#explode_mapping}.
     *
     * @param ctx the parse tree
     */
    void enterExplode_mapping(FlattenerParser.Explode_mappingContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#explode_mapping}.
     *
     * @param ctx the parse tree
     */
    void exitExplode_mapping(FlattenerParser.Explode_mappingContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#with}.
     *
     * @param ctx the parse tree
     */
    void enterWith(FlattenerParser.WithContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#with}.
     *
     * @param ctx the parse tree
     */
    void exitWith(FlattenerParser.WithContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#from}.
     *
     * @param ctx the parse tree
     */
    void enterFrom(FlattenerParser.FromContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#from}.
     *
     * @param ctx the parse tree
     */
    void exitFrom(FlattenerParser.FromContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#broadcast}.
     *
     * @param ctx the parse tree
     */
    void enterBroadcast(FlattenerParser.BroadcastContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#broadcast}.
     *
     * @param ctx the parse tree
     */
    void exitBroadcast(FlattenerParser.BroadcastContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#alias_json_path}.
     *
     * @param ctx the parse tree
     */
    void enterAlias_json_path(FlattenerParser.Alias_json_pathContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#alias_json_path}.
     *
     * @param ctx the parse tree
     */
    void exitAlias_json_path(FlattenerParser.Alias_json_pathContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#as}.
     *
     * @param ctx the parse tree
     */
    void enterAs(FlattenerParser.AsContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#as}.
     *
     * @param ctx the parse tree
     */
    void exitAs(FlattenerParser.AsContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#straight_mapping}.
     *
     * @param ctx the parse tree
     */
    void enterStraight_mapping(FlattenerParser.Straight_mappingContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#straight_mapping}.
     *
     * @param ctx the parse tree
     */
    void exitStraight_mapping(FlattenerParser.Straight_mappingContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#precision}.
     *
     * @param ctx the parse tree
     */
    void enterPrecision(FlattenerParser.PrecisionContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#precision}.
     *
     * @param ctx the parse tree
     */
    void exitPrecision(FlattenerParser.PrecisionContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#attribute}.
     *
     * @param ctx the parse tree
     */
    void enterAttribute(FlattenerParser.AttributeContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#attribute}.
     *
     * @param ctx the parse tree
     */
    void exitAttribute(FlattenerParser.AttributeContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#reference}.
     *
     * @param ctx the parse tree
     */
    void enterReference(FlattenerParser.ReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#reference}.
     *
     * @param ctx the parse tree
     */
    void exitReference(FlattenerParser.ReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#copy}.
     *
     * @param ctx the parse tree
     */
    void enterCopy(FlattenerParser.CopyContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#copy}.
     *
     * @param ctx the parse tree
     */
    void exitCopy(FlattenerParser.CopyContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#data_type}.
     *
     * @param ctx the parse tree
     */
    void enterData_type(FlattenerParser.Data_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#data_type}.
     *
     * @param ctx the parse tree
     */
    void exitData_type(FlattenerParser.Data_typeContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#table_name}.
     *
     * @param ctx the parse tree
     */
    void enterTable_name(FlattenerParser.Table_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#table_name}.
     *
     * @param ctx the parse tree
     */
    void exitTable_name(FlattenerParser.Table_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#schema}.
     *
     * @param ctx the parse tree
     */
    void enterSchema(FlattenerParser.SchemaContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#schema}.
     *
     * @param ctx the parse tree
     */
    void exitSchema(FlattenerParser.SchemaContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#fromField}.
     *
     * @param ctx the parse tree
     */
    void enterFromField(FlattenerParser.FromFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#fromField}.
     *
     * @param ctx the parse tree
     */
    void exitFromField(FlattenerParser.FromFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#filter}.
     *
     * @param ctx the parse tree
     */
    void enterFilter(FlattenerParser.FilterContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#filter}.
     *
     * @param ctx the parse tree
     */
    void exitFilter(FlattenerParser.FilterContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#literal}.
     *
     * @param ctx the parse tree
     */
    void enterLiteral(FlattenerParser.LiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#literal}.
     *
     * @param ctx the parse tree
     */
    void exitLiteral(FlattenerParser.LiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#mappingAlias}.
     *
     * @param ctx the parse tree
     */
    void enterMappingAlias(FlattenerParser.MappingAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#mappingAlias}.
     *
     * @param ctx the parse tree
     */
    void exitMappingAlias(FlattenerParser.MappingAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#json_path}.
     *
     * @param ctx the parse tree
     */
    void enterJson_path(FlattenerParser.Json_pathContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#json_path}.
     *
     * @param ctx the parse tree
     */
    void exitJson_path(FlattenerParser.Json_pathContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#map_func}.
     *
     * @param ctx the parse tree
     */
    void enterMap_func(FlattenerParser.Map_funcContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#map_func}.
     *
     * @param ctx the parse tree
     */
    void exitMap_func(FlattenerParser.Map_funcContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#concat_func}.
     *
     * @param ctx the parse tree
     */
    void enterConcat_func(FlattenerParser.Concat_funcContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#concat_func}.
     *
     * @param ctx the parse tree
     */
    void exitConcat_func(FlattenerParser.Concat_funcContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#simple_json_path}.
     *
     * @param ctx the parse tree
     */
    void enterSimple_json_path(FlattenerParser.Simple_json_pathContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#simple_json_path}.
     *
     * @param ctx the parse tree
     */
    void exitSimple_json_path(FlattenerParser.Simple_json_pathContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#first_field_name}.
     *
     * @param ctx the parse tree
     */
    void enterFirst_field_name(FlattenerParser.First_field_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#first_field_name}.
     *
     * @param ctx the parse tree
     */
    void exitFirst_field_name(FlattenerParser.First_field_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#column_name}.
     *
     * @param ctx the parse tree
     */
    void enterColumn_name(FlattenerParser.Column_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#column_name}.
     *
     * @param ctx the parse tree
     */
    void exitColumn_name(FlattenerParser.Column_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#middle_field_name}.
     *
     * @param ctx the parse tree
     */
    void enterMiddle_field_name(FlattenerParser.Middle_field_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#middle_field_name}.
     *
     * @param ctx the parse tree
     */
    void exitMiddle_field_name(FlattenerParser.Middle_field_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#pk_fk}.
     *
     * @param ctx the parse tree
     */
    void enterPk_fk(FlattenerParser.Pk_fkContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#pk_fk}.
     *
     * @param ctx the parse tree
     */
    void exitPk_fk(FlattenerParser.Pk_fkContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#list_index}.
     *
     * @param ctx the parse tree
     */
    void enterList_index(FlattenerParser.List_indexContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#list_index}.
     *
     * @param ctx the parse tree
     */
    void exitList_index(FlattenerParser.List_indexContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#null_notnull}.
     *
     * @param ctx the parse tree
     */
    void enterNull_notnull(FlattenerParser.Null_notnullContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#null_notnull}.
     *
     * @param ctx the parse tree
     */
    void exitNull_notnull(FlattenerParser.Null_notnullContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#pk}.
     *
     * @param ctx the parse tree
     */
    void enterPk(FlattenerParser.PkContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#pk}.
     *
     * @param ctx the parse tree
     */
    void exitPk(FlattenerParser.PkContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#fk}.
     *
     * @param ctx the parse tree
     */
    void enterFk(FlattenerParser.FkContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#fk}.
     *
     * @param ctx the parse tree
     */
    void exitFk(FlattenerParser.FkContext ctx);

    /**
     * Enter a parse tree produced by {@link FlattenerParser#id}.
     *
     * @param ctx the parse tree
     */
    void enterId(FlattenerParser.IdContext ctx);

    /**
     * Exit a parse tree produced by {@link FlattenerParser#id}.
     *
     * @param ctx the parse tree
     */
    void exitId(FlattenerParser.IdContext ctx);
}