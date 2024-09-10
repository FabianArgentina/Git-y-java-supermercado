import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner pregunta = new Scanner(System.in);
        Empleado empleado1 = new Empleado("Ana", 30, 80000);

        System.out.println();
        System.out.println("Es usted un cliente mayorista? seleccione 1:Si o 2:No");
        String respuesta = pregunta.nextLine();

        boolean mayorista = false;
        if (respuesta.equals("1") || respuesta.equalsIgnoreCase("Si")) {
            mayorista = true;
            System.out.println("Muy bien, lo tendremos registrado como mayorista");
        }

        System.out.println("Cual es su nombre para registrarlo?");
        String clienteNombre = pregunta.next();

        Cliente cliente1 = new Cliente(clienteNombre, 45, mayorista);

        Producto[] productos1 = {
            new Producto("Leche", 1.1, 1000),
            new Producto("Pan", 1800, 543),
            new Producto("Fernet", 3000.50, 504380)
        };

        int[] cantidades = new int[productos1.length];
        for (int i = 0; i < productos1.length; i++) {
            System.out.println("¿Cuánta cantidad de " + productos1[i].getNombre() + " desea comprar?");
            cantidades[i] = pregunta.nextInt();
        }

        Caja caja1 = new Caja(empleado1);
        double total = caja1.procesarCompra(cliente1, productos1, cantidades);

        Transaccion transaccion1 = new Transaccion(cliente1, productos1, cantidades, total, caja1);
        transaccion1.mostrarDetalles();

        pregunta.close();
    }
}
