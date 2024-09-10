class Supervisor extends Empleado {
    private String sector;

    public Supervisor(String nombre, int edad, double sueldo, String sector) {
        super(nombre, edad, sueldo);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void supervisarEmpleado(Empleado empleado) {
        System.out.println("Supervisor " + getNombre() + " está supervisando al empleado " + empleado.getNombre());
    }
}
