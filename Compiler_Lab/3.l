%option noyywrap

odd [1|3|5|7|9]
even [0|2|4|6|8]

%{

%}

%%
exit {return 0;}
{odd} {printf("Odd ");} 
{even} {printf("Even ");}
%%

int main() {
	yylex();
	return 0;
}
