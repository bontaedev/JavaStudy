package com.practice.day03;

import java.util.Scanner;

public class Conditional_prac01 {
    public static void main(String[] args) {
        
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 메뉴 출력
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");
        
        int menu = Integer.parseInt(sc.nextLine());
        
        // 번호 체크
        switch (menu) {
            case 1:
                System.out.println("입력 메뉴입니다.");
                break;
            case 2:
                System.out.println("수정 메뉴입니다.");
                break;
            case 3:
                System.out.println("조회 메뉴입니다.");
                break;
            case 4:
                System.out.println("삭제 메뉴입니다.");
                break;
            case 7:
                System.out.println("프로그램이 종료됩니다.");
                break;
            default:
                System.out.println("잘못된 값입니다.");
                break;
        }
    }
}

