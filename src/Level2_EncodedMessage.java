import java.util.*;

public class Level2_EncodedMessage {
    public static int getInt(List<Integer> list){
         int ans = 0;

         for(int i = 0; i < list.size(); i++){
             ans += list.get(i) * Math.pow(10, i);
         }

         return ans;
    }
    public static int solution(int[] l) {
        // sort array in ascending order
        // save the first two index that has remainder of 1 and 2
        // if remainder of the initial number is not 0
        // if remainder is 1, can either remove one from remainder 1 list or two from remainder 2 list
        // if remainder is 2, can either remove one from remainder 2 list or two from remainder 1 list
        // Your code here
        Arrays.sort(l);
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < l.length; i++){
            list1.add(l[i]);
        }

        int ans = 0;
        List<Integer> list_1 = new ArrayList<Integer>();
        List<Integer> list_2 = new ArrayList<Integer>();

        for(int i = 0; i < list1.size(); i++){
            ans += list1.get(i) * Math.pow(10, i);
            if(list1.get(i) % 3 == 1 && list_1.size() < 2){
                list_1.add(i);
            }
            if(list1.get(i) % 3 == 2 && list_2.size() < 2){
                list_2.add(i);
            }
        }

        int remainder = ans % 3;

        if(remainder == 1){
            if(list_1.size() > 0){
                list1.remove((int)list_1.get(0));
                return getInt(list1);
            }
            else if(list_2.size() == 2){
                list1.remove((int)list_2.get(1));
                list1.remove((int)list_2.get(0));
                return getInt(list1);
            }
            return 0;
        }
        if(remainder == 2){
            if(list_2.size() > 0){
                list1.remove((int)list_2.get(0));
                return getInt(list1);
            }
            else if(list_1.size() == 2){
                list1.remove((int)list_1.get(1));
                list1.remove((int)list_1.get(0));
                return getInt(list1);
            }
            return 0;
        }

        return ans;
    }


}