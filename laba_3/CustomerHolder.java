package com.company;

import java.util.Arrays;

public class CustomerHolder {
    private int quantityCustomers;
    private Customer[] customer;


    public CustomerHolder() {
        this.customer = customer;
        this.quantityCustomers = customer.length;
    }

    //вывод списка покупателей по алфавиту
    public void sortCustomerAlphabet() {
        Arrays.sort(this.customer, ComparatorCustomer.SortAlphabet);
        for (Customer cust : this.customer) {
            System.out.println(cust.toString());
        }
    }

    //вывод списка покупателей, у которых номер кредитной карточки находится в заданном интервале
    public void searchCreditCardNumber(int begin, int end) {
        boolean test = true;
        for (Customer cust : this.customer) {
            if (cust.getCreditCardNumber() >= begin && cust.getCreditCardNumber() <= end) {
                test = false;
                System.out.println(cust.toString());
            }
        }
        if (test) {
            System.out.println("Покупатели с кредитными картами в интервале [" + begin + ", " + end + "] не найдены.");
        }
    }

    public int getQuantityCustomers() {
        return quantityCustomers;
    }

    public void setQuantityCustomers(int quantityCustomers) {
        this.quantityCustomers = quantityCustomers;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Customer value : customer) {
            str.append(value.toString() + "\n");
        }
        return str.toString();
    }
}
