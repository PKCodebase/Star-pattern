public class Oppositepyramid {
    public static void main(String[] args) {
        int size = 5;
        for(int i =size;i>1;i--)
        {
            for(int j =1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}