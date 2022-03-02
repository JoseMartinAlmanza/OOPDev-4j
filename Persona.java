//Definicion de la clase 
class Persona{
	//Atributos
	String nombre; //identificador
	int edad;
	char genero;
	// Métodos acciones que hará mi clase
	// Constructor: no define un tipo de dato de retorno y porque el nombre será igual al nombre de la clase. Se renuncia al constructor que java creo por defecto

	Persona(){
		System.out.println("Esto es un constructor");
	}

	Persona(String n, int ed, char g){
		nombre=n;
		edad=ed;
		genero=g;
	}
	void jugarVideojuegos(Persona p) //mi persona puede jugar videojuegos contra persona parametros
	{
		System.out.println(nombre+" Esta jugando"+p.nombre);
	}

	void imprimirInformacion()//aquí se pueden poner parametros
	{ 
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Genero: "+genero);
			
	}


	public static void main(String args[]){
		Persona p = new Persona("Alex", 32, 'M'); //constructor 
		/*p.nombre="Alex";
		p.edad=32;
		p.genero='M';
	*/		
		p.imprimirInformacion();
		Persona p1 = new Persona();
		p1.nombre="Juan";
		p1.edad=21;
		p1.genero='M';
		p1.imprimirInformacion(); //imprimiendo datos de una persona
		p.jugarVideojuegos(p1);

			}
}