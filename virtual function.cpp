#include<iostream>
using namespace std;
class car
{	public:
	virtual	void velocity()=0;
	};
	class bus:public car
	{
		public:
			void velocity()
			{
				float v,u,a,t;
				cout<<"Enter the values of u,a,t";
				cin>>u>>a>>t;
				v=u+a*t;
				cout<<"velocity = "<<v;
			}
		};
		int main()
		{
			bus ob;
			car *ob1;
		    ob1=&ob;
			ob1->velocity();
			return 0;
		}
