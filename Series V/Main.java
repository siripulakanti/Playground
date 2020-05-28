#include<iostream>
using namespace std;
int main()
{
  int i=11,n,t=1;
  std::cin>>n;
  do{
  std::cout<<i*i<<" ";
    i=i+4;
    t++;
  }while(t<=n);
  //Type your code here.
}