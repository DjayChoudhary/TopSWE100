package dsa;

public class BinarySearch {

	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;

		while (left <= right) {
			mid = left + (right - left) / 2;
			// System.out.println(String.format("%d, %d, %d", mid, left, right));
			if (nums[mid] == target)
				return mid;
			else if (target < nums[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}

		return -1;
	}

}
