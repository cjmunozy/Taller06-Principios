package Factories;

import Factories.TarjetaCreditoFactory;
import Tarjetas.TarjetaCredito;
import Tarjetas.TarjetaVIP;

public class TarjetaVIPFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaVIP();
    }
}