package nominaempleado;

public class EmpleadoBase extends EmpleadoPorComision{
    private double SueldoBase; 
    private String TipoEmpleado ;
    
    public EmpleadoBase(String TipoEmpleado,String primerNombre, String apellidoPaterno, String NSS,
            double ventasBrutas,double SueldoBase,double KM){
    super(TipoEmpleado,primerNombre, apellidoPaterno, NSS, ventasBrutas,SueldoBase,KM);
     this.SueldoBase = SueldoBase;
     this.TipoEmpleado = TipoEmpleado;
    //establecerSalarioBase( salarioBase ,ventas,tarifa );
}
    public void establecerSalarioBase( double SueldoBase){
     //salarioBase = Ventas + super.obtenerTarifaComision();
     SueldoBase = ( SueldoBase < 0.0 ) ? 0.0 : SueldoBase;
    } 
    
    public double obtenerSalarioBase(){
     return SueldoBase;
    } 
    
    public double ingresos(){
     return obtenerSalarioBase() + super.Ingresos();
    } 
    
    @Override
    public String toString(){
    if (TipoEmpleado == "Comision" || TipoEmpleado == "Base"){
     return super.toString() + "\n" + "sueldo base: " + obtenerSalarioBase() 
             + "\n" + "Suelado base mas comision: " + ingresos() ;
    }else {
     return super.toString() + "\n" + "sueldo base: " + obtenerSalarioBase();   
    }
    }
}
