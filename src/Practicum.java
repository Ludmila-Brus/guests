import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        Guest guest1 = new Guest("Николай", "Яблонев");
        Guest guest2 = new Guest("Екатерина", "Майская");
        VipGuest guest3 = new VipGuest("Иван", "Комаров");

        ArrayList<Guest> allGuests = new ArrayList<>();
        allGuests.add(guest1);
        allGuests.add(guest2);
        allGuests.add(guest3);

        GuestsList allGuestsList = new GuestsList();
        allGuestsList.invite(allGuests);
        allGuestsList.printAllGuests();
    }
}

class Guest {

    String name;
    String surname;

    public Guest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getGuestDescription() {
        return "Гость: " + name + " " + surname;
    }
}

class GuestsList {

    ArrayList<Guest> guests = new ArrayList<>();

    public void invite(ArrayList<Guest> guestsToInvite) {
        for (Guest guest : guestsToInvite) {
            guests.add(guest);
        }
    }

    public void printAllGuests() {
        for (Guest guest : guests) {
            System.out.println(guest.getGuestDescription());
        }
    }
}
class VipGuest extends Guest {

    public VipGuest(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getGuestDescription() {
        return "VIP-гость: " + name + " " + surname;
    }
}


