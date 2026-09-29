/**
 * Subclase concreta que representa a un Vendedor.
 * Hereda de la clase abstracta Empleado.
 * 
 * En la rama main, la clase Vendedor debe usar por defecto la ComisionEstandar.
 */
public class Vendedor extends Empleado {

    /**
     * Constructor por defecto que asigna la estrategia ComisionEstandar.
     *
     * @param nombre Nombre del vendedor.
     * @param ventasMes Monto total de ventas realizadas en el mes.
     */
    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    /**
     * Constructor que permite inyectar una estrategia de comisión personalizada.
     *
     * @param nombre Nombre del vendedor.
     * @param ventasMes Monto total de ventas realizadas en el mes.
     * @param estrategia Estrategia de comisión a aplicar.
     */
    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    /**
     * Implementación polimórfica de mostrarDetalle.
     * Imprime el nombre, la venta total y el cálculo polimórfico de la comisión obtenida.
     */
    @Override
    public void mostrarDetalle() {
        double comision = (this.estrategia != null) ? this.estrategia.calcularComision(this.ventasMes) : 0.0;
        System.out.println("=============================================");
        System.out.println("            DETALLE DEL VENDEDOR             ");
        System.out.println("=============================================");
        System.out.println("Nombre del Empleado : " + this.nombre);
        System.out.printf("Ventas del Mes      : $%.2f%n", this.ventasMes);
        System.out.printf("Comisión Obtenida   : $%.2f%n", comision);
        System.out.println("Estrategia Aplicada : " + (this.estrategia != null ? this.estrategia.getClass().getSimpleName() : "Ninguna"));
        System.out.println("=============================================");
    }
}
