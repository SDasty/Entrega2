public class Metodos{
    public static void Promedio(String tpromedio){
      int TotalSuma=0;
        int A[]= tpromedio;
        int n= A.length;
        for (int i=0; i<n;i++){
            TotalSuma=TotalSuma+A[i];
        }
        System.out.println("El promedio es="+ (float)(TotalSum/n));
    }
}
