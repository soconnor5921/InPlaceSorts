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

    public static void selectionSort(int[] arr)
    {
        int pos, min;
        for(int i = 0; i < arr.length-1; i++)
        {
            pos = i;
            min = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < min)
                {
                    pos = j;
                    min = arr[j];
                    swap(arr, i, pos);
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

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = Math.random()*10000;
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

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;
        int temp;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = i; i = j; j = temp;
            }
        }
        temp = arr[i+1]; arr[i+1] = arr[right]; arr[right] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot + 1, right);
        }
    }
}
