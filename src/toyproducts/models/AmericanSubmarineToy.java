package toyproducts.models;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentFactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Propeller;

public class AmericanSubmarineToy implements Toy {

    private final Integer serialNumber;
    private final String type;
    private Engine engine;
    private Propeller propeller;
    final private ComponentFactory componentFactory;
    public AmericanSubmarineToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Submarine";
        this.componentFactory = new AmericanComponentFactory();
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s':'%d'\n",this.getType(),this.getSerialNumber());
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s':'%d'\n",this.getType(),this.getSerialNumber());
    }

    @Override
    public void prepare() {
        this.engine = this.componentFactory.createEngine();
        this.propeller = this.componentFactory.createPropeller();
        System.out.println("Motor y helices americanas listos");    
        }
}

