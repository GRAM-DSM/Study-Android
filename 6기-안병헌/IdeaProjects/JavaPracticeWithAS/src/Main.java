public class Main {
    public static void main(String[] args) {
        String box1 = "", box2 = "";
        int a = 0, b = 0, number = 1;

        box1 = Integer.toString(number);
        number++;
        box2 = Integer.toString(number);

        a = Integer.parseInt(box1);
        b = Integer.parseInt(box2);
        System.out.println(a + b);
    }
}

