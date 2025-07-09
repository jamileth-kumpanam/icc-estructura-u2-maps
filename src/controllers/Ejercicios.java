package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        return map1.equals(map2);
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }
        return null;
    }

    /**
     * Cuenta la frecuencia de cada caracter en la cadena recibida y
     * muestra el resultado por consola.
     */
    public void contarCaracteres(String texto) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        for (char c : texto.toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }
        System.out.println(mapa);
    }

    /**
     * Verifica si dos palabras son anagramas.
     * Deben contener las mismas letras con la misma frecuencia.
     */
    public boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : palabra1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : palabra2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        return map1.equals(map2);
    }   
}