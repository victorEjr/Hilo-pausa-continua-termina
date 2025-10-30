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

    //Menu 
 do {
    try{
      System.out.println("Menu");
      System.out.println("1.Crear hilo");
      System.out.println("2.Pausar hilo");
      System.out.println("3.Continuar hilo");
      System.out.println("4.Terminar hilo");
      System.out.println("5.Mostar arreglo");
      System.out.println("6.Mostrar estdo del hilo");
      System.out.println("7.SALIR");
      System.out.println("Elige una opcion");
      opcion = sc.nexInt();
      switch (opcion){
        case 1:
            System.out.println("Hilo creado :)");
            
          break;
        case 2:
            System.out.println("Hilo pausado");
            
            break;
            case 3:
                System.out.println("Continuando...");
                
            break
            case 4:
                System.out.println("Terminando...");
                
            break;
            case 5:
                System("Mostrando arreglo");
            break;
            
            case 6:
                System.out.println("El estado es...");
                break;
                
                case 7: System.out.println("Saliendo...");
                    break;
                    default:
                    System.out.println("Opcion no valida");
          
      }
    } catch
 }
   }
}
   
