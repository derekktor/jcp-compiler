public class Main {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (String i : cars) {
        //     System.out.println(i);
        // }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int index = 0;
        while (index < cars.length) {
            System.out.println(cars[index]);
            index++;
        }

    }
}
