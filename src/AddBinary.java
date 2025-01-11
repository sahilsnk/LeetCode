public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();
        int i = num1.length - 1, j = num2.length - 1, carry = 0;
        while (i >= 0 && j >= 0) {
            if (num1[i] == '1' && num2[j] == '1') {
                if (carry == 0) {
                    carry = 1;
                    sum.append(0);
                } else {
                    sum.append(1);
                }
            } else if (num1[i] == '0' && num2[j] == '1' || num1[i] == '1' && num2[j] == '0') {
                if (carry == 0) {
                    sum.append(1);
                } else {
                    sum.append(0);
                }
            } else {
                if (carry == 0) {
                    sum.append(0);
                } else {
                    carry = 0;
                    sum.append(1);
                }
            }
            i--;
            j--;
        }
        System.out.println((int)Math.sqrt(8));
        while (i >= 0) {
            if (num1[i] == '1' && carry == 1) {
                sum.append(0);
            } else if (num1[i] == '0' && carry == 1) {
                sum.append(1);
                carry = 0;
            } else {
                sum.append(num1[i]);
            }
            i--;
        }
        while (j >= 0) {
            if (num2[j] == '1' && carry == 1) {
                sum.append(0);
            } else if (num2[j] == '0' && carry == 1) {
                sum.append(1);
                carry = 0;
            } else {
                sum.append(num2[j]);
            }
            j--;
        }
        if (carry == 1) {
            sum.append(1);
        }
        return sum.reverse().toString();
    }

}
