class Solution {
    fun minWindow(s: String, t: String): String {

       val countMap = mutableMapOf<Char,Int>()
       for(c in t){
        countMap[c] = countMap.getOrDefault(c,0)+1
       }

       val windowCount = mutableMapOf<Char,Int>()
       var have = 0
       val need = countMap.size

       var resLen = Int.MAX_VALUE
       var resLeft = 0

       var left = 0

       for(right in s.indices){
        val c = s[right]
        windowCount[c] = windowCount.getOrDefault(c,0)+1

        if(countMap.containsKey(c) && windowCount[c] == countMap[c]){
            have += 1
        }

        while(have == need){
            if((right-left+1)<resLen){
                resLen = right-left+1
                resLeft = left
            }
            //shrink
            val leftChar = s[left]
            windowCount[leftChar] = windowCount.getOrDefault(leftChar,0)-1

            if(countMap.containsKey(leftChar) && windowCount[leftChar]!!<countMap[leftChar]!!){
                have -= 1
            }
            left += 1
        }
       }

 return if(resLen == Int.MAX_VALUE) "" else s.substring(resLeft, resLeft+resLen)
       }
    }
