import java.util.*;

public class TwoBestNonOverlappingEvents {
        static int START=0, END=1, VALUE=2;
        public int maxTwoEvents(int[][] events) {
            Arrays.sort(events, Comparator.comparingInt(a -> a[START]));
            int maxValue= 0, n= events.length;
            TreeMap<Integer,Integer> sMax= new TreeMap<>();

            for(int i=n-1; i>=0; i--)if(events[i][VALUE]>maxValue)sMax.put(events[i][START], maxValue= events[i][VALUE]);

            System.out.println(sMax);

            int maxTwo= 0;
            for(int[] e:events){
                Map.Entry<Integer,Integer> maxOne= sMax.ceilingEntry(e[END]+1);
                maxTwo= Math.max(maxTwo, e[VALUE] + (maxOne!=null ? maxOne.getValue() : 0));
            }
            return maxTwo;
    }
}
