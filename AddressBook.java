import java.util.*;
public class AddressBook {
    private final LinkedList<BuddyInfo> budds;

    public AddressBook() {
        budds = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo homie) {
        budds.add(homie);
    }

    public void removeBuddy(BuddyInfo exHomie) {
        for (int i = 0; i < budds.size(); i++) {
            if ((budds.get(i)).getName().equals(exHomie.getName())) {
                budds.remove(i);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Address Book");
    }
}

