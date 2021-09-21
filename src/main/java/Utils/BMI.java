package Utils;

import exceptions.InvalidHeightException;
import exceptions.InvalidWeightException;

public class BMI {
    private static final int MIN_WEIGHT = 2;
    private static final int MAX_WEIGHT = 100;
    private static final int MIN_HEIGHT = 1;
    private static final int MAX_HEIGHT = 3;

    public static double calculateBMI(int w, int h) throws InvalidWeightException, InvalidHeightException {
        if (w <= MIN_WEIGHT || w > MAX_WEIGHT) {
            throw new InvalidWeightException();
        }

        if (h <= MIN_HEIGHT || h > MAX_HEIGHT) {
            throw new InvalidHeightException();
        }
        return w / (h * h);
    }
}
