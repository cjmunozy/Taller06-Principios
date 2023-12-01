package Tarjetas;

import Tarjetas.TarjetaCredito;

public class TarjetaVIP implements TarjetaCredito {
    @Override
    public void mostrarDetalles() {
        System.out.println("Tarjeta VIP - Costo anual: $V, Límite de crédito: $U");
    }
}