import java.util.Scanner;

public class Main {
	static int max = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Pila p = new Pila(max);
		System.out.println("INTRODUZCA LA CANTIDAD DE ELEMENTOS A ADICIONAR EN LA PILA");
		int n = in.nextInt();
		while(n-- > 0) {
			Estudiante e = new Estudiante();
			e.leer();
			p.adicionar((Object)e);
		}
		
		// sol_a
//		System.out.println("SOL A \nAPEILLIDO X");
//		System.out.println(sol_a(p, in.next()));
		
//		System.out.println("SOL_B \n AÑO X");
//		sol_b(p, in.nextInt());

		
//		System.out.println("SOL C\n");
//		sol_c(p);

//		System.out.println("SOL D\n INTRODUZCA MATRICULA");
//		sol_d(p, in.nextInt());
//		p.mostrar();
		

		System.out.println("SOL E\n PILA ORDENADA");
		sol_e(p);
		p.mostrar();
	}
	
	// contar cuantos estudiantes de la pila tienen apellido X
	public static int sol_a(Pila a, String lastName) {
		int count = 0;
		Pila aux = new Pila(max);
		while(!a.esVacia()) {
			Estudiante e = (Estudiante)a.eliminar();
			if(e.getApellido().equals(lastName)) {
				count++;
			}
			aux.adicionar((Object)e);
		}
		
		// hay que recuperar la pila
		a.vaciar(aux);
		return count;
	}
	//mostrar al estudiante que nacio en el año y
	public static void sol_b(Pila a, int anio) {
		Pila aux = new Pila(max);
		while(!a.esVacia()) {
			Estudiante e = (Estudiante)a.eliminar();
			// 12/12/1999
			int new_anio = Integer.parseInt(e.getFecha_nac().substring(6, 10));
			if(new_anio == anio) {
				e.mostrar();
			}
			aux.adicionar((Object)e);
		}
		
		// hay que recuperar la pila
		a.vaciar(aux);
	}
	
	public static boolean is_prime(int x) {
		if(x == 2) return true;
		if(x < 2 || x % 2 == 0) return false;
		for(int i = 3; i * i <= x; i += 2) {
			if(x % i == 0)
				return false;
		}
		return true;
	}
	// mostrar al estudiante que tenga ci como primo
	public static void sol_c(Pila a) {
		Pila aux = new Pila(max);
		while(!a.esVacia()) {
			Estudiante e = (Estudiante)a.eliminar();
			if(is_prime(e.getCi())) {
				e.mostrar();
			}
			aux.adicionar((Object)e);
		}
		a.vaciar(aux);
	}
	
	// eliminar al estudiante que tenga matricula x
	public static void sol_d(Pila a, int matricula) {
		Pila aux = new Pila(max);
		while(!a.esVacia()) {
			Estudiante e = (Estudiante)a.eliminar();
			if(e.getMatricula() != matricula) {
				aux.adicionar((Object)e);
			}
		}
		a.vaciar(aux);
	}
	// ordenar la pila por ci
	public static void sol_e(Pila a) {
		Pila aux = new Pila(max);
		Pila respuesta = new Pila(max);
		while(!a.esVacia()) {
			
			Estudiante cur = new Estudiante("1", "1", 1000000000, "", 0, 0);
			while(!a.esVacia()) {
				Estudiante e = (Estudiante) a.eliminar();
				if(e.getCi() < cur.getCi()) {
					cur = e;
				}
				aux.adicionar(e);
			}
			
			while(!aux.esVacia()) {
				Estudiante e = (Estudiante) aux.eliminar();
				if(e.getCi() == cur.getCi()) {
					respuesta.adicionar(e);
				}else {
					a.adicionar(e);
				}
			}
		}
		a.vaciar(respuesta);
	}

}
