%option noyywrap

binary [0-1]
decimal [2-9]
hexadecimal [A-F]

%{
int b=0;
int d=0;
int h=0;
%}

%%
exit return 0;

{binary} {b++;} 
{decimal} {d++;}
{hexadecimal} {h++;}
[\n] {if(h!=0 ){printf("Hexadecimal\n");}else if(d!=0 ){printf("Decimal\n");}else if(b!=0){printf("Binary\n");}else{printf("error\n");}b=0;d=0;h=0;}
%%

int main() {
	yylex();
	return 0;
}