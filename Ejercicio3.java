
public class Ejercicio3 {
    public static void main(String[] args) {
        // Parte 1
        System.out.println(sum(1, 2, 3));
        // Parte 2
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        System.out.println(miCoche.puertas);
    }

    static int sum(int a, int b, int c) {
        return a + b +c;
    }
}

//Parte 2
class Coche {
    int puertas = 4;
    public void aumentarPuerta() {
        this.puertas = this.puertas + 1;
    }
}

