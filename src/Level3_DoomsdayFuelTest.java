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
}