package negocio;

public interface IServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numeroCuenta);
    boolean abonar(int numeroCuenta, double cantidad);
    boolean retirar(int numeroCuenta, double cantidad);
    Cuenta obtenerCuenta(int numeroCuenta);
}
