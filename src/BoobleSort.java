public class BoobleSort
{
    public static void main(String[] args) {
        Integer[] num = {23,45,2,6,7,31,4};
        boobleSort(num);
        for (int i = 0; i < num.length; i++ )
        {
            System.out.println("Элемент массива с индексом " + i + " -> " + num[i]);
        }
    }

    public static void boobleSort(Integer[] array)
    {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = array.length - 1; j > i; j--){
                if (array[j-1] > array[j])
                {
                        int temp = array[j - 1];
                        array[j-1] = array[j];
                        array[j] = temp;
                }
            }
        }
    }
}
