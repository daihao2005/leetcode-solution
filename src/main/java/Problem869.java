public class Problem869 {

    public boolean reorderedPowerOf2(int n) {
        int res = 0;
        for (; n > 0; n /= 10) res += (int) Math.pow(10, n % 10);
        switch (res) {
            case 10:
            case 100:
            case 10000:
            case 100000000:
            case 1000010:
            case 1100:
            case 1010000:
            case 100000110:
            case 1100100:
            case 100110:
            case 10111:
            case 100010101:
            case 1001010001:
            case 1100000110:
            case 101011010:
            case 111001100:
            case 2201000:
            case 10001121:
            case 1020210:
            case 200110200:
            case 111110011:
            case 1010100211:
            case 1000031011:
            case 401001001:
            case 32000120:
            case 223100:
            case 212010011:
            case 120011220:
            case 102221100:
            case 1111101111:
                return true;
            default:
                return false;
        }
    }
}
