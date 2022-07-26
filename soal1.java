class ToggleArray
{
    static void Toggle(boolean arr[], int start, int end)
    {
        arr[start] ^= true;
        arr[end + 1] ^= true;
    }

    static void getToggling(boolean arr[], int n)
    {
        for (int k = 1; k <= n; k++)
        {
            arr[k] ^= arr[k - 1];
        }
    }

    static void printOutput(boolean arr[], int n)
    {
        for (int k = 1; k <= n; k++)
        {
            if(arr[k] == true)
                System.out.print("1" + " ");
            else
                System.out.print("0" + " ");
        }
    }

    public static void main(String args[])
    {
        int n = 5, m = 3;
        boolean arr[] = new boolean[n + 2];

        Toggle(arr, 1, 5);
        Toggle(arr, 2, 5);
        Toggle(arr, 3, 5);

        getToggling(arr, n);

        printOutput(arr, n);
    }
}
