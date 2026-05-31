class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
       for(i in 0 until nums.size) {
            val req = target - nums[i]
            map[req]?.let {
                return intArrayOf(it, i)
            } ?: run { map[nums[i]] = i }
        }
        return intArrayOf()
    }
}
