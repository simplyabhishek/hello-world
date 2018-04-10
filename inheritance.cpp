#include<iostream>
using namespace std;
class area
{
	protected:float x,y;
	public:
		void setlength(float a)
		{
			x=a;
		}
	public:
		void setbreadth(float b)
		{
			y=b;
		}
	};
	class rect:public area
	{
		public:
			float calculate()
			{
			return(x*y);
			}
	};
	int main()
		{
		float areaa,a,b;
	rect ob;
	cout<<"Enter length and breadth";
	cin>>a>>b;
	ob.setlength(a);
	ob.setbreadth(b);
	areaa=ob.calculate();
	cout<<areaa;
return 0;
	}
