import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//5
        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//6
        for(int r = 6; r >= 0; r--)
        {
            for(int c = 1; c < r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//7
        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}