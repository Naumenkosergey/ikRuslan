package ruslan.lesson1;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
2*(2+2)*5=40
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 5;
        int k = i * (i + i) * j;
        System.out.println(i + "*(" + i + "+" + i +")*" + j +"=" + k);
    }
}
