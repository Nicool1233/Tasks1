package Tasks;

import Tasks.Vector3D;

public class Vector3DProcessor {
    
    public static Vector3D vectorsSum(Vector3D v1, Vector3D v2){ // Сумма
        return new Vector3D(v1.getP().getX() + v2.getP().getX(),
                v1.getP().getY() + v2.getP().getY(),
                v1.getP().getZ() + v2.getP().getZ());
    }
    public static Vector3D vectorsRazn(Vector3D v1, Vector3D v2){ // Разность
        return new Vector3D(v1.getP().getX() - v2.getP().getX(),
                v1.getP().getY() - v2.getP().getY(),
                v1.getP().getZ() - v2.getP().getZ());
    }
    public static double vectorsSkal(Vector3D v1, Vector3D v2){ // Скалярное произведение
        return ((v1.getP().getX()) * (v2.getP().getX()) +
                (v1.getP().getY()) * (v2.getP().getY()) +
                (v1.getP().getZ()) * (v2.getP().getZ()));
    }
    public static Vector3D vectorsVekt(Vector3D v1, Vector3D v2){ // Векторное произведение
        return new Vector3D ((v1.getP().getY()) * (v2.getP().getZ()) - (v1.getP().getZ()) * (v2.getP().getY()),
                (v1.getP().getX()) * (v2.getP().getZ()) - (v1.getP().getZ()) * (v2.getP().getX()),
                (v1.getP().getX()) * (v2.getP().getY()) - (v1.getP().getY()) * (v2.getP().getX()));
    }
    public static boolean vectorsColl(Vector3D v1, Vector3D v2){ // Коллинеарность
        Vector3D v3 = vectorsVekt(v1, v2);
        return (v3.getP().getX() == 0&& v3.getP().getY() == 0&& v3.getP().getZ() == 0);
    }
    
}
