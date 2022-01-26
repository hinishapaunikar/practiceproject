package com.sorting;

public class mergSortExample {

 static void merge(int[] arr,int left,int middle,int right) {
	 
 }

 static void sort(int[]arr.arr,int left,int right) {
	 if(left<right) {
		 int mid = (left+(right-1))/2;
		 sort(arr,left,mid);
		 sort(arr,mid+1,right);
		 merge(arr,left, mid,right);
	 }
 }
 

