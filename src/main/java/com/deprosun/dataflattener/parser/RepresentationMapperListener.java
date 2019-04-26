// Generated from /Users/kgupta/DataFlattener/target/RepresentationMapper.g4 by ANTLR 4.7.2
package com.deprosun.dataflattener.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RepresentationMapperParser}.
 */
public interface RepresentationMapperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#mapper}.
	 * @param ctx the parse tree
	 */
	void enterMapper(RepresentationMapperParser.MapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#mapper}.
	 * @param ctx the parse tree
	 */
	void exitMapper(RepresentationMapperParser.MapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#mappings}.
	 * @param ctx the parse tree
	 */
	void enterMappings(RepresentationMapperParser.MappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#mappings}.
	 * @param ctx the parse tree
	 */
	void exitMappings(RepresentationMapperParser.MappingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(RepresentationMapperParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(RepresentationMapperParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(RepresentationMapperParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(RepresentationMapperParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(RepresentationMapperParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(RepresentationMapperParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(RepresentationMapperParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(RepresentationMapperParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(RepresentationMapperParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(RepresentationMapperParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#concatBy}.
	 * @param ctx the parse tree
	 */
	void enterConcatBy(RepresentationMapperParser.ConcatByContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#concatBy}.
	 * @param ctx the parse tree
	 */
	void exitConcatBy(RepresentationMapperParser.ConcatByContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(RepresentationMapperParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(RepresentationMapperParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(RepresentationMapperParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(RepresentationMapperParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(RepresentationMapperParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(RepresentationMapperParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(RepresentationMapperParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(RepresentationMapperParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#fhirResource}.
	 * @param ctx the parse tree
	 */
	void enterFhirResource(RepresentationMapperParser.FhirResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#fhirResource}.
	 * @param ctx the parse tree
	 */
	void exitFhirResource(RepresentationMapperParser.FhirResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#fromField}.
	 * @param ctx the parse tree
	 */
	void enterFromField(RepresentationMapperParser.FromFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#fromField}.
	 * @param ctx the parse tree
	 */
	void exitFromField(RepresentationMapperParser.FromFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#first_field_name}.
	 * @param ctx the parse tree
	 */
	void enterFirst_field_name(RepresentationMapperParser.First_field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#first_field_name}.
	 * @param ctx the parse tree
	 */
	void exitFirst_field_name(RepresentationMapperParser.First_field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(RepresentationMapperParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(RepresentationMapperParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#middle_field_name}.
	 * @param ctx the parse tree
	 */
	void enterMiddle_field_name(RepresentationMapperParser.Middle_field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#middle_field_name}.
	 * @param ctx the parse tree
	 */
	void exitMiddle_field_name(RepresentationMapperParser.Middle_field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#pk_fk}.
	 * @param ctx the parse tree
	 */
	void enterPk_fk(RepresentationMapperParser.Pk_fkContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#pk_fk}.
	 * @param ctx the parse tree
	 */
	void exitPk_fk(RepresentationMapperParser.Pk_fkContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#list_index}.
	 * @param ctx the parse tree
	 */
	void enterList_index(RepresentationMapperParser.List_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#list_index}.
	 * @param ctx the parse tree
	 */
	void exitList_index(RepresentationMapperParser.List_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(RepresentationMapperParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(RepresentationMapperParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#pk}.
	 * @param ctx the parse tree
	 */
	void enterPk(RepresentationMapperParser.PkContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#pk}.
	 * @param ctx the parse tree
	 */
	void exitPk(RepresentationMapperParser.PkContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#fk}.
	 * @param ctx the parse tree
	 */
	void enterFk(RepresentationMapperParser.FkContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#fk}.
	 * @param ctx the parse tree
	 */
	void exitFk(RepresentationMapperParser.FkContext ctx);
	/**
	 * Enter a parse tree produced by {@link RepresentationMapperParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RepresentationMapperParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RepresentationMapperParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RepresentationMapperParser.IdContext ctx);
}