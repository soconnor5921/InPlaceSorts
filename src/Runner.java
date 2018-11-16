public class Runner
{
    public static void main(String[] args)
    {
        int[] array = InPlaceSorts.randIntArr(20);

        double[] doubleArr = InPlaceSorts.randDoubleArr(20);

        InPlaceSorts.printArr(array);
        InPlaceSorts.selectionSort(array);
        InPlaceSorts.printArr(array);
    }
}
