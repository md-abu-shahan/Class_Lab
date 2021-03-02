//GRAPH
//adjecancyMatrix

//Unweighted
#include<bits/stdc++.h>
using namespace std;
int a[6][6];
int main()
{
    int e,i,j,u,v,n,c;
    cin>>n>>e;

    for(i=0; i<e; i++)
    {
        cin>>u>>v>>c;

        a[u][v]=c;
        a[v][u]=c;

    }
    for(i=1; i<=n; i++)
    {
        for(j=1; j<=n; j++)
            cout<<a[i][j]<<"  ";
        cout<<endl;
    }

}

