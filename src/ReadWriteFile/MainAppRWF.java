package ReadWriteFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainAppRWF
{
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;

        String pathIn = "E:" + sep + "JavaWorkplace" + sep + "Lessons"
                + sep + "src" + sep + "ReadWriteFile" + sep + "InOutFile" + sep + "InFile";

        File inFile = new File(pathIn);

        Scanner loadFile = new Scanner(inFile);
        while (loadFile.hasNextLine())
        {
            System.out.println(loadFile.nextLine());
        }
    }
}
