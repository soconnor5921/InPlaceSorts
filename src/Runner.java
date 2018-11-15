public class Runner
{
    public static void main(String[] args)
    {
        int[] array = InPlaceSorts.randIntArr(10);
        InPlaceSorts.printArr(array);
        InPlaceSorts.selectionSort(array);
        InPlaceSorts.printArr(array);
    }
}
