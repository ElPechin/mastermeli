package main

import (
	"./errors"
	"fmt"
	"math"
)

func calcularRaizCuadrada (a float64) (float64, error) {
	if a < 0 {
		//Creo un nuevo error, con un nuevo mensaje
		return 0, errors.New("El numero debe ser positivo.", a)
	}

	//retorno la raiz, y como pude hacer la funcion, devuelvo error nulo
	return math.Sqrt(a), nil
}

func main() {
	a := -16.0
	r, err := calcularRaizCuadrada(a)
	if err, ok := err.(*errors.MyError); ok {
		fmt.Println(err.IsNegativo())
	} else {
		fmt.Printf("La raiz cuadrada de %v es %v", a, r)
	}
}