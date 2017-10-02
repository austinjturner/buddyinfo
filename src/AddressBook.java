import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyList;
	
	
	public void addBuddy(BuddyInfo buddyToAdd) {
		buddyList.add(buddyToAdd);
	}
	
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddyList.size()) {
			return buddyList.remove(index);
		}
		return null;
	}
	
	public AddressBook() {
		this.buddyList = new ArrayList<BuddyInfo>();
	}
	
	public static void main(String[] args) {
		System.out.println("Building a new addressbook!");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "1234");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
