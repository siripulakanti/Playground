#include<iostream>
using namespace std;
int main()
{
  int a,b,c,t,l,i;
  std::cin>>a>>b>>c;
  ((a>b && a<c) || (a>c && a<b))?(std::cout<<"The treasure is in box which has number "<<a):(((b>a && b<c) || (b<a && b>c))?(std::cout<<"The treasure is in box which has number "<<b):(std::cout<<"The treasure is in box which has number "<<c));
  (a<b && a<c)?(l=a):((b<c)?(l=b):(l=c));
  for(i=1;i<=l;i++)
    if(a%i==0 && b%i==0 && c%i==0)
      t=i;
  	  i++;
  std::cout<<"\nThe code to open the box is "<<t;
  //Type your code here.
}