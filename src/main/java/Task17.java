public class Task17 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 3, 1);
        Point3D p2 = new Point3D(3, 1, 2);
        Vector3D v1 = new Vector3D(p1, p2);

        Point3D p3 = new Point3D(9, 2, 0);
        Point3D p4 = new Point3D(2, -3, 6);
        Vector3D v2 = new Vector3D(p3, p4);

        Vector3D v3 = Vector3DProcessor.vectorsSum(v1, v2);
        v3.getP().printPoint3D();
        v3.getP().printPoint3D();
        
        Vector3D v4 = Vector3DProcessor.vectorsRazn(v1, v2);
        v4.getP().printPoint3D();
        
        Point3D p5 = new Point3D();
        Point3D p6 = new Point3D(1, 1, 2);
        Point3D p7 = new Point3D();
        Point3D p8 = new Point3D(2, 3, 4);
        
        Vector3D v5 = new Vector3D(p5, p6);
        Vector3D v6 = new Vector3D(p7, p8);
        double s = Vector3DProcessor.vectorsSkal(v5, v6);
        System.out.println(s);

        Vector3D v7 = Vector3DProcessor.vectorsVekt(v5, v6);
        boolean coll = Vector3DProcessor.vectorsColl(v1, v2);
    }
}
