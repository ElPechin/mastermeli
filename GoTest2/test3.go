package main

import (
	"fmt"
	"net/http"
	"net/url"
)


func main(){
	f, err := http.Get("https://api.mercadolibre.com/sites/MLA/categories")
	//Meto el error que recibo en vez de esta comparacion
	if err, ok := err.(*url.Error); ok{
		fmt.Println(err)
	} else {
		fmt.Println(f)
	}
}

type Error struct {
	Err string
	IsTimeout bool
	IsTemporary bool
}


func (e *Error) Error () string{
	return e.Err
}

