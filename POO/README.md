# POO

La POO se refiere a la Programación Orientada a Objetos, tambien conocido como OOP (Object Oriented Programming).

## Convenciones

En Java no existe un standard para escribir código, por lo que los desarrolladores que usan esta tecnologia formaron convenciones para organizar y escribir código y cualquiera pueda entenderlo.

1. Cómo nombrar los paquetes.

El paquete principal lleva el nombre de una pagina web escrita al revés y evitando el protocolo y el www. Por ejemplo:

* Tu pagina: www.miprimerapagina.com
* Tu paquete principal: com.miprimerapagina.blog

Todos los paquetes y subpaquetes deben tener el nombre en minuscula.

2. El nombre de todas las clases deben comenzar en Mayuscula y el nombre del archivo debe ser el mismo que el de la clase que almacena. Por ejemplo:

Nuestra clase se llama Persona, por ende nuestro archivo se llamara Persona.java

3. Camel Case es el modo de escritura preferida en Java. Ejemplo de Camel Case.

    - esteEsUnGranEjemploDeComoFuncionaElCamelCase

4. Getters y Setters deben comenzar con la palabra get o set respectivamente y a continuación con el nombre de la variable que se hace referencia. Por ejemplo:
 ```
    private String marca;
    
    // Getter
    public String getMarca(){
        return this.marca;
    }
    
    // Setter
    public void setMarca(String marca){
        this.marca = marca;
    }
 ```
Nota: considerar que los getter y setter deben ser públicos.

5. Los constructores deben ir inmediatamente despues de los atributos y los métodos inmediatamente despues de los constructores. Los getter y setters van hasta el final.