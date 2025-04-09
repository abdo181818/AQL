package org.example.TP0;

public class Person {

    // Attributs privés représentant le prénom, le nom et l'âge de la personne
    private String firstName;
    private String lastName;
    private int age;

    // Constructeur pour initialiser les attributs
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Méthode pour obtenir le nom complet sous la forme "prénom nom"
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Méthode pour vérifier si la personne est majeure (âge >= 18)
    public boolean isAdult() {
        return age >= 18;
    }

    // Méthode principale pour tester la classe
    public static void main(String[] args) {
        // Création d'une instance de la classe Person
        Person person1 = new Person("Alice", "Dupont", 25);
        Person person2 = new Person("Bob", "Martin", 16);

        // Affichage du nom complet et du statut majeur/mineur pour chaque personne
        System.out.println("Nom complet : " + person1.getFullName());
        System.out.println("Est majeur : " + person1.isAdult());

        System.out.println("Nom complet : " + person2.getFullName());
        System.out.println("Est majeur : " + person2.isAdult());
    }
}
