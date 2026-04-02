class Solution {
    fun isAnagram(s: String, t: String): Boolean {
     //1.lenght has to be same
     if(s.length != t.length) return false

    val count = IntArray(26)

    for(i in s.indices){
        count[s[i] - 'a']++
        count[t[i]-'a']--
    }

    for(value in count){
        if(value!=0){
            return false
        }
    }

    return true

    }
}
