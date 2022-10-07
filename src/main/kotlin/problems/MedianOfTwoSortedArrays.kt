package problems

fun main() {
    println(findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    /** Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)). */

    val array = (nums1 + nums2).sortedArray()
    return if (array.size % 2 == 0) {
        val index = array.size / 2
        (array[index].toDouble() + array[index - 1]) / 2
    } else {
        val index = ((array.size + 1) / 2) - 1
        array[index].toDouble()
    }
}