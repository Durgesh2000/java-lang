#include<iostream>
using namespace std;

template<class T>
 T Add(T i ,T j)
{
    T ans;
    ans = i + j;
    return ans;
}



int main()
{
    int a = 10, b = 11, iret = 0;
    float x = 90.0f, y = 67.0f, fret = 0.0f;
    double p = 90.1, q = 67.8, dret = 0.0;
   
    dret = Add(p,q);
    iret = Add(a,b);
    fret = Add(x,y);
    
    cout<<"ADditon of interger :"<<iret<<"\n";
    cout<<"ADditon of float :"<<fret<<"\n";
    cout<<"ADditon of double :"<<dret<<"\n";

    return 0;
}