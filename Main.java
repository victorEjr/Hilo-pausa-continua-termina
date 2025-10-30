import java.util.scanner

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String[] areglo = new String[20];
    Posicion pos = new Posicion();
    HiloEscribe hilo = new HiloEscribe(pos); //Creción del hilo

    //Configuración del hilo
    hilo.setInfo(arreglo);
    hilo.setIni(0);
    hilo.setInfo(1000);

    int opcion = 0;
    boolean hiloCreado = false;
}
}
