package Utils;

import java.util.Random;

public enum EnumNames {
    JOHN,
    MARY,
    ROBERT,
    PATRICIA,
    MICHAEL,
    LINDA,
    WILLIAM,
    ELIZABETH,
    DAVID,
    JENNIFER,
    RICHARD,
    MARIA,
    JOSEPH,
    SUSAN,
    THOMAS,
    MARGARET,
    CHARLES,
    DOROTHY,
    CHRISTOPHER,
    LISA;

    public static String getRandomName() {
        Random random = new Random();
        EnumNames[] names = values();
        return names[random.nextInt(names.length)].toString().toLowerCase();
    }
}