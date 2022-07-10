package lesson11qa;

public class Mouse extends Computer{
    private TypeWires typeWires;
    private TypeMouse typeMouse;

    public void setTypeMouse(TypeMouse typeMouse) {
        this.typeMouse = typeMouse;
    }
    public TypeMouse getTypeMouse(){
        return typeMouse;
    }
    public void setTypeWires(TypeWires typeWires){
        this.typeWires=typeWires;
    }
    public TypeWires getTypeWires(){
        return typeWires;
    }

    public Mouse(String brand, String model, TypeWires typeWires, TypeMouse typeMouse){
        super(brand,model);
        this.typeMouse = typeMouse;
        this.typeWires = typeWires;
    }
}
