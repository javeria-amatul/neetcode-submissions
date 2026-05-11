class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        strs.forEach { word ->
            val countArray = IntArray(26)
            word.forEach { ch ->
                countArray[ch -'a']++
            }
            val countWord = countArray.joinToString("#")
            // val sortedWord = word.toCharArray().sorted().toString()
            map.getOrPut(countWord) {
                mutableListOf()
            }.add(word)
        }
        return map.values.toList()
    }
}
