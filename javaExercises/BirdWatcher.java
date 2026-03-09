
class BirdWatcher {
    private final int[] birdsPerDay;
    private int todaysCount;
    private final int size;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.size = birdsPerDay.length;
        this.todaysCount  = birdsPerDay[birdsPerDay.length - 1];
    }

    // For comparison purposes, you always keep a copy of last week's counts nearby,
    // which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek()
    // method that returns last week's counts:
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    // Implement the BirdWatcher.getToday() method to return how many birds visited
    // your garden today. The bird counts are ordered by day, with the first element
    // being the count of the oldest day, and the last element being today's count.
    public int getToday() {
        return this.todaysCount;
    }

    // Implement the BirdWatcher.incrementTodaysCount() method to increment today's
    // count:
    public void incrementTodaysCount() {
        this.todaysCount += 1;
    }

    // Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if
    // there was a day at which zero birds visited the garden; otherwise, return
    // false:
    public boolean hasDayWithoutBirds() {
        boolean dayFound = false;
        for (int i: this.birdsPerDay) {
            if (i == 0) {
                return ! dayFound;
            }
        }
        return dayFound;
    }

    // Implement the BirdWatcher.getCountForFirstDays() method that returns the
    // number of birds that have visited your garden from the start of the week, but
    // limit the count to the specified number of days from the beginning of the
    // week.
    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > this.size) {
            for (int num: birdsPerDay) {
                count += num;
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                count += this.birdsPerDay[i];
            }
        }
        return count;
    }

    // Some days are busier than others. A busy day is one where five or more birds
    // have visited your garden. Implement the BirdWatcher.getBusyDays() method to
    // return the number of busy days:
    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.birdsPerDay[i] >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
