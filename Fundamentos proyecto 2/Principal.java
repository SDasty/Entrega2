import java.util.ArrayList;
public class Principal{
    //El main 
    public static void main(String[] args){
        String CSVleer= "C:\\Users\\W1803\\Downloads\\Medellin.csv";
        String CSVescribir= "C:\\Users\\W1803\\Downloads\\Medellin2.csv";
        ArrayList<Dato> datos = new ArrayList<Dato>();
        MarcoDeDatos n = new MarcoDeDatos(CSVleer, CSVescribir,  datos);
        n.LeerFicheroCSV();
        n.MostrarDatos();
        Dato b = new Dato("COM00080110","HOLAYA HERRERA","CO","2022-05-23","0","25","30","20");
        Dato c = new Dato("COM00080110","HOLAYA HERRERA","CO","2022-05-24","0","25","30","20");
        n.getDatos().add(b);
        n.getDatos().add(c);
        n.EscribirFicheroCSV();
    }
}
