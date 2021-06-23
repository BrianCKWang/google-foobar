import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class Level3_DoomsdayFuel {
    public static int[] solution(int[][] m) {
        // Your code here
        if(m == null || m.length == 0 || m[0].length == 0 || m.length != m[0].length){
            return new int[]{};
        }

        if(isTerminal(m[0])){
            int countTerminal = 0;
            for (int[] ints : m) {
                countTerminal += isTerminal(ints) ? 1 : 0;
            }
            int[] ans = new int[countTerminal+1];
            if(countTerminal == 0){
                return new int[]{};
            }
            ans[0] = 1;
            ans[countTerminal] = 1;
            return ans;
        }

        return calcMarkovChain(m);
    }

    private static int[] calcMarkovChain(int[][] m){
        //    [I O]
        //m = [R Q] -> get R and Q for calculation

        List<List<Fraction>> m_R = new ArrayList<>();
        List<List<Fraction>> m_Q = new ArrayList<>();

        // convert m to probability in fractions
        // [0, 1, 0, 0, 0, 1] -> [0, 0.5, 0, 0, 0, 0.5]
        Fraction[][] m_fraction = convertToProbability(m);

        List<Integer> noneTerminalIndex = new ArrayList<>();
        // get m_R, matrix that has the probability
        for(int i = 0; i < m[0].length; i++){
            if(!isTerminal(m[i])){
                noneTerminalIndex.add(i);
            }
        }

        // extract none terminal rows
        for(Integer index : noneTerminalIndex){
            m_R.add(new ArrayList<>(Arrays.asList(m_fraction[index]).subList(0, m[index].length)));
        }

        // save none terminal index to m_Q
        for(List<Fraction> m_R_row : m_R){
            List<Fraction> m_Q_row = new ArrayList<>();
            for(int index : noneTerminalIndex){
                m_Q_row.add(m_R_row.get(index));
            }
            m_Q.add(m_Q_row);
        }

        //remove none terminal index from m_R
        for(List<Fraction> m_R_row : m_R){
            for(int index = noneTerminalIndex.size(); index --> 0;){
                int indexToRemove = noneTerminalIndex.get(index);
                m_R_row.remove(indexToRemove);
            }
        }

        // I - m_Q
        for(int i = 0; i < m_Q.size(); i++){
            for(int j = 0; j < m_Q.size(); j++) {
                Fraction I = new Fraction(i==j?1:0);
                m_Q.get(i).set(j, Fraction.subtract(I, m_Q.get(i).get(j)));
            }
        }

        List<List<Fraction>> m_F = findInverse(m_Q);
        List<List<Fraction>> multiply = matrix_multiply(m_F, m_R);

        // get row at s0 for answer array
        List<Fraction> multiply_s0 = new ArrayList<>(multiply.get(0));
        int[] ansArr = new int[multiply_s0.size()+1];

        for(int i = 0; i < multiply_s0.size();i++){
            ansArr[i] = multiply_s0.get(i).getNum();
        }

        int LCM = Fraction.findLCM(multiply_s0);
        for(int i = 0; i < multiply_s0.size();i++){
            ansArr[i] *= ((double) LCM / multiply_s0.get(i).getDenom());
        }
        ansArr[multiply_s0.size()] = LCM;

        return ansArr;
    }

    private static Fraction[][] convertToProbability(int[][] m){
        Fraction[][] _m = new Fraction[m.length][m[0].length];
        for(int i = 0; i < m[0].length; i++){
            // get sum of row to calculate probability
            int sum = 0;
            for(int value : m[i]){
                sum += value;
            }
            // calculate probability
            for(int j = 0; j < m[i].length; j++){
                if(sum != 0.0){
                    _m[i][j] = new Fraction(m[i][j], sum);
                }
                else{
                    _m[i][j] = new Fraction(0);
                }
            }
        }

        return _m;
    }

    private static List<List<Fraction>> matrix_multiply(List<List<Fraction>> m_1, List<List<Fraction>> m_2){
        // number of columns of m_1 should be the same as number of rows of m_2
        if(m_1.size() == 0 || m_2.size() == 0){
            return new ArrayList<>();
        }

        if(m_1.get(0).size() != m_2.size()){
            return new ArrayList<>();
        }


        int matrixDim = m_1.size();
        List<List<List<Fraction>>> m_multiDim = new ArrayList<>();
        for(int dim = 0; dim < matrixDim; dim++) {
            List<List<Fraction>> m_singleDim = new ArrayList<>();
            for (List<Fraction> fractions : m_1) {
                List<Fraction> newRow = new ArrayList<>();
                for (int j = 0; j < m_2.get(0).size(); j++) {
                    newRow.add(Fraction.multiply(fractions.get(dim), m_2.get(dim).get(j)));
                }
                m_singleDim.add(newRow);
            }
            m_multiDim.add(m_singleDim);
        }

        // add the dim matrix
        List<List<Fraction>> ans = new ArrayList<>();
        for(List<List<Fraction>> m_singleDim : m_multiDim){
            if(ans.size() == 0){
                ans = new ArrayList<>(m_singleDim);
            }
            else{
                for(int i = 0; i < m_singleDim.size(); i++){
                    for(int j = 0; j < m_singleDim.get(0).size(); j++){
                        ans.get(i).set(j, Fraction.add(ans.get(i).get(j), m_singleDim.get(i).get(j)));
                    }
                }
            }
        }

        return ans;
    }

    private static List<List<Fraction>> findInverse(List<List<Fraction>> m){
        //1x1 - inverse is 1/num, 0 if num is 0
        if(m.size() == 1 && m.get(0).size() == 1){
            List<List<Fraction>> ans = new ArrayList<>();
            List<Fraction> singleValue = new ArrayList<>();
            Fraction value = new Fraction(1);
            Fraction denom = m.get(0).get(0);
            if(Fraction.compare(m.get(0).get(0), new Fraction(0)) != 0){
                value = Fraction.divide(value, denom);
            }
            else{
                value.setValue(1);
            }
            singleValue.add(value);
            ans.add(singleValue);
            return ans;
        }

        // Equation to calculate inverse of square matrix:
        // A^-1 = 1/det(A) * adj(A)

        // if m has no inverse, return empty m
        if(!hasInverse(m)){
            return new ArrayList<>();
        }

        // 2x2 matrix
        if(m.size() == 2){
            Fraction detInverse = Fraction.inverse(getDet(m)) ;
            List<List<Fraction>> ans = new ArrayList<>();
            List<Fraction> ans_row_1 = new ArrayList<>();
            List<Fraction> ans_row_2 = new ArrayList<>();
            Fraction a = m.get(0).get(0);
            Fraction b = m.get(0).get(1);
            Fraction c = m.get(1).get(0);
            Fraction d = m.get(1).get(1);

            Fraction posOne = new Fraction(1);
            Fraction negOne = new Fraction(-1);

            ans_row_1.add(Fraction.multiply(posOne, Fraction.multiply(d, detInverse)));
            ans_row_1.add(Fraction.multiply(negOne, Fraction.multiply(b, detInverse)));
            ans_row_2.add(Fraction.multiply(negOne, Fraction.multiply(c, detInverse)));
            ans_row_2.add(Fraction.multiply(posOne, Fraction.multiply(a, detInverse)));
            ans.add(ans_row_1);
            ans.add(ans_row_2);

            return ans;
        }

        // find the determinant of each of the m-1 x m-1 minor matrices
        int matrixDim = m.size();
        List<List<Fraction>> m_adj = new ArrayList<>();

        for (int i = 0; i < matrixDim; i++) {
            List<Fraction> m_adj_row = new ArrayList<>();
            for (int j = 0; j < matrixDim; j++) {
                // make the new m-1 x m-1 matrix for calculating determinant
                List<List<Fraction>> _m = reduceMatrix(i, j, m);
                Fraction det = getDet(_m);
                Fraction sign = new Fraction((i+j)%2==0?1:-1);
                m_adj_row.add(Fraction.multiply(sign, det));
            }
            m_adj.add(m_adj_row);
        }

        // transpose the original matrix
        List<List<Fraction>> m_adj_transpose = new ArrayList<>();
        for (int i = 0; i < matrixDim; i++) {
            List<Fraction> m_adj_transpose_row = new ArrayList<>();
            for (int j = 0; j < matrixDim; j++) {
                m_adj_transpose_row.add(m_adj.get(j).get(i));
            }
            m_adj_transpose.add(m_adj_transpose_row);
        }

        // get inverse determinant
        Fraction detInverse = Fraction.inverse(getDet(m));

        // multiply inverse det to all cell of adj
        for (int i = 0; i < matrixDim; i++) {
            for (int j = 0; j < matrixDim; j++) {
                m_adj_transpose.get(i).set(j, Fraction.multiply(detInverse, m_adj_transpose.get(i).get(j)));
            }
        }

        return m_adj_transpose;
    }

    private static boolean hasInverse(List<List<Fraction>> m){
        if(m.size() == 0 || m.size() != m.get(0).size()){
            return false;
        }
        Fraction det = getDet(m);
        Fraction zero = new Fraction(0);
        return Fraction.compare(det,zero) != 0;
    }

    private static Fraction getDet(List<List<Fraction>> m){
        // 2 x 2 matrix
        if(m.size() == 2 && m.get(0).size() >0 && m.size() == m.get(0).size()){
            // ad - bc
            Fraction a = m.get(0).get(0);
            Fraction b = m.get(0).get(1);
            Fraction c = m.get(1).get(0);
            Fraction d = m.get(1).get(1);

            Fraction ad = Fraction.multiply(a, d);
            Fraction bc = Fraction.multiply(b, c);

            return Fraction.subtract(ad, bc);
        }

        Fraction determinant = new Fraction(0);
        for(int dim = 0; dim < m.size(); dim++){
            // get determinant by reducing row 0
            List<List<Fraction>> _m = reduceMatrix(0, dim, m);
            Fraction dimFraction = new Fraction(dim%2==0?1:-1);
            Fraction det = getDet(_m);
            Fraction det2 = Fraction.multiply(dimFraction, m.get(0).get(dim));
            Fraction result = Fraction.multiply(det2,det);
            determinant = Fraction.add(determinant, result);
        }

        return determinant;
    }

    private static List<List<Fraction>> reduceMatrix(int dim_i, int dim_j, List<List<Fraction>> m){
        List<List<Fraction>> _m = new ArrayList<>();
        // add all rows other than first
        for(int i = 0; i < m.size(); i++){
            if(i != dim_i){
                _m.add(new ArrayList<>(m.get(i)));
            }
        }
        // remove column with dim index
        for (List<Fraction> fractions : _m) {
            fractions.remove(dim_j);
        }

        return _m;
    }

    private static boolean isTerminal(int[] _m){
        for(int value : _m){
            if(value != 0){
                return false;
            }
        }
        return true;
    }

    private static class Fraction{
        int[] num = new int[2];

        Fraction(int numerator){
            num[0] = numerator;
            num[1] = 1;
        }

        Fraction(int numerator, int denominator){
            num[0] = numerator;
            if(denominator < 0){
                num[0] *= -1;
                num[1] = -1 * denominator;
            }
            else{
                num[1] = denominator;
            }
            if(numerator == 0){
                num[1] = 1;
            }
        }

        public int getNum(){
            return num[0];
        }

        public int getDenom(){
            return num[1];
        }

        public double getDouble(){
            double numerator = num[0];
            double denominator = num[1];
            return numerator/denominator;
        }

        public void setValue(int num){
            this.num[0] = num;
            this.num[1] = 1;
        }

        public static int compare(Fraction num1, Fraction num2){
            if((num1.getNum() == num2.getNum()) && (num1.getDenom() == num2.getDenom())){
                return 0;
            }
            else if(num1.getDouble() > num2.getDouble()){
                return 1;
            }
            return -1;
        }

        public static Fraction add(Fraction num1, Fraction num2){
            if(num1.getNum() == 0){
                return num2;
            }
            if(num2.getNum() == 0){
                return num1;
            }
            int totalNum = num1.getNum() * num2.getDenom() + num2.getNum() * num1.getDenom();
            int commonDenom = num1.getDenom() * num2.getDenom();
            if(totalNum == 0){
                commonDenom = 1;
            }

            return simplifyFraction(new Fraction(totalNum, commonDenom));
        }

        public static Fraction subtract(Fraction num1, Fraction num2){
            if(num1.getNum() == 0){
                return Fraction.multiply(new Fraction(-1), num2);
            }
            if(num2.getNum() == 0){
                return num1;
            }
            int totalNum = num1.getNum() * num2.getDenom() - num2.getNum() * num1.getDenom();
            int commonDenom = num1.getDenom() * num2.getDenom();
            if(totalNum == 0){
                commonDenom = 1;
            }

            return simplifyFraction(new Fraction(totalNum, commonDenom));
        }

        public static Fraction multiply(Fraction num1, Fraction num2){
            int totalNum = num1.getNum() * num2.getNum();
            int commonDenom = num1.getDenom() * num2.getDenom();
            if(totalNum == 0){
                commonDenom = 1;
            }

            return simplifyFraction(new Fraction(totalNum, commonDenom));
        }

        public static Fraction divide(Fraction num1, Fraction num2){
            int sign_num1 = (num1.getNum() / Math.abs(num1.getNum()));
            int sign_num2 = (num2.getNum() / Math.abs(num2.getNum()));
            int sign = sign_num1 * sign_num2;
            int totalNum = sign * Math.abs(num1.getNum() * num2.getDenom());
            int commonDenom = Math.abs(num1.getDenom() * num2.getNum());
            if(totalNum == 0){
                commonDenom = 1;
            }
            if(commonDenom == 0){
                totalNum = 0;
                commonDenom = 1;
            }

            return simplifyFraction(new Fraction(totalNum, commonDenom));
        }

        public static Fraction inverse(Fraction num){
            return new Fraction(num.getDenom(), num.getNum());
        }

        private static Fraction simplifyFraction(Fraction num){
            if(num.getNum() == 0){
                return new Fraction(0, 1);
            }
            int gcd = findGCD(num.getNum(), num.getDenom());
            int newNum = num.getNum() / gcd;
            int newDenom = num.getDenom() / gcd;

            return new Fraction(newNum, newDenom);
        }

        private static Integer findGCD(int num1, int num2) {
            // Greatest Common Divisor
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
            if (num1 == 0 || num2 == 0) {
                return 0;
            }
            while (num1 != 0 && num2 != 0) {
                int numForMod = Math.min(num1, num2);
                if (num1 > num2) {
                    num1 %= numForMod;
                } else {
                    num2 %= numForMod;
                }
            }

            return Math.max(num1, num2);
        }

        public static Integer findLCM(List<Fraction> list){
            // Least Common Multiple
            if(list == null || list.size() == 0){
                return 1;
            }
            else if(list.size() == 1){
                return list.get(0).getDenom();
            }

            int LCM = 1;
            for(int i = 1; i < list.size(); i++){
                LCM = Math.max(LCM, findLCM(list.get(i-1).getDenom(), list.get(i).getDenom()));
            }

            return LCM;
        }

        public static Integer findLCM(int num1, int num2){
            // Least Common Multiple
            return Math.abs(num1*num2) / findGCD(num1, num2);
        }
    }
}
