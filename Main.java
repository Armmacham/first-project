import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        StepTracker.MonthData monthData = stepTracker.new MonthData();

        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {

            if (userInput == 1) {
                System.out.println("Выберите за какой месяц вы хотите внести колличество шагов:  0 - Январь, 1 - Февраль, 2 - Март, 3 - Апрель, 4 - Май, 5 - Июнь, 6 - Июль, 7 - Август, 8 - Сентябрь, 9 - Октябрь, 10 - Ноябрь, 11 - Декабрь");
                int month = scanner.nextInt();
                System.out.println("За какой день вы хотите внести колличество шагов?");
                int day = scanner.nextInt();
                System.out.println("Введите колличество шагов");
                int stepsInDay = scanner.nextInt();
                monthData.saveSteps(stepsInDay, month, day);

            } else if (userInput == 2) {
                System.out.println("Выберите за какой месяц напечатать, статистику:  0 - Январь, 1 - Февраль, 2 - Март, 3 - Апрель, 4 - Май, 5 - Июнь, 6 - Июль, 7 - Август, 8 - Сентябрь, 9 - Октябрь, 10 - Ноябрь, 11 - Декабрь");
                int month = scanner.nextInt();
                monthData.stepsDayByDay(month);
                monthData.findMaxStepsPerMonth(month);
                converter.convert(monthData.sumPerMonth(month), 0.05, 0.00075);
                System.out.println("Самая длинная серия достигнутой цели - " + monthData.findMaxStreak(month));

            } else if (userInput == 3) {
                stepTracker.setGoal();

            } else {
                System.out.println("Программа завершена");
                break;
            }
            printMenu();
            userInput = scanner.nextInt();
        }
    }

        public static void printMenu() {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Ввести количество шагов за день");
            System.out.println("2 - Напечатать статистику за месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");
            System.out.println("0 - Выход");
        }
    }