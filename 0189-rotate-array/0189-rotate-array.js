/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    const n = nums.length; // Get the length of the array
    k = k % n; // Handle cases where k is greater than the array length

    // Create a temporary array to store the rotated values
    const res = new Array(n);

    // Fill the rotated array
    for (let i = 0; i < n; i++) {
        res[(i + k) % n] = nums[i];
    }

    // Copy the rotated values back to the original array
    for (let i = 0; i < n; i++) {
        nums[i] = res[i];
    }
};
