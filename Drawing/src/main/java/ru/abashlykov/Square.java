package src.main.java.ru.abashlykov;

/**
 * Created by art on 10.04.2017.
 */
public class Square implements Shape {

    public String pic(){
        StringBuilder sb = new StringBuilder();
        sb.append(" ******* \n");
        sb.append(" *     * \n");
        sb.append(" *     * \n");
        sb.append(" *     * \n");
        sb.append(" ******* \n");

        String s = sb.toString();

        return s;
    }

}
