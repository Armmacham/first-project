import java.util.Scanner;
public class StepTracker {
       MonthData[] monthToData;
        Scanner scanner = new Scanner(System.in);
    int goal = 1000;

        public StepTracker() {
            monthToData = new MonthData[12];
            for (int i = 0; i < monthToData.length; i++) {
                monthToData[i] = new MonthData();
            }
        }

       public class MonthData {
            int[] stepsPerDay = new int[31];
        void saveSteps(int stepsInDay, int month, int day) {
            if (stepsInDay > 0) {
                monthToData[month].stepsPerDay[day] = stepsInDay;
            } else {
                System.out.println("Колличество шагов в день не может быть отрицательным");
            }
        }

        public int sumPerMonth(int month) {
            int stepsPerMonth = 0;
            for (int i = 0; i < stepsPerDay.length; i++) {
                stepsPerMonth = stepsPerMonth + monthToData[month].stepsPerDay[i];
            }
            System.out.println();
            return stepsPerMonth;
        }

        public void stepsDayByDay(int month) {
            for (int i = 1; i < stepsPerDay.length; i++) {
                System.out.println(i + " день: " + monthToData[month].stepsPerDay[i]);
            }
        }

        public void findMaxStepsPerMonth(int month) {
            int maxStepsPerMonth = 0;
            for (int i = 1; i < stepsPerDay.length; i++) {
                if (monthToData[month].stepsPerDay[i] > maxStepsPerMonth) {
                    maxStepsPerMonth = monthToData[month].stepsPerDay[i];
                }
            }
            System.out.println("Максимальное количество шагов за месяц - " + maxStepsPerMonth);
        }

        public int findMaxStreak(int month) {
            int maxStreak = 0;
            int streakCount = 0;

            for (int i = 1; i < stepsPerDay.length; i++) {
                if (monthToData[month].stepsPerDay[i] >= goal) {
                    streakCount = streakCount + 1;
                }
                else {
                    if (streakCount > maxStreak) {
                        maxStreak = streakCount;
                        streakCount = 0;
                    }
                    else {
                        streakCount = 0;
                    }
                }
            }
            return maxStreak;
        }

    }

        public int setGoal() {
            System.out.println("Сейчас цель по шагам за день - " + goal);
            System.out.println("Хотите изменть цель за день?");
            System.out.println("1 - заменить");
            System.out.println("2 - отмена");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Задайте новую цель за день");
                int newGoal = scanner.nextInt();

                if (newGoal > 0) {
                    System.out.println("Успех!");
                    goal = newGoal;
                    return goal;
                } else {
                    System.out.println("Цель по шагам в день не может быть отрицательной");
                }
            } else if (input == 2) {
                System.out.println("Выход");
            }
            return goal;
        }
    }

