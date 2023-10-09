package practica6;

public class grupo{
	
	String idgrupo;
	materia mat=new materia();
	profesor profesor=new profesor();
	alumno alus[]= new alumno[30];

	 public String getId(){
         return idgrupo;   
     }
     
     public void setId(String id){
         idgrupo=id;
     }
	
}
