package Question_2;


import java.util.*;

public class question_2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        System.out.print("Enter the size of first array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the size of second array: ");
        int m = scanner.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = random.nextInt(50);
                arrayList.add(a1[i]);
        }
       Arrays.sort(a1); //сортировка первого рандомного массива
        System.out.println("First array: "+ Arrays.toString(a1));
        for (int i = 0; i < m; i++) {
            a2[i] = random.nextInt(45);
            if(a2[i]>0) {
                arrayList.add(a2[i]);
            }
        }
       Arrays.sort(a2);//сортировка второго рандомного массива
        System.out.println("Second array:"+ Arrays.toString(a2));

        Collections.sort(arrayList); //объединение двух массивов и их сортировка

        System.out.println("Sorting array: "+ arrayList);

    }
}
