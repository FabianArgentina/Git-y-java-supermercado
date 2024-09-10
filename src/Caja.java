class Caja {
    private Empleado empleado;

    public Caja(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double procesarCompra(Cliente cliente, Producto[] productos, int[] cantidades) {
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            int cantidadComprada = cantidades[i];
            total += producto.getPrecio() * cantidadComprada;
            producto.reducirCantidad(cantidadComprada);
        }

        if (cliente.esMayorista()) {
            total *= 0.8; 
        }

        return total;
    }
}
