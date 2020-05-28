#include<iostream>
int main()
{
  int m,n,sum=0,i,k;
  std::cin>>m>>n;
  for(k=m;k<=n;k++)
  {
    sum=0;
  for(i=1;i<k;i++)
  {
    {
    if(k%i==0)
      sum=sum+i;
  }
  }
  if(sum==k)
    std::cout<<k<<" " ;
  
  }

}