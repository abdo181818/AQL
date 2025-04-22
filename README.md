== Rapport des erreurs et corrections - TP1 Tests Unitaires ==

1. Classe: Palindrome.java
   Erreur :
   while (i < j) {
   if (s.charAt(i) != s.charAt(j)) {
   return false;
   }
   j++;  // ❌ Mauvais sens
   i--;
   }
   Correction :
   i++;  // ✅ Avancer i vers le centre
   j--;  // ✅ Reculer j vers le centre

2. Classe: Anagram.java
   Erreur :
   for (int i = 0; i <= s1.length(); i++)
   Correction :
   for (int i = 0; i < s1.length(); i++)  // ✅ Éviter ArrayIndexOutOfBounds

3. Classe: BinarySearch.java
   Erreur :
   while (low < high)
   Correction :
   while (low <= high)  // ✅ Permet de vérifier aussi quand low == high

4. Classe: RomanNumeral.java
   Erreur :
   for (int i = 0; i <= symbols.length; i++)
   Correction :
   for (int i = 0; i < symbols.length; i++)  // ✅ Corrige IndexOutOfBoundsException

5. Classe: FizzBuzz.java
   Erreur :
   if (n <= 1) {
   throw new IllegalArgumentException("n must be positive");
   }
   Correction :
   if (n <= 0) {
   throw new IllegalArgumentException("n must be positive");  // ✅ 1 est valide, pas à rejeter

== Fin du rapport ==
