import java.util.Scanner;

public class Ex4_3{
    int radius;
    String name;

    public Ex4_3(){
        radius = 1; name = "";
    }
    public Ex4_3(int r, String n){
        radius = r; name = n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Ex4_3 pizza = new Ex4_3(10, "자바 피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex4_3 donut = new Ex4_3();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
        }
}
