public class Runner
{
    public static void main(String[] args)
    {
        int[] array = InPlaceSorts.randIntArr(20);

        double[] doubleArr = InPlaceSorts.randDoubleArr(20);

        InPlaceSorts.printArr(array);
        InPlaceSorts.quickSort(array, 4, 10);
        InPlaceSorts.printArr(array);


    }
}
