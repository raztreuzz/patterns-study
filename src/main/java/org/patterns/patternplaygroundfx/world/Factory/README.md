# Abstract Factory

- - -
### Motivacion

#### El Problema: Dependencia de Clases Concretas

Si una aplicacion codifica directamente las clases especificas de una interfaz(botones , barras, etc) sera muy
dificil cambiar a otro estandar mas tarde. La aplicacion se queda acoplada a una implementacion visual concreta.

#### La Solucion
Se propone definir una clase abstracta(WorldFactory) que declare una interfaz para crear
cada tipo basico de componente.

- Las subclases concretas de esta fabrica son las que implementa la creacion de los componentes en este caso Map
- El cliente solo interactua con la interfaz abstracta, por lo que no necesita saber que clase concreta se esta
instanciando.

### Consistencia  de Familia de objetos

Uno de los mayores beneficios es que el patron de fuerza la coherencia entre los objetos.

