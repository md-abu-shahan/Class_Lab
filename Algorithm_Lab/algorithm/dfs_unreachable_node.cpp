#include<bits/stdc++.h>
using namespace std;
#define ll long long
vector<ll>v[100005];
bool visited[100005];
ll c=0;ll n,e,x,y,start;
void dfs(ll s)
{
    visited[s]=true;
    ll sz=v[s].size();
    for(ll i=0;i<sz;i++)
    {
        if(visited[v[s][i]]==false)
        {
            visited[v[s][i]]=true;
            dfs(v[s][i]);
        }
    }
}

void search()
{
    for(ll i=1;i<=n;i++)
       if( visited[i]==true )
        c++;
}

int main()
{
    cin>>n>>e;
    for(ll i=0;i<e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    cin>>start;
    dfs(start);
    search();
    cout<<n-c<<endl;
}
