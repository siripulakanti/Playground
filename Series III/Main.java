#include<iostream>
int main()
{
  int n,i=1,t=6;
  std::cin>>n;
  do{
    std::cout<<t<<" ";
    t=t+5*i;
    i++;
  }while(i<=n);
}