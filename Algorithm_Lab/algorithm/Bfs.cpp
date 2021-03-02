//bfs

#include<bits/stdc++.h>
using namespace std;
vector<int> edge[2505];
int dis[2505],fre[2505],Max,Depth,node;
void Bfs(int source)
{
    queue<int>q;
    int sz,d=0,m,front;
    q.push(source);
    dis[source]=0;
    while(q.size())
    {
        front= q.front();
        q.pop();
        sz=edge[front].size();
        for(int i=0;i<sz;i++)
        {
            int value=edge[front][i];
           // cout<<value<<endl;
            if(dis[value]==-1)
            {
                dis[value]=dis[front]+1;
                q.push(value);
                fre[dis[value]]++;
            }
        }
        for(int i=0;i<node; i++)
        {
            if(fre[i]>Max)
            {
                Max=fre[i];Depth=i;
            }
        }
    }
    return ;}
int main()
{
    int n,y,z,t;
    cin>>node;
    for(int i=0;i<node;i++)
    {
        cin>>n;
        for(int j=0;j<n;j++)
        {
            cin>>y;
            edge[i].push_back(y);
        }
    }

    cin>>t;
    while(t--)
    {
        Max=-1;Depth=0;

        cin>>z;

        if(edge[z].size()==0)
        {
            cout<<"0"<<endl;
        }
        else{
            memset(dis , -1 , sizeof(dis));
            memset(fre , 0 , sizeof(fre));
            Bfs(z);
            cout<<Max<<" "<<Depth<<endl;
        }
    }
}
