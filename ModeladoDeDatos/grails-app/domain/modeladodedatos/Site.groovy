package modeladodedatos

class Site {

    String name

    static hasMany = [category: Category]

    static constraints = {
        name nullable: false
    }
}