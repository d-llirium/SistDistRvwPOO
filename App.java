import data.GerenciaClientes;

public class App {
    public static void main(String[] args) {
        GerenciaClientes clientes = new GerenciaClientes();

        clientes.cadastrar("Daniel", 23, 1000);

        System.out.println(clientes.consulta("Daniel"));

        System.out.println(clientes.consulta("Danilo"));        
    }
}
