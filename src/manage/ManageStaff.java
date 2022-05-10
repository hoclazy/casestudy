package Manage;

import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class ManageStaff {
    List<Staff> staffList = new ArrayList<>();

    public void add(Staff staff) {
        staffList.add(staff);
    }

    public int search(String username) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String username) {
        staffList.remove(search(username));
    }

    public int login(String username, String pass) {
        for (Staff staff: staffList) {
            if (staff.getUsername().equals(username) && staff.getPass().equals(pass)) {
//                currentStaff = staff;
                return 1;
            }
        }
        return 0;
    }
}
