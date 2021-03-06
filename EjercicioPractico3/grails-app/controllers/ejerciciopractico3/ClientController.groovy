package ejerciciopractico3

import grails.converters.JSON
import grails.io.IOUtils
import groovy.json.JsonSlurper

class ClientController {

    def index() {

        ///sites/${site_id}/payment_methods/${payment_method_id}/agencies/${agency_id}
        // /reports?report_type=${report_type}&limit$={}&offset=${offset}&sort_by=${order},${sorting}
        def url = new URL("http://localhost:4567/agencias?site_id="+params.site_id+"&payment_method_id="+ params.payment_method +
                "&latitude="+ params.latitude +"&longitude="+ params.longitude +"&radius="+ params.offset +"&sortBy=distance")
        def connection = (HttpURLConnection) url.openConnection()
        //asociamos a connetion un setrequestmethod y en el metodo le ponemos get, ya que ml en el metodo nos devuelve los sites
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/jason")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")

        //castea el JSon similar al Gson, con JsonSlurper
        JsonSlurper json = new JsonSlurper()
        def result = json.parse(connection.getInputStream())

        //buscar parsear jsonslurper to array.

        def model = [
                agencies: result.data
        ]

        //lo renderizo pasando result
        render(view:"clientresponse", model:model)
    }

    def addAgency(){

        def agency = Agencia.get(params.id)
        println (agency)
        print("hola")
        // def results =  IOUtils.toString(request.getReader())
        JsonSlurper json = new JsonSlurper()
        def results = json.parse(request.getReader())
        render results as JSON

    }

    def deleteAgency(){

        println ("Eliminar agencia")
    }
}
