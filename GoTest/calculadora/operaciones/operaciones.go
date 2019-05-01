package operaciones

import (
	"math"
)


//metodo publico para ser llamado desde otro archivo, nombre mayuscula
//devuelve una variable suma de tipo int, por eso no me hace falta declarar una varaibale suma dentro de la func
func Sumar (a, b int) (suma int) {
	suma = a + b
	return  suma
}

func Potenciar (a float64, b float64) (potencia int) {
	potencia = int(math.Pow(a, b))
	return potencia
}
