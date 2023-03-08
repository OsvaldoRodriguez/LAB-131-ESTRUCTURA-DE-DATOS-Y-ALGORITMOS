
public class CSCircular extends ColaSimple{

	public CSCircular(int cap) {
		// TODO Auto-generated constructor stub
		super(cap);
	}
	
	@Override
	boolean esvacia() {
		return nroelem() == 0;
	}

	@Override
	boolean esllena() {
		return nroelem() == max - 1;
	}

	@Override
	void adicionar(Object elem) {
		if(!esllena()) {
			fin = (fin + 1) % max;
			v[fin] = elem;
		}else
			System.out.println("COLA LLENA");
		
	}

	@Override
	Object eliminar() {
		Object cur = null;
		if(!esvacia()) {
			ini = (ini + 1) % max;
			cur = v[ini];
		}
		return cur;
	}

	@Override
	void mostrar() {
		int len = nroelem();
		for(int i = 0; i < len; i++) {
			Object x = eliminar();
			System.out.println(x);
			adicionar(x);
		}
		
	}

	@Override
	int nroelem() {
		return (fin - ini + max) % max;
	}

}
