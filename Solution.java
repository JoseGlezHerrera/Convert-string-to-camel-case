import java.lang.StringBuilder;
public class Solution {
    /**
     * Método para convertir un String en el fotmato "camelCase"
     * @param s En la "s" se le pasa el String a convertir
     * @return String en camelCase
     * @examples
     * "the-stealth-warrior" gets converted to "theStealthWarrior"
     * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
     */
   public static String toCamelCase(String s){
        StringBuilder resultado = new StringBuilder();
        String[] palabras = s.split("[-_]");
        resultado.append(palabras[0]);

        for (int i = 1; i < palabras.length; i++) {
            resultado.append(Character.toUpperCase(palabras[i].charAt(0)))
                    .append(palabras[i].substring(1));
    }
        return resultado.toString();
}
}