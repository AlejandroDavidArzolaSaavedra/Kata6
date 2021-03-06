package toyproducts.models;

import toyproducts.Toy;

public class HelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    
    public HelicopterToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
    }

    @Override
    public String toString() {
        return "HelicopterToy{" + "serialNumber=" + serialNumber + '}';
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
        System.out.printf("Packing '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
}
