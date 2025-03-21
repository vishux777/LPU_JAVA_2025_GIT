
// class -> class -> extends
// interface -> interface -> extends
// class -> interface -> implements

interface Shape{
    void draw();
}

interface Color extends Shape{
    void fillColor();
}

class Circle implements Color{
    public void draw(){
        System.out.println("Drawing circle");
    }

    public void fillColor(){
        System.out.println("Filling color");
    }
}


public class interface_3 {
    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.draw();
        obj.fillColor();
    }
}
