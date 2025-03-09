#include <stdio.h>
#include <math.h>
int a3, a2, a1, a0;
float f(float);
int main()
{
    float xl, xm, xu, fxl, fxm, fxu, E, Era;

    printf("Enter the value of a3, a2, a1 and a0 :");
    scanf("%d %d %d %d", &a3, &a2, &a1, &a0);
    printf("Enter the value of xl and xu and Error: ");
    scanf("%f %f %f  ", &xl, &xu, &E);
    while (1)
    {
        xm = (xl + xu) / 2;
        fxl = f(xl);
        fxu = f(xu);
        fxm = f(xm);
        if (fxl * fxm == 0)
        {
            printf("Root is %f", xm);
            break;
        }
        else if (fxl * fxm < 0)
        {
            xu = xm;
        }
        else
        {
            xl = xm;
        }
        Era = (xu - xl) / xu;
        if (fabs(Era) < E)
        {
            printf("Root is %f", xm);
            break;
        }
    }

    return 0;
}

float f(float x)
{
    return a3 * x * x * x + a2 * x * x + a1 * x + a0;
}