class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean allNines = true;
        for (int digit : digits) {
            if (digit != 9) {
                allNines = false;
                break;
            }
        }
        if (allNines) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                break;
            }
        }

        return digits;
    }
}