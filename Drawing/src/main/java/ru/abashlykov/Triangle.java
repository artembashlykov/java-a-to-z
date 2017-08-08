package src.main.java.ru.abashlykov;

/**
 * Created by art on 10.04.2017.
 */
public class Triangle implements Shape {
    public String pic(){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("     *     \n");
        sb1.append("    * *    \n");
        sb1.append("   *   *   \n");
        sb1.append("  *     *  \n");
        sb1.append(" ********* \n");

        String s = sb1.toString();

        return s;
    }
}
