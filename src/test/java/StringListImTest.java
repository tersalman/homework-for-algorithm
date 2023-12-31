import org.example.IntegerList;
import org.example.IntegerListIm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringListImTest {
    private final IntegerListIm out = new IntegerListIm();



    @Test
    public void shouldAddItemCorrectly() {
        Integer exp = 1;

        out.add(1);

        Integer actual = out.arr[0];

        assertEquals(exp,actual);


    }

    @Test
    public void shouldAddItemWithIndex() {

        Integer expected = 2;
        assertEquals(expected, out.add(9, 2));
    }
    @Test
    public void shouldSet(int index, String item) {
    }
    @Test
    public void shouldRemoveItem(String item) {
    }
    @Test
    public void shouldRemoveItemWithIndex(int index) {
    }
    @Test
    public void shouldReturnBooleanOfContains(String item) {
    }
    @Test
    public void shouldIndexOf(String item) {
    }
    @Test

    public void shouldLastIndexOf(String item) {
    }
    @Test
    public void shouldGet(int index) {
    }
    @Test
    public void shouldReturnBooleanResultOfEqualsWithArrays(IntegerList otherList) {
    }
    @Test
    public void shouldReturnSize() {
    }
    @Test
    public void shouldReturnBooleanResultOfIsEmpty() {
    }
    @Test
    public void shouldClear() {

    }
    @Test
    public void shouldTransformObjectToArray() {

    }


}
