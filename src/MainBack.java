import java.util.ArrayList;


public class MainBack {

	public static void main(String[] args) {
		
								  //id, nombre, apellido, edad, fuerza de trabajo
		Empleado e1 = new Empleado("e1", "Juan", "P�rez", 32, 48);
		Empleado e2 = new Empleado("e2", "Roberto", "Hern�ndez", 45, 57);
		Empleado e3 = new Empleado("e3", "Camila", "Guti�rrez", 33, 51);
		Empleado e4 = new Empleado("e4", "Francisco", "Mart�nez", 22, 73);
		Empleado e5 = new Empleado("e5", "Benjam�n", "N��ez", 55, 15);
		Empleado e6 = new Empleado("e6", "Mateo", "Morales", 24, 33);
		Empleado e7 = new Empleado("e7", "Delfina", "L�pez", 36, 92);
		Empleado e8 = new Empleado("e8", "Catalina", "Cruz", 51, 71);
		Empleado e9 = new Empleado("e9", "Benicio", "Montero", 48, 19);
		Empleado e10 = new Empleado("e10", "Valentino", "Gonz�lez", 58, 22);
		Empleado e11 = new Empleado("e11", "Olivia", "G�mez", 33, 41);
		Empleado e12 = new Empleado("e12", "Martina", "D�az", 21, 49);
		Empleado e13 = new Empleado("e13", "Joaqu�n", "Cabrera", 22, 14);
		Empleado e14 = new Empleado("e14", "Bautista", "Dom�nguez", 36, 33);
		Empleado e15 = new Empleado("e15", "Emilia", "Paz", 40, 16);
		Empleado e16 = new Empleado("e16", "Francesca", "Figueroa", 43, 21);
		Empleado e17 = new Empleado("e17", "Santino", "Blanco", 25, 79);
		Empleado e18 = new Empleado("e18", "Ignacio", "Ibarra", 61, 32);
		Empleado e19 = new Empleado("e19", "Andrea", "Ch�vez", 27, 78);
		Empleado e20 = new Empleado("e20", "Elena", "Mengochea", 52, 67);
		
		Empresa empresa = new Empresa();
		
		/*-------------------------SOLUCION 1-------------------------*/
		ArrayList<Empleado> entrada1 = new ArrayList<>();
		entrada1.add(e1);
		entrada1.add(e2);
		entrada1.add(e3);
		entrada1.add(e4);
		entrada1.add(e5);
		entrada1.add(e6);
		
		mostrarSolucion(entrada1, "Soluci�n 1", empresa);
		
		/*-------------------------SOLUCION 2-------------------------*/
		ArrayList<Empleado> entrada2 = new ArrayList<>();
		entrada2.add(e7);
		entrada2.add(e4);
		entrada2.add(e8);
		entrada2.add(e15);
		
		mostrarSolucion(entrada2, "Soluci�n 2", empresa);
		
		/*-------------------------SOLUCION 3-------------------------*/
		ArrayList<Empleado> entrada3 = new ArrayList<>();
		entrada3.add(e19);
		entrada3.add(e12);
		entrada3.add(e11);
		entrada3.add(e13);
		
		mostrarSolucion(entrada3, "Soluci�n 3", empresa);
		
		/*-------------------------SOLUCION 4-------------------------*/
		ArrayList<Empleado> entrada4 = new ArrayList<>();
		entrada4.add(e19);
		entrada4.add(e18);
		entrada4.add(e14);
		entrada4.add(e16);
		
		mostrarSolucion(entrada4, "Soluci�n 4", empresa);
		
		/*-------------------------SOLUCION 5-------------------------*/
		ArrayList<Empleado> entrada5 = new ArrayList<>();
		entrada5.add(e7);
		entrada5.add(e8);
		entrada5.add(e20);
		entrada5.add(e3);
		entrada5.add(e16);
		
		mostrarSolucion(entrada5, "Soluci�n 5", empresa);
		
		/*-------------------------SOLUCION 6-------------------------*/
		ArrayList<Empleado> entrada6 = new ArrayList<>();
		entrada6.add(e6);
		entrada6.add(e15);
		entrada6.add(e17);
		entrada6.add(e13);
		entrada6.add(e16);
		entrada6.add(e10);
		
		mostrarSolucion(entrada6, "Soluci�n 6", empresa);
		
		/*-------------------------SOLUCION 7-------------------------*/
		ArrayList<Empleado> entrada7 = new ArrayList<>();
		entrada7.add(e17);
		entrada7.add(e2);
		entrada7.add(e19);
		entrada7.add(e20);
		entrada7.add(e4);
		entrada7.add(e12);
		entrada7.add(e15);
		
		mostrarSolucion(entrada7, "Soluci�n 7", empresa);
		
		/*-------------------------SOLUCION 8-------------------------*/
		ArrayList<Empleado> entrada8 = new ArrayList<>();
		entrada8.add(e12);
		entrada8.add(e14);
		entrada8.add(e18);
		entrada8.add(e6);
		entrada8.add(e2);
		entrada8.add(e9);
		entrada8.add(e10);
		entrada8.add(e16);
		
		mostrarSolucion(entrada8, "Soluci�n 8", empresa);
		
		/*-------------------------SOLUCION 9-------------------------*/
		ArrayList<Empleado> entrada9 = new ArrayList<>();
		entrada9.add(e1);
		entrada9.add(e2);
		entrada9.add(e3);
		entrada9.add(e4);
		entrada9.add(e5);
		entrada9.add(e6);
		entrada9.add(e7);
		entrada9.add(e8);
		entrada9.add(e9);
		entrada9.add(e10);
		entrada9.add(e11);
		entrada9.add(e12);
		entrada9.add(e13);
		entrada9.add(e14);
		entrada9.add(e15);
		entrada9.add(e16);
		entrada9.add(e17);
		entrada9.add(e18);
		entrada9.add(e19);
		entrada9.add(e20);
		
		mostrarSolucion(entrada9, "Soluci�n 9", empresa);
		
	}

	private static void mostrarSolucion(ArrayList<Empleado> entrada, String nroSolucion, Empresa empresa) {
		
		Solucion solucion = empresa.backtracking(entrada);

		int fuerzaTotalGrupo1 = solucion.getTotalAcumuladoGrupo1();
		int fuerzaTotalGrupo2 = solucion.getTotalAcumuladoGrupo2();
		ArrayList<Empleado> grupo1 = solucion.getGrupo1();
		ArrayList<Empleado> grupo2 = solucion.getGrupo2();
		
		mostrarGrupos(grupo1, grupo2, nroSolucion, fuerzaTotalGrupo1, fuerzaTotalGrupo2);
		
	}

	private static void mostrarGrupos(ArrayList<Empleado> grupo1, ArrayList<Empleado> grupo2, String solucion, int fuerzaTotalGrupo1, int fuerzaTotalGrupo2) {
		
		System.out.println("------------ " + solucion + " -------------");
		mostrarGrupo(grupo1, "Grupo 1", fuerzaTotalGrupo1);
		System.out.println();
		mostrarGrupo(grupo2, "Grupo 2", fuerzaTotalGrupo2);
		System.out.println("Cantidad de estados backtracking: " + Empresa.getContador());
		System.out.println("_____________________________________");
	}

	private static void mostrarGrupo(ArrayList<Empleado> grupo, String nombreGrupo, int fuerzaTotalGrupo) {
		
		System.out.println(nombreGrupo + ":  ");
		for(int i = 0; i < grupo.size(); i++){
			System.out.println(grupo.get(i));
		}
		System.out.println("**Fuerza de trabajo: " + fuerzaTotalGrupo);
		
	}

}
