import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level3_DoomsdayFuelTest {
    @Test
    void q4_Test_1() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 2, 1, 0, 0},
                {0, 0, 0, 3, 4},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{7, 6, 8, 21});
    }

    @Test
    void q4_Test_2() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 1, 0, 0, 0, 1},
                {4, 0, 0, 3, 2, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{0, 3, 2, 9, 14});
    }

    @Test
    void q4_Test_3() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 0, 0, 0, 0, 0, 1});
    }

    @Test
    void q4_Test_4() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {3, 1, 6, 2, 0, 4},
                {0, 1, 0, 0, 5, 0},
                {0, 0, 3, 1, 2, 0},
                {5, 0, 3, 0, 0, 8},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{83, 92, 175});
    }

    @Test
    void q4_Test_5() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 1, 0, 0, 1, 0},
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1});
    }

    @Test
    void q4_Test_6() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {4, 0, 3, 0, 0, 0},
                {0, 1, 9, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 2, 0},
                {0, 0, 5, 4, 5, 5},
                {0, 0, 1, 5, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1});
    }

    @Test
    void q4_Test_7() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {4, 1, 1, 0, 0, 3, 0, 3, 0, 6},
                {0, 0, 1, 0, 0, 3, 0, 2, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 4, 0, 0},
                {0, 0, 0, 0, 1, 0, 6, 0, 0, 6},
                {0, 0, 2, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 1, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{5411, 20042, 10304, 31779, 67536});
    }

    @Test
    void q4_Test_8() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0,  0, 12, 0, 15, 0, 0, 0, 1, 8},
                {0,  0, 60, 0, 0, 7, 13, 0, 0, 0},
                {0, 15,  0, 8, 7, 0, 0,  1, 9, 0},
                {23, 0,  0, 0, 0, 1, 0,  0, 0, 0},
                {37, 35, 0, 0, 0, 0, 3, 21, 0, 0},
                {0,  0,  0, 0, 0, 0, 0,  0, 0, 0},
                {0,  0,  0, 0, 0, 0, 0,  0, 0, 0},
                {0,  0,  0, 0, 0, 0, 0,  0, 0, 0},
                {0,  0,  0, 0, 0, 0, 0,  0, 0, 0},
                {0,  0,  0, 0, 0, 0, 0,  0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 2, 3, 4, 5, 15});
    }

    @Test
    void q4_Test_9() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 7, 0,17, 0, 1, 0, 5, 0, 2},
                {0, 0, 29,0, 28,0, 3, 0,16, 0},
                {0, 3, 0, 0, 0, 1, 0, 0, 0, 0},
                {48,0, 3, 0, 0, 0,17, 0, 0, 0},
                {0, 6, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{4, 5, 5, 4, 2, 20});
    }

    @Test
    void q4_Test_10() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1, 1, 1, 1, 5});
    }

    @Test
    void q4_Test_11() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {1, 1, 1, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{2, 1, 1, 1, 1, 6});
    }

    @Test
    void q4_Test_12() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 86, 61, 189, 0, 18, 12, 33, 66, 39},
                {0, 0, 2, 0, 0, 1, 0, 0, 0, 0},
                {15, 187, 0, 0, 18, 23, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{6, 44, 4, 11, 22, 13, 100});
    }

    @Test
    void q4_Test_13() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 0, 0, 0, 3, 5, 0, 0, 0, 2},
                {0, 0, 4, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 4, 4, 0, 0, 0, 1, 1},
                {13, 0, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 1, 8, 7, 0, 0, 0, 1, 3, 0},
                {1, 7, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1, 1, 2, 5});
    }

    @Test
    void q4_Test_14() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1});
    }

    @Test
    void q4_Test_15() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 0},
                {0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 0, 1});
    }

    @Test
    void q4_Test_16() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{
                {0, 1},
                {0, 0}
        };
        assertArrayEquals(q4.solution(input), new int[]{1, 1});
    }

    @Test
    void q4_Test_17() throws Exception{
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        int[][] input = new int[][]{{}};
        assertArrayEquals(q4.solution(input), new int[]{});
    }

    //        Fraction num1 = new Fraction(9,-3);
//        Fraction num2 = new Fraction(-23,4);
//        Fraction result = Fraction.add(num1, num2);
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " plus ");
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " equals ");
//        System.out.println(result.getNum() + "/" + result.getDenom());
//        System.out.println();
//        result = Fraction.subtract(num1, num2);
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " minus ");
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " equals ");
//        System.out.println(result.getNum() + "/" + result.getDenom());
//        result = Fraction.multiply(num1, num2);
//        System.out.println();
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " times ");
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " equals ");
//        System.out.println(result.getNum() + "/" + result.getDenom());
//        result = Fraction.divide(num1, num2);
//        System.out.println();
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " divided by ");
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " equals ");
//        System.out.println(result.getNum() + "/" + result.getDenom());
//        System.out.println();
//        result = Fraction.inverse(num2);
//        System.out.println();
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " inverse is ");
//        System.out.println(result.getNum() + "/" + result.getDenom());
//        System.out.println();
//        List<Fraction> fractionList = new ArrayList<>();
//        fractionList.add(num1);
//        fractionList.add(num1);
//        fractionList.add(num2);
//        int LCM = Fraction.findLCM(fractionList);
//        System.out.println(" LCM of ");
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " and ");
//        System.out.println(num1.getNum() + "/" + num1.getDenom() + " and ");
//        System.out.println(num2.getNum() + "/" + num2.getDenom() + " is ");
//        System.out.println(LCM);

