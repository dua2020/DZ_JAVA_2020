public class Main {
    public static void main(String[] args) {
        /*
        Задача 4.4
        Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
        -----
        Подсказка: их 6 штук.
        Каждую комбинацию вывести с новой строки. Слова не разделять.
        ----------
        Пример:
        МылаРамуМама
        РамуМамаМыла
        ...
         */
        String WordArray [] = {"Мама", "Мыла", "Раму"};
        CreateStr(WordArray, 0);
    }
    public static void CreateStr(String[] arrWord, int k){
        if (k==arrWord.length) {
            printstroka(arrWord);
        }
        else {
            int xrange[] = new int [arrWord.length-k];
            for (int i=k, n=0; i<arrWord.length; i++,n++) {
                xrange[n]=i;
            }
            for (int i=0; i<xrange.length; i++) {
                String z;
                z=arrWord[k];
                arrWord[k]=arrWord[xrange[i]];
                arrWord[xrange[i]]=z;
                // рекурсивный вызов
                CreateStr(arrWord, k+1);
                z=arrWord[k];
                arrWord[k]=arrWord[xrange[i]];
                arrWord[xrange[i]]=z;
            }
        }
    }
    public static void printstroka(String[] arr)
    {
        // печать готовой строки
        String testString="";
        for (int i=0; i<arr.length; i++) {
            testString = testString + arr[i];
        }
        System.out.println(testString);
    }
}
