import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class MarcoDeDatos{

    private String CSVleer;
    private String CSVescribir;

    private ArrayList<Dato> datos;

    public MarcoDeDatos(String CSVleer, String CSVescribir, ArrayList<Dato> datos){
        this.CSVleer = CSVleer;
        this.CSVescribir = CSVescribir;
        if(datos == null){
            this.datos = new ArrayList<Dato>();
        }
        else{
            this.datos = datos;
        }

    }

    public void MostrarDatos(){
        for(Dato d: this.datos){
            System.out.println(d.toString());
        }
    }

    public String getCSVleer(){
        return CSVleer;
    }

    public void setCSVleer(String CSVleer){
        this.CSVleer = CSVleer;
    }

    public String getCSVescribir(){
        return CSVescribir;
    }

    public void setCSVescribir(String CSVescribir){
        this.CSVescribir = CSVescribir;
    }

    public ArrayList<Dato> getDatos(){
        return datos;
    }

    public void setDatos(ArrayList<Dato> datos){
        this.datos = datos;
    }

    public void LeerFicheroCSV(){
        FileReader fr;
        try{
            fr = new FileReader(this.CSVleer);
            String LeerLinea = "";
            BufferedReader br = new BufferedReader(fr);
            int cont = 0;
            while((LeerLinea = br.readLine()) != null){
                if(cont != 0){
                    System.out.println(LeerLinea);
                    String[] datoslinea = LeerLinea.split(",");
                    String estacion = datoslinea[0].trim();
                    String nombre = datoslinea[1].trim();
                    String pais = datoslinea[2].trim();
                    String fecha = datoslinea[3].trim();
                    String precipitacion = datoslinea[4].trim();
                    String tpromedio = datoslinea[5].trim();
                    String tmax = datoslinea[6].trim();
                    String tmin = datoslinea[7].trim();
                    Dato d = new Dato(estacion, nombre, pais, fecha, precipitacion, tpromedio, tmax, tmin);
                    this.datos.add(d);
                }
                else{
                cont++;
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    } 

    public void EscribirFicheroCSV(){
        FileWriter fw;
        try{
            fw = new FileWriter(this.CSVescribir);
            BufferedWriter bw = new BufferedWriter(fw);
            String lineaTexto = "";
            for(Dato d: this.datos){
                String textoestacion = d.getEstacion();
                String textonombre = d.getNombre();
                String textopais = d.getPais();
                String textofecha = d.getFecha();
                String textoprecipitacion = d.getPrecipitacion();
                String textoTpromedio = d.getTpromedio();
                String textoTmax = d.getTmax();
                String textoTmin = d.getTmin();
                lineaTexto = textoestacion + "," + textonombre + "," + textopais + "," + textofecha + "," + textoprecipitacion + "," + textoTpromedio + "," + textoTmax + "," + textoTmin +"/n";
                bw.write(lineaTexto);
            }
            bw.flush();
            bw.close();
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
