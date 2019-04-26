class Test {

    static  main( args) {
        def a = 'IT Academy'
        def modelo= '2005'
        def b = 5
        println "${modelo}, ${b}"
        println "Modelo: ${modelo}"
        println "Prueba: ${modelo + b}"
        println "Prueba: ${b + modelo}"
        println modelo + b

        //Definimos una lista igual que como en java
        List javalist = new ArrayList();
        //Definimos una lista en groovy
        def groovyList = []
        def alist = [1,2,3,4,5]
        //puedo crear atrocidades de listas, y no da error
        def blist = [1, "perro", new Integer("2"), true]
        //agrego un elemento a la lista b,
        blist << "gato"
        println blist
        //como no existe esta posicion de la lista la crea y le añade gatos
        blist[5] = "gatos"
        println blist.size()

        def blista = ["hola", "mercadolibre", "sasha"]
        //obtener acceso a atributos de los objetos de una lista
        println blista*.length()

        //toma el valor del entero asociado a times, y realiza un for sobre times,
        // realizando el contenido del contenido de las llaves
        5.times {
            println "hola Mundo"
        }

        //Crear un map de la forma [key:'identificador', contenido:'value']
        [nombre:'Fuckencio', apellido:'Perez']

    }
}
