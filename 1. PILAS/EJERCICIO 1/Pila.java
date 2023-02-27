
public class Pila {
	private int tope, max;
	private Object[] v = new Object[100];
	
	Pila(int capacidad) {
		max = capacidad;
		tope = 0;
	}
	
	public boolean esLlena() {
		return max == tope;
	}
	
	public boolean esVacia() {
		return tope == 0;
	}
	public void adicionar(Object elemento) {
		if(!esLlena()) {
			tope++;
			v[tope] = elemento;
		}else {
			System.out.println("LA PILA ESTA LLENA");
		}
	}
	
	public Object eliminar() {
		Object cur = null;
		if(!esVacia()) {
			cur = v[tope];
			tope--;
		}
		return cur;
	}
	
	public int nroElem() {
		return tope;
	}
	public void vaciar(Pila b) {
		while(!b.esVacia()) {
			adicionar(b.eliminar());
		}
	}

	public void mostrar() {
		Pila auxiliar = new Pila(max);
		Object cur = null;
		while(!esVacia())
			auxiliar.adicionar(eliminar());
		
		while(!auxiliar.esVacia()) {
			cur = auxiliar.eliminar();
			System.out.println(cur);
			adicionar(cur);
		}
	}
}
