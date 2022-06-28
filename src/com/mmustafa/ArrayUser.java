package com.mmustafa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUser {
	
	public static void main(String[] args) {
		int[] array = new int[getData()];
		array = randomArray(array);
		arrayClone(array);
		System.out.println("\n*****************************");
		maxMinSearch(array);
		System.out.print("\n");
		System.out.println("Toplam = " + arraySum(array) + "\n");
		System.out.println("*****************************");
		averageArray(array);
		System.out.println("*****************************");
		oddNumberSum(array);
		System.out.println("*****************************");
		evenNumberSum(array);
		System.out.println("*****************************");
		maxControl(array);
		System.out.println("*****************************");
		fiveSearch(array);
		System.out.println("*****************************");
		againNumber(array);
	}
	
	public static int getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Eleman sayisini giriniz ");
		int size = scanner.nextInt();
		return size;
	}
	
	public static int[] randomArray(int[] array) {
		Random random = new Random();
		System.out.println("\n");
		System.out.println("Random olusturma");
		for (int i = 0; i < array.length; i++) {
			array[i] = (random.nextInt(10) + 1);
			System.out.print(array[i] + ",");
		}
		return array;
	}
	
	public static void arrayClone(int[] array) {
		int[] arrayyClone = array.clone();
		Arrays.sort(arrayyClone);
		System.out.println("\n");
		System.out.println("clone Siralama");
		for (int i = 0; i < arrayyClone.length; i++) {
			System.out.print(arrayyClone[i] + ",");
		}
	}
	
	public static void maxMinSearch(int[] array) {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("\n\nMAX-MIN\n");
		System.out.print("Max = " + max + " Min : " + min + "\n");
	}
	
	public static int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	public static void averageArray(int[] array) {
		int sum = arraySum(array);
		System.out.println("Ortalama = " + (sum / array.length + "\n"));
	}
	
	private static void oddNumberSum(int[] array) {
		int count = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count++;
				sum += array[i];
			}
		}
		System.out.println("tek sayi adedi = " + count + " \nTek Sayi toplami= " + sum);
	}
	
	private static void evenNumberSum(int[] array) {
		int count = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
				sum += array[i];
			}
		}
		System.out.println("Cift sayi adedi = " + count + " \nCift Sayi toplami= " + sum);
	}
	
	public static void maxControl(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		if (max > 25) {
			System.out.println("\n25 ten buyuktur\n");
		} else {
			System.out.println("\n25 ten kucuktur\n");
		}
	}
	
	private static void fiveSearch(int[] array) {
		int[] arr = array.clone();
		Arrays.sort(arr);
		int result = Arrays.binarySearch(arr, 5);
		
		if (result < 0) {
			System.out.println("5 sayisi yoktur\n");
		} else {
			System.out.println("5 sayisi vardir indexno = " + result + "\n");
		}
	}
	
	public static void againNumber(int[] array) {
		int[] arr = new int[array.length];
		int[] tekrarsiz = new int[array.length];
		int[] againArray = array.clone();
		int count = 0, c = 1, a = 0;
		Arrays.sort(againArray);
		for (int i = 0; i < againArray.length; i++) {
			count = 0;
			for (int j = 0; j < againArray.length; j++) {
				if (againArray[i] == againArray[j]) {
					count++;
					
				}
			}
			if (count > 1) {
				if (arr[c - 1] != againArray[i]) {
					arr[c] = againArray[i];
					c++;
				}
			}
			if (count == 1) {
				tekrarsiz[a] = againArray[i];
				a++;
				
			}
		}
		System.out.println("Tekrar Edenler ");
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				System.out.print(arr[j] + ",");
			} else {
				continue;
			}
		}
		System.out.println("\n");
		System.out.println("Tekrarsiz ");
		for (int j = 0; j < tekrarsiz.length; j++) {
			if (tekrarsiz[j] != 0) {
				System.out.print(tekrarsiz[j] + ",");
			} else {
				continue;
			}
		}
	}
}