public class Main {
    public static void main(String[] args) {
//Задача1
        byte variableByte = 1;
        System.out.println(variableByte);
        short variebleShort = -200;
        System.out.println(variebleShort);
        int variableInt = 50000;
        System.out.println(variableInt);
        long variableLong = -3333333333L;
        System.out.println(variableLong);
        float variableFloat = 0.1234567f;
        System.out.println(variableFloat);
        double variableDouble = -0.123456789;
        System.out.println(variableDouble);
//Задача2
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.876f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
//Задача3
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        float paperStudent = (float) 480/(teacherLP + teacherAS + teacherEA);
        System.out.println("There are " + paperStudent + " sheets of paper for each student");
//Задача4
        int machinePower2Min = 16;
        int machinePower20Min = machinePower2Min * 10;
        System.out.println("In 20 minute, the machine produced " + machinePower20Min + " bottles");
        int machinePowerDay = machinePower2Min * 24 * 30;
        System.out.println("In 1 day, the machine produced " + machinePowerDay + " bottles");
        int machinePower3Days = machinePowerDay * 3;
        System.out.println("In 3 days, the machine produced " + machinePower3Days + " bottles");
        int machinePower1Month = machinePower3Days * 10;
        System.out.println("In 1 month, the machine produced " + machinePower1Month + " bottles");
//Задача5
        byte totalCans = 120;
        byte cansWhiteMin = 2;
        byte cansBrownMin = 4;
        int totalClass = (totalCans / (cansBrownMin + cansWhiteMin));
        int cansWhite = totalClass * cansWhiteMin;
        int cansBrown = totalClass * cansBrownMin;
        System.out.println("In school whis " + totalClass + " classes, need " + cansWhite + " cans of white paint and " + cansBrown + " cans of brown paint");
//Задача6
        short massBananas = 80;
        short massMilk100ml = 105;
        short massIceCream1Briquette = 100;
        short massEggs = 70;
        int breakfastG = (massBananas * 5) + (massMilk100ml * 2) + (massIceCream1Briquette * 2) + (massEggs * 5);
        float breakfastKg = (float) breakfastG / 1000;
        System.out.println("Breakfast in grams = " + breakfastG + ", breakfast in kilograms = " + breakfastKg);
//Задача7
        short result = 7000;
        short ration1 = 250;
        short ration2 = 500;
        int needDaysRation1 = result / ration1;
        int needDaysRation2 = result / ration2;
        System.out.println("Days to lose 7 kg according to the diet 1 = " + needDaysRation1);
        System.out.println("Days to lose 7 kg according to the diet 2 = " + needDaysRation2);
//Задача8
        int salaryMariaMonthNow = 67760;
        int salaryDenisMonthNow = 83690;
        int salaryKristineMonthNow = 76230;
        int salaryMariaYearNow = salaryMariaMonthNow * 12;
        int salaryDenisYearNow = salaryDenisMonthNow * 12;
        int salaryKristineYearNow = salaryKristineMonthNow * 12;
        float salaryMariaMonthIncrease =  (float) (salaryMariaMonthNow * 1.1);
        float salaryDenisMonthIncrease = (float) (salaryDenisMonthNow * 1.1);
        float salaryKristineMonthIncrease = (float) (salaryKristineMonthNow * 1.1);
        int salaryMariaYearIncrease = (int) (salaryMariaMonthIncrease * 12);
        int salaryDenisYearIncrease = (int) (salaryDenisMonthIncrease * 12);
        int salaryKristineYearIncrease = (int) (salaryKristineMonthIncrease * 12);
        System.out.println("Masha gets it now " + (int) salaryMariaMonthIncrease + " rub. Annual income increased by " + (salaryMariaYearIncrease - salaryMariaYearNow) + " rubles'");
        System.out.println("Denis gets it now " + (int) salaryDenisMonthIncrease + " rub. Annual income increased by " + (salaryDenisYearIncrease - salaryDenisYearNow) + " rubles'");
        System.out.println("Masha gets it now " + (int) salaryKristineMonthIncrease + " rub. Annual income increased by " + (salaryKristineYearIncrease - salaryKristineYearNow) + " rubles'");
    }
}