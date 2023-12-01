/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator.notifier;

/**
 *
 * @author crisj
 */
public class WhatsAppDecorator extends NotifierDecorator{
    private int number;
    
    public WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message){
        System.out.println("Notificación enviada por WhatsApp al número " + number);
        super.send(message);
    }
}
