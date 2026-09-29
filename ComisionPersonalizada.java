/**
 * Implementación de la estrategia de comisión personalizada.
 * Retorna el (5 + N)% de la venta, donde N es la cantidad de letras
 * del primer nombre del estudiante ("Christian" -> N = 9 letras).
 * 
 * Por lo tanto, porcentaje = (5 + 9)% = 14% de la venta.
 */
public class ComisionPersonalizada implements EstrategiaComision {

    // N = 9 ("Christian") -> (5 + 9)% = 14%
    private static final double PORCENTAJE = 0.14;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
