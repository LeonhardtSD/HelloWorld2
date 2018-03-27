package main;

import com.model.Model1;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Leon
 */
public class HelloTest {

    @Test
    public void testHello1() {
        Model1 m1=new Model1("2111605133","高兆曦",25);
        Model1 m2=new Model1();

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        m2.setId("1");
        m2.setName("gao");
        m2.setAge(1);
    }
}