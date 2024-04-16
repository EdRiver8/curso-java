package negocio;

import java.util.ArrayList;

public class Banco implements IServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, String calle, String numero, String colonia, String estado, String codigoPostal, String rfc, String telefono) {
        this.setNombre(nombre);
        this.domicilio = new Domicilio(calle,numero,colonia,estado,codigoPostal);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new ArrayList<>();
    }
    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.clientes = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

//    public void setClientes(ArrayList<Cliente> clientes) {
//        this.clientes = clientes;
//    }


    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public Cliente consultaCliente(int numero) {
        for(Cliente c:clientes){
            if(c.getNumero()==numero){
                System.out.println("Se encontro el cliente numero: "+numero);
                System.out.println(c);
                return c;
            }
        }
        // pediente manejo de excepciones
        System.out.println("No se encontro el cliente numero: "+numero);
        return null;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente c = consultaCliente(numero);
        if(c!=null){
            clientes.remove(c);
            System.out.println("El cliente numero: "+numero+" fue eliminado!");
            System.out.println(c);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for(Cliente c:clientes){
            if(c.getRfc()==rfc){
                System.out.println("Se encontro el cliente con RFC: "+rfc);
                System.out.println(c);
                return c;
            }
        }
        // pediente manejo de excepciones
        System.out.println("No se encontro el cliente con RFC: "+rfc);
        return null;
    }

    @Override
    public void listarClientes() {
        System.out.println("=".repeat(250));
        for(Cliente c:clientes){
            System.out.println(c);
        }
        System.out.println("=".repeat(250));
    }
}