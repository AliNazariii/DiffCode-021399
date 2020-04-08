#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    int a[100];
    int i = 0;
    for ( i; i < n; i++ ) {
        int temp;
        scanf("%d", &temp);
        a[i] = temp;
    }
    i = 0;
    for ( i; i < n; i++) {
        if (a[i] < 4) {
            int t = 0;
            for ( t; t < a[i]; t++) {
                printf("%c", '*');
            }
        }
        else {
            printf("%c", '*');
        }
        if (i < n - 1) {
            printf("\n");
        }
    }
    return 0;
}

