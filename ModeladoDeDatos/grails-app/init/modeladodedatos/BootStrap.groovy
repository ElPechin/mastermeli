package modeladodedatos

class BootStrap {

    def init = { servletContext ->

        //para
        def site2 = new Site(name: "MLB")
                site2.save()
        def site1 = new Site(name: "MLA")
                site1.save()
        def category1 = new Category(site: site1 ,name: "Repuestos Automotores")
        category1.save()
        def item1 = new Item(category: category1, title: "Faros Fiat Siena 98", subtitle: "Juego opticas derechas (trasera y delantera)", price: 2300).save()
        def item2 = new Item(category: category1, title: "Faros Fiat Siena 98", subtitle: "Faros delanteros independientes sin faro de guiño", price: 2000).save()
    }
    def destroy = {
    }
}
