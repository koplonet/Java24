package com.java24hours;

class Wheel {
    public static void main(String[] arguments) {
        String phrase[] = {
            "ВСЫПАТЬ ПО ПЕРВОЕ ЧИСЛО",
            "ГНАТЬСЯ ЗА ДЛИННЫМ РУБЛЕМ",
            "В ЧАС ПО ЧАЙНОЙ ЛОЖКЕ",
            "КАЖДЫЙ КУЛИК СВОЕ БОЛОТО ХВАЛИТ",
            "ЗА ТРИДЕВЯТЬ ЗЕМЕЛЬ",
            "СЕМЬ ПЯДЕЙ ВО ЛБУ",
            "ЗАРУБИТЬ НА НОСУ",
            "ПРИНЦ НА БЕЛОМ КОНЕ",
            "ДОМА И СТЕНЫ ПОМОГАЮТ",
            "ОТ ЗАБОРА ДО ОБЕДА",
            "ВЕРНЕМСЯ К НАШИМ БАРАНАМ",
            "ВНЕСТИ СВОЮ ЛЕПТУ",
            "НЕ МЫТЬЕМ, ТАК КАТАНЬЕМ",
            "ЭТОТ ДИВНЫЙ НОВЫЙ МИР"
    };
        int[] letterCount = new int[32];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ( (lett >= 'А') & (lett <= 'Я') ) {
                    letterCount[lett - 'А']++;
                }
            }
        }
        for (char count = 'А'; count <= 'Я'; count++) {
            System.out.print(count + ": " +
                            letterCount[count - 'А'] +
                            " ");
            if (count == 'М') {
                System.out.println();
            }
        }
        System.out.println();
    }
}