//rechable
#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll w=0,g=1,b=-1;
ll status[1000],par[1000];
vector<ll>v[1000];
void dfs(ll sou)
{
    status[sou]=g;
    ll sz=v[sou].size();
    for(ll i=0;i<sz;i++)
    {
        ll adj=v[sou][i];
        if(status[adj]==w)
        {
            par[adj]=sou;
            dfs(adj);
        }
    }
    status[sou]=b;
}

void path(ll i, ll j)
{
    if(i==j)
    {
        cout<<i<<" ";
        return ;
    }
    else
    {
        path(i,par[j]);
    }
    cout<<j<<" ";
}

int main()
{
    ll n,e,sou,dtn,x,y;
    cin>>n>>e;
    for(ll i=0;i<e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    cin>>sou>>dtn;
    dfs(sou);
    if(status[sou]==b && status[dtn]==b)
    {
        cout<<"reachable"<<endl;
        path(sou,dtn);
    }
    else
    {
        cout<<"not reachable"<<endl;
    }
}


/*
6 5
1 2
2 6
2 5
2 3
3 4
*/

/*

4 3
1 2
1 3
2 3
1 4

*/

//cycle
#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll w=0,g=1,b=-1;
ll status[1000],par[1000],f;
vector<ll>v[1000];
void dfs(ll sou)
{
    status[sou]=g;
    ll sz=v[sou].size();
    for(ll i=0;i<sz;i++)
    {
        ll adj=v[sou][i];
        if(status[adj]==w)
        {
            dfs(adj);
        }
        if(status[adj]==g && f==0)
        {
            f=1;
            cout<<"cycle"<<endl;
            return ;
        }
    }
    status[sou]=b;
}

int main()
{
    ll n,e,sou,dtn,x,y;
    cin>>n>>e;
    for(ll i=0;i<e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
    }

    dfs(1);
   if(f==0)
   {
       cout<<"not cycle"<<endl;
   }
}
/*
5 5
1 2
2 3
3 4
4 1
5 1
*/


//connected path
#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll w=0,g=1,b=-1;
ll status[1000],par[1000];
vector<ll>v[1000];
void dfs(ll sou)
{
    status[sou]=g;
    ll sz=v[sou].size();
    for(ll i=0;i<sz;i++)
    {
        ll adj=v[sou][i];
        if(status[adj]==w)
        {
            dfs(adj);
        }
    }
    status[sou]=b;
}
int main()
{
    ll n,e,sou,dtn,x,y;
    cin>>n>>e;
    for(ll i=0;i<e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    ll cnt=0;
    for(ll i=1;i<=n;i++)
    {
        if(status[i]==w)
        {
            cnt++;
            dfs(i);
        }
    }
    cout<<cnt<<endl;
}

/*
9 8
1 2 2 3 3 1
4 5 5 6 6 4
7 8 8 9
*/
