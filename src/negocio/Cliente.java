package negocio;

import java.util.ArrayList;

public class Cliente implements IServicioClientes {
    private int numero;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, String apellido, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setCuentas(new ArrayList<>());
        this.setFechaNacimiento(fechaNacimiento);
    }

    public Cliente(int num, String nombre, String apellido, String calle, String numero, String colonia, String estado, String codigoPostal, String rfc, String telefono, String fechaNacimiento) {
        this.setNumero(num);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.domicilio=new Domicilio(calle,numero,colonia,estado,codigoPostal);;
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setCuentas(new ArrayList<>());
        this.setFechaNacimiento(fechaNacimiento);
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return false;
    }

    @Override
    public Cliente consultaCliente(int numero) {
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return null;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        return null;
    }

    @Override
    public void listarClientes() {

    }
}
