package modb;

import java.util.Scanner;

class Bicicleta {
    String color;
    String tipo_estructura;
    String asiento;
    Rueda rueda;
    Cuadro cuadro;

    public Bicicleta(String color, String tipo_estructura, String asiento) {
        this.color = color;
        this.tipo_estructura = tipo_estructura;
        this.asiento = asiento;
        this.rueda = new Rueda();
        this.cuadro = new Cuadro();
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

        public Rueda() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa las libras de la llanta: ");
            this.libras = entrada.nextInt();
            System.out.println("Ingresa las pulgadas de rin: ");
            this.pul_rin = entrada.nextInt();
            System.out.println("Ingresa el peso de una llanta: ");
            this.peso = entrada.nextInt();
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

        public Cuadro() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el tipo de material del cuadro: ");
            this.material = entrada.nextLine();
            System.out.println("Ingrese el tipo de bicicleta que es: ");
            this.tipo = entrada.nextLine();
            System.out.println("Ingresa el tamaño de la bicicleta: ");
            this.tamaño = entrada.nextDouble();
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

public class ModB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el color de la bicicleta");
        String color = entrada.nextLine();
        System.out.println("Ingresa el tipo de bicicleta que es: ");
        String tipo_estructura = entrada.nextLine();
        System.out.println("Ingresa el tipo de asiento: ");
        String asiento = entrada.nextLine();

        Bicicleta bici = new Bicicleta(color, tipo_estructura, asiento);

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
