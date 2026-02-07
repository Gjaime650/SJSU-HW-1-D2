package proj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class MergeTest {
    private final Merge merge = new Merge();
    private ArrayList<Integer> array1 = new ArrayList<>();
    private ArrayList<Integer> array2 = new ArrayList<>();
    private ArrayList<Integer> expected = new ArrayList<>();
    private ArrayList<Integer> result = new ArrayList<>();

    @Test
    void test1(){
        array1.addAll(Arrays.asList(1, 3, 5, 7, 9));
        array2.addAll(Arrays.asList(2, 4, 6, 8, 10));
        result = merge.MergeArrays(array1,array2);

        expected.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("\nTest1");
        System.out.println("array1: " + array1 +
                          "\narray2: " + array2 +
                          "\nExpected: " + expected +
                          "\nResult after Merge: " + result);


        assertEquals(expected,result);

    }
   @Test
    void test2(){

        array1.addAll(Arrays.asList(1, 2, 4, 4, 7, 11));
        array2.addAll(Arrays.asList(2, 4, 6, 8));
        result = merge.MergeArrays(array1,array2);

        expected.addAll(Arrays.asList(1, 2, 2, 4, 4, 4, 6, 7, 8, 11));
       System.out.println("\nTest2");
       System.out.println("array1: " + array1 +
               "\narray2: " + array2 +
               "\nExpected: " + expected +
               "\nResult after Merge: " + result);


        assertEquals(expected,result);

    }
    //Test with different sized array
    @Test
    void test3(){

        array1.addAll(Arrays.asList(1, 2, 3));
        array2.addAll(Arrays.asList(10, 11, 12, 13));
        result = merge.MergeArrays(array1,array2);

        expected.addAll(Arrays.asList(1, 2, 3, 10, 11, 12, 13));
        System.out.println("\nTest3");
        System.out.println("array1: " + array1 +
                "\narray2: " + array2 +
                "\nExpected: " + expected +
                "\nResult after Merge: " + result);


        assertEquals(expected,result);

    }
    //Test with Negative numbers
    @Test
    void test4(){

        array1.addAll(Arrays.asList(-10, -3, 0, 5));
        array2.addAll(Arrays.asList(-8, -2, 1, 4, 6));
        result = merge.MergeArrays(array1,array2);

        expected.addAll(Arrays.asList(-10, -8, -3, -2, 0, 1, 4, 5, 6));
        System.out.println("\nTest4");
        System.out.println("array1: " + array1 +
                "\narray2: " + array2 +
                "\nExpected: " + expected +
                "\nResult after Merge: " + result);


        assertEquals(expected,result);

    }
}