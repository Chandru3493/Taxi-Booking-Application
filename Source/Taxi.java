import java.util.*;

public class Taxi {
  static int taxicount = 0;
  int id;
  boolean booked;
  char currentSpot;
  int freeTime;
  int totalEarnings;
  List<String> trips;

  public Taxi() {
    booked = false;
    currentSpot = 'A';
    freeTime = 6;
    totalEarnings = 0;
    trips = new ArrayList<String>();
    taxicount = taxicount + 1;
    id = taxicount;
  }

  public void setDetails(boolean booked, char currentSpot, int freeTime, int totalEarnings, String tripDetail) {
    this.booked = booked;
    this.currentSpot = currentSpot;
    this.freeTime = freeTime;
    this.totalEarnings = totalEarnings;
    this.trips.add(tripDetail);
  }

  public void printDetails() {
    System.out.println("Taxi - " + this.id + " Total Earnings - " + this.totalEarnings);
    System.out.println("TaxiID    BookingID    From    To    PickupTime    DropTime    Amount");
    for (String trip : trips) {
      System.out.println(id + "         " + trip);
    }
    System.out.println("---------------------------------------------------------------------\n");
  }
}