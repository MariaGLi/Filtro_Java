package filtro_islaninja;

import MVC.Controlador.Controlador;
import MVC.Modelo.DAO;
import MVC.Vista.Vista;

/**
 *@author María Lizarazo
 */
public class Filtro_IslaNinja {

    public static void main(String[] args) {
        DAO dao = new DAO();
        Vista vista = new Vista();
        Controlador controlador =new Controlador(dao, vista);
        
        controlador.iniciar();
    }    
}
