import java.util.HashSet;


class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> uniqueNumbers = new HashSet<>(); // HashSet to hold unique numbers

        for (int number : nums) { // Loop through each number in the array
            if (!uniqueNumbers.add(number)) { // If the number already exists in the set
                return true; // Duplicate found, return true
            }
        }

        return false; // No duplicates found, return false
    }

}