import java.util.*;

public class Main {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//
//        int q1_inputs_1 = 15324;
//        int q1_inputs_2 = 12;
//        Level1_MaxSquare q1 = new Level1_MaxSquare();
//        System.out.println(Arrays.toString(q1.solution(q1_inputs_1)));
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
//        int[] q2_inputs_1 = new int[]{5,3,2,1};
//        Level2_EncodedMessage q2 = new Level2_EncodedMessage();
//        System.out.println(q2.solution(q2_inputs_1));


//        Random rand = new Random();
//        List<String> inputGen = new ArrayList<>();
//        Set<String> inputGenSet = new HashSet<>();
//        for(int i = 0; i < 500; i++){
//            int major = rand.nextInt(10);
//            int minor = rand.nextInt(10);
//            int revision = rand.nextInt(10);
//            int type = rand.nextInt(3);
//            String newRev = "";
//
//            switch(type){
//                case 0:
//                    newRev = major + "." + minor + "." + revision;
//                    break;
//                case 1:
//                    newRev = major + "." + minor;
//                    break;
//                case 2:
//                    newRev = String.valueOf(major);
//                    break;
//            }
//
//            if(!inputGenSet.contains(newRev)) {
//                inputGenSet.add(newRev);
//                inputGen.add(newRev);
//            }
//        }
//
//        String[] q3_input_inputGen = new String[inputGen.size()];
//        for(int i = 0; i < inputGen.size(); i++){
//            q3_input_inputGen[i] = inputGen.get(i);
//        }
//        String[] q3_inputs_1 = new String[]{"1.11","2.0.0","1.2","2","0.1","1.2.1","1.1.1","2.0"};
//        String[] q3_inputs_2 = new String[]{"1.1.2","1.0","1.3.3","1.0.12","1.0.2"};
//        Level2_ElevatorMaintenance q3 = new Level2_ElevatorMaintenance();
//        System.out.println(Arrays.toString(q3.solution(q3_input_inputGen)));

        List<int[][]> q4_inputs = new ArrayList<>();
        q4_inputs.add(new int[][]{
                {0, 2, 1, 0, 0},
                {0, 0, 0, 3, 4},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
                {0, 1, 0, 0, 0, 1},
                {4, 0, 0, 3, 2, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
                {3, 1, 6, 2, 0, 4},
                {0, 1, 0, 0, 5, 0},
                {0, 0, 3, 1, 2, 0},
                {5, 0, 3, 0, 0, 8},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
                {0, 1, 0, 0, 1, 0},
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
                {4, 0, 3, 0, 0, 0},
                {0, 1, 9, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 2, 0},
                {0, 0, 5, 4, 5, 5},
                {0, 0, 1, 5, 0, 0}});
        q4_inputs.add( new int[][]{
                {4, 1, 1, 0, 0, 3, 0, 3, 0, 6},
                {0, 0, 1, 0, 0, 3, 0, 2, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 4, 0, 0},
                {0, 0, 0, 0, 1, 0, 6, 0, 0, 6},
                {0, 0, 2, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 1, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}});
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
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
        });
        q4_inputs.add( new int[][]{
                {0}});
        q4_inputs.add( new int[][]{
                {0, 0},
                {0, 0}});
        q4_inputs.add( new int[][]{
                {0, 1},
                {0, 0}});
        q4_inputs.add( new int[][]
                {{}});
        q4_inputs.add( new int[0][0]);
        Level3_DoomsdayFuel q4 = new Level3_DoomsdayFuel();
        for(int[][] input: q4_inputs){
            System.out.println();
            System.out.println("Input:");
            for(int[] _m : input) {
                System.out.println(Arrays.toString(_m));
            }
            System.out.println("Output:");
            long startTime = System.currentTimeMillis();
            System.out.println(Arrays.toString(q4.solution(input)));
            long endTime = System.currentTimeMillis();
            System.out.println("Total execution time: " + (endTime-startTime) + "ms");
        }

    }
}
