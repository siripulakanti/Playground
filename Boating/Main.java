#include<iostream>
using namespace std;
int main()
{
  int t,a,b,x,y;
  std::cin>>t>>a>>b;
  x=75*a+30*b;
  y=bool(x<=t);
  switch(y){
    case (0):
      std::cout<<"Boat will drow";
      break;
     case (1):
      std::cout<<"Boat is stable";
      break; 
  }
  
  //Type your code here.
}