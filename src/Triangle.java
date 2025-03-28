public class Triangle extends Shape{

    private int sideA,sideB,hipotenus;




    public Triangle(Point topLeft, int sideA, int sideB,int sideC) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);

    }

    public Triangle(Point topLeft, int sideA) {
        super(topLeft);
        this.sideA = sideA;
        this.sideB = sideA;
        
    }



    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA<0) {
            throw new IllegalArgumentException("Side can't be negative");
        }
        else{
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB<0){
            throw new IllegalArgumentException("Side can't be negative");
        }else{
            this.sideB = sideB;
        }
    }

    @Override
    public double area() {
        return this.sideB*this.sideA/2 ;
    }

    @Override
    public double perimeter() {
        return this.sideA+this.sideB+this.hipotenus;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "location=" + getLocation() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ",hipotenus"+
                '}';
    }














}
