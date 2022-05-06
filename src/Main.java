import Manage.ManageStaff;
import Manage.ManageTransaction;
import model.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ManageStaff manageStaff = new ManageStaff();
        ManageTransaction manageTransaction = new ManageTransaction();

        int choice = -1;

        while (choice != 0) {
            choice = sc.nextInt();
            System.out.println("1. Dang ky");
            System.out.println("2. Dang nhap");
            switch (choice) {
                case 1:
                    System.out.println(" dang ky");
                    System.out.println("nhap username");
                    String username = scanner.nextLine();
                    System.out.println("nhap mat khau");
                    String pass = scanner.nextLine();
                    System.out.println("nhap ten nhan vien");
                    String name = scanner.nextLine();
                    Staff staff = new Staff(username, pass, name);
                    manageStaff.add(staff);

                    break;
            }
        }
    }
}
