package lesson11qa;

public class KeyBoard extends Computer {
    private  TypeWires typeWire;
    private String typeUsing;

    public KeyBoard() {

    }


    public TypeWires getTypeWire() {
        return typeWire;
    }

    public void setTypeWire(TypeWires typeWire) {
        this.typeWire = typeWire;
    }

    public String getTypeUsing() {
        return typeUsing;
    }

    public void setTypeUsing(String typeUsing) {
        this.typeUsing = typeUsing;
    }




   // public KeyBoard() {}
    public KeyBoard( String model,String  brand, TypeWires typeWire, String typeUsing ) {
        super(model,brand);
        this.typeWire = typeWire;
        this.typeUsing = typeUsing;
    }
}


