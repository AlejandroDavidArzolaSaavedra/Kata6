package toyproducts.models;
import toyproducts.Toy;

public class AmericanHelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    
    public AmericanHelicopterToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }

    public String getType() {
        return type;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s': '%d'\n",this.getType(),this.getSerialNumber());
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s': '%d'\n",this.getType(),this.getSerialNumber());
    }
}



