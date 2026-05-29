class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        val countArr = Array<MutableList<Int>>(nums.size + 1) { mutableListOf()}
        map.forEach { (num, count) ->
            countArr[count].add(num)
        }
        val res = mutableListOf<Int>()
        for(i in countArr.size - 1 downTo 0) {
            if(countArr[i].size > 0) {
                for(j in countArr[i]) {
                    res.add(j)
                if(res.size == k)
                    return res.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}
