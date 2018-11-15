public class InPlaceSorts
{
    public static int[] swap(int[] array, int pos1, int pos2)
    {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        return array;
    }

    public void bubbleSort(int[] arr)
    {

    }

    public void selectionSort(int[] arr)
    {
        int temp;
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
}
