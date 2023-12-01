package Factories;

import Tarjetas.TarjetaBasica;
import Tarjetas.TarjetaCredito;

public class TarjetaBasicaFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaBasica();
    }
}