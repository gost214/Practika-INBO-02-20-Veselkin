package pract9;
import javax.swing.JFrame;

public class LabClassDriver {
    public void run(Student[] list){
        LabClass sort=new LabClass();
        sort.quickSort(list,0,list.length-1);
    }
}