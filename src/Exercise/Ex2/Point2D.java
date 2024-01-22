package Exercise.Ex2;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[] {x,y};
    }
    @Override
    public String toString(){
        return "(x = " + x + ", y =  " + y + ")";

    }

    public static void main(String[] args) {
        Point2D obj1=new Point2D();
        System.out.println(obj1.toString());
        Point2D newObj=new Point2D(2,4);
        System.out.println(newObj.toString());
    }
}
