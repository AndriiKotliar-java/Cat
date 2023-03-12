package ATM;

import ATM.AccountATM;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<AccountATM> list = new ArrayList();

    static {
        list.add(new AccountATM("Mrs.Jane",6500,1,"15ft")); //1
        list.add(new AccountATM("Dave",17880,2,"97re"));
        list.add(new AccountATM("Mrs.Vane",5670,3,"82we"));
        list.add(new AccountATM("Roma",7264,4,"45pw"));
        list.add(new AccountATM("Andrey",100000,8,"15lx")); //5
        list.add(new AccountATM("Mr.Tom",7049,5,"74mk"));
        list.add(new AccountATM("Pasha",15499,6,"84ht"));
        list.add(new AccountATM("Mr.Fam",2544,7,"47lt"));
        list.add(new AccountATM("Mrs.Rene",72664,9,"78hy"));
        list.add(new AccountATM("Mr.Fan",8945,10,"84sa")); //10





    }
}
