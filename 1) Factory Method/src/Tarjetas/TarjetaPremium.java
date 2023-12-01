package Tarjetas;

import Tarjetas.TarjetaCredito;

public class TarjetaPremium implements TarjetaCredito {
    @Override
    public void mostrarDetalles() {
        System.out.println("Tarjeta Premium - Costo anual: $Z, Límite de crédito: $W");
    }
}