
public class CSNormal extends ColaSimple{

	public CSNormal(int cap) {
		super(cap);
	}
	@Override
	boolean esvacia() {
		return ini == 0;
	}

	@Override
	boolean esllena() {
		return fin == max;
	}

	@Override
	void adicionar(Object elem) {
		if(!esllena()) {
			if(esvacia())
				ini = 1;
			fin++;
			v[fin] = elem;
		}else
			System.out.println("COLA SIMPLE LLENA");
		
	}

	@Override
	Object eliminar() {
		Object cur = null;
		if(!esvacia()) {
			cur = v[ini];
			ini++;
			if(ini > fin) 
				ini = fin = 0;
			
		}else
			System.out.println("COLA SIMPLE VACIA");
		return cur;
	}

	@Override
	void mostrar() {
		CSNormal aux = new  CSNormal(max);
		while(!esvacia()) {
			Object cur = eliminar();
			System.out.println(cur);
			aux.adicionar(cur);
		}
		vaciar(aux);
		
	}
	public void vaciar(CSNormal p) {
		while(!p.esvacia()) {
			adicionar(p.eliminar());
		}
	}
	@Override
	int nroelem() {
		if(esvacia())
			return 0;
		return fin - ini + 1;
	}
	
}
