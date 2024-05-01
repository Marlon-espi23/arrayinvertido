import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        boolean condicionsalida = true;

        do {
            try {
                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                condicionsalida = (tamv >= 2 && tamv <= 16) ? false : true;
            } catch (Exception e) {
                System.out.println("Ocurrió algo, revisar");
                leer.nextLine();
            }
        } while (condicionsalida);

        int[] array = llenado();

        System.out.println("Mostrar array:");
        Mostrar(array);
        
        // Invertir el array
        int[] arrayInvertido = invertirArray(array);
        
        System.out.println("Mostrar array invertido:");
        Mostrar(arrayInvertido);
    }

    public static int[] llenado() {
        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }
     
    public static int Mostrar(int[] a) {
        for (int i : a) {

            System.out.println(i);
        }
        return arreglo;
    }
    
    //cree un metodo "invertirarray" utilizando un enfoque punteros
     //para intercambiar los elementos desde el principio y el final del array
    public static int[] invertirArray(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
        return arr;
    }
}
