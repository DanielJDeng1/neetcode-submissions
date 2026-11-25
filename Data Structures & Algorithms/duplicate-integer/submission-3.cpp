class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::set<int> vals;
        for (int i: nums) {
            if (vals.contains(i))
                return true;
            vals.insert(i);
        }
        return false;
    }
};