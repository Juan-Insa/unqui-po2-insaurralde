package ar.edu.unq.po2.tp3;

public class Respuestas {
	static String a = "abc";
	static String s = a;
	static String t;
	static Integer unValor;
	
	String getA() {
		return a;
	}
	void setA(String a) {
		this.a = a;
	}
	String getS() {
		return s;
	}
	void setS(String s) {
		this.s = s;
	}
	String getT() {
		return t;
	}
	void setT(String t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		System.out.println(unValor);
	}
	
	
	/*
	Examinar las expresiones

	Dado el siguiente código:

	    String a = "abc";

		String s = a;

		String t;

	Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:

		● s.length(); -> 3, porque s es equivalente a la variable 'a' que contiene 3 caracteres "abc".

		● t.length(); -> error, devuelve null porque la variable de instancia t no contiene ningún valor.

		● 1 + a;      ->  1abc, agrega el 1 en la primera posición del String.

		● a.toUpperCase(); -> ABC, todos los caracteres en mayúsculas.

		● "Libertad".indexOf("r"); -> 4, índice de la primera aparición de letra "r" en el String dado.

		● "Universidad".lastIndexOf('i'); -> 2 índice de la última aparición de letra "i" en el String dado.

		● "Quilmes".substring(2,4); -> il, devuelve un String con los caracteres entre las posiciones 2 hasta 4 del String dado.

		● (a.length() + a).startsWith("a"); -> false, startsWith("<char>") indica si la palabra comienza con el caracter dado.

		● s == a; -> true, porque su valor es equivalente, pero no significa que sean el mismo objeto.

		● a.substring(1,3).equals("bc") -> true, el resultado del substring(1,3) es equivalente a "bs".

     
    3. Tipos Primitivos

	1. ¿Qué son los tipos de datos primitivos?

	Un tipo de dato primitivo es predefinido por el lenguaje y se llama con una pabra clave reservada. 
	Los valores primitivos no comparten estado con otros valores primitivos. Los ocho tipos de datos 
	primitivos que contiene java son: byte, short int, long, float, double, boolean y char.

	
	2. ¿Cuál es la diferencia entre un int y un Integer?

	En java, int es un tipo de dato primitivo, no un objeto, almacena el valor binario real para el entero
	que se desea representar. En cambio, Integer es una clase (Wrappers), un puntero que hace referencia a
	una objeto que contiene un entero.

	Los Wrappers como Integer son útiles cuando necesitamos usar nuestra variable en colecciones o queremos
	dejar algún atributo opcional, como un valor nulo, que con un primitivo no es posible.

	Los tipos primitivos son excelentes para cuando no queremos nulos y para operaciones matemáticas, ya que
	ocupan poco espacio en la memoria, mejorando el rendimiento de su aplicación.
	
	
	3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se
	define una de tipo Integer? Haga la prueba en Eclipse

	El valor predeterminado para el tipo de dato primitivo int es 0 (cero). Para Integer, el valor predeterminado
	es null ya que no hace referencia a ningún valor.


	4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
	instancia se define una variable de método.

	En este caso no compila. Las variables locales definidas en un método requieren un valor de inicialización
	antes de que sea ejecutado.
	
	
	
	5. Jerarquía de paquetes

    1. ¿Cómo están organizadas en el sistema de archivos?
    
    Las clases definidas se encuentran guardados en la carpeta src con la extensión .java.
    las clases de los paquetes model.gui y model.stack se encuentran dentro de la carpeta
    que contiene los archivos del paquete model.
    
    De forma paralela a la carpeta src se encuentra la carpeta bin, que contiene los archivos
    de código escrito contenidos en src organizados de la misma forma, pero convertidos a extensión
    .class para ser comprendido por la máquina. 
    
    
    2. ¿Encuentra alguna relación entre el nombre del paquete y la ubicación de los archivos fuentes de las
        clases (.java) y los archivos compilados (.class)?
	
	*/
}


