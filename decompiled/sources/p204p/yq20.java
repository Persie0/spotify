package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yq20 {

    /* JADX INFO: renamed from: a */
    public static final int[] f275114a;

    /* JADX INFO: renamed from: b */
    public static final int[] f275115b;

    /* JADX INFO: renamed from: c */
    public static final int[] f275116c;

    /* JADX INFO: renamed from: d */
    public static final long[] f275117d;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f275114a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        f275115b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        f275116c = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f275117d = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final int m94320a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) as91.m27076d(j)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m94321b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            m94328i(str, i, i2, 1, "at least");
            throw null;
        }
        if (i3 > 8) {
            int i4 = (i3 + i) - 8;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbM56838j = klh.m56838j(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM56838j.append(str.charAt(i));
                    sbM56838j.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM56838j.toString());
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m94322c(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m94323d(String str) {
        long j;
        byte[] bArr;
        br20 br20Var = br20.f29944d;
        int length = str.length();
        bga.m29091m(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        zq20 zq20Var = br20Var.f29947b;
        if (zq20Var.f285290a) {
            if (!zq20Var.f285291b) {
                long j2 = 0;
                long j3 = j2 + 2 + j2 + j2;
                long j4 = length;
                j = 2;
                int i = (int) ((j4 + j2) / j3);
                if ((((long) i) * j3) - j2 != j4) {
                    bArr = null;
                } else {
                    bArr = new byte[i];
                    int i2 = i - 1;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr[i4] = m94325f(i3, str);
                        i3 += 2;
                    }
                    bArr[i2] = m94325f(i3, str);
                }
            } else if ((length & 1) != 0) {
                j = 2;
                bArr = null;
            } else {
                int i5 = length >> 1;
                bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = m94325f(i6, str);
                    i6 += 2;
                }
                j = 2;
            }
            if (bArr != null) {
                return bArr;
            }
        } else {
            j = 2;
        }
        boolean z = zq20Var.f285292c;
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j5 = 0;
        long j6 = j5 + j + j5;
        long j7 = Alert.DURATION_SHOW_INDEFINITELY;
        long j8 = ((j7 - 1) * j5) + (j6 * j7);
        long j9 = length;
        long jM94331l = m94331l(1, j9, j8);
        long j10 = j9 - ((j8 + 1) * jM94331l);
        long jM94331l2 = m94331l(2, j10, j8);
        long j11 = j10 - ((j8 + ((long) 2)) * jM94331l2);
        long jM94331l3 = m94331l(0, j11, j6);
        int i8 = (int) ((jM94331l2 * j7) + (jM94331l * j7) + jM94331l3 + ((long) (j11 - ((j6 + j5) * jM94331l3) > 0 ? 1 : 0)));
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            if (i11 == Integer.MAX_VALUE) {
                if (str.charAt(i9) == '\r') {
                    int i13 = i9 + 1;
                    i9 = (i13 >= length || str.charAt(i13) != '\n') ? i13 : i9 + 2;
                } else {
                    if (str.charAt(i9) != '\n') {
                        StringBuilder sbM56838j = klh.m56838j(i9, "Expected a new line at index ", ", but was ");
                        sbM56838j.append(str.charAt(i9));
                        throw new NumberFormatException(sbM56838j.toString());
                    }
                    i9++;
                }
                i11 = 0;
                i12 = 0;
            } else if (i12 == Integer.MAX_VALUE) {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (!zn91.m96517E("  ".charAt(i14), str.charAt(i9 + i14), z)) {
                        int i15 = 2 + i9;
                        if (i15 <= length) {
                            length = i15;
                        }
                        throw new NumberFormatException(ikc0.m50939k("Expected group separator \"  \" at index ", ", but was ", i9, str.substring(i9, length)));
                    }
                }
                i9 += 2;
                i12 = 0;
            }
            i11++;
            i12++;
            if (length - 2 < i9) {
                m94328i(str, i9, length, 2, "exactly");
                throw null;
            }
            bArr2[i10] = m94325f(i9, str);
            i9 += 2;
            i10++;
        }
        return i10 == i8 ? bArr2 : Arrays.copyOf(bArr2, i10);
    }

    /* JADX INFO: renamed from: e */
    public static int m94324e(String str) {
        br20 br20Var = br20.f29944d;
        int length = str.length();
        bga.m29091m(0, length, str.length());
        if (br20Var.f29948c.f18912a) {
            m94321b(0, length, str);
            return m94326g(length, str);
        }
        if (length <= 0) {
            throw new NumberFormatException(edb.m38564m("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", str.substring(0, length)));
        }
        m94321b(0, length, str);
        return m94326g(length, str);
    }

    /* JADX INFO: renamed from: f */
    public static final byte m94325f(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = f275116c)[cCharAt]) < 0) {
            m94327h(i, str);
            throw null;
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        m94327h(i4, str);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final int m94326g(int i, String str) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 << 4;
            char cCharAt = str.charAt(i4);
            if ((cCharAt >>> '\b') != 0 || (i2 = f275116c[cCharAt]) < 0) {
                m94327h(i4, str);
                throw null;
            }
            i3 = i5 | i2;
        }
        return i3;
    }

    /* JADX INFO: renamed from: h */
    public static final void m94327h(int i, String str) {
        StringBuilder sbM56838j = klh.m56838j(i, "Expected a hexadecimal digit at index ", ", but was ");
        sbM56838j.append(str.charAt(i));
        throw new NumberFormatException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: i */
    public static final void m94328i(String str, int i, int i2, int i3, String str2) {
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + str.substring(i, i2) + "\" of length " + (i2 - i));
    }

    /* JADX INFO: renamed from: j */
    public static final int m94329j(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    /* JADX INFO: renamed from: k */
    public static final String m94330k(byte[] bArr, br20 br20Var) {
        int length = bArr.length;
        bga.m29091m(0, length, bArr.length);
        if (length == 0) {
            return "";
        }
        int[] iArr = br20Var.f29946a ? f275115b : f275114a;
        zq20 zq20Var = br20Var.f29947b;
        if (zq20Var.f285290a) {
            if (zq20Var.f285291b) {
                char[] cArr = new char[m94320a(((long) length) * 2)];
                int iM94322c = 0;
                for (int i = 0; i < length; i++) {
                    iM94322c = m94322c(bArr, i, iArr, cArr, iM94322c);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long j = 0;
            char[] cArr2 = new char[m94320a((((long) length) * (((2 + j) + j) + j)) - j)];
            int iM94329j = m94329j("", cArr2, m94322c(bArr, 0, iArr, cArr2, m94329j("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iM94329j = m94329j("", cArr2, m94322c(bArr, i2, iArr, cArr2, m94329j("", cArr2, m94329j("", cArr2, iM94329j))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = length - 1;
        int i4 = i3 / Alert.DURATION_SHOW_INDEFINITELY;
        int i5 = length % Alert.DURATION_SHOW_INDEFINITELY;
        if (i5 == 0) {
            i5 = Integer.MAX_VALUE;
        }
        int i6 = (i5 - 1) / Alert.DURATION_SHOW_INDEFINITELY;
        long j2 = (((long) i6) * ((long) 2)) + ((long) i4);
        long j3 = (i3 - i4) - i6;
        long j4 = 0;
        int iM94320a = m94320a(((j4 + 2 + j4) * ((long) length)) + (j3 * j4) + j2);
        char[] cArr3 = new char[iM94320a];
        int iM94329j2 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (i7 == Integer.MAX_VALUE) {
                cArr3[iM94329j2] = '\n';
                i8 = 0;
                iM94329j2++;
                i7 = 0;
            } else if (i8 == Integer.MAX_VALUE) {
                iM94329j2 = m94329j("  ", cArr3, iM94329j2);
                i8 = 0;
            }
            if (i8 != 0) {
                iM94329j2 = m94329j("", cArr3, iM94329j2);
            }
            iM94329j2 = m94329j("", cArr3, m94322c(bArr, i9, iArr, cArr3, m94329j("", cArr3, iM94329j2)));
            i8++;
            i7++;
        }
        if (iM94329j2 == iM94320a) {
            return new String(cArr3);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: l */
    public static final long m94331l(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
