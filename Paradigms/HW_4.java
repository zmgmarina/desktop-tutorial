public class Main {
    public static void main(String[] args) {
        double[] numX = new double[] {2, 4, 6, 8};
        double[] numY = new double[] {2, 4, 10, 12};

        System.out.println(findСorrelation(numX, numY));

    }

    public static double average(double[] n){
        double sumNum = 0;
        for (int i = 0; i < n.length; i++) {
            sumNum += n[i];
        }
        return sumNum / n.length;
    }

    public static double findСorrelation(double[] numX, double[] numY){
        double[] res = new double[numY.length];
        double result = 0;
        double numerator = 0;

        for (int i = 0; i < numX.length; i++) {
            for (int j = 0; j < numY.length; j++) {
                result = (numX[i] - average(numX)) * (numY[i] - average(numY));
                res[i] = result;
            }
        }

        for (int i = 0; i < res.length; i++) {
             numerator += res[i];
        }

        result = 0;
        double sumX = 0;
        double sumY = 0;

        for (int i = 0; i < numX.length; i++) {
            result = Math.pow(numX[i] - average(numX), 2);
            sumX += result;
        }

        result = 0;
        for (int i = 0; i < numY.length; i++) {
            result = Math.pow(numY[i] - average(numY), 2);
            sumY += result;
        }
        return numerator/Math.sqrt(sumX*sumY);
    }
}
