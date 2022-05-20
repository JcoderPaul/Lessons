package SortModul;

public class ChoiceSorted
{
    public static void main(String[] args) {

        Integer[] num = {23, 54, 12, 5, 7, 2, 93};
         choiseSorted(num);

        for (int i = 0; i < num.length; i++)
        {
            System.out.println("Элемент массива с индексом " + i + " -> " + num[i]);
        }
    }

    private static void choiseSorted(Integer[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int position = i;
            int min = array[i];
                for (int j = i + 1; j < array.length; j++)
                {
                    if(array[j] < min)
                    {
                        position = j;
                        min = array[j];
                    }
                }
                array[position] = array[i];
                array[i] = min;
        }
    }
}
