package ua.edu.npu.lab01.task04;

public class StringSplit {
    String[] StringArr;
    public void  Split (String s) {
        StringArr = s.split(" ");
    }

    public String[] getStringArr() {
        return StringArr;
    }
}
