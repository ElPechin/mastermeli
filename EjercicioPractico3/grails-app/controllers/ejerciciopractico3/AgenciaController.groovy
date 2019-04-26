package ejerciciopractico3

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AgenciaController {

    AgenciaService agenciaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond agenciaService.list(params), model:[agenciaCount: agenciaService.count()]
    }

    def show(Long id) {
        respond agenciaService.get(id)
    }

    def create() {
        respond new Agencia(params)
    }

    def save(Agencia agencia) {
        if (agencia == null) {
            notFound()
            return
        }

        try {
            agenciaService.save(agencia)
        } catch (ValidationException e) {
            respond agencia.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'agencia.label', default: 'Agencia'), agencia.id])
                redirect agencia
            }
            '*' { respond agencia, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond agenciaService.get(id)
    }

    def update(Agencia agencia) {
        if (agencia == null) {
            notFound()
            return
        }

        try {
            agenciaService.save(agencia)
        } catch (ValidationException e) {
            respond agencia.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'agencia.label', default: 'Agencia'), agencia.id])
                redirect agencia
            }
            '*'{ respond agencia, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        agenciaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'agencia.label', default: 'Agencia'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'agencia.label', default: 'Agencia'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
