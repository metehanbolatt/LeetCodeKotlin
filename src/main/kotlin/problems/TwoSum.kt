package problems

fun main() {
    twoSumSolution(intArrayOf(3,2,4), 6)
}

fun twoSumSolution(nums: IntArray, target: Int): IntArray {
    /** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order. */
    var solution = intArrayOf()
    nums.forEachIndexed { index1, i ->
        nums.forEachIndexed { index2, y ->
            if (i + y == target && index1 != index2) {
                solution = intArrayOf(index1, index2)
                return solution
            }
        }
    }
    return solution
}