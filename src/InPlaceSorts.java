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

    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] > arr[i])
                {
                    swap(arr, j, i);
                }
            }
        }
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static void printArr(int[] arr)
    {
        String array = "";
        for(int i = 0; i < arr.length-1; i++)
        {
            array = array + arr[i] + ", ";
        }
        array += arr[arr.length-1];
        System.out.println(array);
    }
}
