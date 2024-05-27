#include <stdio.h>

// Definizione del capitale iniziale
float saldo = 1000.0; // Esempio di capitale iniziale: 1000 euro

// Funzione per eseguire un prelievo
void prelievo(float amount) {
    if (amount > 0 && amount <= saldo) {
        saldo -= amount;
        printf("Prelievo di %.2f euro effettuato con successo.\n", amount);
    } else {
        printf("Errore nel prelievo di %.2f euro. Importo non valido o fondi insufficienti.\n", amount);
    }
}

// Funzione per effettuare un versamento in contanti
void versamento(float amount) {
    if (amount > 0) {
        saldo += amount;
        printf("Versamento di %.2f euro effettuato con successo.\n", amount);
    } else {
        printf("Errore nel versamento di %.2f euro. Importo non valido.\n", amount);
    }
}

// Funzione per effettuare il saldo del conto
void saldoConto() {
    printf("Il saldo attuale del conto è: %.2f euro\n", saldo);
}

int main() {
    int scelta;
    float amount;

    do {
        // Menu di scelta
        printf("\nMenu:\n");
        printf("1. Prelievo\n");
        printf("2. Versamento\n");
        printf("3. Saldo del conto\n");
        printf("0. Uscita\n");
        printf("Seleziona un'opzione: ");
        scanf("%d", &scelta);

        switch (scelta) {
            case 1:
                printf("Inserisci l'importo da prelevare: ");
                scanf("%f", &amount);
                prelievo(amount);
                break;
            case 2:
                printf("Inserisci l'importo da versare: ");
                scanf("%f", &amount);
                versamento(amount);
                break;
            case 3:
                saldoConto();
                break;
            case 0:
                printf("Uscita dal programma.\n");
                break;
            default:
                printf("Scelta non valida. Riprova.\n");
        }
    } while (scelta != 0);

    return 0;
}
