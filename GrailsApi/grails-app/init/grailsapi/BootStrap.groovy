package grailsapi

class BootStrap {

    def init = { servletContext ->

        def s1 = new Site (iDs: "MLA", name: "Mercado Libre Argentina").save()
        def s2 = new Site (iDs: "MLB", name: "Mercado Livre Brasil").save()
        def s3 = new Site (iDs: "MLM", name: "Mercado Libre Méjico").save()

        def c1 = new Category(nombre: "Categoria 1", descripcion: "descripcion 1", site: s1).save()
        def c2 = new Category(nombre: "Categoria 2", descripcion: "descripcion 2", site: s1).save()
        def c3 = new Category(nombre: "Categoria 3", descripcion: "descripcion 3", site: s1).save()
        def c4 = new Category(nombre: "Categoria 4", descripcion: "descripcion 4", site: s2).save()
        new Category(nombre: "Categoria 5", descripcion: "descripcion 5", site: s2).save()

        new Item(nombre: "Item 1", precio: 43, category: c1).save()
        new Item(nombre: "Item 2", precio: 66, category: c1).save()
        new Item(nombre: "Item 3", precio: 25.8, category: c3).save()
        new Item(nombre: "Item 4", precio: 89, category: c4).save()
        new Item(nombre: "Item 5", precio: 100 , category: c2).save()

    }
    def destroy = {
    }
}
