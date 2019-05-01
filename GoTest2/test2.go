package main

import (
	"fmt"
)

func function1 () {
	fmt.Println("Imprime funcion 1")
}

func function2 () {
	fmt.Println("Imprime funcion 2")
}

func main () {
	//con la palabra defer, indica que se realizara la ejecucion de la funcion 1 al final del
	defer function1()
	for i:=0;i<100;i++{
		fmt.Print(i)
	}

	fmt.Print("\n")
	function2()
}
