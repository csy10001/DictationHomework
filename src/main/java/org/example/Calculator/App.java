package org.example.Calculator;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator2 calculator = new Calculator2();

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int firstNumber = sc.nextInt();
            if (firstNumber < 0) {
                System.out.println("음수를 입력할수 없습니다. 다시 작성해주시기 바랍니다.");
                continue;
            }

            System.out.println("두 번째 숫자를 입력하세요 : ");
            int secondNumber = sc.nextInt();
            if (secondNumber < 0) {
                System.out.println("음수를 입력할수 없습니다. 다시 작성해주시기 바랍니다.");
                continue;
            }
            System.out.println("사칙연산을 입력해주세요 (+,-,*,/) : ");
            char operator = sc.next().charAt(0);

            double result = calculator.calculate(firstNumber,secondNumber,operator);

            System.out.println("결과 : " + result);

            System.out.println("계속하시겠습니까? (exit 입력 시 종료)");
            if ("exit".equals(sc.next())) {
                break;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes 입력 시 삭제)");
            if ("yes".equals(sc.next())) {
                calculator.removeResult();
            }

            System.out.println("연산 결과를 조회하시겠습니까? (yes 입력 시 조회)");
            if ("yes".equals(sc.next())) {
                List<Double> resultlist = calculator.getResultList();
                System.out.println("저장된 연산결과는 " +  resultlist.toString());
            }
        }
    }
}
