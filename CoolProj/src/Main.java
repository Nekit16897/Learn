import java.util.Scanner;
public static final Parabola parabola1=new Parabola(3,-3,0.5);
public static final Parabola2 parabola2=new Parabola2(6,4,-0.25);
public static final Circle circle1=new Circle(-1,3,9);
public static final Circle circle2=new Circle(1,3,25);


public static SimpleColor getColor(double x, double y) {
    if (parabola1.isPointUndertOfParabola(x,y)){
        if (circle1.isPointInCircle(x,y)){
            if (parabola2.isPointUndertOfParabola(x,y)){
                return SimpleColor.BLUE;
            }
            else{
                return SimpleColor.WHITE;
            }
        }
        if (parabola2.isPointUndertOfParabola(x,y)){
            return SimpleColor.WHITE;
        }
        if (circle2.isPointInCircle(x,y)){
            return SimpleColor.GRAY;
        }
        return SimpleColor.ORANGE;
    }
    if (parabola2.isPointUndertOfParabola(x,y)){
        if (circle2.isPointInCircle(x,y)){
            if (circle1.isPointInCircle(x,y)){
                return SimpleColor.ORANGE;
            }
            return SimpleColor.GREEN;
        }
        return SimpleColor.ORANGE;
    }
    if (circle2.isPointInCircle(x,y)){
        if(circle1.isPointInCircle(x,y)){
            return SimpleColor.GREEN;
        }
        return SimpleColor.BLUE;
    }
    if(!circle2.isPointInCircle(x,y) && x>-1){
        return SimpleColor.BLUE;
    }
    return SimpleColor.WHITE;
}
public static void printColorForPoint(double x, double y) {
    System.out.println("Цвет этой точки "+getColor(x,y));
}
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("(1.0, 1.0) ->" + getColor(1,1));
    System.out.println("(5.0, 3.0) ->" + getColor(5,3));
    System.out.println("(-7.0, -6.123) ->" + getColor(-7,-6.123));
    System.out.println("(-2.0, -3.0) ->" + getColor(-2,-3));
    System.out.println("(3.0, -3.0) ->" + getColor(3,-3));
    System.out.print("Введи координаты точки x ");
    int xInput = scanner.nextInt();
    System.out.print("Введи координаты точки y ");
    int yInput = scanner.nextInt();
    printColorForPoint(xInput,yInput);
}

