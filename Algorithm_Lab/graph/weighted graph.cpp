#include<bits/stdc++.h>
using namespace std;

struct data
{
    int n2,cost;
    data(int v,int c)
    {
        n2=v;
        cost=c;
    }
};
vector<data>a[100];
int main()
{
    int n,e,u,v,c;
    cin>>n>>e;
    for(int i=0; i<e; i++)
    {
        cin>>u>>v>>c;
        a[u].push_back(data(v,c));
        a[v].push_back(data(u,c));
    }
    cout<<endl;
    for(int i=1; i<=n; i++)//if source=1(staring node=1)
    {
        int s=a[i].size();
        for(int j=0; j<s; j++)
                cout<<i<<" "<<a[i][j].n2<<" "<<a[i][j].cost<<endl;
        cout<<endl;
    }
}
