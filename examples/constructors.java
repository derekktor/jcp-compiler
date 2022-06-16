//filename: Main.java
public class Main {
    int modelYear;
    String modelName;

    public Main() {
        modelName = "hello";
        modelYear = 1950;
    }

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear);
        System.out.println(myCar.modelName);
    }
}
