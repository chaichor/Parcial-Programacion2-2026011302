/**
 * Clase principal para la ejecución del programa.
 * Rama: main (resolución de conflicto con feature/comision-personalizada)
 * 
 * Estudiante: Christian Alessandro Marin Sandoval
 * CIF: 2026011302
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Cálculo de Comisiones de Ventas\n");

        // Conflicto resuelto: se conserva la llamada a la comisión personalizada (14%)
        Vendedor vendedor = new Vendedor("Christian Alessandro Marin Sandoval", 10000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
