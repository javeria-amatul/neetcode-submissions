class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map: HashMap<String, MutableList<String>> = HashMap()
        strs.forEach {
            val buildKey = createKey(it)
            map.getOrPut(buildKey) { 
                mutableListOf()
            }.add(it)
        }
        return map.values.toList()
    }

    fun createKey(str: String): String {
        val count = IntArray(26)
        str.forEach {
            count[it - 'a']++
        }
        return count.joinToString("#")
    }
}
