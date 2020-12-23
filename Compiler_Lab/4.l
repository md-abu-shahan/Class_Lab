%option noyywrap

odd [1|3|5|7|9]
even [0|2|4|6|8]

%{
int o=0;
int e=0;
%}

%%
[\n] {if(o!=0 || e!=0){printf("Even = %d, Odd = %d\n",e,o);}
		o=0;e=0;}
exit {return 0;}
{odd} {o++;} 
{even} {e++;}
%%

int main() {
	yylex();
	return 0;
}
