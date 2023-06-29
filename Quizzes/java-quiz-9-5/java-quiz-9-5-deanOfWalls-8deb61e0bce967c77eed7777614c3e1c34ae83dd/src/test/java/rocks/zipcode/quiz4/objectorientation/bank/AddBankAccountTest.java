package rocks.zipcode.quiz4.objectorientation.bank;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.Bank;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;

public class AddBankAccountTest {
    @Test
    public void test1() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount();
        Assert.assertFalse(bank.containsBankAccount(bankAccount));

        // when
        bank.addBankAccount(bankAccount);

        // then
        Assert.assertTrue(bank.containsBankAccount(bankAccount));
    }
}
