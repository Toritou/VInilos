import java.util.Scanner;

class VinilosFinal {
    private String[] vinilos; // almacenar los nombres
    private static final int CANTIDAD_MAXIMA = 100; // máximo de vinilos
    private int cantidadVinilos; // Contador

    public VinilosFinal() {
        this.vinilos = new String[CANTIDAD_MAXIMA]; // array de vinilos
        this.cantidadVinilos = 0; // iniciar contador
    }

    public void agregarVinilo(String viniloNuevo) {
        if (this.cantidadVinilos < CANTIDAD_MAXIMA) {
            this.vinilos[cantidadVinilos] = viniloNuevo; // agregar nombres al array
            cantidadVinilos++;
            System.out.println("El disco se guardó en la colección :)");
        } else {
            System.out.println("La colección está llena");
        }
    }

    public int cantidadVinilos() {
        return this.cantidadVinilos; // Cantidad de vinilos actual
    }

    public int espaciosDisponibles() {
        return CANTIDAD_MAXIMA - this.cantidadVinilos; // Espacios disponibles
    }

    public static void main(String[] args) {
        VinilosFinal coleccion = new VinilosFinal(); // Instancia la colección de vinilos
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre del vinilo (o escriba 'salir' para terminar):");
            String nombreVinilo = scanner.nextLine(); // Lee el nombre del vinilo desde la entrada del usuario

            if (nombreVinilo.equalsIgnoreCase("salir")) {
                break; // Sale del bucle si el usuario escribe salir
            }

            coleccion.agregarVinilo(nombreVinilo); // Agrega el vinilo a la colección
        }

        scanner.close(); // Cierra el objeto Scanner

        System.out.println("Cantidad de vinilos: " + coleccion.cantidadVinilos());
        System.out.println("Espacios disponibles: " + coleccion.espaciosDisponibles());
    }
}
