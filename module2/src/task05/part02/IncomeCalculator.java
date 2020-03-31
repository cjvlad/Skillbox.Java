package task05.part02;

import java.util.Scanner; // Инициализация сканера для считывания

public class IncomeCalculator // Класс Main
{
    private static int minIncome = 200000; // Минимальная сумма дохода
    private static int maxIncome = 900000; // Максимальная сумма дохода

    private static int officeRentCharge = 140000; // Аренда офиса
    private static int telephonyCharge = 12000; // Оплата телефона
    private static int internetAccessCharge = 7200; // Оплата интернета

    private static int assistantSalary = 45000; // Зарплата асистента
    private static int financeManagerSalary = 90000; // Зарплата бугалтера

    private static double mainTaxPercent = 0.24; // Процент налога
    private static double managerPercent = 0.15; // Процент менеджера

    private static double minInvestmentsAmount = 100000; // Минимальный счет для инвестирования

    public static void main(String[] args)
    {
       int minIncomeForInvestment = (int) Math.ceil((minInvestmentsAmount/(1-mainTaxPercent)+calculateFixedCharges())/(1-managerPercent));
        // Мин.счет для инвестирования / (1 - Налоговый процент) + Подсчет постоянных расходов + Подсчёт постоянных расходов())/(1 - Процент менеджера ))
        System.out.println("Минимальный доход для инвестиций: " + minIncomeForInvestment); // Формула для расчета дохода, при котором можно инвестировать.

        while(true) // Цикл
        {
            System.out.println("Введите сумму доходов компании за месяц " + "(от 200 до 900 тысяч рублей): "); // Вывод запроса в консоли на ввод
            int income = (new Scanner(System.in)).nextInt(); // Получаем значение с консоли

            if(!checkIncomeRange(income)) { // Условие выполняется если сумма доходов компании за месяц в пределах заданного диапазона
                continue;
            }
            double managerSalary = income * managerPercent; //Зарплата менеджера сумма доходов * Процент менеджера
            double pureIncome = income - managerSalary - calculateFixedCharges(); // Чистый доход = Сумма Доходов - Зарплата менеджера - Постоянные доходы
            double taxAmount = mainTaxPercent * pureIncome; // Расчёт суммы налога = Процент налога * Чистый доход
            double pureIncomeAfterTax = pureIncome - taxAmount; //Прибыль = Чистый доход - сумму налога

            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount; // Присвоение true если прибыль больше либо равна минимальному порогу инвестирования

            System.out.println("Зарплата менеджера: " + managerSalary); //Отображение зарплаты менеджера
            System.out.println("Общая сумма налогов: " + (taxAmount > 0 ? taxAmount : 0)); //Вывод суммы налогов если есть чистый доход
            System.out.println("Компания может инвестировать: " + (canMakeInvestments ? "да" : "нет")); //Выводит может ли команда инвестировать на основании строки 37
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!"); //Выводится если чистая прибль меньше 0
            }
        }
    }

    private static boolean checkIncomeRange(int income) //Проверка суммы доходов компании за месяц
    {
        if(income < minIncome) //Проверка нижнего значения
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome) //Проверка верхнего значения
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() // Подсчёт постоянных расходов
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
