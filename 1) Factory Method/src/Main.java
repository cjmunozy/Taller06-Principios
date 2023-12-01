import Factories.TarjetaBasicaFactory;
import Factories.TarjetaCreditoFactory;
import Factories.TarjetaPremiumFactory;
import Factories.TarjetaVIPFactory;
import Tarjetas.TarjetaCredito;

public class Main {
    public static void main(String[] args) {
        TarjetaCreditoFactory basicaFactory = new TarjetaBasicaFactory();
        TarjetaCredito tarjetaBasica = basicaFactory.crearTarjetaCredito();
        tarjetaBasica.mostrarDetalles();

        TarjetaCreditoFactory premiumFactory = new TarjetaPremiumFactory();
        TarjetaCredito tarjetaPremium = premiumFactory.crearTarjetaCredito();
        tarjetaPremium.mostrarDetalles();

        TarjetaCreditoFactory vipFactory = new TarjetaVIPFactory();
        TarjetaCredito tarjetaVIP = vipFactory.crearTarjetaCredito();
        tarjetaVIP.mostrarDetalles();
    }
}
