class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        val minHeap = PriorityQueue<Int> {a: Int?, b: Int? -> (map[a] ?: 0) - (map[b] ?: 0)}
        map.keys.forEach {
            minHeap.add(it)
            if(minHeap.size > k) {
                minHeap.poll()
            }
            
        }
        return minHeap.toIntArray()
    }
}
