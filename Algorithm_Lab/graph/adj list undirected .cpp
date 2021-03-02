#include<bits/stdc++.h>
using namespace std;
vector<int> edge[2505];

int main()
{
    int u,v,e,n;
    cin>>n>>e;
    for(int i=0;i<e;i++)
    {
            cin>>u>>v;
            edge[u].push_back(v);
            edge[v].push_back(u);
    }
    for(int i=1;i<=n;i++)
    {
        int sz=edge[i].size();
        cout<< i <<"->";
        for(int j=0;j<sz;j++)
        {
            cout<<edge[i][j]<<" ";
        }
        cout<<endl;
    }

}
