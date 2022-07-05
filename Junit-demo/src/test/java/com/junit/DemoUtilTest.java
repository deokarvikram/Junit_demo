package com.junit;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilTest {

    DemoUtil d=new DemoUtil();

//    @BeforeAll
//    static void before_All()
//    {
//        System.out.println("Before all");
//    }
//
//    @BeforeEach
//    void beforeEach()
//    {
//        System.out.println("This is before each method");
//
//    }


    @Test
    @Order(3)
    public void arraysEquals()
    {
        String[] darr={"A","B","C"};

        assertArrayEquals(darr,d.getArray());
    }

    @Test
    @Order(1)
    public void throwNotThrow()
    {
        assertThrows(Exception.class,()->{d.throwException(-2);});
        assertDoesNotThrow(()->{d.throwException(90);});
    }

    @Test
    public void timeOutTest()
    {

                assertTimeoutPreemptively(Duration.ofSeconds(3),()->d.timeOut());
    }

    @Test
    @Order(-4)
    public void matchList()
    {
        String[] sarr=new String[]{"Love","2","Code"};
        ArrayList<String> dlist= new ArrayList<>(); //List.of("Love","2","Code");
        dlist.add("Love");
        dlist.add("2");
        dlist.add("Code");
        assertLinesMatch(dlist,d.getList());
    }


    @Test
    @DisplayName("Equals not equals")
    public void equalsNotEquals()
    {
        System.out.println("This is equals not equals");
           assertEquals(5, d.add(2,3),"2+3 equals to 5");
        assertNotEquals(6, d.add(2, 3), "2+3 not equals to 6");

    }

    @Test
    @DisplayName("null not null")
    public void nullNotNull()
    {
        String str1=null;
        String str2="Vikram";
        System.out.println("This is null not null");
        assertNotNull(d.nullNotNull(str2),"must not be null");
        assertNull(d.nullNotNull(str1),"must be null");


    }


    @Test
    void sameNotSame()
    {
        assertSame(d.getAcademy(),d.getDuplicate(),"Should be same");
        assertNotSame(d.getAcademy(),"code 8","Should not be same");
    }

    @Test
    void trueFalse()
    {
        assertTrue(d.isGreater(12,3),"12 is greater than 3");
        assertFalse(d.isGreater(3,12),"3 is not greater than 12");
    }
@Test
    void testMultiply()
{
    assertEquals(6,d.multiply(2,3),"2*3=6");
}

//    @AfterEach
//    void afterEach()
//    {
//        System.out.println("This is after each method");
//    }
//    @AfterAll
//    static void afterAll()
//    {
//        System.out.println("after all");
//    }
}
