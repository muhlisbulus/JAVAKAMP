
public class Person {
public boolean checkPerson(Customer customer) {
		
		if (customer.getTcNo()!= null && customer.getBirthYear() != null &customer.getFirstName() != null && customer.getLastName() != null) {
			return true;
		}
		return false;


}
}