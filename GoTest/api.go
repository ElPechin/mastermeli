package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"
	"os"
	"strings"
)

type site struct {
	Name string
	Id string
}

func main () {

	fmt.Println("Iniciando Aplicación...")
	//conectar con url, se necesita un archivo http, que debe importarse
	//Recibe 2 parametros, un error y un response
	//Creamos 2 variables, response y error porq son lo que devuelve el metodo http.get
	response, err := http.Get("https://api.mercadolibre.com/sites")
	//nil = null, ocurrre un error, imprime eso, y sale
	if err != nil{
		fmt.Println("Ocurrio un error: %s", err)
	} else {
		//metodo body, dentro de response, trae el cuerpo del response
		// para poder leerlo, como es similar a un imput stream, importo io/ioutil
		//puedo asignar lo leido en ioutil.readall a una variable data.
		//con el string(data) formateo la salida para leerlo, sino me devuelve un ascii
		data, _ := ioutil.ReadAll(response.Body)
		//fmt.Println(string(data))
		var sites[] site

		err := json.Unmarshal([]byte(data),&sites)
		if(err != nil){
				fmt.Println("Ocurrio un error %s", err)
			}else {
				for i:=0;i<len(sites);i++ {
					fmt.Println(sites[i].Name)
				}
				var seleccion string
				fmt.Println("Seleccione un pais: ")
				fmt.Scanln(&seleccion)
				selecciones := strings.Title(seleccion)
				for i:=0;i<len(sites);i++ {
					if selecciones == sites[i].Name {
						Get(sites[i].Id)
					}else {
						println("Pais fuera de lista.")

					}
				}
			}
		}
	}



	//creo un mapa de json del o que quiero armar, y el mapa se arma con los corchetes, dentro de los corchetes
	// va el tipo de datos del key, y fuera del corchete, el tipo del valor qeu posee el map
	/*jsonData := map[ string ] string{
		"nombre": "pipo",
		"id" : "pepo"	}*/

	//ahora que tengo el mapa, lo convierto a valor json
	//Todos los meotodos devuelven una variable de error, por eso pongo ,_ que podria capturarlo declarando la variable err
	//Le paso el mapa a traves del metodo json.Marshal y lo casteo
	//como si hay un error de casteo, lo devuelvo en una variable err, que no se esta capturando, cambio ,_ por err.





	//DEVUELVE LOS VALORES EN BYTES DEL JSON
	//byt := []byte(jsonValue)
	//fmt.Println(byt)

//Funcion que se comunica con la api
func Get (id string) {


	url := "https://api.mercadolibre.com/sites/"+id+"/categories"
	response, err := http.Get(url)
	if (err != nil) {
		fmt.Println("Ocurrio un error %s", err)
	} else {
		data, _ := ioutil.ReadAll(response.Body)
		f,err:= os.Create("categorias.txt")
		if(err!= nil){
			fmt.Println("Error al crear el archivo %s,err")
			return
		}
		l,err:=f.WriteString(string(data))
		if(err != nil){
			fmt.Println("Error al escribir el archivo %s,err")
			return
			l++
		}
	}
}


