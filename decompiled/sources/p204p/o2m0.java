package p204p;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o2m0 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f161069c;

    /* JADX INFO: renamed from: a */
    public static final byte[] f161067a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f161068b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f161070d = new byte[128];

    /* JADX INFO: renamed from: e */
    public static final Charset f161071e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f161069c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f161067a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f161069c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f161070d, (byte) -1);
        while (true) {
            byte[] bArr3 = f161068b;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f161070d[b2] = (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m66121a(int i, int i2, StringBuilder sb, byte[] bArr) {
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i4 = 0;
            while (i - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
            i3 = i4;
        }
        while (i3 < i) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m66122b(StringBuilder sb, String str, int i, int i2) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e6 A[EDGE_INSN: B:76:0x00e6->B:57:0x00e6 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x000e A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m66123c(String str, int i, int i2, StringBuilder sb, int i3) {
        char cCharAt;
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt2 = str.charAt(i6);
            byte[] bArr = f161069c;
            byte[] bArr2 = f161070d;
            if (i4 == 0) {
                if (m66125e(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt2 - 'A'));
                    }
                } else if (m66124d(cCharAt2)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (bArr[cCharAt2] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) bArr2[cCharAt2]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                    break;
                }
            } else {
                if (i4 != 1) {
                    if (i4 == 2) {
                        byte b = bArr[cCharAt2];
                        if (b != -1) {
                            sb2.append((char) b);
                        } else if (m66125e(cCharAt2)) {
                            sb2.append((char) 28);
                            i4 = 0;
                        } else if (m66124d(cCharAt2)) {
                            sb2.append((char) 27);
                            i4 = 1;
                        } else {
                            int i7 = i6 + 1;
                            if (i7 >= i2 || bArr2[str.charAt(i7)] == -1) {
                                sb2.append((char) 29);
                                sb2.append((char) bArr2[cCharAt2]);
                            } else {
                                sb2.append((char) 25);
                                i4 = 3;
                            }
                        }
                    } else if (bArr2[cCharAt2] != -1) {
                        sb2.append((char) bArr2[cCharAt2]);
                    } else {
                        sb2.append((char) 29);
                        i4 = 0;
                    }
                } else if (m66124d(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt2 - 'a'));
                    }
                } else if (m66125e(cCharAt2)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt2 - 'A'));
                } else if (bArr[cCharAt2] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) bArr2[cCharAt2]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                }
            }
        }
        int length = sb2.length();
        char c = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt = (char) (sb2.charAt(i8) + (c * 30));
                sb.append(cCharAt);
            } else {
                cCharAt = sb2.charAt(i8);
            }
            c = cCharAt;
        }
        if (length % 2 != 0) {
            sb.append((char) ((c * 30) + 29));
        }
        return i4;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m66124d(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m66125e(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
