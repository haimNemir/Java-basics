package OOP_exercises;

import jdk.dynalink.beans.StaticClass;

public class File {
    private String fileName;
    private String fileExtension;
    private double fileSize;

    /* Constructor */
    public File(String fileName, String fileExtension, double fileSize) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
    }

    /* Getters */

    public String getFileName (){
        return fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void doString(){
        System.out.println("File name: " + fileName + "\nFile size: " + fileSize + "\nFile extension: " + fileExtension);
    }

    /* Setters */

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    /*-------------*/

    public void fileData (){
        System.out.println("The name of the file is: " + fileName + "\nThe extension of the file is: " + fileExtension + "\nThe file size is: "+ fileSize);
    }

}
