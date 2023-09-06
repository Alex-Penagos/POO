package pkg060923;

import exercise.Persona;

public class Main {

    public static void main(String[] args) {
        
        Persona[] arrayPerson = new Persona[3];
        
        //Persona person = new Persona("Alex", "Penagos", "1137674231");
        //Persona2 person2 = new Persona2("Joseph", "Valencia", "1137674231");
        
        arrayPerson[0] = new Persona("Alex", "Penagos", "1137674231");
        arrayPerson[0] = new Persona("Joseph", "Valencia", "1324767311");
        arrayPerson[0] = new Persona("", "", "");
        System.out.println("-------------------");
        System.out.println(person.getFirstName());
        System.out.println(person.getLasName());
        System.out.println(person.getDocument());
        System.out.println("-------------------");
        
        person.setFirstName("Joseph");
        
        System.out.println("-------------------");
        System.out.println(person.getFirstName());
        System.out.println(person.getLasName());
        System.out.println(person.getDocument());
        System.out.println("-------------------");
       
        

    }

}
