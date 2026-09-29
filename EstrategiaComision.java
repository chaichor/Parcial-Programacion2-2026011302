/**
 * Interfaz que define la estrategia para el cálculo de comisiones sobre ventas.
 * Implementa el Patrón de Diseño Strategy.
 */
public interface EstrategiaComision {
    /**
     * Calcula la comisión correspondiente en base al monto de venta proporcionado.
     *
     * @param montoVenta Monto total de la venta realizada.
     * @return El valor de la comisión calculada.
     */
    double calcularComision(double montoVenta);
}
