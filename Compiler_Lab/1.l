%option noyywrap

letter [a-z|A-Z]
vowel [a|e|i|o|u|A|E|I|O|U]

%{

%}

%%
exit return 0;
{vowel} {printf("Vowel ");} 
{letter} {printf("Consonant ");}

%%

int main() {
	yylex();
	return 0;
}