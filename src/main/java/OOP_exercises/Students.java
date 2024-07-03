package OOP_exercises;

// יצירת class שבתוכו יש אובייקט ושאר הקוד שלי
public class Students {
    String name, address;
    double age;
    int id;

    public static void main(String[] args) {
/*
יצירת אובייקטים חדשים לפי התבנית הקיימת  והכנסת מידע במשתנים, מבלי להשתמש בקונסטרקטור.      //
        Students student1 = new Students();
        student1.name = "Haim";
        student1.age = 25.5;

        student1.id = 123456789;

        Students student2 = new Students();
        student2.name = "ron";
        student2.age = 23.4;
        student2.id = 987654321;
 */
//        יצירת אובייקטים חדשים עם שימוש בקונסטרקטור ותוך כדי יצירתם אני מכניס את המידע שנכנס ישירות לאובייקט,
//        מאחר שייצרתי מספר קונסטרקטורים שכל אחד דורש כמות אחרת של משתנים יש לי אפשרות להחליט כמה משתנים לספק
//        ניתן ליצור קונסטרקטור בפנים class אחר מאחר ש".this" יכול לקחת משתנה גלובלי
        Students student4 = new Students("amit", 23);
        Students student1 = new Students("haim", 25.5, 123456789);
        Students student2 = new Students("mosh", 54.5, 123456788);
        Students student3 = new Students("ron","jerusalem",23, 123456787);
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.address);
        System.out.println(student4.name);
    }
//    יצירת הקונסטרקטור:
//    לא יהיה static,
//    והשם שלו חייב להיות שווה לשם של האובייקט,
//    כאשר אני כותב ".this" אני מתכוון למשתמש גלובלי ולא מקומי ולכן ניתן לגשת למה שהמשתמש הכניס במקום אחר
    public Students(String name, double age){
        this.name = name;
        this.age = age;
    }



    public Students(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Students(String name, String address, double age, int id){
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;
    }

}