//        List<List<Fraction>> fracList = new ArrayList<>();
//        List<Fraction> list_1 = new ArrayList<>();
//        list_1.add(new Fraction(6));
//        list_1.add(new Fraction(1));
//        list_1.add(new Fraction(1));
//        List<Fraction> list_2 = new ArrayList<>();
//        list_2.add(new Fraction(4));
//        list_2.add(new Fraction(-2));
//        list_2.add(new Fraction(5));
//        List<Fraction> list_3 = new ArrayList<>();
//        list_3.add(new Fraction(2));
//        list_3.add(new Fraction(8));
//        list_3.add(new Fraction(7));
//        fracList.add(list_1);
//        fracList.add(list_2);
//        fracList.add(list_3);
//        Fraction det = getDet(fracList);

    @Test
    void q4_initFraction() throws Exception{
        Level3_DoomsdayFuel.Fraction q4 = new Level3_DoomsdayFuel.Fraction(1);
        assertEquals(q4.getNum(), 1);
        assertEquals(q4.getDenom(), 1);
    }

    @Test
    void q4_staticAdd() throws Exception{
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 7);
        Level3_DoomsdayFuel.Fraction result = Level3_DoomsdayFuel.Fraction.add(num1, num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(11, 28);

        assertEquals(Level3_DoomsdayFuel.Fraction.compare(result, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);

    }

    @Test
    void q4_add() throws Exception{
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 3);
        num1.add(num2);


        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(7, 12);

        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_staticSubtract() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 7);

        // act
        Level3_DoomsdayFuel.Fraction result = Level3_DoomsdayFuel.Fraction.subtract(num1, num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(3, 28);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(result, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_subtract() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 3);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act
        num1.subtract(num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(1, 12);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_staticMultiply() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(5, 7);

        // act
        Level3_DoomsdayFuel.Fraction result = Level3_DoomsdayFuel.Fraction.multiply(num1, num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(5, 28);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(result, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_multiply() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 3);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act
        num1.multiply(num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(1, 12);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_staticDivide() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(5, 7);

        // act
        Level3_DoomsdayFuel.Fraction result = Level3_DoomsdayFuel.Fraction.divide(num1, num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(7, 20);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(result, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_divide() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 3);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act
        num1.divide(num2);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(4, 3);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_staticInverse() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act
        Level3_DoomsdayFuel.Fraction result = Level3_DoomsdayFuel.Fraction.inverse(num1);
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(4, 1);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(result, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_inverse() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(2, 3);

        // act
        num1.inverse();
        Level3_DoomsdayFuel.Fraction expected = new Level3_DoomsdayFuel.Fraction(3, 2);

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, expected), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }

    @Test
    void q4_staticIsZero() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(0, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.isZero(num1), true);
        assertEquals(Level3_DoomsdayFuel.Fraction.isZero(num2), false);
    }

    @Test
    void q4_isZero() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(0, 4);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);

        // act

        // assert
        assertEquals(num1.isZero(), true);
        assertEquals(num2.isZero(), false);
    }

    @Test
    void q4_compare() throws Exception{
        // arrange
        Level3_DoomsdayFuel.Fraction num1 = new Level3_DoomsdayFuel.Fraction(-1, 3);
        Level3_DoomsdayFuel.Fraction num2 = new Level3_DoomsdayFuel.Fraction(1, 4);
        Level3_DoomsdayFuel.Fraction num3 = new Level3_DoomsdayFuel.Fraction(1, 2);
        Level3_DoomsdayFuel.Fraction num4 = new Level3_DoomsdayFuel.Fraction(1, 2);
        // act

        // assert
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, num2), Level3_DoomsdayFuel.Fraction.compareResult.isLess);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num1, num3), Level3_DoomsdayFuel.Fraction.compareResult.isLess);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num2, num3), Level3_DoomsdayFuel.Fraction.compareResult.isLess);

        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num2, num1), Level3_DoomsdayFuel.Fraction.compareResult.isLarger);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num3, num1), Level3_DoomsdayFuel.Fraction.compareResult.isLarger);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num3, num2), Level3_DoomsdayFuel.Fraction.compareResult.isLarger);

        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num3, num4), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num3.multiply(num4), num2), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
        assertEquals(Level3_DoomsdayFuel.Fraction.compare(num4.multiply(num4), num2), Level3_DoomsdayFuel.Fraction.compareResult.isEqual);
    }
}