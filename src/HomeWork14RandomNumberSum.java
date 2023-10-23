import java.util.Random;

public class HomeWork14RandomNumberSum {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100001 - 11) + 11; // Генеруємо випадкове число в діапазоні [11, 100011]

        System.out.println("Випадкове число: " + randomNumber);

        int number = randomNumber;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10; // Отримуємо останню цифру числа
            sumOfDigits += digit; // Додаємо цифру до суми
            number /= 10; // Видаляємо останню цифру
        }

        System.out.println("Сума цифр числа: " + sumOfDigits);
    }

}
