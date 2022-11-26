package Tasks;

import java.util.Objects;

public class Vector3D {
    private Point3D p;

    // Конструкторы
    public Vector3D(){
        p = new Point3D();
    }
    
    public Vector3D(double x, double y, double z){
        p = new Point3D();
        p.setX(x);
        p.setY(y);
        p.setZ(z);
    }

    public Vector3D(Point3D p1, Point3D p2){
        p = new Point3D();
        p.setX(p2.getX() - p1.getX());
        p.setY(p2.getY() - p1.getY());
        p.setZ(p2.getZ() - p1.getZ());
    }

    public Point3D getP() {
        return p;
    }
    
    public double vectorLength(){ // Длина вектора
        return Math.sqrt(Math.pow(p.getX(), 2) + 
                         Math.pow(p.getY(), 2) + 
                         Math.pow(p.getZ(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Objects.equals(p, vector3D.p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p);
    }
}

