# Quiz 9-5

## Overview
* This quiz will measure your understanding of Object Orientation:
	1. object orientation - (complete the following)
		* `Account`
		* `BankAccount`
		* `Bank`
		* `Transactable`
		* `Employee`
		* `Worker`



<hr>
<hr>

## Object Orientation
### Account
* **Description**
	* The purpose of this class is to create a model of an `Account`.
* **Methods to Complete**
	* `Long getId()`
	* `void setId(Long id)`

	

### BankAccount
* **Description**
	* The purpose of this class is to create a subclass of an `Account` which implements `Transactable`.
* **Methods to Complete**
	* `void setBalance(Double double)`



### Bank
* **Description**
	* The purpose of this class is to create an encapsulation of a `Collection` of `BankAccount` objects.
* **Methods to Complete**
	* `BankAccount removeBankAccountByIndex(Integer indexNumber)`
	* `void addBankAccount(BankAccount bankAccount)`
	* `Boolean containsBankAccount(BankAccount bankAccount)`



### Employee
* **Description**
	* The purpose of this class is to create an implementation of a `Worker` and `Transactable` which can `deposit`, `withdrawal`, and `getBalance`, of its composite `BankAccount`.
* **Methods to Complete**
	* `BankAccount getBankAccount()`
	* `void setBankAccount(BankAccount bankAccount)`

		
### Transactable
* **Description**
	* The purpose of this interface is to ensure a class can `deposit`, `withdrawal`, and `getBalance`.
* **Methods to Complete**
	* `void deposit(Double amountToIncreaseBy)`
	* `void withdrawal(Double amountToDecreaseBy)`
	* `Double getBalance()`

### Worker
* **Description**
	* The purpose of this interface is to ensure a class has `BankAccount`
* **Methods to Complete**
	* `BankAccount getBankAccount()`
	* `void setBankAccount(BankAccount bankAccount)`











