package grailsapi

import ch.qos.logback.core.net.server.Client
import grails.converters.JSON
import groovy.json.JsonSlurper

class ClientController {

    def index() {

        def url = new URL("https://api.mercadolibre.com/sites")
        def connection = (HttpURLConnection) url.openConnection()

        //asociamos a connetion un setrequestmethod y en el metodo le ponemos get, ya que ml en el metodo nos devuelve los sites
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/jason")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")

        //castea el JSon similar al Gson, con JsonSlurper
        JsonSlurper json = new JsonSlurper()
        def result = json.parse(connection.getInputStream())

        //lo renderizo pasando result
        [ result: result ]
    }

    def showCategories () {

        def url = new URL("https://api.mercadolibre.com/sites/" + params.id + "/categories")
        def connection = (HttpURLConnection) url.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def result = json.parse(connection.getInputStream())
        render result as JSON
    }

    def showSubCategories () {

        def url = new URL("https://api.mercadolibre.com/categories/"+ params.id)
        def connection = (HttpURLConnection) url.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def result1 = json.parse(connection.getInputStream())
        render result1 as JSON
    }


}
