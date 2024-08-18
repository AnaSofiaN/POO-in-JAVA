public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("mazda","rojo","2002","ABC");
        Vehiculo vehiculo2 = new Vehiculo("ford","blanco","2020","CBA");

        System.out.println("Vehiculo 1: " + vehiculo.getMarca());

        vehiculo.setMarca("Kia");

        System.out.println("Vehiculo 1 con marca nueva: " + vehiculo.getMarca());

        System.out.println(vehiculo.infoVehiculo());

        Mascota mascota = new Mascota("Persa", "blanco", "Perlo");
        Mascota mascota2 = new Mascota("Egipcio", "Rubia", "Perla");

        System.out.println("El nombre es: " + mascota.getNombre());

        mascota2.setRaza("Desrazada");
        System.out.println("La raza de la seca loca es: " + mascota2.getRaza());

    }


}