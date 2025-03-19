---
title: 'Documentación del Proyecto - Convertir String a camelCase'
disqus: hackmd
---

# 🏆 Convert String to camelCase

![downloads](https://img.shields.io/github/downloads/atom/atom/total.svg)
![build](https://img.shields.io/appveyor/ci/:user/:repo.svg)
![chat](https://img.shields.io/discord/:serverId.svg)

Este documento describe la implementación de un programa en **Java** que convierte cadenas de texto en formato `camelCase`.

---

## 📌 Contenidos

[TOC]

---

## 📖 Guía de Uso

Para utilizar el código y probar su funcionamiento, sigue estos pasos:

1. **Descargar el código fuente:**
    - 🔗 [Descargar ZIP](https://github.com/JoseGlezHerrera/Convert-string-to-camel-case/archive/refs/heads/main.zip)
    - 📂 O clonar el repositorio en GitHub:
      ```sh
      git clone https://github.com/JoseGlezHerrera/Convert-string-to-camel-case.git
      ```
2. **Abrir en tu IDE** favorito (Eclipse, IntelliJ, VS Code).
3. **Ejecutar `Main.java`** para probar el programa.
4. **Ejecutar `SolutionTest.java`** para validar con **JUnit**.

---

## 📝 Enunciado del Problema

El ejercicio consiste en transformar una cadena de texto en formato `camelCase`, eliminando guiones (`-`) y guiones bajos (`_`), y capitalizando cada palabra excepto la primera.

🔗 [Problema original en Codewars](https://www.codewars.com/kata/517abf86da9663f1d2000003)

### 🏷️ Ejemplo de Entrada y Salida

| Entrada                 | Salida              |
|-------------------------|---------------------|
| `"the-stealth-warrior"` | `"theStealthWarrior"` |
| `"The_Stealth_Warrior"` | `"TheStealthWarrior"` |
| `"The_Stealth-Warrior"` | `"TheStealthWarrior"` |

---

## 🛠️ Implementación en Java

### 📌 `Main.java` (Ejecutar el programa)

```java
public class Main {
    public static void main(String args[])
    {
        Solution s = new Solution();
        System.out.println(s.toCamelCase("the_Stealth_Warrior"));
    }
}
```

---

### 📌 `Solution.java` (Conversión a `camelCase`)

```java
import java.lang.StringBuilder;

public class Solution {
    /**
     * Método para convertir un String en formato "camelCase"
     * @param s String a convertir
     * @return String convertido a camelCase
     * @examples
     * "the-stealth-warrior" -> "theStealthWarrior"
     * "The_Stealth_Warrior" -> "TheStealthWarrior"
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
```

### 📌 Explicación del Código:
1. **Separa** el string en palabras usando `"_"` y `"-"` como delimitadores.
2. **Añade la primera palabra sin cambios**.
3. **Convierte la primera letra de cada palabra restante en mayúscula**.
4. **Concatena todas las palabras** para formar el resultado en `camelCase`.



## ❓ Apéndice y FAQ

:::info
**¿Encuentras este documento incompleto?**  
Déjame un comentario y lo mejoraré. 🚀
:::

📌 **Autor:** Jose Carlos González Herrera  
📌 **Proyecto:** Convertir cadenas a `camelCase`  
📌 **Fecha:** 19/03/2025

🔗 **Repositorio en GitHub:** [Descargar o clonar](https://github.com/JoseGlezHerrera/Convert-string-to-camel-case)

###### 🏷️ Etiquetas: `Java` `camelCase`  `Documentation`