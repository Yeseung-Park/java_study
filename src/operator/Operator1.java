package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);
        // int형과 int형끼리의 나눗셈이기 때문에 결과도 int형이 나와야 한다.
        // 따라서 5/2는 2.5지만 소수점이 날라간 2가 나온다.
        // python에서 //와 비슷하게 생각하면 되려나..

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
