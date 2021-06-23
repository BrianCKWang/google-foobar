import java.util.*;
public class Level1_MaxSquare {
    public int[] solution(int area) {
        List<Integer> ans = new ArrayList<>();

        while(area != 0){
            int num = (int)Math.floor(Math.pow(area, 0.5));
            num *= num;
            area -= num;
            ans.add(num);
        }

         int[] arr = ans.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
