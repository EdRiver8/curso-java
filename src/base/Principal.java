package base;

import negocio.Banco;

public class Principal {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Banco banco = new Banco("Bancolombia", "BAN123", "1234567890", "Calle 123",
                "123", "Colonia 123", "Estado 123", "12345");
        System.out.printf("Nombre: %s\nRFC: %s\nTeléfono: %s\nDomicilio: %s\n",
                banco.getNombre(), banco.getRfc(), banco.getTelefono(), banco.getDomicilio());
    }
}