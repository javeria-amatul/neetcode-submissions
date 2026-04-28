class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
        val charCount = IntArray(26)
        s.forEach {
            charCount[it - 'a']++
        }
        t.forEach {
            charCount[it - 'a']--
        }
        charCount.forEach {
            if(it != 0)
                return false
        }
        return true
    }
}
