package com.thinkgem.jeesite.tools;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[15];
		// 随机生成测试数据
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = random.nextInt(1000);
		}
		
		System.out.println("排序之前：");
		printArr(arr);
		
		// 快速排序
		quick(arr);
		
		System.out.println("排序之后：");
		printArr(arr);
	}
	
	private static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(arr[i]);
			if(i == arr.length - 1){
				System.out.println();
			}
		}
	}

	private static void quick(int[] a) {
		if (a.length> 0) {
			quickSort(a, 0, a.length - 1);
		}
	}

	private static void quickSort(int[] a, int low , int high) {
		if (low < high) { //递归退出
			int middle = getMiddle(a, low, high);
			quickSort(a, low, middle - 1);
			quickSort(a, middle + 1, high);
		}
	}

	private static int getMiddle(int[] a, int low, int high) {
		int temp = a[low];// 基准元素
		while (low < high) {
			// 找到比基准元素小的元素位置
			while (low < high && a[high] >= temp) {
			    high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= temp) {
			    low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return high;
	}
}
