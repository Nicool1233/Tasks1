public class Task15 {
    public static void main(String[] args) {
        // Создание точек
        Point3D obj1 = new Point3D(1, 2, 3);
        Point3D obj2 = new Point3D(7, 4, 9);
        Point3D obj3 = new Point3D();
        // Выставляем координаты точкам
        obj1.setX(8);
        obj2.setZ(-3);
        obj3.setY(5);
        
        System.out.println(obj1 == obj2); 
        System.out.println(obj3 == obj3);
        
        obj1.printPoint3D();
    }
}
