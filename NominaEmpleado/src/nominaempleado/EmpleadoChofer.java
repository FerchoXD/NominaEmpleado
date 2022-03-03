package nominaempleado;
/*@author fernando daniel*/
public class EmpleadoChofer extends EmpleadoBase {
    private double KM; 
    //private double tarifa = 0.6;
    
    public EmpleadoChofer(String TipoEmpleado,String primerNombre, String apellidoPaterno, String NSS,
            double ventasBrutas,double SueldoBase,double KM){
    super(TipoEmpleado,primerNombre, apellidoPaterno, NSS, ventasBrutas,SueldoBase,KM);
     this.KM = KM;
    }
     
    public void establecerKM( double KM){    
     KM = KM;
    } 
    
    public double obtenerKM(){
     return KM; 
    }
     
     
     
   @Override
    
    public String toString(){
     return super.toString() + "\n" + "kilometros: " + obtenerKM();
    }
    
}
