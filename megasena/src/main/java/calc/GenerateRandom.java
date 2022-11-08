package calc;

public class GenerateRandom {

    private int min;
    private int max;

    int enerate(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }
}
