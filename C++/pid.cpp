#include <stdio.h>
#include <unistd.h>
#include <math.h>

int main() {
    int cat1 = 3;
    int cat2 = 4;

    pid_t pid = fork();

    if (pid < 0) {
        perror("Errore nella creazione del processo figlio");
        return 1;
    } else if (pid == 0) {
        printf("Processo figlio: calcolo del perimetro\n");
        double ipotenusa = sqrt(cat1 * cat1 + cat2 * cat2);
        double perimetro = cat1 + cat2 + ipotenusa;
        printf("Perimetro del triangolo: %.2f\n", perimetro);
    } else {
        printf("Processo padre: calcolo dell'area\n");
        double area = (cat1 * cat2) / 2.0;
        printf("Area del triangolo: %.2f\n", area);
    }

    return 0;
}
