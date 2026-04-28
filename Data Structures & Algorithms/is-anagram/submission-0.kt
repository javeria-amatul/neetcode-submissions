class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map = HashMap<Char, Int>()
        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        t.forEach {
            map[it] = map.getOrDefault(it,0) - 1
        }
        map.forEach { entry ->
            if(entry.value != 0)
                return false
        }
        return true
    }
}
