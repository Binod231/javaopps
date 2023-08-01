class cylinder{
    private float radius;
    private float height;

public void setRadius(float radius){
    this.radius=radius;
}

    public float getRadius() {
        return radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
public class EgGetterSetter {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setRadius(2.5F);
        c.setHeight(3);
        double surfacearea=(2*3.1415* c.getRadius()*c.getHeight())+(2*3.1415* c.getRadius()* c.getRadius());
       double area=3.1415*c.getRadius()*c.getRadius()*c.getHeight();
        System.out.format("The Area of cylinder is %.2f \n",area);
        System.out.format("The Surface area of cylinder is %.3f " ,surfacearea);

    }
}