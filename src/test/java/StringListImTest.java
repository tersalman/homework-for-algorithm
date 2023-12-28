import org.example.StringList;
import org.example.StringListIm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringListImTest {
    private final StringListIm out = new StringListIm();



    @Test
    public void shouldAddItemCorrectly() {
        String exp = "hi";

        out.add("hi");

        String actual = out.arr[0];

        assertEquals(exp,actual);


    }

    @Test
    public void shouldAddItemWithIndex() {

        String expected = "two";
        assertEquals(expected, out.add(9, "two"));
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
    public void shouldReturnBooleanResultOfEqualsWithArrays(StringList otherList) {
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
