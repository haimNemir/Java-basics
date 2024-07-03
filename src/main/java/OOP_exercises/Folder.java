package OOP_exercises;

import java.util.Scanner;

public class Folder {
    private String folderName;
    private File[] arrayOfFiles = new File[3];

    /* Constructor */

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    /* Setter */

    public void setFiles(File file) {
        for (int i = 0; i < arrayOfFiles.length; i++) {
            if (arrayOfFiles[i] == null) {
                arrayOfFiles[i] = file;
                break;
            } else if (arrayOfFiles[i] != null && i == arrayOfFiles.length - 1) {
                System.out.println("There is no free space in the folder, please delete other file");
            }
        }
    }

    public void deleteFile(int fileIndex){
        Scanner scanner = new Scanner(System.in);
        while (fileIndex < 0 || fileIndex > arrayOfFiles.length - 1) {
            System.out.println("Please enter a valid number");
            fileIndex = scanner.nextInt();
        }
        arrayOfFiles[fileIndex] = null;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setArrayOfFiles(File[] arrayOfFiles) {
        this.arrayOfFiles = arrayOfFiles;
    }

    /* Getter */

    public String getFolderName() {
        return folderName;
    }

    public File[] getArrayOfFiles() {
        return arrayOfFiles;
    }

    public File getFile(int filePlaceNumber) {
        File file = new File("","", 0);
        if (arrayOfFiles[filePlaceNumber] == null){
            System.out.println("This file number is empty");
            return file;
        } else {
            return arrayOfFiles[filePlaceNumber];
        }
    }



    /*-----------------*/

}
