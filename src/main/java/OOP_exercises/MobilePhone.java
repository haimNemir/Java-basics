//תרגיל classes2 29.05.2024
//צרו קלאס בשם MobilePhone המכיל
//· String model
//· int memory
//· int numOfAppsInstalled
//הוסיפו constructor עם שם וכמות זכרון בלבד (מספר אפליקציות מותקנות יוגדר כ-0)
//הוסיפו מתודה של הדפסת מידע.
//הוסיפו מתודה בשם installApp שמעדכנת את numOfAppsInstalled
//הוסיפו מתודה בשם uninstallApp שמעדכנת את numOfAppsInstalled
//צרו מספר אובייקטים של טלפונים ובדקו שהכל עובד

package OOP_exercises;
public class MobilePhone {
    String model;
    int memory;
    int[] numOfAppsInstalled = new int[1];

    public MobilePhone(String model, int memory){
        this.model = model;
        this.memory = memory;
        this.numOfAppsInstalled[0] = 5;
    }
    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("Iphone 15", 32);
        System.out.println(mobile1.numOfAppsInstalled[0]);
        moreApps(mobile1.numOfAppsInstalled);
        System.out.println(mobile1.numOfAppsInstalled[0]);
        lessApps(mobile1.numOfAppsInstalled);
        System.out.println(mobile1.numOfAppsInstalled[0]);
    }
    public static int moreApps( int[] apps){
        apps[0] += 5;
        return apps[0];
    }
    public static int lessApps(int[] apps){
        apps[0] -= 2;
        return apps[0];
    }
}
