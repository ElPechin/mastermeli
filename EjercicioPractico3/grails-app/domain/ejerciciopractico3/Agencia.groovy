package ejerciciopractico3

class Agencia {

     String agency_code;
     String correspondent_id;
     String description;
     String disabled;
     String distance;
     String id;
     String payment_method_id;
     String phone;
     String site_id;
     String terminal;

    static hasMany = [address: Address]

    static constraints = {

    }
}
