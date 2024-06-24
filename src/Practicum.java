import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        Guest guest1 = new Guest("Николай", "Яблонев");
        Guest guest2 = new Guest("Екатерина", "Майская");

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        GuestsList guestsList = new GuestsList();
        guestsList.invite(guests);

        guestsList.printAllGuests();
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
        for (Guest guest: guestsToInvite) {
            guests.add(guest);
        }
    }

    public void printAllGuests() {
        for (Guest guest: guests) {
            System.out.println(guest.getGuestDescription());
        }
    }
}
