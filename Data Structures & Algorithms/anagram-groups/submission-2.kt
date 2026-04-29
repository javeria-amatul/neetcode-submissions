class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        strs.forEach { word ->
            val sortedWord = word.toCharArray().sorted().toString()
            map.getOrPut(sortedWord) {
                mutableListOf()
            }.add(word)
        }
        return map.values.toList()
    }
}
