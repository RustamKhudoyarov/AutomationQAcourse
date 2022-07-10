package lesson11qa;

public class Monitors extends Computer {
    private String typeMatrix;
    private float diagonal;
    private String typeConnector;

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public String getTypeConnector() {
        return typeConnector;
    }

    public void setTypeConnector(String typeConnector) {
        this.typeConnector = typeConnector;
    }
    public Monitors(){}
    public Monitors(String brand, String model,String typeMatrix, float diagonal, String typeConnector) {
        super(brand,model);
        this.typeMatrix = typeMatrix;
        this.diagonal = diagonal;
        this.typeConnector = typeConnector;
    }
}
