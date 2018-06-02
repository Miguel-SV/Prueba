public abstract class Datos_Personales {

    private String Nombre;

    private String Direccion;

    private String Telefono;

    private String Correo;

    public Datos_Personales() {
        
    }

    public abstract void Registrar();

    public abstract void Modificar();

    public abstract void Consultar();
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
