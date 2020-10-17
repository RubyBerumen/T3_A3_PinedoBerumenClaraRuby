import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

interface RegistroImpresiones{
	 Scanner ent = new Scanner(System.in);
	 public void insertar();
	 public Impresion elimnar();
	 public boolean verificarFilaLlena();
	 public boolean verificarFilaVacia();
	 public void mostrarFrente(); 
	 public void mostrarTotalHojasImpresas();
	 public void mostrarTotalBytes();
}//interface RegistroImpresiones


class Impresion{
	private String identificador;
	private byte tamaño;
	private int cantidad;
	
	public Impresion() {}
	public Impresion(String identificador, byte tamaño, int cantidad) {
		this.identificador = identificador;
		this.tamaño = tamaño;
		this.cantidad = cantidad;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public byte getTamaño() {
		return tamaño;
	}
	public void setTamaño(byte tamaño) {
		this.tamaño = tamaño;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	@Override
	public String toString() {
		return "Impresion [identificador=" + identificador + ", tamaño=" + tamaño + ", cantidad=" + cantidad + "]";
	} 
	
}//class Impresion



class ImplementacionFilaEstatica implements RegistroImpresiones{
    Impresion impresiones[];
    int top;
    int tamaño;
   
    
    public ImplementacionFilaEstatica() {}
	public ImplementacionFilaEstatica(int tamaño){
        this.tamaño=tamaño;
        impresiones = new Impresion[tamaño];
        System.out.println(Arrays.toString(impresiones));
        top=-1;
    }


	public void insertar(Impresion datos) {
		if(!verificarFilaLlena())
        	impresiones[++top]=datos;
        else
            System.out.println("Está llena, no se puede insertar");
	}

	
	public Impresion elimnar() {
		return null;
	}

	
	public boolean verificarFilaLlena() {
		return top == impresiones.length-1;
	}


	public boolean verificarFilaVacia() {
		return(top==-1);
	}


	public void mostrarFrente() {
		System.out.println(impresiones[top]);
		
	}


	public void mostrarTotalHojasImpresas() {
		
		
		
	}


	public void mostrarTotalBytes() {
		
		

		
	}


	public void insertar() {
	
		
	}


	
}//class ImplementacionFilaEstatica



class ImplementacionFilaDinamica implements RegistroImpresiones{
	Queue<Impresion> impresiones = new LinkedList<Impresion>();


	public void insertar() {

	}

	public Impresion elimnar() {
		if (verificarFilaVacia()) {
			System.out.println("Fila vacia");
			return null;
		}else {
			return impresiones.poll();
		}
		
	}

	public boolean verificarFilaLlena() {
		return false;
		
	}

	public boolean verificarFilaVacia() {
		return impresiones.isEmpty();
		
		
	}

	public void mostrarFrente() {
		if (verificarFilaVacia()) {
			System.out.println("Fila vacia");
		}else {
			Impresion frente = impresiones.peek();
			System.out.println(frente);
		}
	}

	public void mostrarTotalHojasImpresas() {
		int sum=0;
		

	}

	public void mostrarTotalBytes() {
		
	}
	
}//class ImplementacionFilaDinamica


public class Impresiones {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
boolean salir = false;
		
		do {
			System.out.println("1) Usar fila estática");
			System.out.println("2) Usar fila dinámica");
			System.out.println("3) Salir");
			
			try {
				System.out.println("Elije una opción: ");
				int op = ent.nextInt();
				
				switch(op) {
					case 1 : 
						boolean salir1 = false;
						do {
							System.out.println("1) Agregar a cola de impresión");
							System.out.println("2) Mostrar total de hojas impresas");
							System.out.println("3) Mostrar impresión del frente");
							System.out.println("4) Mostrar total de bytes recibidos para impresion");
							System.out.println("5) Salir");
							
							try {
								System.out.println("Elije una opción: ");
								int op1 = ent.nextInt();
								 ImplementacionFilaEstatica ife = new  ImplementacionFilaEstatica();
								
								switch(op1) {
									case 1 :
										
										//ife.insertar(datos);
										break;
										
									case 2 :
										
										break;
										
									case 3 :
										
										break;
										
									case 4 :
										
										break;
										
									case 5 :
										salir = true;
										break;
										
									default :
										System.out.println("Debes ingresar números entre 1 y 5");

								}
								
							} catch (InputMismatchException e) {
								System.out.println("Debes ingresar un número");
				                ent.next();
							}
							
						}while(!salir1);
						
						break;
					
					case 2 :
						boolean salir2 = false;
						do {
							System.out.println("1) Agregar a cola de impresión");
							System.out.println("2) Mostrar total de hojas impresas");
							System.out.println("3) Mostrar impresión del frente");
							System.out.println("4) Mostrar total de bytes recibidos para impresion");
							System.out.println("5) Salir");
							
							try {
								System.out.println("Elije una opción: ");
								int op2 = ent.nextInt();
								ImplementacionFilaDinamica ifd = new  ImplementacionFilaDinamica();
								
								switch(op2) {
									case 1 :
										break;
										
									case 2 :
										//ifd.eliminar();
										break;
										
									case 3 :
										ifd.insertar();
										break;
										
									case 4 :
										//ifd.mostrarCantidadElementos();
										break;
										
									case 5 :
										salir = true;
										break;
										
									default :
										System.out.println("Debes ingresar números entre 1 y 5");

								}
								
							} catch (InputMismatchException e) {
								System.out.println("Debes ingresar un número");
				                ent.next();
							}
							
						}while(!salir2);
						
						break;
						
					case 3 :
						salir = true;
						break;
						
					default :
						System.out.println("Debes ingresar números entre 1 y 3");
				}
	
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un número");
                ent.next();
			}
			
		}while(!salir);

		
		
		
		
	}

}
