package Exercise.Ex3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
        super();
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        this.setX(x);
        this.setY(y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+ "), speed= ("+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint defaultPoint= new MovablePoint();
        System.out.println(defaultPoint.toString());
        defaultPoint.setSpeed(5,6);
        System.out.println(defaultPoint.toString());
        defaultPoint.move();
        System.out.println(defaultPoint.toString());
        MovablePoint point1=new MovablePoint(1,2,3,4);
        System.out.println(point1.toString());
        point1.move();
        System.out.println(point1.toString());

    }
}
