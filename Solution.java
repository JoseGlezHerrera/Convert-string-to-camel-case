import java.lang.StringBuilder;
public class Solution {

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