#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>

int main() {
    char message[1000];
    printf("Enter a message: ");
    fgets(message, sizeof(message), stdin);
    message[strcspn(message, "\n")] = 0; // remove newline

    srand(time(0));
    int shift = rand() % 94 + 1; // random shift between 1–94 (printable ASCII range)

    printf("Random shift value: %d\n", shift);

    // Encrypt
    for (int i = 0; message[i] != '\0'; i++) {
        if (message[i] >= 32 && message[i] <= 126) { // printable ASCII range
            message[i] = 32 + ((message[i] - 32 + shift) % 95);
        }
    }

    printf("Encrypted: %s\n", message);

    // Decrypt
    for (int i = 0; message[i] != '\0'; i++) {
        if (message[i] >= 32 && message[i] <= 126) {
            message[i] = 32 + ((message[i] - 32 - shift + 95) % 95);
        }
    }

    printf("Decrypted: %s\n", message);
    return 0;
}
