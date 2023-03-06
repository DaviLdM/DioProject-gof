package subsystem2Cep;

public class CepApi {
      
    private static CepApi instancia = new CepApi();

        
    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
        
        return instancia;
    
    }

    public String getCity(String cep){
        return "araraquara";
    }

    public String getState(String cep){
        return "SP";
    }
    


}
