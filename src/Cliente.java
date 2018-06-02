public class Cliente extends Datos_Personales {

    private String NIT;

    private String NRC;

    public void HacerPago() {
    }

    public void AsignarContacto() {
    }

    @Override
    public void Registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

}
