%option noyywrap

%{
%}

%%
exit return 0;
(([0-1]*)[0][1][0]([0-1]*)) {printf("010 has contained");} 
[0-1]* {printf("010 has not contained");}
%%

int main() {
	yylex();
	return 0;
}