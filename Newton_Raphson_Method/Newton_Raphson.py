def f(x,a3,a2,a1,a0):
    return a3*x*x*x+a2*x*x+a1*x+a0

def f_(x,a3,a2,a1):
    return ((3*a3*x*x)+(a2*2*x)+a1)

def main():
    a3=int(input("Enter the value of a3 : "))
    a2=int(input("Enter the value of a2 : "))
    a1=int(input("Enter the value of a1 : "))
    a0=int(input("Enter the value of a0 : "))
    x0=float(input("Enter the value of x0 : "))
    E=float(input("Enter the value of E : "))
    while(True):
        fx=f(x0,a3,a2,a1,a0)
        f_x=f_(x0,a3,a2,a1)
        if fx==0 :
            print("Root is :",x0)
            break
            
        x1=(x0-(fx/f_x))
        Error=(x1-x0)/x1
        if(abs(Error)<E):
            print("Root is :",x1)
            break
        else:
            x0=x1
        
    return
main()
    
