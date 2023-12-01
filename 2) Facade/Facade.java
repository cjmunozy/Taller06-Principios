/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman_projects.patronesestructurales;

/**
 *
 * @author USUARIO
 */
public class Facade {
    private ServiceWeb sv;
    private MovilService ms;
    private TelefonicService ts;
    
    public Facade(){
        sv=new ServiceWeb();
        ms=new MovilService();
        ts= new TelefonicService();
    }
    
    
    public void productoStock(Producto p){
        sv.buscarProducto(p);
        ms.buscarProducto(p);
        ts.consultarProducto(p);
        //logic
    }
}
