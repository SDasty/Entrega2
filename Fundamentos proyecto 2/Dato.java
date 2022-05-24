public class Dato{
    private String estacion;
    private String nombre;
    private String pais;
    private String fecha;
    private double precipitacion;
    private double tpromedio;
    private double tmax;
    private double tmin;
    
    public Dato(String estacion, String nombre, String pais, String fecha, double precipitacion, double tpromedio, double tmax, double tmin){
        this.estacion = estacion;
        this.nombre = nombre;
        this.pais= pais;
        this.fecha = fecha;
        this.precipitacion = precipitacion;
        this.tpromedio = tpromedio;
        this.tmax = tmax;
        this.tmin = tmin;
    }
    
    
    public String getEstacion(){return this.estacion;}
    public void setEstacion(){this.estacion = estacion;}
    
    public String getPais(){return this.pais;}
    public void setPais(){this.pais = pais;}
    
    public String getNombre(){return this.nombre;}
    public void setNombre(){this.nombre = nombre;}
    
    public String getFecha(){return this.fecha;}
    public void setFecha(){this.fecha = fecha;}
    
    public double getPrecipitacion(){return this.precipitacion;}
    public void setPrecipitacion(){this.precipitacion = precipitacion;}
    
    public double getTpromedio(){return this.tpromedio;}
    public void setTpromedio(){this.tpromedio = tpromedio;}
    
    public double getTmax(){return this.tmax;}
    public void setTmax(){this.tmax = tmax;}
    
    public double getTmin(){return this.tmin;}
    public void setTmin(){this.tmin = tmin;}
    
    @Override
    public String toString(){
        return "Estacion = "+ estacion + "Nombre= "+ nombre +"Pais= " + pais +"Fecha= " +fecha+ "Precipitacion =" +precipitacion+ "Temperatura promedio= " + tpromedio + "Temperatura max= " + tmax + "Temperatura minima=" + tmin;
    }
}