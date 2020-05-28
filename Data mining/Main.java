#include<iostream>
using namespace std;
int main()
{
  int n,o=0,e=0,t;
  std::cin>>n;
  while(n>0){
    t=n%10;
  	n=n/10;
    if(t%2==0)
      e=e+t;
    else
      o=o+t;
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
    
  //Type your code here.
}