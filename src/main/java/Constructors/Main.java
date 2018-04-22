package Constructors;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create field for the account number, balance,customer name,email and phone number.
        // Create getters and setters for each field
        // Create two additional methods
        // 1, To allow the customer to deposit fund(this should be increment the balance field);
        // 2, To allow the customer to withdraw fund. This should deduct from balance field,
        // but not allow the withdrawl to complete if their are insufficient funds.
        // you will want to create various code in Main class( the one created by Intellij) to
        // confirm your code is working .
        // Add some System.out.println's in the two methods above as well.

//        Account  sriAccount=new Account();
//          //      ("1234",0.00,"Sridharan","sri@aol.com","0934-234-123");
//
//        System.out.println(sriAccount.getCustomerName());
//        System.out.println(sriAccount.getCustomerEmail());
//        System.out.println(sriAccount.getBalance());
//        sriAccount.deposit(50.0);
//        sriAccount.withdrawal(100.0);
//
//        sriAccount.deposit(51.0);
//        sriAccount.withdrawal(100.0);

        Account timsAccount=new Account("Tim","time@mail.com","0434-233-423");
        System.out.println(timsAccount.getNumber() +" Name :" +timsAccount.getCustomerName());
        System.out.println("Current Balance is "+timsAccount.getBalance());
        timsAccount.withdrawal(300.55);
        timsAccount.deposit(400.00);
        timsAccount.withdrawal(300.10);
        timsAccount.deposit(100.00);
        timsAccount.withdrawal(300.10);

        //Create a new class VipCustomer
        // it should have 3 field name,credit limit,and email address.
        // Create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default value
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setter wont be needed
        // test and confirm it works.


//        VipPerson person1=new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2=new VipPerson("Bob",341.43);
//        System.out.println(person2.getName());
//
//        VipPerson person3=new VipPerson("Tim",323.43,"tm@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());


    }

}
