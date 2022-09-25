package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void depositMoneyTest(){
        //  given i have an account
        Account amirahAccount = new Account();
        // when i deposit 3000
        amirahAccount.deposit(3000);
        //check my balance increases by 300
        int balance = amirahAccount.getBalance();
        assertEquals(3000, balance);
    }
    @Test
    public void negativeDeoositSholdNotWorkTest(){
        //given i have an account
        Account amirahTeenAccount = new Account();
        // given that balance is 10000
        amirahTeenAccount.deposit(10000);
        assertEquals(10000, amirahTeenAccount.getBalance());
        //when i deposit -5000
        amirahTeenAccount.deposit(-5000);
        //check that balance is 10000
        assertEquals(10000, amirahTeenAccount.getBalance());
    }

    @Test
    public void withdrawMoneyTest(){
        //given that we have an account
        Account amirahTeenAccount = new Account();
        amirahTeenAccount.deposit(1000);
        assertEquals(1000,amirahTeenAccount.getBalance());
        amirahTeenAccount.withdraw(500);
        assertEquals(500, amirahTeenAccount.getBalance());
    }

    @Test
    public void withdrawingAboveBalanceFailsTest(){
        Account amirahTeenAccount = new Account();
        //given that amira has 3k
        amirahTeenAccount.deposit(3000);
        assertEquals(3000, amirahTeenAccount.getBalance());
        amirahTeenAccount.withdraw(50_000);
        assertEquals(3000, amirahTeenAccount.getBalance());
    }


}