package business;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    final private Map<String,ToyFactory> toyFactories = new HashMap<>();
        
    final private SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public void add(String type, ToyFactory toyFactory){
        toyFactories.put(type, toyFactory);
    }
    
    public Toy produceToy(String type){
        return toyFactories.get(type).produceToy(serial.next());
    }
    
}

