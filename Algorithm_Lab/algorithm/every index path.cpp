// every index path

#include<bits/stdc++.h>
using namespace std;
#define ll long long
char mat[100][100];
ll sour,souc,disr,disc,r,c;
ll la[100][100];
queue< pair<ll,ll> >q;

//int movex[]={1, -1, 0, 0};
//int movey[]={0, 0, 1, -1};
//int visited[100][100];

void bfs(ll r, ll c)
{
    q.push(make_pair(r,c));
    la[r][c]=0;

    //visited[r][c]=1;

    while(!q.empty()){
       ll fr=q.front().first;
       ll fc=q.front().second;

       q.pop();

//cout<<mat[fr+1][fc];
       if( mat[fr+1][fc]=='.')
       {
          q.push(make_pair(fr+1,fc));
           mat[fr+1][fc]='*';
           la[fr+1][fc]=la[fr][fc]+1;

       }
       if( mat[fr-1][fc]=='.')
       {
           q.push(make_pair(fr-1,fc));
           mat[fr-1][fc]='*';
           la[fr-1][fc]=la[fr][fc]+1;
       }
        if(  mat[fr][fc+1]=='.')
       {
           q.push(make_pair(fr,fc+1));
           mat[fr][fc+1]='*';
           la[fr][fc+1]=la[fr][fc]+1;
       }
       if( mat[fr][fc-1]=='.')
       {
           q.push(make_pair(fr,fc-1));
           mat[fr][fc-1]='*';
           la[fr][fc-1]=la[fr][fc]+1;
       }

    }

//    for(int i=0; i<4; i++)
//    {
//        int vx = ux + movex[i];
//        int vy = uy + movey[i];
//
//        if(visited[vx][vy]==0 && mat[vx][vy]=='.')
//        {
//            visited[vx][vy]=1;
//            q.push(make_pair(vx,vy));
//            la[vx][vy]=la[ux][uy]+1;
//        }
//    }
//}

}
int main()
{
    cin>>r>>c;
    for(ll i=0;i<r;i++)
        for(ll j=0;j<c;j++)
          cin>>mat[i][j];

    cin>>sour>>souc;
    cin>>disr>>disc;

    mat[sour][souc]='*';
    //mat[disr][disc]='D';

    bfs(sour,souc);

    for(ll i=0;i<r;i++){

            for(ll j=0;j<c;j++)
                cout<<la[i][j] << " ";
        cout << endl;
    }


}
/*
4 4
....
.**.
....
****
0 0
0 3

*/
