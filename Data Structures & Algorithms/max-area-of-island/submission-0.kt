class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    var maxArea = 0 //largest island

    //directions
    val dirs = arrayOf(intArrayOf(1,0),
    intArrayOf(-1,0),
    intArrayOf(0,1),
    intArrayOf(0,-1))
    

    for(i in 0 until m){
        for(j in 0 until n){
            if(grid[i][j]==1){
                var area =0
                val stack = ArrayDeque<Pair<Int,Int>>()
                stack.add(Pair(i,j))
                grid[i][j] = 0
              
              while(stack.isNotEmpty()){
                val (x,y) = stack.removeLast() //pop 
                area += 1 //count increase
                for(dir in dirs){
                    val nx = x + dir[0] //nxt row
                    val ny = y + dir[1] //next col
                    //in bounds
                    if(nx in 0 until m && ny in 0 until n && grid[nx][ny]==1){
                        stack.add(Pair(nx,ny)) //add to stack
                       grid[nx][ny] = 0 //mark as visited
                    }
                }
            }
            if(area > maxArea) maxArea = area
        }
    }
}
return maxArea
    }
}