public class BoxPrgm {
    double w,h,d;
    Box(double width,double height,double depth)
    {
        w=width;
        h=height;
        d=depth;
    }
    double volume()
    {
        double v;
        v=w*h*d;
        return v;
    }
    public static void main(String[] args) {
        Box b = new Box(2.5,3.5,4.5);
        System.out.println(b.volume());
    }
}
