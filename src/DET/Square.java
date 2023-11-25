package DET;

public class Square {
    protected double side;

    public Square(double side) {
        this.side = side;
    }
}

class FancySquare extends Square {
    public FancySquare(double side) {
        super(side);
    }

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }
}
