import grails.rest.render.json.JsonRenderer
//se deben importar las  clases que
import grailsapi.Category
import grailsapi.Item
import grailsapi.Site


// Place your Spring DSL code here
beans = {

    //en este bean se hacen modificaciones para exluiir atributos o elementos que luego mostrara el json o xml
    categoriaRenderer(JsonRenderer, Category) {
        excludes = [ 'id' ]
    }

    itemRenderer(JsonRenderer, Item) {
        excludes = [ 'id' ]
    }

    siteRenderer ( JsonRenderer, Site){
        excludes = [ 'id' ]
    }
}
