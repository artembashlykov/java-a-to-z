package src.main.java.ru.abashlykov;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



/**
 * Created by art on 11.04.2017.
 */
public class PaintTest {
    @Test
    public void shouldPrintSquare(){

        StringBuilder sb = new StringBuilder();
        sb.append(" ******* \n");
        sb.append(" *     * \n");
        sb.append(" *     * \n");
        sb.append(" *     * \n");
        sb.append(" ******* \n");
        String string1 = sb.toString();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint.draw(new Square());
        assertThat(out.toString(), is(string1));
    }

    @Test
    public void shouldPrintTriangle(){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("     *     \n");
        sb1.append("    * *    \n");
        sb1.append("   *   *   \n");
        sb1.append("  *     *  \n");
        sb1.append(" ********* \n");
        String string2 = sb1.toString();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint.draw(new Triangle());
        assertThat(out.toString(), is(string2));
    }

}