package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        //variable dato de tipo IAccesoDatos, asignamos un objeto de la clase
        //ImplementacionMySql
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();
        
        imprimir(datos);
        
        //reutilizamos la variable dato de tipo IAccesoDatos, 
        //asignamos un objeto de la clase
        //ImplementacionOracle
        datos = new ImplementacionOracle();
        datos.listar();
        
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
