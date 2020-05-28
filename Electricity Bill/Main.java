#include<iostream>
using namespace std;
int main()
{
  int x,i;
  std::cin>>x;
  if(x<=200)
    i=1;
  if(200<x && x<=400)
    i=2;
  if(400<x && x<=600)
    i=3;
  if(x>600)
    i=4;
  switch(i){
    case 1:
      std::cout<<"Rs."<<x/2;
  	   break;
    case 2:
      std::cout<<"Rs."<<x*0.65+100;
      break;
    case 3:
      std::cout<<"Rs."<<x*0.80+200;
      break;
    case 4:
      std::cout<<"Rs."<<x*1.25+425;
      break;
  }
  
  //Type your code here.
}