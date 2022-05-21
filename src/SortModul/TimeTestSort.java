package SortModul;
import java.util.*;

public class TimeTestSort
{
    public static void main(String[] args)
    {

        int arrVolume = actionMethod();

        ArrayGenerator myArray = new ArrayGenerator(arrVolume);
        System.out.print("Время затраченное на пузырьковоую сортировку составляет: ");
        double timeStart = System.nanoTime();
        BoobleSort.boobleSort(myArray.getRandomArray());
        double timeStop = System.nanoTime();
        System.out.println((timeStop - timeStart)/1000000 + " ms");

        ArrayGenerator myArray2 = new ArrayGenerator(arrVolume);
        System.out.print("Время затраченное на сортировку выбором составило: ");
        double timeStart2 = System.nanoTime();
        ChoiceSorted.choiseSorted(myArray2.getRandomArray());
        double timeStop2 = System.nanoTime();
        System.out.println((timeStop2 - timeStart2)/1000000 + " ms");
    }

    protected static int actionMethod()
    {
        int arrVolume;
        for (;;)
        {
            Scanner vol = new Scanner(System.in);
            System.out.print("Введите размер массива (целое число): ");
            if(vol.hasNextInt())
            {
                arrVolume = vol.nextInt();
                vol.close();
                break;
            } else
                System.out.println("Вы ввели что-то другое! Повторите попытку.");
        }
        return arrVolume;
    }
}
