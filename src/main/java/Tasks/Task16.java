package Tasks;

import Tasks.Point3D;

public class Task16 {
    public static void main(String[] args) {
        // Вектор из двух точек
        Point3D p1 = new Point3D(1, 3, 1);
        Point3D p2 = new Point3D(3, 1, 2);
        Vector3D v1 = new Vector3D(p1, p2);
        double len = v1.vectorLength();
        System.out.println(len);
        
        Point3D p3 = new Point3D(1, 3, 1);
        Point3D p4 = new Point3D(3, 1, 2);
        Vector3D v2 = new Vector3D(p3, p4);        
        System.out.println(v1.vectorsEqual(v2));

        Vector3D v4 = new Vector3D(1, 6, -4);
    }
}
