class Square{
    int side=4;
    int area,perimeter;
    public int getArea(){
        return area=side*side;
    }
    public  int getPerimeter(){
        return perimeter=2*side;

    }


}
public  class ClassPractice {
    public static void main(String[] args) {


        Square s = new Square();
        System.out.println("Area:- "+ s.getArea());
        System.out.println("Perimeter:- "+s.getPerimeter());


    }

}
