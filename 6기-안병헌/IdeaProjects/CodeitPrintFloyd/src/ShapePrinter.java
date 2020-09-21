public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        int printNum = 1;
        int length = String.valueOf(height * (height + 1) / 2).length();
        for(int i = 1; i <= height; i++){
            
            for(int k = 1; k <= length; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(printNum + " ");
                printNum++;
            }
            System.out.println();
        }
    }
}