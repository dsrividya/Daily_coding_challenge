package org.example;

public class StreamsExample2  {
        public  static int findPoisonedDuration(int[] timeSeries, int duration) {
            if (timeSeries == null || timeSeries.length == 0 || duration == 0) return 0;

            int total = 0;
            for (int i = 0; i < timeSeries.length - 1; i++) {
                // Add the minimum of duration or the gap between current and next attack
                total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
            }
            // Add the duration of the last attack
            total += duration;

            return total;
        }

    public static void main(String[] args) {
            int[] timeSeries = {1,4};
        int duration = 2;
        int v=findPoisonedDuration( timeSeries, duration);
        System.out.println(v);
    }
    }


