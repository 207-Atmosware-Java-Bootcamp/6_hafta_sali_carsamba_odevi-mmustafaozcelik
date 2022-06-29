package com.mmustafa;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
	static String[] classList = { "Ali Furkan Ergüven", "Alim Yogurtcu", "Arda Kozan", "Beytullah Zor",
			"Burak Can Gületin", "Dogus Saglam", "Emre Yildiz", "Furkan Gurcay", "Huseyin Baris Aktas",
			"Ibrahim Bayramli", "Kadir Irpik", "Kubilay Alp Agacan", "Mehmet Mustafa Ozcelik", "Mustafa Kemal",
			"Omer Faruk Caliskan", "Seyda Ozdemir", "Tolga Gureli", "Tuba Argin", "Yigit Ozen" };
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		RandomClass randomClass = new RandomClass();
		randomClass.randomStudent();
	}
	
	public int getData() {
		Scanner scanner = new Scanner(System.in);
		int piece = 0;
		while (true) {
			System.out.print("Lutfen odev verilecek ogrenci sayisi giriniz : ");
			try {
				piece = scanner.nextInt();
			} catch (Exception e) {
				System.err.println("Sayi Giriniz :/");
				System.out.println("******************************");
				randomStudent();
				break;
			}
			if (piece < 1 || 19 < piece) {
				System.err.println("Lutfen 1 ile 19 arsinda bi deger giriniz :/");
				System.out.println("************************");
			} else {
				break;
			}
		}
		
		scanner.close();
		return piece;
	}
	
	public void randomStudent() {
		int piece = getData();
		String[] choiseArray = new String[piece];
		for (int i = 0; i < piece;) {
			int a = random.nextInt(classList.length);
			if (!arrayControl(choiseArray, classList[a])) {
				choiseArray[i] = classList[a];
				i++;
			}
		}
		System.out.println("*************************");
		for (int i = 0; i < choiseArray.length; i++) {
			System.out.println((i + 1) + ". ogrenci = " + choiseArray[i]);
		}
		System.exit(0);
	}
	
	public boolean arrayControl(String[] array, String from) {
		for (int i = 0; i < array.length; i++) {
			if (from.equals(array[i])) {
				return true;
			}
		}
		return false;
	}
}
