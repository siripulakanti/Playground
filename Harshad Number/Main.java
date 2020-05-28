#include<iostream>
using namespace std;
int main()
{
  int  n,t,sum=0,rev;
  std::cin>>n;
  rev=n;
  while(n>0)
  {
    t=n%10;
  	n=n/10;
  	sum=sum+t;
  }
  if(rev%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
    
    
  //Type your code here.
}