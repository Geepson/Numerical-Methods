#include <stdio.h>
#include <math.h>
float f(float x);
float f_(float x);
int a3, a2, a1, a0;
int main()
{
    float x0, x1, fx, f_x, Error, E;
    printf("Enter the value of a3,a2,a1,a0 :");
    scanf("%d %d %d %d ", &a3, &a2, &a1, &a0);
    printf("Enter the value of x0 and Error :");
    scanf("%f %f", &x0, &E);
    while (1)
    {
        fx = f(x0);
        f_x = f_(x0);
        x1 = (x0 - (fx / f_x));
        Error = ((x1 - x0) / x1);
        if (fx == 0)
        {
            printf("Root is %f", x0);
            break;
        }
        if (fabs(Error) < E)
        {
            printf("Root is %f", x1);
            break;
        }
        else
        {
            x0 = x1;
        }
    }
}
float f(float x)
{
    return a3 * x * x * x + a2 * x * x + a1 * x + a0;
}
float f_(float x)
{
    return 3 * a3 * x * x + 2 * a2 * x + a1;
}
