class Main {
    protected String Draw = "Drawing";
    public void myDraw() {
        System.out.println("Drawing Shape");
    }
    protected String Erase = "Erasing";
    public void myErase() {
        System.out.println("Erasing Shape");
    }
}

class Triangle extends Main {
    protected String Shape = "Triangle";
    public static void main (String [] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.myDraw();
        myTriangle.myErase();
        System.out.println(myTriangle.Draw +" "+myTriangle.Shape);
        System.out.println(myTriangle.Erase+" "+myTriangle.Shape);
    }
}
class Circle extends Main {
    protected String Shape = "Circle";
    public static void main (String [] args) {
        Circle myCircle = new Circle();
        myCircle.myDraw();
        myCircle.myErase();
        System.out.println(myCircle.Draw +" "+myCircle.Shape);
        System.out.println(myCircle.Erase+" "+myCircle.Shape);
    }
}

class Square extends Main {
    protected String Shape = "Square";
    public static void main (String [] args) {
        Square mySquare = new Square();
        mySquare.myDraw();
        mySquare.myErase();
        System.out.println(mySquare.Draw+" "+mySquare.Shape);
        System.out.println(mySquare.Erase+" "+mySquare.Shape);


    }
}

class ShapeDemo {
    public static void main (String [] args) {
        
        Circle myCircle= new Circle();
        Triangle myTriangle= new Triangle();
        Square mySquare= new Square();
        myCircle.myDraw();
        myCircle.myErase();
        System.out.println(myCircle.Draw+" "+myCircle.Shape);
        System.out.println(myCircle.Erase+" "+myCircle.Shape);
        }
        }
 

         

