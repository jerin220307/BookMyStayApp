List<Booking> history = new ArrayList<>();

public void addToHistory(Booking b) {
    history.add(b);
}

public void showHistory() {
    for (Booking b : history) {
        System.out.println(b.name + " booked room " + b.roomId);
    }
}

void main() {
}