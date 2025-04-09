package org.example.TP0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        // Création d'un compte avec un solde initial de 100
        BankAccount account = new BankAccount(100, 0.05);

        // Dépôt d'une somme positive
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Le solde doit être 150 après dépôt");

        // Tentative de dépôt d'une somme négative
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10);
        });
        assertEquals("Amount must be positive", exception.getMessage(), "Le message d'erreur doit être 'Amount must be positive'");
    }

    @Test
    void testWithdraw() {
        // Création d'un compte avec un solde initial de 100
        BankAccount account = new BankAccount(100, 0.05);

        // Retrait d'une somme positive et valide
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Le solde doit être 50 après retrait");

        // Tentative de retrait d'une somme négative
        Exception negativeException = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10);
        });
        assertEquals("Amount must be positive", negativeException.getMessage(), "Le message d'erreur doit être 'Amount must be positive'");

        // Tentative de retrait d'une somme supérieure au solde
        Exception insufficientException = assertThrows(IllegalStateException.class, () -> {
            account.withdraw(100);
        });
        assertEquals("Insufficient balance", insufficientException.getMessage(), "Le message d'erreur doit être 'Insufficient balance'");
    }

    @Test
    void testTransfer() {
        // Création de deux comptes
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(50, 0.05);

        // Transfert réussi
        account1.transfer(30, account2);
        assertEquals(70, account1.getBalance(), "Le solde du compte 1 doit être 70 après transfert");
        assertEquals(80, account2.getBalance(), "Le solde du compte 2 doit être 80 après transfert");

        // Tentative de transfert vers un compte null
        Exception nullException = assertThrows(NullPointerException.class, () -> {
            account1.transfer(20, null);
        });
        assertEquals("Other account must not be null", nullException.getMessage(), "Le message d'erreur doit être 'Other account must not be null'");

        // Tentative de transfert avec un solde insuffisant
        Exception insufficientException = assertThrows(IllegalStateException.class, () -> {
            account1.transfer(100, account2);
        });
        assertEquals("Insufficient balance", insufficientException.getMessage(), "Le message d'erreur doit être 'Insufficient balance'");
    }

    @Test
    void testAddInterest() {
        // Création d'un compte avec un solde initial de 1000 et un taux d'intérêt de 5%
        BankAccount account = new BankAccount(1000, 0.05);

        // Ajout des intérêts
        account.addInterest();
        assertEquals(1050, account.getBalance(), "Le solde doit être 1050 après ajout des intérêts");

        // Cas où le taux d'intérêt est nul
        BankAccount zeroInterestAccount = new BankAccount(1000, 0);
        zeroInterestAccount.addInterest();
        assertEquals(1000, zeroInterestAccount.getBalance(), "Le solde ne doit pas changer avec un taux d'intérêt nul");
    }

    @Test
    void testGetBalance() {
        // Création d'un compte avec un solde initial de 100
        BankAccount account = new BankAccount(100, 0.05);

        // Vérification du solde initial
        assertEquals(100, account.getBalance(), "Le solde initial doit être 100");

        // Après un dépôt
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Le solde doit être 150 après dépôt");

        // Après un retrait
        account.withdraw(50);
        assertEquals(100, account.getBalance(), "Le solde doit être 100 après retrait");
    }
}