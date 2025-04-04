package MVC.Vista;

import MVC.Modelo.MisionNinja;
import MVC.Modelo.Ninja;
import java.util.List;
import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);
    
    //Listar ninjas
    public void mostrarNinjas(List<Ninja> ninja){
        System.out.println("Lista de Ninjas:");
        for (Ninja n : ninja){
            System.out.println(n);
        }
    }
    
    //Listar misiones disponibles según un id_ninja especifico
    public void mDisponible(List<MisionNinja> mn) {
        System.out.println("Lista misiones disponibles:");
        for (MisionNinja n : mn){
            System.out.println(n);
        }
    }
    
    public MisionNinja agregarMision(){
        System.out.println("Para agg una mision al ninja digite lo sgte:");
        System.out.println("Id del ninja: ");
        int id_ninja = sc.nextInt();
        System.out.println("Id de la misión: ");
        int id_mision = sc.nextInt();
        System.out.println("Fecha de inicio de la misión: ");
        sc.nextLine();
        String fechaInicio = sc.nextLine();
        System.out.println("Fecha de finalización de la misión: ");
        String fechaFin = sc.nextLine();
        return new MisionNinja(id_ninja, id_mision, fechaInicio, fechaFin);
    }
    
    //Listar misiones completas según un id_ninja especifico
    public void misComp(List<MisionNinja> mn) {
        System.out.println("Lista de misiones completas:");
        for (MisionNinja n : mn){
            System.out.println(n);
        }
    }
}
