package subsystem1Client;

public class ClientService {

    private ClientService(){
        super();
    }

    public static void saveClient(String name, String cep, String city, String state){

        System.out.println("cliente salvo no sistema de cliente.");
        System.out.println(name);
        System.out.println(city);
        System.out.println(cep);
        System.out.println(state);
        

    }

}
