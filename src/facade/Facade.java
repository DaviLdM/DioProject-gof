package facade;


import subsystem1Client.ClientService;
import subsystem2Cep.CepApi;

public class Facade {

    public void changeClient(String name, String cep){

        String city = CepApi.getInstancia().getCity(cep);
        String state = CepApi.getInstancia().getState(cep);



        ClientService.saveClient(name, cep, city, state);
    }
    
}
