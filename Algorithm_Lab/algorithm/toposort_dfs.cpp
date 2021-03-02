#include<bits/stdc++.h>
using namespace std;
#define ll long long
vector<ll>v[100];
ll s[100],f[100],arr[100];
ll w=0,g=1,b=-1,t=0;
void dfs(ll sou)
{
    ++t;
    arr[sou]=g;
    s[sou]=t;
    ll sz=v[sou].size();
    for(ll i=0;i<sz;i++)
    {
        ll adj=v[sou][i];
        if(arr[adj]==w)
        {
            dfs(adj);
        }
    }
    ++t;
    f[sou]=t;
    arr[sou]=b;
}

int main()
{
    ll n,e,u,x;
    cin>>n>>e;
    for(ll i=0;i<e;i++)
    {
        cin>>u>>x;
        v[u].push_back(x);
        //v[x].push_back(u);
    }
    for(ll i=1;i<=n;i++)
    {
        if(arr[i]==w)
            dfs(i);
    }


    for(ll i=1;i<=n;i++)
    {
        cout<<"s = "<<s[i]<<" "<<"f = "<<f[i]<<endl;
    }
    vector< pair<ll,ll> >p;
    for(ll i=1;i<=n;i++)
    {
       p.push_back(make_pair(f[i],i));
    }
    sort(p.begin(),p.end());

for(ll i=n-1;i>=0;i--)
{
    cout<<p[i].second<<endl;
}


}
