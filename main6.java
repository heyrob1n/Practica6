package practica6;

public class main6 {

	public static void main(String[] args) {
		
		grupo gp1=new grupo();
		System.out.print("INGRESA ID DE GRUPO:");
		gp1.setId(scan.String());
		System.out.print("INGRESA NOMBRE DE PROFESOR:");
		gp1.profesor.setNombre(scan.String());
		System.out.print("INGRESA NOMBRE DE MATERIA:");
		gp1.mat.setNombre(scan.String());
		
        for (int i = 0; i<30; i++){
			gp1.alus[i] = new alumno();}
        
        System.out.print("INGRESA NOMBRE DE ALUMNO[1]:");
        gp1.alus[0].setNombre(scan.String());
        
        System.out.println();
        System.out.println("ID GRUPO:"+gp1.getId());
        System.out.println("NOMBRE PROFESOR:"+gp1.profesor.getNombre());
        System.out.println("MATERIA:"+gp1.mat.getNombre());
        System.out.println("NOMBRE ALUMNO[1]:"+gp1.alus[0].getNombre());
        
	}
}
