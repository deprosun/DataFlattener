grammar Flattener;

mappers:
    mapper*;

mapper:
    'TABLE' table_name ('FROM' fromField)? '(' 'MAPPING' '(' mapping+ ')' mapper* ')'
    ;

mapping
    : straight_mapping | explode_mapping
    ;

explode_mapping
    : 'explode' '(' json_path ')' '(' mapping+ ')'
    ;

straight_mapping
    : json_path '=' column_name data_type precision? null_notnull attribute*
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

//join
//    : join_type '(' table_name alias ',' condition additional_conditions* ')'
//    ;
//
//join_type
//    : 'INNER' | 'LEFT' | 'RIGHT'
//    ;
//
//additional_conditions
//    : and_or condition
//    ;
//
//and_or
//    : and
//    | or
//    ;
//
//condition
//    : json_path conditional_operator json_path
//    ;
//
//conditional_operator
//    : equals
//    | less_than
//    | greater_than
//    | less_than_equal_to
//    | greater_than_equal_to
//    ;

data_type
    : id
    ;

table_name
    :(schema '.')? id
    ;

schema
    :id
    ;

//alias
//    :id
//    ;

fromField
    :simple_json_path
    ;

json_path
    : uuid_func
    | simple_json_path
    | concat_func
    ;

uuid_func
    : 'TO_UUID' '(' simple_json_path ')'
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

equals: '=';

less_than: '<';

greater_than: '>';

less_than_equal_to: '<=';

greater_than_equal_to: '>=';

and: 'and'
   | 'AND'
   | '&&'
   ;

or: 'or'
   | 'OR'
   | '||'
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