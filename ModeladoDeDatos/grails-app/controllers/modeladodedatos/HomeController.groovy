package modeladodedatos

class HomeController {

    //se activa por defecto para uqe no se active el index. cuando es llamado HomeController desde UrlMapping
    static defaultAction = "otroMetodo"

    def index() { }


    def otroMetodo(){
        render view: 'otro'
    }
}
