package Factories;

import Factories.TarjetaCreditoFactory;
import Tarjetas.TarjetaCredito;
import Tarjetas.TarjetaPremium;

public class TarjetaPremiumFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaPremium();
    }
}