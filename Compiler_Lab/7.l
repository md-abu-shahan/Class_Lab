%option noyywrap
%{
int flag=0;
%}
%%
[\n] return 0;
[a-z | A-Z | . | 0-9 | _ | - ] + "@gmail.com"|"@yahoo.com"|"@outlook.com" { flag=1; }
[a-z | A-Z | . | 0-9 | _ | - | @ ] {flag=0; }
%%
int main()
{
yylex();
if(flag==1)
	printf("Valid mail");
else
	printf("Not a valid mail");
	
	return 0;
}