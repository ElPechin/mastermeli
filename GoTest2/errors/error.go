package errors

type MyError struct {
	mensaje string
	radicando float64

}


func New (m string, r float64) error {
	return &MyError{ m	, r}
}

func (e *MyError) Error()  string {
	//crea un objeto error, agregando el mensaje que paso por puntero
	return e.mensaje
}

func (e *MyError) IsNegativo()  bool {
	//crea un objeto error, agregando el mensaje que paso por puntero
	return e.radicando < 0
}