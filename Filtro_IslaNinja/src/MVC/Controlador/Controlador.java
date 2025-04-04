package MVC.Controlador;

import MVC.Modelo.DAO;
import MVC.Modelo.Mision;
import MVC.Modelo.MisionNinja;
import MVC.Modelo.Ninja;
import MVC.Vista.Vista;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    private DAO dao;
    private Vista vista;
    private Scanner scanner;

    public Controlador(DAO dao, Vista vista) {
        this.dao = dao;
        this.vista = vista;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        
        while (!salir){
            System.out.println("------- Menu principal -------");
            System.out.println("1. Ver Ninjas");
            System.out.println("2. Ver la misión disponible para el ninja");
            System.out.println("3. Ver la misión completada del ninja");
            System.out.println("4. Agreagar una misión a un ninja");
            System.out.println("5. Ingrese fecha de finalización de una misión completada");
            System.out.println("6. Mostrar todas las misiones completadas");
            System.out.println("0. Salir.");
            
            try{
                System.out.println("Selecciona una de las opciones: ");
                opcion = sn.nextInt();
            
                switch (opcion){
                    case 1 -> {
                        List<Ninja> ninja = dao.obtenerTodos();
                        vista.mostrarNinjas(ninja);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Ingrese el id del ninja que desea saber si tiene una misión disponible: ");
                        int idNinja = sn.nextInt();
                        List<MisionNinja> mn = dao.misionDisponible(idNinja);
                        vista.mDisponible(mn);
                        break;
                    }
                    case 3 -> {
                        /*Usuario usuarioActualizado = usuarioVista.actusuario();
                        usuarioDAO.actualizar(usuarioActualizado);
                        System.out.println("Usuario actualizado!");
                        break;*/
                    }
                    case 4 -> {
                        MisionNinja nuevaMision = vista.agregarMision();
                        dao.agregar(nuevaMision);
                        //System.out.println("Mision agregada!");
                        break;
                        /*System.out.println("Ingrese el ID del usuario a eliminar:");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        usuarioDAO.eliminar(id);
                        System.out.println("Usuario eliminado!");
                        break;*/
                    }
                    case 5 ->{
                    
                    }
                    case 6 ->{
                        System.out.println("Ingrese el id del ninja que desea saber si ya completó la mision: ");
                        int idNinja = sn.nextInt();
                        List<MisionNinja> mn = dao.misionDisponible(idNinja);
                        vista.mDisponible(mn);
                        break;
                    }
                    case 0 -> {
                        salir = true;
                    }

                    default -> {
                        System.out.println("Ojo, las opciones son entre 1 y 6");
                    }
                }                
            }catch(InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        System.out.println("Fin del menú");
    }
}
