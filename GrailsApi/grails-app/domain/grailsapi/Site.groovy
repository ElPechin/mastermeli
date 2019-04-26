package grailsapi

import grails.rest.Resource


@Resource (uri = '/site', formats = [ 'xml', 'json'])
class Site {

    String id
    String name

    static hasMany = [ category: Category ]

    static constraints = {
        id nulleable: false, blank: false
        name nullable: false, blank: false
    }
}
