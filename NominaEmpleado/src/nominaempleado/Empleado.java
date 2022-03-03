package nominaempleado;

public class Empleado {
    private String TipoEmpleado;
    private String primerNombre;
    private String apellidoPaterno;
    private String NSS;
    private double ventasBrutas; 
    private double SueldoBase;
    private double KM;
    
    public Empleado(){   
    }
public Empleado(String TipoEmpleado,String primerNombre, String apellidoPaterno, String NSS, 
            double ventasBrutas,double SueldoBase,double KM) { 
        this.TipoEmpleado = TipoEmpleado;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.NSS = NSS;
        this.ventasBrutas = ventasBrutas;
        this.SueldoBase = SueldoBase;
        this.KM = KM;
    } 

   public void establecerTipoEmpleado(String TipoEmpleado ){
        TipoEmpleado = TipoEmpleado; 
    } 
    
    public String obtenerTipoEmpleado(){
        return TipoEmpleado;
    }
    public void establecerPrimerNombre(String nombre ){
        primerNombre = nombre;
    } 

    public String obtenerPrimerNombre(){
        return primerNombre;
    } 
    
    public void establecerApellidoPaterno(String apellido ){
        apellidoPaterno = apellido;
    } 
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    } 
    
    public void establecerNumeroSeguroSocial(String nss ){
        NSS = nss; 
    } 
    
    public String obtenerNumeroSeguroSocial(){
        return NSS;
    } 
    
    public void establecerVentasBrutas( double ventasBrutas ){
        ventasBrutas = ( ventasBrutas < 0.0 ) ? 0.0 : ventasBrutas;
    } 
    
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    public void establecersueldoBase (double SueldoBase){
        SueldoBase = SueldoBase;
    }
    public double obtenersueldoBase (){
        return SueldoBase;
    }
    
    public void establecerKM (double KM){
        KM = KM;
    }
    public double obtenerKM (){
        return KM;
    }
    
    public String toString(){
        
        if (TipoEmpleado == "Comision"){
        return "Empleado por comision: " + obtenerPrimerNombre() + "  " +obtenerApellidoPaterno() + "\n" +
                "numero de seguro social: " + obtenerNumeroSeguroSocial()
                + "\n" +
                "ventas por semana: " + obtenerVentasBrutas();
        }if (TipoEmpleado == "Base"){
        return "Empleado Base: " + obtenerPrimerNombre() + "  " +obtenerApellidoPaterno() + "\n" +
                "numero de seguro social: " + obtenerNumeroSeguroSocial()
                + "\n" +
                "ventas por semana: " + obtenerVentasBrutas();    
        }if (TipoEmpleado == "Chofer"){
         return "Empleado Chofer: " + obtenerPrimerNombre() + "  " +obtenerApellidoPaterno() + "\n" +
                "numero de seguro social: " + obtenerNumeroSeguroSocial();
               /* + "\n" +
                "ventas por semana: " + obtenerVentasBrutas();*/
        }else{
            return "null";
        }
        //return null;
    }
    }

