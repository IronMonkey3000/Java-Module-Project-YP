import java.util.Scanner;

public class Main {
    static final int MAX_SPEED = 250;
    static final int MIN_SPEED = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            String name = nonEmptyString(scanner, i);
            int speed = readSpeed(scanner, i);
            race.newLeader(name, speed);
        }

        System.out.println("Самая быстрая машина: " + race.leaderName);
        scanner.close();
    }

    static String nonEmptyString(Scanner scanner, int carsNumb) {
        String name;
        do {
            System.out.println("Введите название машины №" + carsNumb + ": ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Название не может быть ПУСТЫМ");
            }
        } while (name.isEmpty());
        return name;
    }

    static int readSpeed(Scanner scanner, int carsNumb) {
        int speed = 0;
        boolean isValid;
        do {
            isValid = false;
            System.out.println("Введите скорость машины №" + carsNumb + ": ");
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                scanner.nextLine();
                if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                    isValid = true;
                } else {
                    System.out.println("Неправильная скорость ");
                }
            } else {
                    System.out.println("Введите ЦЕЛОЕ число!");
                    scanner.next();
                }
            } while (!isValid) ;
            return speed;
        }
    }
