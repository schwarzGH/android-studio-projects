package com.example.phrase_gen;

public class Phraser {
    public static String PhraserGen() {
//Создайте три набора слов для выбора. Можете добавлять собственные слова!
        String[] wordListOne = {"круглосуточный", "трех-звенный",
                "30-футовый", "взаимный", "хардкорный", "адский",
                "забористый", "проникающий", "умный", "динамичный"};


        String[] wordListTwo = {"уполномоченный", "трудный",
                "чистый", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный", "позиционированный", "сетевой",
                "сфокусированный", "выгодный", "выровненный",
                "целесообразный", "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень", "портал", "продукт",
                "обзор", "образец", "пункт следования"};

        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //Генерируем три случайных числа
        int rl = (int) (Math.random() * oneLength) ;
        int r2 = (int) (Math.random() * twoLength) ;
        int r3 = (int) (Math.random() * threeLength);
        //Теперь строим фразу
        // TODO 1.1 Поставьте Breakpoint
        String phrase = wordListOne[rl] + " " +
                wordListTwo[r2] + " " + wordListThree[r3];

        return phrase;
    }


}
