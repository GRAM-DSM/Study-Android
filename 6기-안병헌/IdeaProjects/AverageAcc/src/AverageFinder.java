public class AverageFinder {
    double computeAverage(int[] intArray) {
        // 코드를 입력하세요.
        double result = 0;
        int cnt = 0;
        for(int i = 0; i < intArray.length; i++){
            result += intArray[i];
            cnt++;
        }
        return result / cnt;
    }
}