package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //bloque de inicializacion estatico. Se ejecuta una sola vez cuando
        //se carga la clase en memoria
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es un atributo estatico, genera un error
    }
    
    { //Bloque de inicializacion no estatico (contexto dinamico). Se ejecuta
        //cada vez que la clase es instanciada
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersonas++; //incrementamos el atributo
    }
    
    //los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
