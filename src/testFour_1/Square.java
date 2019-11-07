package testFour_1;

class Square extends Rectangle {
    private double side;
    public Square(double side) {
        super(side,side);
        setSide(side);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
}
