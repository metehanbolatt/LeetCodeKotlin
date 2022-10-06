package problems

fun main() {
    println(findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val array = (nums1 + nums2).sortedArray()
    return if (array.size % 2 == 0) {
        val index = array.size / 2
        (array[index].toDouble() + array[index - 1]) / 2
    } else {
        val index = ((array.size + 1) / 2) - 1
        array[index].toDouble()
    }
}