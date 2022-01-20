import java.util.Arrays;
// Гномья сортировка
public class Gnome {
    static void gnomeSort(int arr[], int n)
    {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }

    //  Программа для тестирования вышеуказанных функций.
    public static void main(String[] args)
    {
        int arr[] = { 344, -2, 50, -11 };

        gnomeSort(arr, arr.length);

        System.out.print("Отсортированная последовательность после применения сортировки Gnome: ");
        System.out.println(Arrays.toString(arr));
    }
}