class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        strs.forEach { word -> 
            val sWord = word.toCharArray().sorted()
            map.getOrPut(sWord.toString()) { mutableListOf<String>() }.add(word)
        }
        return map.values.toList()
    }
}
