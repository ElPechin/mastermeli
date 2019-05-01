package main

import (
	"fmt"
)

func main() {

	/*var ancho, alto = 10, 20.45
	var numero = 10*/

	/*var (
		figura = "Rectángulo"
		ancho = 20
		alto = 30
	)*/

	/*figura, ancho, alto := "Rectangulo", 20, 30
	//Puedo asignar varias variables en la misma linea
	figura, ancho, alto = "Rectangulo", 20, 30

	//No puedo reasignar directo con la misma firma
	//figura := "Cuadrado"
	//PERO PUEDO REASIGNAR, SI AÑADO NUEVAS VARIABLES
	figura, a := "Cuadrado", 2
	superficie := ancho * alto

	superficie = int(math.Pow(float64(ancho), 2))

	fmt.Println("Resultado superficie = ", superficie, figura, a )*/

	v1 := true
	v2 := false
	v3 := v1 && v2

	fmt.Printf( "La variable es de tipo %t y el valor de %t y %t ", v3, v1, v2)

	v4 := complex (12, 3)
	v4 = 3 + 6i
	fmt.Printf( "\nLa variable es de tipo %T y el valor de %g", v4, v4)

	var alumno = "Pedro"
	type myType string
	var nombre myType

	//Alumno es de tipo string, nombre es de tipo myType que myType es de tipo string
	//entonces si asigno a nombre el contenido de alumno, me da error, porque nombre es de tipo myType
	//nombre = alumno
	//pero si se la castea
	nombre = myType(alumno)

	fmt.Println("\n",alumno, nombre)

	suma, producto := operar(10,20)
	fmt.Println("\n",suma, producto)


}

//Metodo privado, debido a uqe la funcion tiene firma con minuscula!!!
func operar (a, b int) (suma int,producto int) {
	suma = a + b
	producto = a * b
	return suma, producto
}



