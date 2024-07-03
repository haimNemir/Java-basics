package JAVA_basic;

import java.util.Random;

public class test27052024 {
    public static void main(String[] args) {
//הגדירו שני מערכי מספרים (arr1,arr2) מסוג int בגודל 15 ואתחלו אותם בספרות חד ספרתיות (0-9) באופן אקראי.
// בסיום הדפיסו את 2 המערכים באמצעות הפונקציה שהגדרתם בסעיף הקודם
        int[] arr1 = new int[15];
        int[] arr2 = new int[arr1.length];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(0,10);
            arr2[i] = rand.nextInt(0,10);
        }
        System.out.print("The array arr1 is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("The array arr2 is: ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }


// צרו משתנה בשם max, משתנה זה יהיה המספר התלת ספרתי הגבוה ביותר אשר ניתן למצוא במערך הראשון arr1 ומורכב מרצף תאים סמוכים זה לזה.
// לדוגמא, עבור מערך :{ 3,2,6,4,2,8,5,1,5,1,3,2,7,1,1} המשתנה max הינו 851 הדפיסו את max
//        סעיף 3 + 4:
        int max = 0;
        int min = 999;
        int temp = 0;
        for (int i = 0; i < arr1.length-2; i++) {
                temp = arr1[i] * 10 * 10;
                temp += arr1[i + 1] * 10;
                temp += arr1[i + 2];
            if (max < temp && arr1[i] != 0){
                max = temp;
            }
            if (min > temp && arr1[i] != 0){
                min = temp;
            }
        }
        System.out.println();
        System.out.println("the max is: " + max);
        System.out.println("the min is: " + min);
// צרו מערך שלישי של מספרים (distinct) בגודל 10 המאותחל כולו בערכי 1-  .
// הוסיפו למערך זה את כל המספרים שייחודים לכל מערך, כלומר, כל המספרים שמופיעים ב-arr1 ואינם נמצאים ב-arr2 וכל המספרים שמופיעים ב-arr2 ואינם נמצאים ב-arr1  .
// המערך distinct צריך להחזיק ערכים ייחודיים, כלומר כל ספרה מופיעה פעם אחת בלבד ללא כפילויות
        int[] distinct = new int[10];
        int countUnique = 0;
        for (int i = 0; i < distinct.length; i++) {
            distinct[i] = -1;
        }
        boolean itsUnique = true;
        for (int i = 0; i < arr1.length; i++) {
            itsUnique = true;
            for (int j = 0; j < arr1.length; j++) { // הלופ מוודא שהמספר ייחודי ואם לא itsUnique שווה false
                if (arr1[i] == arr2[j]){
                    itsUnique = false;
                    break;
                }
            }
            for (int j = 0; j < countUnique; j++) {  // וודא שהמספר הנוכחי לא מופיע בתוך distinct
                if (arr1[i] == distinct[j]){
                    itsUnique = false;
                }
            }
            if (itsUnique) {
                distinct[countUnique] = arr1[i];
                countUnique++;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            itsUnique = true;
            for (int j = 0; j < arr1.length; j++) {  // הלופ מוודא שהמספר ייחודי ואם לא itsUnique שווה false
                if (arr2[i] == arr1[j]){
                    itsUnique = false;
                    break;
                }
            }
            for (int j = 0; j < countUnique; j++) {  // וודא שהמספר הנוכחי לא מופיע בתוך distinct
                if (arr2[i] == distinct[j]){
                    itsUnique = false;
                }
            }
            if (itsUnique) {
                distinct[countUnique] = arr2[i];
                countUnique++;
            }
        }
            System.out.print("The array distinct is: ");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + " ");
        }
    }
}
