package root;

import java.util.List;

public class CafeOrderChecker {
    public static boolean checkOrders(List<Integer> takeOut,
                                      List<Integer> dineIn,
                                      List<Integer> servedOrders){
        int ptr1 = 0;
        int ptr2 = 0;

        for(int i = 0; i < servedOrders.size(); i++){
            if(ptr1 < takeOut.size() && servedOrders.get(i) == takeOut.get(ptr1))
                ptr1 ++;
            else if (ptr2 < dineIn.size() && servedOrders.get(i) == dineIn.get(ptr2))
                ptr2 ++;
        }

        return ptr1 == takeOut.size() && ptr2 == dineIn.size();
    }
}
