class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> numFrequencies = new HashMap<>();

        for (int num : nums) {
            int numFrequency = numFrequencies.getOrDefault(num, 0);
            numFrequencies.put(num, numFrequency + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> frequencyHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        int maxHeapSize = k;

        for (Map.Entry<Integer,Integer> numFrequency : numFrequencies.entrySet()) {
            frequencyHeap.add(numFrequency);

            if (frequencyHeap.size() > k) {
                frequencyHeap.poll();
            }
        }

        int[] answers = new int[k];

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer,Integer> numFrequency = frequencyHeap.poll();
            answers[i] = numFrequency.getKey();
        }

        return answers;
    }
}
