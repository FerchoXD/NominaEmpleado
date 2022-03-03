package nominaempleado;
/**
 * @author ferch
 */
public class ListaEmpleado {
    private Empleado[] lista;
    private int contador;
    public ListaEmpleado(int tamañoMaximo){
        lista = new Empleado[tamañoMaximo];
        contador = 0;
    }
    
    public int size(){
        return contador;
    }
    
    private boolean llena(){
        return contador == lista.length;
    }
    
    public boolean add(Empleado m){
        if (llena()){
            return false;
        }else{
            lista[contador] = m;
            contador++;
            return true;
        }
    }
        
    public String toString(){
        String s="";
        for(int i=0; i<contador; i++){
            s += lista[i].toString() + "\n\n";
        }
        return s;
    }

    public void borrar() {
       contador --;
    }
    
    public void Eliminar(){
        contador = 0;
    }
}
