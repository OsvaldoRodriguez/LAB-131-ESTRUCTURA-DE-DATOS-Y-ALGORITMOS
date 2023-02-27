import java.util.Scanner;

public class Estudiante {
	private String nombre, apellido;
	private int ci;
	private String fecha_nac;
	private double altura;
	private int matricula;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Estudiante(String nombre, String apellido, int ci, String fecha_nac, double altura, int matricula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.fecha_nac = fecha_nac;
		this.altura = altura;
		this.matricula = matricula;
	}


	public void leer() {
		System.out.println("ESTUDIANTE\n nombre-apellido-ci-matricula-fecha_nac- altura");
		Scanner in = new Scanner(System.in);
		nombre = in.next();
		apellido = in.next();
		ci = in.nextInt();
		matricula = in.nextInt();
		fecha_nac = in.next();
		altura = in.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", fecha_nac=" + fecha_nac
				+ ", altura=" + altura + ", matricula=" + matricula + "]";
	}

	public void mostrar() {
		System.out.println(toString());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
