package org.example.leetcode;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if(nums1.length<nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int[] data = new int[length];
        int i=0,j=0,k=0;
        double result;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j])
            {
                data[k] = nums1[i];
                i++;
            }
            else
            {
                data[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length)
        {
            data[k++] = nums1[i++];
        }

        while(j < nums2.length)
        {
            data[k++] = nums2[j++];
        }

        int secondElement = data[(nums1.length + nums2.length) / 2];
        if((nums1.length + nums2.length) % 2 == 0)
        {
            int firstElement = data[((nums1.length + nums2.length) / 2) - 1];
            result = (secondElement + firstElement) / 2.0;
        }else
            result = secondElement;
        return result;
    }


//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int counter = 0;
//        int length = nums1.length + nums2.length;
//        if(nums1.length < nums2.length){
//            return findMedianSortedArrays(nums2,nums1);
//        }
//        int midPoint =  length % 2 == 0 ? (length / 2)  + 1: (length+1) / 2;
//        boolean isEven = length % 2 == 0;
//        int i =0;
//        int j = 0;
//        int total = 0;
//
//
//        while (midPoint > counter) {
//            if(nums1[i] > nums2[j]) {
//                if (isEven)
//                    total += nums2[j];
//                if(j < nums2.length - 1)
//                    j++;
//            }
//            else {
//                if(isEven && i == midPoint- 2 && i == nums2.length-1)
//                    total += nums1[i];
//                if( i < nums1.length - 1)
//                    i++;
//            }
//
//
//            counter++;
//        }
//
//        return (double) total / (isEven ? 2 : 1 );
//    }
}
