package SortModul;
public class ArrayGenerator
{
        int arrVolume;
        Integer [] randomArray;

        protected ArrayGenerator(int arrVolume)
        {
            this.arrVolume = arrVolume;
            randomArray = new Integer[arrVolume];
            for (int i = 0; i < arrVolume; i++)
            {
                if(arrVolume < 10)
                {
                    randomArray[i] = (int) (Math.random() * arrVolume);
                } else
                    randomArray[i] = arrVolume - (int) (Math.random() * arrVolume);
            }
        }

        public Integer[] getRandomArray() {
            return randomArray;
       }
}
