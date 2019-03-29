
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Ordenacao {
    public static String[] bubbleSort(String[] array) {
        /*boolean troca = true;
        String aux = "";
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i].length() > vetor[i + 1].length()) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }*/
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
               if (array[i].length() < array[menor].length()) {
                  menor = i;
               }
            }
            if (menor != fixo) {
              String t = array[fixo];
              array[fixo] = array[menor];
              array[menor] = t;
            }
        }
        return array;
    }
    
    public static String[] selectionSort(String[] array) { 
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
               if (array[i].length() < array[menor].length()) {
                  menor = i;
               }
            }
            if (menor != fixo) {
              String t = array[fixo];
              array[fixo] = array[menor];
              array[menor] = t;
            }
        }
        /*for(int y = 0; y < array.length; y++){
            System.out.println(array[y]);
        }*/
       return array;
    }
    
    public static String[] insertionSort(String[] vetor) {
        /*int j;
        String key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i].length() > key.length()); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }*/
        
        int j;
        String key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i].length() > key.length()); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
        return vetor;
    }
    
    
    private static void merge(String arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        String L[] = new String [n1]; 
        String R[] = new String [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].length() <= R[j].length()) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public static String[] mergeSort(String arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        }
        return arr;
    }
}
