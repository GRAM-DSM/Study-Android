public class ShapePrinter {
    public void printPyramid(int height) {
        // 코드를 입력하세요.
        for(int i = 1;i <= height; i++){
            for(int j = 0; j < (height - i); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}