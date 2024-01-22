package Exercise.Ex2;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){
        super();
        this.z=0.0f;
    }
    public Point3D(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(float x, float y, float z){
        return new float[] {x,y,z};
    }
    @Override
    public String toString(){
        return "(x = \"" + getX() + "\", y = \"" + getY() + "\", z = \"" + z + "\")";
    }

    public static void main(String[] args) {
        Point3D obj1=new Point3D();
        System.out.println(obj1.toString());
        Point3D newObj=new Point3D(1,2,3);
        System.out.println(newObj.toString());
    }
}
