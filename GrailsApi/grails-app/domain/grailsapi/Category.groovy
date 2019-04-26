package grailsapi

import grails.rest.Resource

//Con este override indicamos que esta clase es un recurso api
// se pasa el uri que se añadirá a la url.
// Al añadir ", readOnly = true NO PERMITIRÁ AGREGAR O MODIFICAR CATEGORIAS, SOLO LEER
@Resource(uri= '/categorias', readOnly = true, formats = [ 'xml', 'json'] )

class Category {

    String nombre;
    String descripcion
    Site site


    static hasMany = [item: Item]

    static constraints = {
        nombre blank: false, nullable: false
        descripcion blank: false, nullable: false
    }
}
