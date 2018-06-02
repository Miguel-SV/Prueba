public class Conexion_BdD {

    private String User;

    private String Password;

    private String Server;

    private String Port;

    private String DataBase;

    public static void Conectar() {
    }

    public static void Desconectar() {
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getServer() {
        return Server;
    }

    public void setServer(String Server) {
        this.Server = Server;
    }

    public Object getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }

    public String getDataBase() {
        return DataBase;
    }

    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }
}
