
#include<bits/stdc++.h>
using namespace std;
struct data
{
    int ee,cc;
    data();
    data(int e,int c)
    {
        ee=e;
        cc=c;
    }
};
vector<data> edge[100];

int main()
{
    int u,v,e,n,c;
    cin>>n>>e;
    for(int i=0; i<e; i++)
    {
        cin>>u>>v>>c;
        edge[u].push_back(data(v,c));
    }
    for(int i=1; i<=n; i++)
    {
        int sz=edge[i].size();
        cout<< i <<"->";
        for(int j=0; j<sz; j++)
        {
            cout<<edge[i][j].ee<<"("<<edge[i][j].cc<<") ";
        }
        cout<<endl;
    }

}
