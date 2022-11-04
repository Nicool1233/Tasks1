package Tasks;

import Tasks.Point3D;
import Tasks.Vector3D;

import java.util.ArrayList;

public class Vector3DArray {
    private ArrayList<Vector3D> vectors;

    // Конструктор
    public Vector3DArray(int size){
        vectors = new ArrayList<>();
        for (int i = 0; i < size; i++){
            vectors.add(new Vector3D());
        }
    }
    public int arrayLen(){
        return vectors.size();
    } // Размер массива

    public void setElem(int i, Vector3D elem){
        vectors.set(i, elem);
    }
    // Наибольшая длина вектора в массиве
    public double maxLen(){
        double max = 0;
        for (Vector3D vector : vectors) {
            if (vector.vectorLength() > max) {
                max = vector.vectorLength();
            }
        }
        return max;
    }

    // Найти нужный вектор
    public int findVector(Vector3D v) {
        int ind = -1;
        Vector3D t;
        for (int i = 0; i < vectors.size(); i++){
            t = vectors.get(i);
            if (t.getP().getX() == v.getP().getX() && t.getP().getY() == v.getP().getY() && t.getP().getZ() == v.getP().getZ()){
                ind = i;
                break;
            }
        }
        return ind;
    }

    // Сумма векторов
    public Vector3D vectorsSum(){
        Vector3D v = new Vector3D();
        Vector3D t;
        for (Vector3D vector : vectors) {
            t = vector;
            v.getP().setX(v.getP().getX() + t.getP().getX());
            v.getP().setY(v.getP().getY() + t.getP().getY());
            v.getP().setZ(v.getP().getZ() + t.getP().getZ());
        }
        return v;
    }
    
    public Vector3D vectorsComb(int[] array){
        Vector3D v = new Vector3D();
        Vector3D t;
        if (array.length != vectors.size())
            return v;
        for (int i = 0; i < vectors.size(); i++){
            t = vectors.get(i);
            v.getP().setX(v.getP().getX() + array[i] * t.getP().getX());
            v.getP().setY(v.getP().getY() + array[i] * t.getP().getY());
            v.getP().setZ(v.getP().getZ() + array[i] * t.getP().getZ());
        }
        return v;
    }
    
    public ArrayList<Point3D> vectorsPoint(Point3D p){
        ArrayList<Point3D> points = new ArrayList<>();
        Point3D t;

        for (Vector3D vector : vectors) {
            t = vector.getP();
            p.setX(p.getX() + t.getX());
            p.setY(p.getY() + t.getY());
            p.setZ(p.getZ() + t.getZ());
            points.add(t);
        }
        return points;
    }
    
    
}
