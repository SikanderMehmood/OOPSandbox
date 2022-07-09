
import java.util.HashMap;
import java.util.Map;

public class GFG {

    int solve(int n, String str)
    {

        HashMap<Integer, Integer> mymap
                = new HashMap<>();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '5')
                c = '2';
            else if (c == '9')
                c = '6';
            int c_int = Integer.parseInt(String.valueOf(c));
            if (mymap.containsKey(c_int))
                mymap.put(c_int, mymap.get(c_int) + 1);
            else
                mymap.put(c_int, 1);
        }
        HashMap<Integer, Integer> rems = new HashMap<>();

        while (n > 0) {
            int rem = n % 10;
            if (rem == 5)
                rem = 2;
            if (rem == 9)
                rem = 6;
            if (rems.containsKey(rem))
                rems.put(rem, rems.get(rem) + 1);
            else
                rems.put(rem, 1);

            n = n / 10;
        }

        int cnt = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> ele : rems.entrySet()) {

            int key = ele.getKey();

            if (!mymap.containsKey(key))
                return 0;

            int temp = mymap.get(key)
                    / ele.getValue();

            cnt = Math.min(cnt, temp);
        }
        return cnt;
    }

    // Driver Code
    public static void main(String args[])
    {

        GFG obj = new GFG();
        int N = 56;
        String M = "245769";
        System.out.println(obj.solve(N, M));
    }
}