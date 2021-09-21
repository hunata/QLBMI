import Utils.BMI;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w,h;
       try{
        System.out.println("Nhập vào chiều cao: ");
        h = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào cân năng: ");
        w =  Integer.parseInt(sc.nextLine());
       } catch (NumberFormatException e1){
           System.out.println("Chỉ được nhập số");
           return;
       }
       try {
           double bmi = BMI.calculateBMI(w, h);
           System.out.println("BMI = %f\n"+ bmi);
       } catch (Exception e){
           System.out.println(e);
       }
    }


}
