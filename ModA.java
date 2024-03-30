package moda;

import java.util.Scanner;

class Bicicleta {
    String color;
    String tipo_estructura;
    String asiento;
    Rueda rueda;
    Cuadro cuadro;

    public Bicicleta(String color, String tipo_estructura, String asiento, Rueda rueda, Cuadro cuadro) {
        this.color = color;
        this.tipo_estructura = tipo_estructura;
        this.asiento = asiento;
        this.rueda = rueda;
        this.cuadro = cuadro;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo_estructura;
    }

    public String getAsiento() {
        return asiento;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    class Rueda {
        int libras;
        int pul_rin;
        int peso;

        public Rueda(int libras, int pul_rin, int peso) {
            this.libras = libras;
            this.pul_rin = pul_rin;
            this.peso = peso;
        }

        public int getRodada() {
            return libras;
        }

        public int getRin() {
            return pul_rin;
        }

        public int getPeso() {
            return peso;
        }
    }

    class Cuadro {
        String material;
        String tipo;
        double tamaño;

        public Cuadro(String material, String tipo, double tamaño) {
            this.material = material;
            this.tipo = tipo;
            this.tamaño = tamaño;
        }

        public String getMaterial() {
            return material;
        }

        public String getTipo() {
            return tipo;
        }

        public double getTamano() {
            return tamaño;
        }
    }
}

public class ModA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el color de la bicicleta");
        String color = entrada.nextLine();
        System.out.println("Ingresa el tipo de bicicleta que es: ");
        String tipo_estructura = entrada.nextLine();
        System.out.println("Ingresa el tipo de asiento: ");
        String asiento = entrada.nextLine();

        System.out.println("Ingresa las libras de la llanta: ");
        int libras = entrada.nextInt();
        System.out.println("Ingresa las pulgadas de rin: ");
        int pul_rin = entrada.nextInt();
        System.out.println("Ingresa el peso de una llanta: ");
        int peso = entrada.nextInt();
        Bicicleta.Rueda rueda = new Bicicleta(color, tipo_estructura, asiento, null, null).new Rueda(libras, pul_rin, peso);

        entrada.nextLine(); // Consume la nueva línea pendiente

        System.out.println("Ingrese el tipo de material del cuadro: ");
        String material = entrada.nextLine();
        System.out.println("Ingrese el tipo de bicicleta que es: ");
        String tipoCuadro = entrada.nextLine();
        System.out.println("Ingresa el tamaño de la bicicleta: ");
        double tamaño = entrada.nextDouble();
        Bicicleta.Cuadro cuadro = new Bicicleta(color, tipo_estructura, asiento, null, null).new Cuadro(material, tipoCuadro, tamaño);

        Bicicleta bici = new Bicicleta(color, tipo_estructura, asiento, rueda, cuadro);

        System.out.println("Color: " + bici.getColor());
        System.out.println("Tipo de estructura: " + bici.getTipo());
        System.out.println("Tipo de asiento: " + bici.getAsiento());

        System.out.println("Libras de cada llanta: " + bici.getRueda().getRodada() + " psi");
        System.out.println("Tamaño del rin: " + bici.getRueda().getRin() + " pulgadas");
        System.out.println("El peso de una llanta es de: " + bici.getRueda().getPeso() + " kg");

        System.out.println("Material del cuadro: " + bici.getCuadro().getMaterial());
        System.out.println("Tipo de bicicleta: " + bici.getCuadro().getTipo());
        System.out.println("El tamaño de la bicicleta: " + bici.getCuadro().getTamano() + " cm");
    }
}

