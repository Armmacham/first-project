public class SaveSteps {

Scanner scanner = new Scanner(System.in);

    void stepCount () {
        System.out.println("Выберите за какой месяц вы хотите внести колличество шагов:  0 - Январь, 1 - Февраль, 2 - Март, 3 - Апрель, 4 - Май, 5 - Июнь, 6 - Июль, 7 - Август, 8 - Сентябрь, 9 - Октябрь, 10 - Ноябрь, 11 - Декабрь");
    int month = scanner.nextInt();
        System.out.println("За какой день вы хотите внести колличество шагов?");
    int day = scanner.nextInt();
        System.out.println("Введите колличество шагов");
    int stepsPerDay = scanner.nextInt();
        StepTraker.monthToData[mounth].StepsPerDay[day] = 0 + stepsPerDay;
        if (stepsPerDay < 0) {
        System.out.println("Колличество шагов в день не может быть отрицательным");
    }
        break;
}

}
