import java.util.ArrayList;
import java.util.Scanner;
public class Principal{
    //El main 
    public static void main(String[] args){
        
        
    }
     public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        String CSVleer= "C:\\Users\\dsbetancu1\\Downloads\\Medellin.csv";
        String CSVescribir= "C:\\Users\\dsbetancu1\\Downloads\\Medellin2.csv";
        
        ArrayList<Dato> datos = new ArrayList<Dato>();
        MarcoDeDatos n = new MarcoDeDatos(CSVleer, CSVescribir,  datos);

        while(true){
            System.out.println("-----------------------------------------------------");
            System.out.println("0. Cerrar programa.");
            System.out.println("1. Mostrar datos");
            System.out.println("-----------------------------------------------------");


            System.out.print("Ingrese Opcion: ");
            int num = scan.nextInt();
            if(num == 0) {
                break;
            }
            switch(num){
                    
                case 1:
                n.LeerFicheroCSV();
                n.MostrarDatos();
                Dato b = new Dato("COM00080110","OLAYA HERRERA","CO","2022-05-23",0,25,30,20);
                Dato c = new Dato("COM00080110","OLAYA HERRERA","CO","2022-05-24",0,25,30,20);
                n.getDatos().add(b);
                n.getDatos().add(c);
                n.EscribirFicheroCSV();
                            break;
                }
            }
        }
    }
                
                    
