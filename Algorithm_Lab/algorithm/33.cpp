#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll w=0,g=1,b=-1;
ll status[1000],f;
vector<ll>v[1000];
void dfs(ll sou)
{
    status[sou]=g;
    ll sz=v[sou].size();
    for(ll i=0; i<sz; i++)
    {
        ll adj=v[sou][i];
        if(status[adj]==w)
        {
            dfs(adj);
        }
        if(status[adj]==g && f==0)
        {
            f=1;
            return ;
        }
    }
    status[sou]=b;
}

int main()
{
    ll n,e,sou,dtn,x,y;
    cin>>n>>e;
    for(ll i=0; i<e; i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
    }

    for(ll i=1; i<=n; i++)
    {
        dfs(i);
        if(f==1)
        {
            cout<<"Not tree"<<endl;
            return 0;
        }

        memset(status, 0 , 1000);

    }
    cout<<"Tree"<<endl;
}
/*
7 9
1 3
2 3
4 3
2 4
5 6
4 5
7 1
1 2
6 7
*/

/*
10 9
1 2
1 5
1 6
2 3
5 7
6 9
3 4
7 8
9 10
*/
