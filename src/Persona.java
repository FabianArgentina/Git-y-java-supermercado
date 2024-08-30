class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}



class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}

class Cliente extends Persona {
    private boolean esMayorista;

    public Cliente(String nombre, int edad, boolean esMayorista) {
        super(nombre, edad);
        this.esMayorista = esMayorista;
    }

    public boolean esMayorista() {
        return esMayorista;
    }
}

