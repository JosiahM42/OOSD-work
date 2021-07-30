package week14;

public class Square {

    private double dim;

    public Square(double dim) throws IllegalArgumentException
    {
        this.dim = dim;
    }

    public double getDim()
    {
        return dim;
    }

    public void setDim(double dim) throws IllegalArgumentException
    {

    }

    public double Area()
    {
        return this.dim * this.dim;
    }

    public double Perimeter()
    {
        return this.dim * 4;
    }

    public String toString()
    {
        return "Square{" +
                "dim=" + dim +
                '}';
    }
}
