#include <iostream>
int main() 
{
  int n,sum=0;
  std::cin>>n;
  while(n>0)
  {
    sum = sum * 10 + (n%10);
  	n=n/10;
  }
  std::cout<<sum;
	// Type your code here
	return 0;
}