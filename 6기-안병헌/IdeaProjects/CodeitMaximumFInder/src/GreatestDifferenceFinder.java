public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 코드를 입력하세요.
        int Max = 0;
        if(intArray.length < 2){
            return 0;
        }
        else{
            for(int i = 0; i < intArray.length; i++){
                if(Max < intArray[i]){
                    Max = intArray[i];
                }
            }
        }
        return Max;
    }
}