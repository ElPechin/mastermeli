package modeladodedatos

class Category {

    String name

    static hasMany = [item: Item]
    static belongsTo = [site: Site]

    static mapping = {item joinTable: }

    static constraints = {
        name nullable: false
    }
}
