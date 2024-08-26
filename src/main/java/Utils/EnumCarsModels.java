package Utils;

import java.util.Random;

public enum EnumCarsModels {
    SUZUKI_SWIFT,
    TOYOTA_COROLLA,
    HONDA_CIVIC,
    FORD_FOCUS,
    CHEVROLET_CRUZE,
    BMW_3_SERIES,
    MERCEDES_BENZ_C_CLASS,
    AUDI_A4,
    VOLKSWAGEN_GOLF,
    HYUNDAI_ELANTRA,
    NISSAN_ALTIMA,
    KIA_OPTIMA,
    MAZDA3,
    SUBARU_IMPREZA,
    TESLA_MODEL_3,
    VOLVO_S60,
    LEXUS_IS,
    JAGUAR_XE,
    ALFA_ROMEO_GIULIA,
    ACURA_TLX,
    INFINITI_Q50;

    public static String getRandomCarsModel() {
        Random random = new Random();
        EnumCarsModels[] models = values();
        return models[random.nextInt(models.length)].toString().toLowerCase();
    }
}