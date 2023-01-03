package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        // List<Persona> personas = personaDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }

//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
        //////////////insertar //////////////////////
        //Insertando un nuevo objeto de tipo Persona
//      Persona personaNueva = new Persona("Leonel", "Messi", "lmesssi@mail.com", "98562312");
//      personaDao.insertar(personaNueva);
        //Modificar un objeto de persona existente
//        Persona personaModificar = new Persona(2, "Isai ", "Salgado", "isalgado@mail.com", "335898");
//        personaDao.actualizar(personaModificar);
        //Eliminar un registro
        Persona personaEliminar = new Persona(3);
        personaDao.eliminar(personaEliminar);

        //Listado Persona
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}
