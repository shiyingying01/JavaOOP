package model;

/**
 * Created by dell on 2019/7/18.
 */
class CommonPrinter {public void print(){
    System.out.println("打印");}
    public void print(String color){
        System.out.println("打印" + color + "纸");}
}
class ColorPrinter extends CommonPrinter{
    public void print() {

        System.out.println("打印彩色纸");

    }}
public class Printer {
    public static void main(String[] args) {

        CommonPrinter printer = new CommonPrinter();

        ColorPrinter colorPrinter = new ColorPrinter();

        printer.print();

        colorPrinter.print();

        colorPrinter.print("黑白");

    }
}

