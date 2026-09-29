/**
 * Clase abstracta que modela a un Empleado.
 * Implementa el patrón Strategy para gestionar la comisión de ventas de forma dinámica.
 */
public abstract class Empleado {
    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre Nombre del empleado.
     * @param ventasMes Ventas totales del mes.
     * @param estrategia Estrategia de comisión inicial.
     */
    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    /**
     * Inyección del patrón Strategy: permite cambiar dinámicamente la estrategia de comisión.
     *
     * @param nueva Nueva estrategia de comisión a aplicar.
     */
    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    /**
     * Método abstracto para mostrar los detalles del empleado.
     * Debe ser implementado por las subclases concretas.
     */
    public abstract void mostrarDetalle();

    // Métodos accesores y modificadores (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public EstrategiaComision getEstrategia() {
        return estrategia;
    }
}
