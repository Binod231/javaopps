class Circle{
    private float radius;
    private  double area;
    private double parameter;
    public float getRadius() {
        return radius;

    }
    public void setRadius(int r){
        radius=r;
    }
    public  double getArea(){
        return area;
    }
    public  void setArea(double a){
        area=a;

    }
    public double getParameter(){
        return parameter;
    }
    public  void setParameter(double p){
        parameter=p;

    }
}
    public class Methoduses {
    public static void main(String[] args) {
        Circle cr=new Circle();
        cr.setRadius(3);
        cr.setArea(28.2735);
        cr.setParameter(18.849);
        double ar=3.1415* cr.getRadius()* cr.getRadius();
        double pr=2*3.1415* cr.getRadius();
        if(ar!= cr.getArea())
        {
            System.out.println("Warning!You are set a wrong  Area ");
        }
        else if (pr!= cr.getParameter())
        {
            System.out.println("Warning!You are set a wrong Parameter.");
        }
        else  if (pr== cr.getParameter() && ar== cr.getArea()){
            System.out.println("Area of circle is: "+cr.getArea()+"\nParameter of circle is: "+cr.getParameter());
        }
        else {
            System.out.println("Warning!You are set a wrong  Area and Parameter");
        }
    }
}

