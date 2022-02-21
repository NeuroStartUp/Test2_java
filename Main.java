public class Main {
    public static void main(String[] args) {


        int eaters = 5; // сколько людей будут есть

        int water = 3000; //миллилитров воды
        int potatoes = 12; //картофелин
        int chicken = 12; // куриных бедер
        int spices = 12; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло: ");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин (а)");
        System.out.println((chicken / eaters) + " куринных (ое) бёдер (ро)");
        System.out.println((spices / eaters) + " ложек (ка) специй");
    }

}
