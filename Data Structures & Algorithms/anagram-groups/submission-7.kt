class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        strs.forEach { word -> 
            val count = IntArray(26)
            word.forEach { ch ->
                count[ch - 'a']++
            }
            val sWord = count.joinToString("#")
            map.getOrPut(sWord) { mutableListOf<String>() }.add(word)
        }
        return map.values.toList()
    }
}
