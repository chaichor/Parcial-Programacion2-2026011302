/**
 * Clase principal para la ejecución del programa.
 * Rama: feature/comision-personalizada
 * 
 * Estudiante: Christian Alessandro Marin Sandoval
 * CIF: 2026011302
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Cálculo de Comisiones de Ventas\n");

        // En la rama feature/comision-personalizada, se asigna la ComisionPersonalizada (14%)
        Vendedor vendedor = new Vendedor("Christian Alessandro Marin Sandoval", 10000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
