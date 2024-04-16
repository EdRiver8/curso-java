package negocio;

import java.util.ArrayList;

public interface IServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultaCliente(int numero);
    ArrayList<Cliente> obtenerClientes();
    Cliente buscarClientePorRfc(String rfc);
    void listarClientes();
}
