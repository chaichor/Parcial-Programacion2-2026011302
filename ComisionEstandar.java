/**
 * Implementación de la estrategia de comisión estándar.
 * Retorna el 5% de la venta.
 */
public class ComisionEstandar implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.05;
    }
}
