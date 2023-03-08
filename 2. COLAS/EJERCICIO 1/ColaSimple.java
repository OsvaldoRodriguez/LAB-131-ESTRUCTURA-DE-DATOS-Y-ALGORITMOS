
public abstract class ColaSimple {
	protected int ini, fin, max;
	protected Object v[] = new Object[1000];
	
	public ColaSimple(int cap) {
		max = cap;
		ini = fin = 0;
	}
	
	abstract boolean esvacia();
	abstract boolean esllena();
	abstract void adicionar(Object elem);
	abstract Object eliminar();
	abstract void mostrar();
	abstract int nroelem();
}
