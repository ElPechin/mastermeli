package main

import (
	"./domain"
	"fmt"
)

func main () {
	sitio1 := domain.Site{
		Id: "MLA",
		Name: "Argentina",
	}

	sitio2 := domain.Site{
		Name: "Brasil",
	}

	categoria1 := domain.Category{
		Id: "MLA4344",
		Name: "Accesorios para vehiculos",
		Site: sitio1,
	}
	categoria2 := domain.Category{
		Id: "MLA8844",
		Name: "Accesorios para Adulteros",
		Site: sitio1,
	}

	categoria3 := domain.Category{
		Site: sitio2,
	}

	//Comparar cagtegorias entre si para ver si son iguales en base al contenido del struct
	if(categoria1 == categoria2){
		fmt.Println("Las categorias son iguales")
	} else {
		fmt.Println( "Las categorias son distintas")
	}

	if(categoria1 == categoria3){
		fmt.Println("Las categorias son iguales")
	} else {
		fmt.Println( "Las categorias son distintas")
	}

	fmt.Println(categoria1.GetIdsConcatenados())
	fmt.Println(categoria1.GetAlgo("Hola mchino"))
	categoria1.CambiarNombreP("Vehiculillos")
	categoria1.CambiarNombreCategoria("Vehiculos")

	fmt.Println(categoria1.Name)



	fmt.Println(sitio1)
	fmt.Println(sitio2)
	fmt.Println(sitio2.Name)
	fmt.Println(sitio2.Id)

	fmt.Println(categoria1)
	fmt.Println(categoria2)
	fmt.Println(categoria3)
}
