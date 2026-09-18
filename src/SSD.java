public class SSD {
    String datosAlmacenados;
    int velocidadLecturaEscrituraMBs;
    int capacidadBytes;

    public SSD(int velocidadLecturaEscrituraMBs, int capacidadBytes){
        this.capacidadBytes = capacidadBytes;
        this.velocidadLecturaEscrituraMBs = velocidadLecturaEscrituraMBs;
        this.datosAlmacenados = "";
    }

    void escribirDatos(String datos){
        if(datos != null && datos.getBytes().length > capacidadBytes){
            System.out.println("ERROR. Limite de datos alcanzado. Capacidad maxima: " + capacidadBytes);
            return;
        }

        this.datosAlmacenados = datos;
        System.out.println("Unidad SSD: Escribiendo datos a una velocidad de " + velocidadLecturaEscrituraMBs + "MBs.");
    }

    public String leerDatos(){
        System.out.println("SSD: Accediendo a celdas de memoria ultrarrápida.");
        return  this.datosAlmacenados;
    }
}
