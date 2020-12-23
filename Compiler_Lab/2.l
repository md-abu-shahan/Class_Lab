%option noyywrap

letter [a-z|A-Z]
vowel [a|e|i|o|u|A|E|I|O|U]

%{
int v=0;
int c=0;
%}

%%
exit return 0;

{vowel} {v++;} 
{letter} {c++;}
[\n] {if(v!=0 || c!=0){printf("Vowel = %d , Consonent = %d\n",v,c);}v=0;c=0;}
%%

int main() {
	yylex();
	return 0;
}