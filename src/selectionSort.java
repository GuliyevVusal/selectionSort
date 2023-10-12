public class selectionSort {
    public static void main(String[] args) {
//  3,1,5,8,9 bu alqoritmde arra-in en kicik elementini tapiriq sonra en kicik elementle ilk element yer deyisdirir
//  Daha sonra yeniden en kiciyi tapir amma ilk elemente baxmadan. 1-ci elementle deyisdirir v.s
//  1 ci en kicik element tapmaq isini goruruk int enKicik = num[i]; array-in ilk elementini en kicik qebul edirik
//  Sonrada en kicik elementi tapmaq isini gorecik i+1 den basliyaciq cunki 0-ci elemnti en kicik qebul etmisdik
//  Bubble sortda i-ile isimiz yox idi i sadece tekrar tekrar dovr etmek isini gorurdu biz j ile j+1 e baxirdiq
//  Burda en kiciyi tapmaq isini goruruk deye en kicikle array-in J-ci elementini kontrol edecik
//  if (num[j] < enKicik) num-in j-ci elemnti kicikdirse enKicik-den yeni
//  Sonra gelecik array-in en kicik elementini tapaciq enKicik = num[j]; deyecik
//  Sonra array-in enKicikYeri i elan edirik for bitdikden sonra men array-in en kicik elementini tapmis
//  Olacam en kicik elementi tapdiqdan sonra enKicik elementle array-in i-ci elementini yer deyisdirecem
//  bunun ucun enKiciyin necenci element oldugunu bilmeliyik
//  Sonra en enKicikYeri = j dedik burda en enKicikYeri saxladiq
//  Temp elan edirik yer deyisme isini edecik array-in i-ci elementini temp-e atdiq
//  Sonra arrayin[i]-ci elemnti = arrayin[enKicikYeri] deyirik
//  Sonra num[enKicikYeri]-ne tepmde saxladigimiz [i]-ci elemntini qoyuruq

        int count = 0;
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) num[i] = (int) (Math.random() * 10);
        for (int i = 0; i < num.length ; i++) System.out.printf("%3d",num[i]);
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            int enKicik = num[i], enKicikYeri = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < enKicik) {
                    enKicik = num[j];
                    enKicikYeri = j;

                }
            }
            int temp = num[i];
            num[i] = num[enKicikYeri];
            num[enKicikYeri] = temp;
        }
        for (int i = 0; i < num.length ; i++) System.out.printf("%3d",num[i]);
    }
}
