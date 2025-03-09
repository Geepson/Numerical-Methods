
def f(x,a3,a2,a1,a0):

    return (a3*(x**3))+(a2*(x**2))+(a1*x)+a0

def main():
    a3=int(input("Enter the vale 0f a3 :"))
    a2=int(input("Enter the value of a2 :"))
    a1=int(input("Enter the value of a1 :"))
    a0=int(input("Enter the value of a0 :"))
    xu=int(input("Enter the value of xu :"))
    xl=int(input("Enter the value of xl :"))
    E=float(input("Enter the value of E :"))
    while(True):
        xm=(xu+xl)/2
        fxl=f(xl,a3,a2,a1,a0)
        fxu=f(xu,a3,a2,a1,a0)
        fxm=f(xm,a3,a2,a1,a0)
        if(fxl*fxm==0):
            print("Root is :",xm)
            break
        elif(fxl*fxm<0):
            xu=xm
        else:
            xl=xm   
            
        Era=(xu-xl)/xu
        if(abs(Era)<E):
            print("Root is :",xm)
            break
    
main()        
             
        

        

    
    