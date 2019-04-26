package grailsapi

import grails.rest.Resource

@Resource ( uri = "/items", formats = [ 'json', 'xml' ] )

class Item {

    //con esta linea me realiza la vinculacion directa con la categoria
    Category category
    String nombre
    double precio

    static constraints = {
        nombre blank: false, nullable: false
        precio min: 1D, max: 1000D
    }
}
