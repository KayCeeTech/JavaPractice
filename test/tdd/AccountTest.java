package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //Given i have an account
        Account sunnyAccount = new Account();
        //When i deposit 3000
        sunnyAccount.deposit(3000);
        //Check my balance increases by 3000
        int balance = sunnyAccount.getBalance();
        assertEquals(3000, balance);
        sunnyAccount.deposit(5000);
    }

    @Test
    public void negativeDepositShouldNotWorkTest(){
        Account sunnyAccount = new Account();

        sunnyAccount.deposit(10000);
        assertEquals(10000, sunnyAccount.getBalance());
        sunnyAccount.deposit(-5000);
        int balance = sunnyAccount.getBalance();
        balance = sunnyAccount.getBalance();
        assertEquals(1000, sunnyAccount.getBalance());

    }
    @Test
    public void withDrawMoneyTest(){
        Account sunnyAccount = new Account();
        sunnyAccount.deposit(1000);
        assertEquals(1000, sunnyAccount.getBalance());
        //When i Withdraw 500
        sunnyAccount.withDraw(500);
        //check if balance is 500
        assertEquals(500, sunnyAccount.getBalance());
    }
    @Test
    public void withDrawingAboveTest(){
        //Given i have an Account
        Account sunnyAccount = new Account();
        sunnyAccount.deposit(3000);
        assertEquals(2000, sunnyAccount.getBalance());
        sunnyAccount.withDraw(10000);
        assertEquals(3500, sunnyAccount.getBalance());
    }

}