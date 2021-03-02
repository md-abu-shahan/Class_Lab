#include<bits/stdc++.h>
using namespace std;
#define ll long long
vector<ll>v[1000];
ll la[100],mx=0;
bool vis[100];
queue<ll>q;
void bfs(ll sou)
{
    q.push(sou);
    la[sou]=0;

   while(q.size())
    {
        ll f=q.front();
        q.pop();

        ll sz=v[f].size();
        for(ll i=0;i<sz;i++)
        {
            if(vis[v[f][i]]==0)
            {
                vis[v[f][i]]=1;
                q.push(v[f][i]);

                la[v[f][i]]=la[f]+1;
                mx=max(mx,la[v[f][i]]);
            }
        }
    }
}


int main()
{
    ll n,e,x,y;
    cin>>n>>e;
    for(ll i=1;i<=e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }


    bfs(1);
   for(ll i=1;i<=n;i++)
   {
       if(la[i]==mx)
       {
           cout<<i<<endl;
           return 0;
       }
   }
}


