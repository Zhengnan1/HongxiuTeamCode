x=linspace(0,1,100);
y1=x;
y2=x.^2;
%x为矩阵，我们针对x里面的元素求平方，故为.^,.运算符表示对矩阵元素求运算，以下类似
y3=x.^3;
y4=x.^4;
h=plot(x,y1,'*r',x,y2,'-b',x,y3,'*b',x,y4,'-r')
legend(h,'x','x^2','x^3','x^4')
grid on