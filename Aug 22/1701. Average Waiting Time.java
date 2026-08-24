class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalWaitTime = 0;
        long currentTime = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int cookTime = customer[1];

            currentTime = Math.max(currentTime, (long) arrival) + cookTime;
            totalWaitTime += (currentTime - arrival);
        }

        return (double) totalWaitTime / customers.length;
    }
}