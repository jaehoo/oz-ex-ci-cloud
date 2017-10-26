package org.oz.calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ArithmeticOpsTest {

    private ArithmeticOps ops;
    private Double a,b,res;
    private Class<Throwable> exceptionClass;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2d,4d,6d, null}
                ,{2d,null,6d, NullPointerException.class}
        });
    }

    @Before
    public void setUp() throws Exception {
        ops = new ArithmeticOps();
    }

    public ArithmeticOpsTest(Double a, Double b, Double res, Class<Throwable> exceptionClass) {
        this.a = a;
        this.b = b;
        this.res = res;
        this.exceptionClass = exceptionClass;
    }

    @Test
    public void add() throws Exception {

        if (exceptionClass != null) {
            expected.expect(exceptionClass);
        }

        Double r = ops.add(a,b);
        assertThat(r, is(res));
    }


}