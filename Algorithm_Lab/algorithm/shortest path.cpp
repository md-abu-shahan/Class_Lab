//bfs shortest path

#include<bits/stdc++.h>
using namespace std;
#define ll long long
vector<ll>v[1000];
ll la[100],par[100];
bool vis[100];
queue<ll>q;
void bfs(ll sou, ll dtn)
{
    q.push(sou);
    la[sou]=0;

    while(q.size())
    {
        ll f=q.front();
        q.pop();

        if(f==dtn)break;

        ll sz=v[f].size();
        for(ll i=0;i<sz;i++)
        {
            if(vis[v[f][i]]==0)
            {
                vis[v[f][i]]=1;
                q.push(v[f][i]);

                la[v[f][i]]=la[f]+1;
                par[v[f][i]]=f;
            }
        }
    }
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
    ll n,e,x,y;
    cin>>n>>e;
    for(ll i=1;i<=e;i++)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }

    ll sou,dtn;
    cin>>sou>>dtn;
    bfs(sou,dtn);

    cout<<"shortest path weight : "<<la[dtn]<<endl;
    cout<<"shortest path : ";
    path(sou,dtn);
}


/*

10 12
1 2
1 3
1 4
2 6
6 10
3 7
3 8
4 7
7 9
10 9
10 5
5 8
1 10

*/

