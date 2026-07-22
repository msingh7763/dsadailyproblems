class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0); 
        boolean r = true;
        while (r) {
            r = false;
            for (int i = 0; i < rooms.size(); i++) {
                if (set.contains(i)) {
                    for (int j = 0; j < rooms.get(i).size(); j++) {
                        int key = rooms.get(i).get(j);
                        if (!set.contains(key)) {
                            set.add(key);
                            r= true; 
                        }
                    }
                }
            }
        }
        return set.size() == rooms.size();
    }
}