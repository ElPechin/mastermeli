package modeladodedatos


class Item {

    String title
    String subtitle
    float price
    String imageUrl

    static belongsTo = [category: Category]

    static constraints = {
        price min: 0f
        title nullable: false
        subtitle nullable: true
        imageUrl nullable: true
    }
}