import java.util.GregorianCalendar;
public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GregorianCalendar fechaNacimientoJuan = new GregorianCalendar (1985, 10, 23);
Alumno alumnoJuan = new Alumno (19222831, "Juan", fechaNacimientoJuan);
System.out.println(alumnoJuan.toString());
	}

}
