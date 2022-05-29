import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] stepsPerDay = new int[30];
    }

    int goal = 10000;

    public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        SaveSteps saveSteps = new SaveStaps();
        Converter converter = new Converter();

        while (userImput ! == 0){
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                saveSteps();
            } else if (userInput == 2) {
                System.out.println("Выберите за какой месяц напечатать статистику:  0 - Январь, 1 - Февраль, 2 - Март, 3 - Апрель, 4 - Май, 5 - Июнь, 6 - Июль, 7 - Август, 8 - Сентябрь, 9 - Октябрь, 10 - Ноябрь, 11 - Декабрь\"Выберите за какой месяц вы хотите внести колличество шагов:  0 - Январь, 1 - Февраль, 2 - Март, 3 - Апрель, 4 - Май, 5 - Июнь, 6 - Июль, 7 - Август, 8 - Сентябрь, 9 - Октябрь, 10 - Ноябрь, 11 - Декабрь");
                int mounth = new scanner.nextInt();
                stepsDayByDay( int mounth);
                System.out.println("Общее количество шагов за месяц - " + sumPerMounth(mounth));
                System.out.println("Максимальное пройденное количество шагов - " + findMaxStepsPerDay(mounth));
                converter.convert(sumPerMounth(mounth), 0.05, 0.00075);


            } else if (userInput == 3) {
                setGoal(goal);
            }
        }
        System.out.println("Программа завершена");
        break;
    }

        public static void printMenu () {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Ввести количество шагов за день");
            System.out.println("2 - Напечатать статистику за месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");
            System.out.println("0 - Выход");
        }

        public static int setGoal ( int goal){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сейчас цель по шагам за день - " + goal);
            System.out.println("Хотите изменть цель за день?");
            System.out.println("1 - заменить");
            System.out.println("2 - отмена");
            int input = scanner.nextInt();
            while (true) {
                if (input == 1) {
                    System.out.println("Задайте новую цель за день");
                    goal = scanner.nextInt();
                    if (goal < 0) {
                        System.out.println("Цель по шагам в день не может быть отрицательной");
                    } else {
                        System.out.println("Успех!");
                        break;
                    }
                } else if (input == 2) {
                    System.out.println("Выход");
                    break;
                }
            }
            return goal;
        }

        public static int sumPerMounth ( int mounth){
            int stepsPerMounth = 0;
            for (int i = 0; i < StepTraker.monthToData[mounth].stepsPerDay.length; i++) {
                stepsPerMounth = stepsPerMounth + StepTraker.monthToData[mounth].stepsPerDay[i];
            }
            return stepsPerMounth;
        }

        public static void stepsDayByDay ( int mounth){
            for (int i = 1; i <= StepTraker.monthToData[mounth].stepsPerDay.length; i++) {
                System.out.println(i + "день: " + StepTraker.monthToData[mounth].stepsPerDay[i]);
            }
        }

        int findMaxStepsPerDay ( int mounth){
            int maxStepsPerDay = 0;
            for (int i = 1; i <= StepTraker.monthToData[mounth].stepsPerDay.length; i++) {
                if (StepTraker.monthToData[mounth].countStepsDay[i] > maxStepsPerDay) {
                    maxStepsPerDay = expenses[i];
                }
            }
            return maxStepsPerDay;
        }
    }