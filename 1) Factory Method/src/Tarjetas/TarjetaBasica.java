package Tarjetas;

public class TarjetaBasica implements TarjetaCredito {
    @Override
    public void mostrarDetalles() {
        System.out.println("Tarjeta Básica - Costo anual: $X, Límite de crédito: $Y");
    }
}