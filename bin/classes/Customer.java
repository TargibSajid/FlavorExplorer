package bin.classes;

public class Customer implements ICustomerAction
{	
	 public String name;
	 public String password;
	 public String email;
	 //public Account account;

	 public Customer ()
	 {

	 }

	 public Customer(String name , String password ,String email)
	 {
	 	this.name = name ;

	 	this.password = password;

	 	this.email = email;

	 	//this.account = account;


	 }

	 public void setName(String name)
	 {
	 	this.name = name;
	 }

	 public void setPassword(String password)
	 {
	 	this.password = password;
	 }

	 public void setEmail(String email)
	 {
	 	this.email = email;
	 }

	 /*public void setAccount(Account account)
	 {
	 	this.account = account;
	 }

	 public Account getAccount()
	 {
	 	return account;
	 }*/

	 //override
	 public String getName()
	 {
	 	return name;

	 }
	 //override
	 public String getPassword()
	 {
	 	return password;
	 }
	 //override
	 public String getEmail()
	 {
	 	return email;
	 }



}