grammar jcp;

WS		:	[ \t\r\n]+	-> skip ;
INT		:	[0-9]+ ;
LETTER	:	[a-zA-Z] ;

expr	:	atom=INT
		|	atom=LETTER
		|	'(' expr ')'
		;


