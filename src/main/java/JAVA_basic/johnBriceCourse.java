package JAVA_basic;

import OOP_exercises.Speaker;

import java.sql.Date;


// exercise 1, found the scope of rectangle.
public class johnBriceCourse {

    public static void main(String[] args) {
        //   short rectangleLength = 10;
        //   short rectangleWidth = 5;
        //   int scope = rectangleLength * 2 + rectangleWidth * 2;
        //   System.out.println(scope);
// exercise 2, found the average of four numbers .
        //   System.out.println("Please enter a numbers");
        //  Scanner scan = new Scanner(System.in);
        //   int firstInput = scan.nextInt();
        //   System.out.println("Please enter a numbers");
        //   int secondInput = scan.nextInt();
        //   int average = (firstInput+secondInput)/2;
        //   System.out.println("The average is " + average);
// exercise 3, found the monthly salary .
        //  System.out.println("Please enter work hours of the month");
        //  Scanner scan = new Scanner(System.in);
        //  short workHours = scan.nextShort();
        //   System.out.println("Please enter your hourly wage");
        //   short hourlyWage = scan.nextShort();
        //  int salary = workHours*hourlyWage;
        //   System.out.println("Your work hours is " + workHours + " and your hourly wage is " + hourlyWage + " and you will to get " + salary);
// exercise 4, take distance of km and return meters.
        //   System.out.println("Please enter number of km");
        //   Scanner scan = new Scanner(System.in);
        //   int kilometer = scan.nextInt();
        //   int meters = kilometer*1000;
        //   System.out.println("The number of meters of this distance is " + meters);
// exercise 5, take two numbers and switch between them.
        //    System.out.println("Please enter a number");
        //    Scanner scan = new Scanner(System.in);
        //    int inputFirstNumber = scan.nextInt();
        //    System.out.println("Please enter second number");
        //    int inputSecondNumber = scan.nextInt();
        //    System.out.println("The first number is " + inputFirstNumber + " and the second number is " + inputSecondNumber);
        //    int switchNumbers = inputFirstNumber;
        //    inputFirstNumber = inputSecondNumber;
        //    inputSecondNumber = switchNumbers;
        //    System.out.println("The first number is " + inputFirstNumber + " and the second number is " + inputSecondNumber);
// exercise 6, solve question 5 without third cell.
        //    System.out.println("Please enter a number");
        //    Scanner scan = new Scanner(System.in);
        //    int inputFirstNumber = scan.nextInt();
        //    System.out.println("Please enter second number");
        //    int inputSecondNumber = scan.nextInt();
        //    System.out.println("The first number is " + inputFirstNumber + " and the second number is " + inputSecondNumber);
        //    System.out.println("The first number is " + inputSecondNumber + " and the second number is " + inputFirstNumber);
// exercise 2 page 27, קלוט שני שלמים והצג את כל השלמים ביניהם(כולל)
//                     בסדר עולה, לא מובטח שהנתון השני גדול מהראשון.
        //       Scanner scan = new Scanner(System.in);
        //     int maxInput = scan.nextInt();
        //      int minInput = scan.nextInt();
        //     if (maxInput < minInput) {
        //     int copy = maxInput;
        //         maxInput = minInput;
        //         minInput = copy;
        //     }
        //     while (minInput <= maxInput) {
        //         System.out.println(minInput);
        //         minInput++;
        //     }
//      exercise 3 page 27,     n הצג את כל המספרים הזוגיים מ- 0 עד .n קלוט מספר טבעי
//          (כולל אם הוא זוגי). לא מובטח ש- n זוגי.
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int zero = 0;
//        while(n >= zero){
//            System.out.println(zero);
//            zero += 2;
//        }
//      exercise 4 page 27,                        max -ו den קלוט שני מספרים טבעיים
//                           הצג את כל המספרים הטבעיים עד max(כולל) המתחלקים ב- den.
//                                                 לא מובטח ש- max עצמו מתחלק ב- den
//        Scanner scan = new Scanner(System.in);
//        int max = 0;
//        while (max == 0) {
//            max = scan.nextInt();
//            if (max == 0) {
//                System.out.println("cannot be divided by zero please enter a valid number");
//            }
//        }
//        int den = scan.nextInt();
//        int count = max;
//        while (count <= den) {
//            if (den % count == 0) {
//                System.out.println(count + " divided");
//            } else {
//                System.out.println(count + " not divided");
//            }
//            count++;
//      exercise 5 page 27,  קלוט מספרים אי-שליליים עד הזקיף (ערך סיום קלט) -99 והצג את סכומם.
//        Scanner scan = new Scanner(System.in);
//        int input = 0;
//        int sum = 0;
//        while (input != -99) {
//            sum += input;
//            input = scan.nextInt();
//        }
//        System.out.println(sum);
//
//        exercise 6 page 27, .בתור הקלט כמות לא ידועה של מספרים חיוביים שבסופם המספר 0
//הצג את ממוצע כל המספרים לא כולל ה- 0 (יתכן שהנתון הראשון הוא 0)
//        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        if (input == 0) {
//            System.out.println("0");
//        } else {
//            int sum = 0;
//            int count = 0;
//            while (input != 0) {
//                sum += input;
//                count++;
//                input = scan.nextInt();
//            }
//            System.out.println(sum / count);
//        }
//        exercise 7 page 27, קלוט מספרים עד שתקלוט מספר שלילי או .0
//        הצג את הערך החיובי הגבוה ביותר שנקלט (יתכן שהנתון הראשון אינו חיובי)
//        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        int highest = 0;
//        if (input <= 0) {
//            System.out.println(input);
//        } else {
//        while (input > 0){
//            if (highest < input) {
//                highest = input;
//            }
//            input = scan.nextInt();
//        }
//            System.out.println(highest);
//        }
//        exercise 8 page 28,  . קלוט מספרים עד שת קלוט מספר שלילי או 0
//הצג את הערך החיובי הנמוך ביותר (יתכן שהנתון הראשון אינו חיובי).
//        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        int lowest = input;
//        if (input <= 0) {
//            System.out.println(input);
//        } else {
//        while (input > 0){
//            if (input < lowest) {
//                lowest = input;
//            }
//            input = scan.nextInt();
//        }
//            System.out.println(lowest);
//        }
//        exercise 9 page 28,                            קלוט 100 מספרים.
//הצג את המספר הסידורי של הערך הגבוה ביותר
//        Scanner scan = new Scanner(System.in);
//        int count = 0;
//        int highest = 0;
//        int input;
//        while(count < 3){
//            input = scan.nextInt();
//            if (input > highest){
//                highest = input;
//            }
//            count++;
//        }
//        System.out.println(highest);
//        exercis 26 page 29.  קלוט שני שלמים.
//        הצג את כל השלמים שביניהם )כולל( מהראשון שנקלט ועד השני שנקלט.
//        Scanner scan = new Scanner(System.in);
//        int firstInput = scan.nextInt();
//        int lastInput = scan.nextInt();
//        int number;
//        if (firstInput > lastInput) {
//            while (firstInput >= lastInput) {
//                System.out.println(firstInput);
//                firstInput--;
//            }
//        } else {
//            while (firstInput <= lastInput) {
//                System.out.println(firstInput);
//                firstInput++;
//            }
//        }
//        exercis 27 page 29. קלוט שני שלמים.
// הצג את כל השלמים שביניהם (כולל) מהקטן לגדול ובחזרה לקטן.
//        Scanner scan = new Scanner(System.in);
//        int firstInput = scan.nextInt();
//        int lastInput = scan.nextInt();
//        int numberToSwitch;
//        if (firstInput > lastInput){
//            numberToSwitch = firstInput;
//            firstInput = lastInput;
//            lastInput = numberToSwitch;
//        }
//        numberToSwitch = firstInput;
//        while (numberToSwitch <= lastInput){
//            System.out.println(numberToSwitch);
//            numberToSwitch++;
//        }
//        numberToSwitch -= 2;
//        while (numberToSwitch >= firstInput){
//            System.out.println(numberToSwitch);
//            numberToSwitch--;
//        }
//        exercis 28 page 29. בתור הקלט רשימת טמפרטורות היומיות של יולי (30 ימים) 2000 ו- 2001
//(סה"כ 60 מספרים).
//חשב את הטמפרטורה הממוצעת ביולי 2000
//הצג את הימים ביולי 2001 בהם החום היה גבוה מהממוצע של יולי .
//        Scanner scan = new Scanner(System.in);
//        int input = 0;
//        int count = 0;
//        int average = 0;
//        while (count < 3) {
//            input += scan.nextInt();
//            count++;
//        }
//        average = input/count;
//        count = 0;
//        while (count < 3){
//            input = scan.nextInt();
//            if (input > average) {
//                System.out.println(input);
//            }
//            count++;
//        }
//        exercis 3 page 3,   קלוט שלמים עד שייקלט ערך שלילי.
////        עבור כל שלם חיובי הצג את סכום ספרותיו
//        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        int count = 0;
//        while ( input >= 0) {
//            if (input == 0){
//                System.out.println("1");
//            }else {
//                while (input > 0){
//                    input /= 10;
//                    count++;
//                }
//                System.out.println(count);
//            }
//            count = 0;
//            input = scan.nextInt();
//        }
// מצא את העצרת של האינפוט לדוגמה עצרת 4 זה 1*2*3*4 = 24
//        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        int number = 1;
//        for (int count = 2; count <= input; count++){
//            number += count*number;
//        }
//        System.out.println(number);
//        קבל חמישה מספרים ותוציא כמה ספרות יש בכל מספר
//        Scanner scan = new Scanner(System.in);
//        int count = 0;
//        int digit = 0;
//        int num = 0;
//        while (count < 5){
//            System.out.println("please enter a number ");
//            for (num = scan.nextInt(); num > 0; num /= 10 ){
//                digit++;
//            }
//            System.out.println("this number have a " + digit + " digits in his number");
//            count++;
//        }
//        תדפיס את לוח הכפל לדוגמה: 1*1,1*1,2*3...2*1,2*2,2*3...
//        int result = 0;
//        for (result = 1; result <= 10; result++){
//            for (int j = 1; j<= 10; j++){
//                System.out.println(result*j);
//            }
//        }
//        page 57 exe.2; קלוט נתונים לתוך מערך בגודל 100 והדפס את ממוצע המספרים הזוגיים בלבד.
//        Scanner scan = new Scanner(System.in);
//        int[] numbers = new int[10];
//        int sum = 0;
//        int countEven = 0;
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scan.nextInt();
//            if (numbers[i] % 2 == 0) {
//                sum += numbers[i];
//                countEven++;
//            }
//        }
//        if (sum == 0) {
//            System.out.println("0");
//        } else {
//            System.out.println(sum / countEven);
//        }
//          page 57 ex.3:  קלוט נתונים לתוך מערך בגודל 60 ובדוק האם קיים תא שערכו שווה לסכום כל התאים
//                              האחרים. אם כן, הדפס את מיקומו במערך
//        Scanner scan = new Scanner(System.in);
//        int numbers[] = new int[5];
//        int sum = 0;
//        for (int i = 0; i < numbers.length ; i++) {
//            numbers[i] = scan.nextInt();
//            sum += numbers[i];
//        }
//        for (int j = 0; j < numbers.length; j++) {
//            if (sum - numbers[j] == numbers[j]){
//                System.out.println(j+1);
//            }
//        }
//        ex.4 page 57. קלוט נתונים לתוך מערך בגודל 20. החלף את עשרת התאים הראשונים בעשרת התאים
////האחרונים (תאים 0 ו10- מתחלפים, תאים 1 ו11- מתחלפים וכו').
//        Scanner scan = new Scanner(System.in);
//        int[] numbers = new int[20];
//        int switchNumbers;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scan.nextInt();
//        }
//        for (int i = 0; i < numbers.length/2; i++){
//            switchNumbers = numbers[i];
//            numbers[i] = numbers[i+numbers.length/2] ;
//            numbers[i+numbers.length/2] = switchNumbers;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//          ex.5 page 57: קלוט נתונים מספריים למערך בגודל 60 וסדר את הנתונים במערך, כך שכל הזוגיים יהיו
//בחלקו הימני. הדפס את המערך המקורי ולאחר סידורו מחדש.
//        Scanner scan = new Scanner(System.in);
//        int[] numbers = new int[10];
//        int checkEven;
//        int countEven = 0;
//        int countOdd = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            checkEven = scan.nextInt();
//            if (checkEven % 2 == 0) {
//                numbers[countEven] = checkEven;
//                countEven++;
//            } else {
//                    numbers[numbers.length - countOdd] = checkEven;
//                    countOdd++;
//            }
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        ex.6 page 57:         קלוט נתונים למערך בגודל 20. החלף את סדר התאים מהסוף להתחלה (תאים 0 ו19-
//                           מתחלפים, 1 ו18- מתחלפים וכו')
//        int[] numbers = new int[20];
//        Scanner scan = new Scanner(System.in);
//        int count = 1;
//        int switchNumbers;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scan.nextInt();
//        }
//        for (int i = 0; i < numbers.length/2.0; i++) {
//            switchNumbers = numbers[numbers.length - count];
//            numbers[numbers.length - count] = numbers[i];
//            numbers[i] = switchNumbers;
//            count++;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
////        ex.7 page 57:  קלוט נתונים תווים למערך בגודל 50. הדפס כמה הם ספרות, כמה אותיות וכמה אחרים.
//        Scanner scan = new Scanner(System.in);
//        char[] chars = new char[50];
//        int letters = 0;
//        int numbers = 0;
//        int others = 0;
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] = scan.next().charAt(0);
//            if (chars[i] >= 65 && chars[i] <= 90 || chars[i] >= 97 && chars[i] <= 122 ) {
//                letters++;
//                System.out.println((int) chars[i]);
//            } else if (chars[i] >= 48 && chars[i] <= 57) {
//                numbers++;
//            } else {
//                others++;
//            }
//        }
//        System.out.println(numbers + " Is the number of numbers!!");
//        System.out.println(others + " Is the number the other characters!!");
//        System.out.println(letters + " Is the number of letters!!");
//
//
////        ex.8 page 57: בדוק האם מערך בגודל 10 מהווה פולינדרום או לא (נקרא מימין ומשמאל)
//        Scanner scan = new Scanner(System.in);
//        int count = 1;
//        int isPalindrome = 0;
//        int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scan.nextInt();
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == numbers[numbers.length-count]){
//            isPalindrome++;
//            }
//            count++;
//        }
//        if (isPalindrome == numbers.length){
//            System.out.println("is Palindrome");
//        } else {
//            System.out.println("is not Palindrome");
//        }


//        ex.9 page 57: קלוט נתונים למערך בגודל 10 ולמערך בגודל 50. בדוק האם המערך הקטן נמצא במלואו
//במערך הגדול. אם כן, הדפס את מספר התא במערך הגדול בו הקטן מתחיל.
//        Scanner scan = new Scanner(System.in);
//        int[] arrayMax = new int[6];
//        int[] arrayMin = new int[2];
//        int cellNumber = 0;
//        boolean[] theyEqual = new boolean[arrayMin.length];
//        boolean firstMatch = true;
//
//        System.out.println("Please enter "+ arrayMax.length + " numbers");
//        for (int i = 0; i < arrayMax.length; i++) {
//            arrayMax[i] = scan.nextInt();
//        }
//        System.out.println("Please enter " + arrayMin.length + " numbers");
//        for (int i = 0; i < arrayMin.length; i++) {
//            arrayMin[i] = scan.nextInt();
//        }
//        //this loop check if the first numbers are equal to the last numbers and if they do: it chang the boolean's array "theyEqual" to true.
//        for (int i = 0; i < arrayMin.length; i++) {
//            for (int j = 0; j < arrayMax.length; j++) {
//                if (arrayMin[i] == arrayMax[j]) {
//                    theyEqual[i] = true;
//                    if (firstMatch) {
//                        cellNumber = j + 1;
//                        firstMatch = false;
//                    }
//                }
//            }
//        }
//
//        // this loop check if the value of the booleans in this array are true!.
//        for (int i = 0; i < theyEqual.length; i++) {
//            if (!theyEqual[i]) {
//                System.out.println("The last " + arrayMin.length + " number are not existing in the first " + arrayMax.length);
//                break;
//            }
//            if (i == theyEqual.length - 1) {
//                System.out.println(cellNumber);
//            }
//        }
        // תרגילי הכנה למטלת Flow control
//        ex.1: בנו תוכנית ובה מערך של 5 מספרים רנדומליים יחודיים בין 1 ל -10. הדפיסו את הגדול ביותר, הקטן
//ביותר, ממוצע כל המספרים וכמה מספרים גדולים מ -5.
//        int numbers[] = new int[5];// 10, 5,
//        Scanner scan = new Scanner(System.in);
//        int highest = 0;
//        int lowest = 0;
//        int sum = 0;
//        int average = 0;
//        boolean theFirst = true;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scan.nextInt();
//            if (!theFirst) {
//                for (int j = 0; j < i; j++) {
//                    while (numbers[i] == numbers[j]){
//                        System.out.println("please enter another number");
//                        numbers[i] = scan.nextInt();
//                    }
//                }
//            }
//            theFirst = false;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//
//        }
// ex. random 1:
//        int[] numbers = new int[6];
//        Random rand = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = rand.nextInt(10);
//            System.out.print(numbers[i] + "\t");
//        }
//        System.out.println();
//        for (int i = 0; i < numbers.length-1; i++) {
//            System.out.print(numbers[i] + "" + numbers[i+1] + "\t");
//        }
        // oneDrive folder: תרגילי הכנה למטלת Control Flow/ הכנה למבחן java basic, ex.1:
        //בנו תוכנית ובה מערך של 5 מספרים רנדומליים יחודיים בין 1 ל .10- הדפיסו את הגדול ביותר, הקטן
        //ביותר, ממוצע כל המספרים וכמה מספרים גדולים מ .5-
//        Random rand = new Random();
//        int[] numbers = new int[5];
//        int count = 0;
//        int highest = 0;
//        int lowest = 0;
//        float sum = 0;
//        int higherThanFive = 0;
//        boolean firstRound = true;
//        for (int i = 0; i < numbers.length; ) {
//            if (firstRound) {
//                numbers[i] = rand.nextInt(1, 11);
//                firstRound = false;
//                highest = numbers[i];
//                lowest = numbers[i];
//                sum = numbers[i];
//                if (numbers[i] > 5) {
//                    higherThanFive++;
//                    i++;
//                }
//            }
//            numbers[i] = rand.nextInt(1, 11);
//            for (; count < i; ) {               // this "for" verifies the new number as unique.
//                if (numbers[i] == numbers[count]) {
//                    numbers[i] = rand.nextInt(1, 11);
//                    count = 0;
//                } else {
//                    count++;
//                }
//            }
//            if (numbers[i] > highest) {
//                highest = numbers[i];
//            }
//            if (numbers[i] < lowest) {
//                lowest = numbers[i];
//            }
//            if (numbers[i] > 5) {
//                higherThanFive++;
//            }
//            sum += numbers[i];
//            count = 0;
//            i++;
//        }
//        System.out.println("The numbers are: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println("\nthe highest is: " + highest + "\nThe lowest is: " + lowest + "\n" + higherThanFive + " numbers higher than five\n" + "The average is: " + sum / numbers.length);
//        ex.2 :                בנו תוכנית שמגרילה 10 מספרים רנדומליים (בין 1-5) ושומרת אותם במערך
//הדפיסו כמה פעמים מופיע כל מספר במערך. כלומר כמה פעמים נמצא 1, כמה פעמים 2 וכו'...
//        int[] numbers = new int[10];
//        int[] zeroToFive = {1,2,3,4,5};
//        int[] copies = new int[5];
//        Random rand = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = rand.nextInt(1, 5);
//        }
//        for (int i = 0; i < zeroToFive.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (zeroToFive[i] == numbers[j]){
//                    copies[i]++;
//                }
//            }
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]);
//        }
//        for (int i = 0; i < copies.length; i++) {
//            System.out.println();
//            System.out.print(copies[i]);
//        }
//בנו תוכנית שבה המחשב מגריל מספר רנדומלי. עכשיו המשתמש ינסה לנחש את המספר ע"י קלט
//שלו. אם ניחש נכון תופיע הודעה מתאימה, אם לא ניחש אחרי 3 פעמים תופיע הודעה אחרת
//          והתוכנית תסתיים.
//        Random rand = new Random();
//        Scanner scan = new Scanner(System.in);
//        int randomNumber = rand.nextInt(1 , 10);
//        System.out.println(randomNumber);
//        int guess = 0;
//        for (int i = 0; i < 3; i++) {
//            guess = scan.nextInt();
//            if (guess == randomNumber){
//                System.out.println("Excellent guess!");
//                break;
//            } else {
//                if (i != 2){
//                    System.out.println("Please try again");
//                } else {
//                    System.out.println("Your guess is not correct");
//                }
//            }
//        }
//        עוד תרגילי הכנה למטלת flow control מסמך וורד
//        צרו 2 מערכים באורך 10 ואתחלו אותם עם ספרות רנדומליות (0-9) – הספרות לא צריכות להיות ייחודיות במערך.
//        int[] numbers1 = new int[10];
//        int wantToSwitch = 0;
//        int[] numbers2 = new int[numbers1.length];
//        Random rand = new Random();
//        for (int i = 0; i < numbers1.length; i++) {
//            numbers1[i] = rand.nextInt(0 , 10);
//            numbers2[i] = rand.nextInt(0 , 10);
//        }
//// כתבו קוד שבודק האם המערכים שווים – כלומר האם הערכים בכל מערך שווים לערכים המקבילים במערך השני.
//        boolean theArraysAreEqual = true;
//        for (int i = 0; i < numbers1.length; i++) {
//            if (numbers1[i] != numbers2[i]){
//                theArraysAreEqual = false;
//                break;
//            }
//        }
////כתבו קוד ש"מזיז" את כל ערכי 0 (אם יש כאלה) במערך הראשון לסוף המערך.
//// יש לשמור על סדר שאר הערכים במערך. לדוגמה מערך עם הערכים 0,1,0,0,4,0,8,0,2 יהפוך ל- 1,4,8,2,0,0,0,0,0
//        int countZeros = 0;
//        for (int i = 0; i < numbers1.length; i++) {
//            if (numbers1[i] == wantToSwitch){
//                countZeros++;
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < numbers1.length; i++) {
//            if (numbers1[i] == wantToSwitch){
//                for (int j = i; j < numbers1.length-1; j++) {
//                    numbers1[j] = numbers1[j + 1];
//                }
//            }
//        }
//        for (int i = 0; i < countZeros; i++) {
//            numbers1[numbers1.length-1-count] = wantToSwitch;
//            count++;
//        }
//צרו 2 מערכים בגודל 10 עם מספרים רנדומליים בין 1-50. צרו מערך נוסף באורך 20 שיכיל את כל הערכים משני המערכים הראשונים מסודרים בסדר עולה!
//        int[] numbers1 = new int[10];
//        int[] numbers2 = new int[10];
//        int[] randomOrder = new int[20];
//        int[] ascendingOrder = new int[20];
//        Random rand = new Random();
//        for (int i = 0; i < numbers1.length; i++) {
//            numbers1[i] = rand.nextInt(1,10);
//            numbers2[i] = rand.nextInt(1,10);
//            randomOrder[i] = numbers1[i];
//            randomOrder[i+ numbers2.length] = numbers2[i];
//        }
//        for (int i = 0; i < randomOrder.length; i++) {
//            System.out.print(randomOrder[i]);
//        }
//        System.out.println();
//        int count = 0;
//        int highest = 0;
//        int cellNumber = 0;
//        for (int i = 0; i < randomOrder.length; i++) {
//            for (int j = 0; j < randomOrder.length; j++) {
//                if (highest <= randomOrder[j]){
//                    highest = randomOrder[j];
//                    cellNumber = j;
//                }
//            }
//            randomOrder[cellNumber] = 0;
//            ascendingOrder[ascendingOrder.length-1-count] = highest;
//            count++;
//            highest = 0;
//        }
//        for (int i = 0; i < ascendingOrder.length; i++) {
//            System.out.print(ascendingOrder[i]);
//        }
//
//        int result = (math(4,3));
//        System.out.println(result);
//    }
//
//    /**
//     * תיעוד למה הפונקציה עושה
//     * @return
//     */
//    public static int math(int num, int num2){
//        num = num * num2;
//        return num;
//        תרגול פונקציות: ex.1
//        System.out.println(JAVA_basic.Stream.Main.myFullName());
//        System.out.println(JAVA_basic.Stream.Main.myFullName());
//        ex.2 : צרו מתודה המציגה את כל המספרים הזוגיים מ-2 ועד 200 כולל קצוות.
//קיראו לה מה-main שלוש פעמים.
//        int numbersEvenOrOdd = 20;
//        for (int i = 0; i < numbersEvenOrOdd/2; i++) {
//            System.out.print(" " + JAVA_basic.Stream.Main.evenNumbers(2,numbersEvenOrOdd,i));;
//        }
//        JAVA_basic.Stream.Main.f1();
//        System.out.println("----------------");
//        JAVA_basic.Stream.Main.f2();
//        System.out.println("----------------");
//        JAVA_basic.Stream.Main.f3();

//        System.out.println(JAVA_basic.Stream.Main.correctDate());
//       JAVA_basic.Stream.Main.print1toN(20);
//       JAVA_basic.Stream.Main.printTriangle(7);
//         JAVA_basic.Stream.Main.printNto1(8);
//        JAVA_basic.Stream.Main.printRectangle(8, 3);
//        short a = 5; short b = 5; short c = 3; short d = 2; short e = 1;
//        System.out.println(JAVA_basic.Stream.Main.aDouble(a,b,c,d,e));
//        System.out.println("please enter a five numbers");
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextShort();
//        b = scanner.nextShort();
//        c = scanner.nextShort();
//        d = scanner.nextShort();
//        e = scanner.nextShort();
//        System.out.println(JAVA_basic.Stream.Main.aDouble(a,b,c,d,e));
//        System.out.println(JAVA_basic.Stream.Main.rand(5,25));
//        int a = 5;
//        int b = 7;
//        int c = 9;
//        System.out.println(JAVA_basic.Stream.Main.maxInt(5,7,9));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a three numbers");
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        System.out.println(JAVA_basic.Stream.Main.maxInt(a,b,c));
//        int[] bunchOfNumbers = new int[10];
//        JAVA_basic.Stream.Main.printArray(bunchOfNumbers);
//        int[] arr1 = {1,2,3,5,4};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }
//        System.out.println();
//        JAVA_basic.Stream.Main.intArray(arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }

//        OOP:
//        Speaker speaker1 = new Speaker("red", 7);
//        speaker1.dataMembers();
        /*convert String number to int*/
        String str = "76";
        int num = Integer.parseInt(str);
        System.out.println(num);


        System.out.println(Date.valueOf("2024-08-14"));


    }

//    public static int sum(int a, int b) {
//        int theSum;
//        return theSum = a + b;
//    }

}












