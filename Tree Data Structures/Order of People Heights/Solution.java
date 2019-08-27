public class Solution {
    class Person implements Comparable<Person>{
        int height;
        int pos;
    
        Person(int height, int pos) {
            this.height = height;
            this.pos = pos;
        }
    
        @Override
        public int compareTo(Person person) {
            return this.height - person.height;
        }
    }
 
    public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> positions) {
        int n = heights.size();
        int[] ans = new int[n];
        PriorityQueue<Person> pq = new PriorityQueue<Person>();
        for( int i=0; i<n; i++) {
            pq.offer(new Person(heights.get(i), positions.get(i)) );
        }
 
        for(int i=0; i<n; i++) {
            Person person = pq.poll();
            int vacantTillNow = 0;
            int index = 0;
            while(index < n) {
                if( ans[index] == 0) vacantTillNow++;
                if( vacantTillNow > person.pos) break;
                index++;
            }
            ans[index] = person.height;
        }
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i : ans)
        {
            intList.add(i);
        }
        return intList;
    }
}