%option noyywrap
comma [.|-|@|#]
%{
int n=0;
int c=0;
%}

%%
exit return 0;
(([a-z|A-Z])([a-z|A-Z|_|0-9]*)) {n++;} 
{comma} {c++;}
([0-9 ]*) {c++;}
[\n] {if(c!=0){printf("Not a valid C identifier\n");}else if(n!=0){printf("Valid C identifier\n");}c=0;n=0;}
%%

int main() {
	yylex();
	return 0;
}