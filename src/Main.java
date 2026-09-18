//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

DiscoDuro miDisco = new DiscoDuro(50, 10000);
SSD miSSD = new SSD(100, 3500);
USB miUSB = new USB("3.1", 20);

System.out.println("============================================");
System.out.println("PRUEBA----Escritura y lectura exitos en disco duro");
miDisco.escribirDatos("Hola mundo");
System.out.println("Contenido leido: " + miDisco.leerDatos());
System.out.println("============================================");

System.out.println("============================================");
System.out.println("PRUEBA----Desbordamiento de memoria USB");
miUSB.escribirDatos("Este texto es demasiado largo.");
System.out.println("============================================");

System.out.println("============================================");
System.out.println("PRUEBA----Escritura exitosa en memoria SSD");
miSSD.escribirDatos("Datos para SSD");
System.out.println("Contenido leido: " + miSSD.leerDatos());
System.out.println("============================================");
}
