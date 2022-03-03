package nominaempleado;

public class EmpleadoPorComision extends Empleado { 
   private double tarifa = 0.04;
   private String TipoEmpleado;
public EmpleadoPorComision(String TipoEmpleado,String primerNombre, String apellidoPaterno, String NSS,
            double ventasBrutas,double SueldoBase,double KM) {  
    super(TipoEmpleado,primerNombre, apellidoPaterno,NSS,ventasBrutas,SueldoBase,KM);
        
       this.tarifa = tarifa;
       this.TipoEmpleado = TipoEmpleado;
    } 

    EmpleadoPorComision(String TipoEmpleado, String primerNombre, String apellidoPaterno, String NSS, Double ventasBrutas, Double SueldoBase, Double KM) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void establecerTarifaComision( double tarifa ){
    tarifa = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } 
    
    public double obtenerTarifaComision( ){
        return tarifa;
    } 
     public double Ingresos (){
      double ingresos = super.obtenerVentasBrutas() * obtenerTarifaComision(); 
      return ingresos;
    }
     
    @Override
    public String toString(){
        if (TipoEmpleado == "Comision" || TipoEmpleado == "Base"){
        return super.toString() +"\n" + "tarifa de comision: " + obtenerTarifaComision() + "\n" +
                "sueldo más comisión: " + Ingresos(); 
        }else{
           return super.toString();
        }
    }
}
