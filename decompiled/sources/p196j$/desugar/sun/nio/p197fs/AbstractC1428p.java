package p196j$.desugar.sun.nio.p197fs;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.p */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1428p {

    /* JADX INFO: renamed from: a */
    public static final long f10503a;

    /* JADX INFO: renamed from: b */
    public static final long f10504b;

    /* JADX INFO: renamed from: c */
    public static final char[] f10505c;

    static {
        long j = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j |= 1 << iMax;
        }
        long jM23896b = m23896b('A', 'Z') | m23896b('a', 'z');
        long jM23898d = m23898d("-_.!~*'()");
        long jM23897c = jM23896b | m23897c("-_.!~*'()");
        long jM23898d2 = j | jM23898d | m23898d(":@&=+$,");
        long jM23897c2 = jM23897c | m23897c(":@&=+$,");
        f10503a = jM23898d2 | m23898d(";/");
        f10504b = jM23897c2 | m23897c(";/");
        f10505c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX INFO: renamed from: a */
    public static int m23895a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            throw new AssertionError();
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: b */
    public static long m23896b(char c, char c2) {
        long j = 0;
        for (int iMax = Math.max(Math.min((int) c, 127), 64) - 64; iMax <= Math.max(Math.min((int) c2, 127), 64) - 64; iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static long m23897c(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '@' && cCharAt < 128) {
                j |= 1 << (cCharAt - '@');
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public static long m23898d(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '@') {
                j |= 1 << cCharAt;
            }
        }
        return j;
    }
}
