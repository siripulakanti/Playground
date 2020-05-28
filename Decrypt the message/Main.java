#include<iostream>
int main()
{
  int n1,n2,sum=0,t;
  std::cin>>n1>>n2;
  t=n1+n2;
  for(int i=1;i<t;i++)
    if(t%i==0)
      sum=sum+i;
  if(sum==t)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";

}