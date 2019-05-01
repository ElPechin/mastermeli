package domain

type Category struct {
	Id string
	Name string
	Site Site
}


//funcion que le paso una categoria y me indica a que sitio pertenece
func (c Category) GetSite() (Site) {
	return c.Site
}

//funcion que recibe una categoria y devuelve los ids concatenados
func (c Category) GetIdsConcatenados () (string) {
	return c.Site.Id + "-" + c.Id
}

//Devuelve el nombre de la categoria y un texto pasado por paramtro
func (c Category) GetAlgo (t string) (string) {
	return c.Name + "--" + t
}

//Funcion para cambiar el nobmre de la categoria, el cual no se modificará debido a que desde fuera no se modifica
func (c Category) CambiarNombreCategoria (name string){
	c.Name = name
}

//Funcion para cambiar el nobmre de la categoria, debido a que el puntero de la categoria me lleva al lugar de
// memoria donde se almacena el nobmre de la categoria, el cual si será modificado.
func (c *Category) CambiarNombreP (name string){
	c.Name = name
}