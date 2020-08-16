grammar Flattener;

mappers:
    mapper*;

mapper
    :'TABLE' table_name ('FROM' fromField)? '(' 'MAPPING' '(' mapping+ ')' child_mapper* ')'
    ;

child_mapper
    :'TABLE' table_name 'FROM' fromField '(' 'MAPPING' '(' mapping+ ')' child_mapper* ')'
    ;

mapping
    : straight_mapping | explode_mapping
    ;

explode_mapping
    : 'explode(' json_path ')' with? '(' mapping+ ')'
    ;

with
    : 'WITH' '(' mappingAlias (',' mappingAlias)* ')'
    ;

straight_mapping
    : mappingAlias data_type precision? null_notnull attribute*
    ;

precision
    : '('id (','? id)*')'
    ;

attribute
    : reference
    | pk_fk
    ;

reference
    : 'Reference' '(' table_name (',' id)? ')'
    ;

copy
    : 'copy' '(' id (',' id)* ')'
    ;

data_type
    : id
    ;

table_name
    :(schema '.')? id
    ;

schema
    :id
    ;


fromField
    :simple_json_path
    ;

mappingAlias
    :  json_path '=' column_name
    ;

json_path
    : map_func
    | simple_json_path
    | concat_func
    ;

map_func
    : id '(' json_path? (',' json_path)* ')'
    ;

concat_func
    :'CONCAT' '(' simple_json_path ',' id ')'
    ;

simple_json_path
    : first_field_name ('.' middle_field_name)*
    ;

first_field_name
    :id
    ;

column_name
    :id
    ;

middle_field_name
    : id
    | list_index
    ;

pk_fk
    :pk
    |fk
    ;

list_index
    : '['ID']'
    | '[ALL]'
    ;

null_notnull
    : 'NOT'? 'NULL'
    ;

pk
    :'PK'
    ;

fk
    :'FK'
    ;

id
    : ID ('_' ID)*
    ;

ID: [a-zA-Z0-9]+;

SPACE:              [ \t\r\n]+    -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]* -> channel(HIDDEN);

fragment NUM: [0-9]+;