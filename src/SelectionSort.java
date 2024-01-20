import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        //Selection sort bubbleSortdan ferqli algoritma ile iselyir ilk dovurde arrayin en kicik elementini
        // ve en Boyuk elementini tapir yeni bu array-da 64-ile 11 yer deyisdirecek ilk dovurde 64-u minIndex
        // olaraq goturur 64 ile arrayin 1-ci elementini 25-i qarsilasdirir 25 kicik oldugu ucun minIndex olaraq
        //25-i goturur sonra array[j] elementi 12 ile 25 qarsiladirir 12 kicik oldugu ucun minIndex 12-ni goturur
        //sonra 12 ile 22 qarsilasdirir false alir davam edir en sonda 12 ile 11 qarsilasdirir ve 11 kicik oldugu
        // ucun minIndex 11-i ele alir ilk dovr bitdikde 11 ile 64 yer deyisdirir minIndex 11-dir
        // 2-ci dovrde i=1 den basliyir 25-i min minIndex olaraq ele alir 25 ile arr[j]-si 12 ni qarsilasdirir
        //minIndex 12 ni ele alir 12 ile arr[j] yeni 22 ni qarsilasdirir false sonra 64-u false alir
        // 3-cu dovr basladi minIndex 25-dir 22-ile qarsilasdirir ve minIndex 22 ele alir 22 ile 64 false
        //4-cu dovr minIndex 25 dir ve 64 de dayanir yeni array hazirdir 
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Orginal Array: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After All: " + Arrays.toString(array));
    }

    static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdex]) {
                    minIdex = j;
                }
            }
            int temp = array[minIdex];
            array[minIdex] = array[i];
            array[i] = temp;
        }
    }
}
