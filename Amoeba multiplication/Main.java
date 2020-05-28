#include<iostream>
using namespace std;
int main()
{
  int n,n1=0,t1=0,t2=1;
  std::cin>>n;
   while (n>1) {
        t1 = t2;
        t2 = n1;
        n1 = t1 + t2;
    	n=n-1;
   }
  std::cout<<n1;
}