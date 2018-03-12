package sk.akademiasovy.ProjectUnitTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class unitTest {

    @Test
    public void max() {
        unit unitTest1 = new unit();
        assertEquals(unitTest1.max(7,3,2),7);
        assertEquals(unitTest1.max(1,3,2),3);
        assertEquals(unitTest1.max(14,13,15),15);
        assertEquals(unitTest1.max(14,18,88),88);
        assertEquals(unitTest1.max(0, 0, 1), 1);
        assertEquals(unitTest1.max(5, 6, 5), 6);
        assertEquals(unitTest1.max(78, 87, 89), 89);
        assertEquals(unitTest1.max(9, 4, 1), 9);

    }

    @Test
    public void reverse() throws Exception {
        unit unitTest2 = new unit();
        assertEquals(unitTest2.Reverse("Hellou"),"uolleH");
        assertEquals(unitTest2.Reverse(""),"");
        assertEquals(unitTest2.Reverse(" ")," ");
        assertEquals(unitTest2.Reverse("hoppaaA"),"Aaappoh");
        assertEquals(unitTest2.Reverse("jk l"),"l kj");
        assertEquals(unitTest2.Reverse("BEsT"),"TsEB");
        assertEquals(unitTest2.Reverse("Abc"),"cbA");
        assertEquals(unitTest2.Reverse("eurt"),"true");
        assertNull(unitTest2.Reverse(null));

    }

    @Test
    public void isPrimeNumber() throws Exception {
        unit unitTest3 = new unit();
        assertTrue(unit.isPrimeNumber(2));
        assertTrue(unit.isPrimeNumber(3));
        assertTrue(unit.isPrimeNumber(5));
        assertTrue(unit.isPrimeNumber(7));
        assertTrue(unit.isPrimeNumber(11));
        assertTrue(unit.isPrimeNumber(13));
        assertTrue(unit.isPrimeNumber(17));
        assertTrue(unit.isPrimeNumber(23));

    }
}