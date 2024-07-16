package org.example.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianTwoSortedArraysTest {
    MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();

    @Test
    void findMedianSortedArrays() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5, medianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays2() {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, medianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));

    }

    @Test
    void findMedianSortedArrays3(){
        int[] nums1 = {};
        int[] nums2 = {3};
        assertEquals(3.0, medianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}