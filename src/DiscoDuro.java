import java.nio.charset.StandardCharsets;

public class DiscoDuro {
    String datosAlmacenados;
    int velocidadRPM;
    int capacidadBytes;

    public DiscoDuro(int velocidadRPM, int capacidadBytes){
        this.capacidadBytes = capacidadBytes;
        this.velocidadRPM = velocidadRPM;
        this.datosAlmacenados = "";
    }

    void escribirDatos(String datos){
        if(datos != null && datos.getBytes().length > capacidadBytes){
            System.out.println("ERROR. Los datos exceden la capacidad maxima del disco duro");
            return;
        }

        this.datosAlmacenados = datos;
        System.out.println("Disco duro escribiedo cabezal magnetico a " + velocidadRPM + " RPM.");
    }

    public String leerDatos(){
        System.out.println("Disco duro leyendo datos.");
        return  this.datosAlmacenados;
    }

}
