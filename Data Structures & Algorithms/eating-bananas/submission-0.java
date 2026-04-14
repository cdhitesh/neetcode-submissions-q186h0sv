class Solution {

    public long helper(int[] arr, int speed) {
        long h = 0;
        for (int i = 0; i < arr.length; i++) {
            h += arr[i] / speed;
            if (arr[i] % speed != 0) {
                h++;
            }
        }
        return h;
    }

    public int maxnoarray(int[] arr) {
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            r = Math.max(r, arr[i]);
        }
        return r;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = maxnoarray(piles);
        int res = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hour = helper(piles, mid); //  long

            if (hour > h) {
                l = mid + 1;
            } else {
                res = mid;
                r = mid - 1;
            }
        }
        return res;
    }
}
