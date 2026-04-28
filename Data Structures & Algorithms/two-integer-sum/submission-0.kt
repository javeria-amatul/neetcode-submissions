class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { indx, value ->
            val req = target - value
            if(map.containsKey(req))
                return intArrayOf(map[req]!!, indx)
            map[value] = indx
        }
        return intArrayOf()
    }
}
