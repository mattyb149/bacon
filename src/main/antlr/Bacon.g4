grammar Bacon;

prog:   stat*
      | EOF
    ;

stat : (identifier | quotedString) END_STAT*;
block : START_BLOCK ( stat )* END_BLOCK NL* ;

identifier : Identifier;

quotedString : DQUOTE unquotedString DQUOTE ;
unquotedString : CHAR*;

START_BLOCK : '{' ;
END_BLOCK : '}' ;

START_HOP : '-[' ;
END_HOP : ']->' ;

HEX :   '0' ('x'|'X') HEXDIGIT+ [Ll]? ;

INT :   DIGIT+ [Ll]? ;

fragment
HEXDIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

FLOAT:  DIGIT+ '.' DIGIT* EXP? [Ll]?
    |   DIGIT+ EXP? [Ll]?
    |   '.' DIGIT+ EXP? [Ll]?
    ;
fragment
DIGIT:  '0'..'9' ;
fragment
EXP :   ('E' | 'e') ('+' | '-')? INT ;

DQUOTE : '"' ;

fragment
ESC :   '\\' [abtnfrv"'\\]
    |   UNICODE_ESCAPE
    |   HEX_ESCAPE
    |   OCTAL_ESCAPE
    ;

fragment
UNICODE_ESCAPE
    :   '\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
    |   '\\' 'u' '{' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT '}'
    ;

fragment
OCTAL_ESCAPE
    :   '\\' [0-3] [0-7] [0-7]
    |   '\\' [0-7] [0-7]
    |   '\\' [0-7]
    ;

fragment
HEX_ESCAPE
    :   '\\' HEXDIGIT HEXDIGIT?
    ;

Identifier : [a-zA-Z][a-zA-Z0-9_]* ;

fragment LETTER  : [a-zA-Z] ;

CHAR :  '\u0000' .. '\u0009'
     |  '\u000b' .. '\u000c'
     |  '\u000e' .. '\u00021'
     |  '\u0023' .. '\uffff'
     ;

COMMENT :   '#' .*? '\r'? '\n' -> type(NL) ;

END_STAT : ';' ;

// Match both UNIX and Windows newlines
NL      :   '\r'? '\n' ;

WS      :   [ \r\n\t\0x000c]+ -> skip ;
