package deqo.emar.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by emartin on 24/10/17.
 */
public class ItemTest {
    private Item item;
    private Object object1, object2;

    @Before
    public void setUp() {
        object1 = new String("This is a test string");
        object2 = new Integer(2017);
    }

    @Test
    public void testGetSet() {
        // Given the fixture
        // When
        item = new Item(object1);
        // then
        assertThat(item.getObject(), sameInstance(object1));
        // When
        item.setObject(object2);
        // then
        assertThat(item.getObject(), sameInstance(object2));
    }
}
