class Transaccion {
    private Cliente cliente;
    private Producto[] productos;
    private int[] cantidades;
    private double total;
    private Caja caja;

    public Transaccion(Cliente cliente, Producto[] productos, int[] cantidades, double total, Caja caja) {
        this.cliente = cliente;
        this.productos = productos;
        this.cantidades = cantidades;
        this.total = total;
        this.caja = caja;
    }

    public void mostrarDetalles() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Atendido por: " + caja.getEmpleado().getNombre());
        System.out.println("Productos comprados:");
        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            int cantidadComprada = cantidades[i];
            System.out.println("- " + producto.getNombre() + " x" + cantidadComprada + " - $" + producto.getPrecio() * cantidadComprada);
        }
        System.out.println("Total a pagar: $" + total);
    }
}