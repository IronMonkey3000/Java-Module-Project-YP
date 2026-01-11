import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for(int i = 1; i <= 3; i++) {
            String name;
            while(true) {
                System.out.print("Введите название машины №" + i + ": ");
                name = scanner.nextLine().trim();
                if(!name.isEmpty()) {
                    break;
                }
                System.out.println("Название не может быть ПУСТЫМ!");
            }

            int speed;
            while(true) {
                System.out.print("Введите скорость машины №" + i + ": ");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    }
                    System.out.println("Неправильная скорость ");
                } else {
                    System.out.println("Введите ЦЕЛОЕ число!");
                    scanner.next();
                }
            }
            race.newLeader(name, speed);
        }
        System.out.println("Самая быстрая машина: " + race.leaderName);
        scanner.close();
    }
}