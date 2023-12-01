/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator.notifier;

/**
 *
 * @author crisj
 */
public class WireDecorator extends NotifierDecorator{
    private int number;
    
    public WireDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message){
        System.out.println("Notificación enviada por Wire al número " + number);
        super.send(message);
    }
}
