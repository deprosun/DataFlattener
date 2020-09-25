grammar Flattener;

mappers:
    mapper*;

mapper
    :'TOPIC' topic_name ('FROM' fromField)? ('FILTER' filter)? broadcast? '(' 'MAPPING' '(' mapping+ ')' child_mapper* ')'
    ;

child_mapper
    :'TOPIC' topic_name 'FROM' fromField ('FILTER' filter)? broadcast? '(' 'MAPPING' '(' mapping+ ')' child_mapper* ')'
    ;

mapping
    : straight_mapping | explode_mapping | object_mapping | list_mapping
    ;

object_mapping
    : 'OBJECT' column_name from '(' mapping+ ')'
    ;

list_mapping
    : 'LIST' column_name 'FROM' json_path broadcast? '(' mapping+ ')'
    ;

explode_mapping
    : 'EXPLODE' json_path broadcast? '(' mapping+ ')'
    ;

with
    : 'WITH' '(' mappingAlias (',' mappingAlias)* ')'
    ;

from
    : 'FROM' '(' alias_json_path (',' alias_json_path)* ')'
    ;

broadcast
    : 'BROADCAST' '(' alias_json_path (',' alias_json_path)* ')'
    ;

alias_json_path
    : json_path as?
    ;

as
    : 'AS' id
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
    : 'Reference' '(' topic_name (',' id)? ')'
    ;

copy
    : 'copy' '(' id (',' id)* ')'
    ;

data_type
    : id
    ;

topic_name
    :(schema '.')? id
    ;

schema
    :id
    ;


fromField
    :simple_json_path
    ;

filter
    : (literal | json_path) '=' (literal | json_path)
    ;

literal
    : ('literal(' | 'lit(') id ')'
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