import org.junit.Test;

import static org.junit.Assert.*;

public class UnescapeUtilTest {

    @Test
    public void unescape() {
        assertEquals("·",UnescapeUtil.unescape("&#183;"));
    }
}