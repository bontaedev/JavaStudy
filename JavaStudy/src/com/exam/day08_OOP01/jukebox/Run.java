package com.exam.day08_OOP01.jukebox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) throws JavaLayerException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println(" π μ₯¬ν¬λ°μ€ π ");
		System.out.println("νλ μ΄ νκ³  μΆμ μμμ μ νν΄μ£ΌμΈμ.");
		System.out.println("1. μμ1");
		System.out.println("2. μμ2");
		System.out.println("3. μμ3");
		System.out.println("4. νλ‘κ·Έλ¨ μ’λ£");
		System.out.print("μμ μ ν >> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		
		// νλλμ€ν¬μ μ‘΄μ¬νλ νμΌμ μ½λ μμ
		// μ»΄ν¨ν°λ λ°νμ μ κΉμ§ νμΌμ΄ μλμ§ λͺ¨λ¦ (Exception)
		try {
			FileInputStream fis = null;
			if (menu == 1) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/Good News.mp3");
			} else if (menu == 2) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/Goodbyes.mp3");
			} else if (menu == 3) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/I MEAN I MEAN..mp3");
			} else if (menu == 4) {
				System.out.println("μ₯¬ν¬λ°μ€λ₯Ό μ’λ£ν©λλ€.");
			}
			// μΈλΆ λΌμ΄λΈλ¬λ¦¬ μ¬μ©
			Player playMP3 = new Player(fis);
			playMP3.play();
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("cannot find music :(");
		}
		
	}
}
