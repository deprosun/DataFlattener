// Generated from /Users/kgupta/projects/DataFlattener/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlattenerParser}.
 */
public interface FlattenerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#mapper}.
	 * @param ctx the parse tree
	 */
	void enterMapper(FlattenerParser.MapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#mapper}.
	 * @param ctx the parse tree
	 */
	void exitMapper(FlattenerParser.MapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#mappings}.
	 * @param ctx the parse tree
	 */
	void enterMappings(FlattenerParser.MappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#mappings}.
	 * @param ctx the parse tree
	 */
	void exitMappings(FlattenerParser.MappingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(FlattenerParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(FlattenerParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(FlattenerParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(FlattenerParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(FlattenerParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(FlattenerParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FlattenerParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FlattenerParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(FlattenerParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(FlattenerParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#concatBy}.
	 * @param ctx the parse tree
	 */
	void enterConcatBy(FlattenerParser.ConcatByContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#concatBy}.
	 * @param ctx the parse tree
	 */
	void exitConcatBy(FlattenerParser.ConcatByContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(FlattenerParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(FlattenerParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(FlattenerParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(FlattenerParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(FlattenerParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(FlattenerParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(FlattenerParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(FlattenerParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#fhirResource}.
	 * @param ctx the parse tree
	 */
	void enterFhirResource(FlattenerParser.FhirResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#fhirResource}.
	 * @param ctx the parse tree
	 */
	void exitFhirResource(FlattenerParser.FhirResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#fromField}.
	 * @param ctx the parse tree
	 */
	void enterFromField(FlattenerParser.FromFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#fromField}.
	 * @param ctx the parse tree
	 */
	void exitFromField(FlattenerParser.FromFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#first_field_name}.
	 * @param ctx the parse tree
	 */
	void enterFirst_field_name(FlattenerParser.First_field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#first_field_name}.
	 * @param ctx the parse tree
	 */
	void exitFirst_field_name(FlattenerParser.First_field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(FlattenerParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(FlattenerParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#middle_field_name}.
	 * @param ctx the parse tree
	 */
	void enterMiddle_field_name(FlattenerParser.Middle_field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#middle_field_name}.
	 * @param ctx the parse tree
	 */
	void exitMiddle_field_name(FlattenerParser.Middle_field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#pk_fk}.
	 * @param ctx the parse tree
	 */
	void enterPk_fk(FlattenerParser.Pk_fkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#pk_fk}.
	 * @param ctx the parse tree
	 */
	void exitPk_fk(FlattenerParser.Pk_fkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#list_index}.
	 * @param ctx the parse tree
	 */
	void enterList_index(FlattenerParser.List_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#list_index}.
	 * @param ctx the parse tree
	 */
	void exitList_index(FlattenerParser.List_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(FlattenerParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(FlattenerParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#pk}.
	 * @param ctx the parse tree
	 */
	void enterPk(FlattenerParser.PkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#pk}.
	 * @param ctx the parse tree
	 */
	void exitPk(FlattenerParser.PkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#fk}.
	 * @param ctx the parse tree
	 */
	void enterFk(FlattenerParser.FkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#fk}.
	 * @param ctx the parse tree
	 */
	void exitFk(FlattenerParser.FkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlattenerParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(FlattenerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlattenerParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(FlattenerParser.IdContext ctx);
}