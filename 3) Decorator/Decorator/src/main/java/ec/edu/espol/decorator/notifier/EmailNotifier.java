/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.decorator.notifier;

/**
 *
 * @author crisj
 */
public class EmailNotifier implements Notifier{
    private String mail;

    public EmailNotifier(String mail) {
        this.mail = mail;
    }
    
    @Override
    public void send(String message) {
        System.out.println("Notificación enviada al correo " + mail);
        System.out.println("El contenido de la notificación es:");
        System.out.println(message);
    }
}
