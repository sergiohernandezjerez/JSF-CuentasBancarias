package thefundidors.cuentas.servicio;

import thefundidors.cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {

    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    //nos sirve para actualizar o crear una cuenta nueva
    //si existe la cuenta hará un update
    //si no existe la cuenta hará un insert
    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);


}
