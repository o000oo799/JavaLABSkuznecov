
public class Point3d
{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d()
    {
        xCoord = 0.0;
        yCoord = 0.0;
        zCoord = 0.0;
    }
    public double getX()
    {
        return xCoord;
    }
    public double getY()
    {
        return yCoord;
    }
    public double getZ()
    {
        return zCoord;
    }
    public void setX(double val)
    {
        xCoord = val;
    }
    public void setY(double val)
    {
        yCoord = val;
    }
    public void setZ(double val)
    {
        zCoord = val;
    }
    public void equalpoints(Point3d val1, Point3d val2)
    {
        if (val1.getX()== val2.getX()&&val1.getY()== val2.getY()&&val1.getZ()== val2.getZ())
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
    public double distanceTo (Point3d val)
    {
        return (Math.sqrt(Math.pow(val.getX()-this.getX(),2)+Math.pow(val.getY()-this.getY(),2)+Math.pow(val.getZ()-this.getZ(),2)));
    }

}




