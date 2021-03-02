#include<bits/stdc++.h>
using namespace std;
#define ll long long
string s,s2,s3;
ll L[10000][10000];

void LCS(ll n,ll m)
{
    ll i,j,k,a,b;

    for(i=0; i<=n; i++)
    {
        for(j=0; j<=m; j++)
        {
            if(i==0 || j==0)
            {
                L[i][j]=0;
            }
            else if(s[i-1]==s2[j-1])
            {
                L[i][j]=L[i-1][j-1]+1;
            }
            else
            {
                L[i][j]=max(L[i-1][j],L[i][j-1]);
            }
        }
    }

    ll x,y;
    x=n;y=m;
    while(x>0 && y>0){
        if(s[x-1]==s2[y-1]){
            s3.push_back(s[x-1]);
            x--,y--;
        }
        else if(L[x-1][y]>=L[x][y-1]){
            x--;
        }
        else y--;
    }
    reverse(s3.begin(),s3.end());
}

int main()
{
    ll i,j,k,l,n,m;
    cin>>s>>s2;
    n=s.size();
    m=s2.size();
    LCS(n,m);
    cout<<s3<<endl;
}

/*
paragraph
geography
*/
