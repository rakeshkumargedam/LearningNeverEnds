package rakesh.practice.programs.climb;

public class Repeated
{
    public static void main(String[] args) {
        int input = 7;
        int [] outPut = new int[input + 1];
        outPut [0] = 1;
        outPut [1] = 1;
        outPut [2] = 2;
        for (int i = 3; i <= input; i++) {
            outPut[i] = outPut[i-3] + outPut[i-2] + outPut[i -1];
        }
        System.out.println("Here is the outPut : " + outPut[input]);
    }
}
