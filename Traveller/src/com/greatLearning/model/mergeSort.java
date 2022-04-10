package com.greatLearning.model;

public class mergeSort {
	public void divide(int[] array,int length){
		if (length <2){
			return;
		}
		int mid = length / 2;
		int[] left = new int[mid];
		int[] right = new int[length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < length; i++) {
			right[i - mid] = array[i];
		}
		divide(left, mid);
		divide(right, length - mid);
		merge(array, left, right, mid, length - mid);
	}

	public void merge(int[] array,int[] left,int[] right,int leftIndex,int rightIndex){

			int i = 0, j = 0, k = 0;
			while (i < leftIndex && j < rightIndex) {
				if (left[i] <= right[j]) {
					array[k++] = left[i++];
				}
				else {
					array[k++] = right[j++];
				}
			}
			while (i < leftIndex) {
				array[k++] = left[i++];
			}
			while (j < rightIndex) {
				array[k++] = right[j++];
			}

	}
}
