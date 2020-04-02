public class BMIService {
    public int calculate (double height, double weight) {

        int bodyMassIndex = (int) ( weight / ( height * height ) );

        return bodyMassIndex;
    }
}
