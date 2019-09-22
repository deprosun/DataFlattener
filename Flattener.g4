grammar Flattener;

mapper:
    'SOURCE' table_name ('FROM' fromField)? '(' mappings mapper* ')'
    ;

mappings:
    'MAPPING' '(' mapping (','? mapping)* ','? ')'
    ;

mapping
    : first_field_name ('.' middle_field_name)* '=' column_name data_type precision? null_notnull attributes?
    ;

precision
    : '('id (','? id)*')'
    ;

attributes
    : '(' attribute (attribute)* ')'
    ;

attribute
    : reference
    | pk_fk
    | concatBy
    | referenceType
    ;

reference
    : 'Reference' '['fhirResource']'
    ;

concatBy
    :'ConcatBy' '['separator']'
    ;

referenceType
    : 'ReferenceType'
    ;

separator
    :.*?
    ;

data_type
    : id
    ;

table_name
    :id
    ;

fhirResource
    :id
    ;

fromField
    :first_field_name ('.' middle_field_name)*
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
    : ID
    ;

ID: [a-zA-Z0-9]+;

SPACE:              [ \t\r\n]+    -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]* -> channel(HIDDEN);

fragment NUM: [0-9]+;