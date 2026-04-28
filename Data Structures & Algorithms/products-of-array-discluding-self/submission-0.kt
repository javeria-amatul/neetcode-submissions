class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
       var prod = 1
       val prefix = IntArray(nums.size)
       for(i in 0 until prefix.size) {
        prefix[i] = prod
        prod *= nums[i]
       }
       prod = 1
       for(i in nums.size - 2 downTo 0) {
        prod *= nums[i+1] 
        prefix[i] = prod * prefix[i]
       }
       return prefix
    }
}
