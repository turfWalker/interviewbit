/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        
        Collections.sort(intervals, (a, b) -> a.start < b.start ? -1 : 1);
        
        ArrayList<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++) {
            if(intervals.get(i).start <= res.get(res.size()-1).end) {
                Interval temp = res.get(res.size() -1);
                temp.end = Math.max(temp.end, intervals.get(i).end);
                res.set(res.size()-1, temp);
            } else {
                res.add(intervals.get(i));
            }
        }
        return res;
    }
}