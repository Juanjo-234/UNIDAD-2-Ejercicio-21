public class USB {
    String datosAlmacenados;
    String UsbVersion;
    int capacidadBytes;

    public USB(String UsbVersion, int capacidadBytes){
        this.capacidadBytes = capacidadBytes;
        this.UsbVersion = UsbVersion;
        this.datosAlmacenados = "";
    }

    void escribirDatos(String datos){
        if(datos != null && datos.getBytes().length > capacidadBytes){
            System.out.println("ERROR. Limite de almacenamiento de memoria USB ("+ UsbVersion + ")");
            return;
        }

        this.datosAlmacenados = datos;
        System.out.println("Memoria USB (" + UsbVersion + "): Transfiriendo datos al bus serial...");
    }

    public String leerDatos(){
        System.out.println("Memoria USB: Leyendo sector de memoria flash portátil");
        return  this.datosAlmacenados;
    }
}
