package base;

import negocio.Banco;
import negocio.Cliente;

public class Principal {
    public static void main(String[] args) {

        Banco bancolombia = new Banco("Bancolombia","Av. Principal","1008","Centro","Antioquia","05003","XYZ1234","6041234567");
        System.out.println(bancolombia);

        Cliente c1 = new Cliente(1010,"Fernando","Jaimes","Aldama","204","Centro","Mexico","50000","ABCD670223","527222642235","230267");
        Cliente c3 = new Cliente(7777,"Luisa Fernanda","Escobar","Carrera 14","1204","Centro","Bogota DC","12345","LFEM890223","1234567890","121289");
        Cliente c2 = new Cliente(5555,"Angel Alberto","Guerra","Avenida 3","222","Pedregal","Bogota DC","44444","XYZQ770223","9876543210","030972");

        bancolombia.agregarCliente(c2);
        bancolombia.agregarCliente(c1);
        bancolombia.agregarCliente(c3);

        bancolombia.listarClientes();
        bancolombia.consultaCliente(1000);
        bancolombia.consultaCliente(7777);
        bancolombia.eliminarCliente(1111);
        bancolombia.eliminarCliente(1010);
        bancolombia.buscarClientePorRfc("LFEM890223");
        bancolombia.buscarClientePorRfc("ZZZZ123456");
        bancolombia.listarClientes();
    }
}