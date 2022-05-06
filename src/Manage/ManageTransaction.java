package Manage;

import model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ManageTransaction {
    List<Transaction> transactionList = new ArrayList<>();

    public void add(Transaction transaction) {
        transactionList.add(transaction);
    }

    public int findById(int id) {
        for (int i = 0; i < transactionList.size(); i++) {
            if(transactionList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void edit(int id, Transaction transaction) {
        transactionList.set(findById(id), transaction);
    }

    public void remove(int id) {
        transactionList.remove(findById(id));
    }

    public void showAll() {
        for (int i = 0; i < transactionList.size(); i++) {
            System.out.println(transactionList.get(i));
        }
    }
}
