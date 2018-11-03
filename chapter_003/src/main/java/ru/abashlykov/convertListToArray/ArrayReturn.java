package сonvertListToArray.main.java.ru.abashlykov.convert;

public class ArrayReturn {

    public static void main(String[] args) {
        ArrayReturn t = new ArrayReturn();
        t.calc(0);

    }
    public void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }
}