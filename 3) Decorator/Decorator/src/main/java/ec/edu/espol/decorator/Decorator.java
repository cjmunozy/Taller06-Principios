/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.decorator;

import ec.edu.espol.decorator.notifier.*;

/**
 *
 * @author crisj
 */
public class Decorator {

    public static void main(String[] args) {
        System.out.println("Prueba de Notifier");
        StringBuilder sb = new StringBuilder();
        sb.append("Estimado cliente,");
        sb.append(" le recordamos que el plazo para pagar su crédito está por vencer.");
        sb.append("\nSu tiempo límite es de 7 días a partir de hoy.");
        Notifier notifier = new EmailNotifier("abc@gmail.com");
        notifier = new NotifierDecorator(notifier);
        notifier = new SMSDecorator(notifier);
        notifier = new WhatsAppDecorator(notifier);
        notifier = new SignalDecorator(notifier);
        notifier = new WireDecorator(notifier);
        notifier = new TelegramDecorator(notifier);
        notifier.send(sb.toString());
    }
}
