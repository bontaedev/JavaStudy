package com.exam.day08_OOP01;

public class RunLaptop {
	public static void main(String[] args) {
		// 클래스를 만든다 -> 자료형을 만든다.
		// 인스턴스 : new 연산자를 통해 heap영역 안에 저장할 수 있는 공간.
		Laptop laptop = new Laptop();
		System.out.println(laptop);
		/*
		System.out.println(laptop.brand);
		System.out.println(laptop.price);
		
		laptop.brand = "LG"; // .을 찍어서 주소값으로 따라가 heap영역으로 간다.
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.size);
		
		laptop.powerOn();
		laptop.powerOff();
		
		laptop.brand = "Apple";
		laptop.color = "Space Grey";
		laptop.price = 1000000;
		laptop.size = 13.0;
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.size);
		
		Laptop laptop2 = new Laptop();
		System.out.println(laptop2);
		*/
		// 참조변수를 '주소값'을 저장하는 일종의 변수라고 할 수 있는데 그러면 기본자료형을 선언할 때 처럼 변수의 메모리 크기나, 데이터 표현
	}
}
