package p204p;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mx8 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f147989a;

    /* JADX INFO: renamed from: b */
    public static final Set f147990b;

    /* JADX INFO: renamed from: c */
    public static final char[] f147991c;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        f147989a = bArr;
        kx8 kx8Var = new kx8();
        for (byte b : bArr) {
            kx8Var.add(Character.valueOf((char) (b & 255)));
        }
        f147990b = Collections.unmodifiableSet(kx8Var);
        f147991c = "7N42dgm5tFLK9N8MT7fHC7".toCharArray();
    }

    /* JADX INFO: renamed from: a */
    public static String m63085a(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        int i3;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Not a 16 byte value");
        }
        int i4 = 0;
        int iM63087c = m63087c(bArr, 0);
        int iM63087c2 = m63087c(bArr, 4);
        int iM63087c3 = m63087c(bArr, 8);
        int iM63087c4 = m63087c(bArr, 12);
        byte[] bArr3 = new byte[22];
        while (true) {
            i = 6;
            bArr2 = f147989a;
            if (i4 >= 6) {
                break;
            }
            long j = ((long) iM63087c) & 4294967295L;
            iM63087c = (int) (j / 62);
            long j2 = ((j % 62) << 32) | (((long) iM63087c2) & 4294967295L);
            iM63087c2 = (int) (j2 / 62);
            long j3 = ((j2 % 62) << 32) | (((long) iM63087c3) & 4294967295L);
            iM63087c3 = (int) (j3 / 62);
            long j4 = ((j3 % 62) << 32) | (((long) iM63087c4) & 4294967295L);
            iM63087c4 = (int) (j4 / 62);
            bArr3[21 - i4] = bArr2[(int) (j4 % 62)];
            i4++;
        }
        while (true) {
            i2 = 11;
            if (i >= 11) {
                break;
            }
            long j5 = ((long) iM63087c2) & 4294967295L;
            iM63087c2 = (int) (j5 / 62);
            long j6 = ((j5 % 62) << 32) | (((long) iM63087c3) & 4294967295L);
            iM63087c3 = (int) (j6 / 62);
            long j7 = ((j6 % 62) << 32) | (((long) iM63087c4) & 4294967295L);
            bArr3[21 - i] = bArr2[(int) (j7 % 62)];
            i++;
            iM63087c4 = (int) (j7 / 62);
        }
        while (true) {
            if (i2 >= 17) {
                break;
            }
            long j8 = ((long) iM63087c3) & 4294967295L;
            iM63087c3 = (int) (j8 / 62);
            long j9 = ((j8 % 62) << 32) | (((long) iM63087c4) & 4294967295L);
            iM63087c4 = (int) (j9 / 62);
            bArr3[21 - i2] = bArr2[(int) (j9 % 62)];
            i2++;
        }
        for (i3 = 17; i3 < 22; i3++) {
            bArr3[21 - i3] = bArr2[iM63087c4 % 62];
            iM63087c4 /= 62;
        }
        return new String(bArr3, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX INFO: renamed from: b */
    public static boolean m63086b(String str) {
        char c;
        boolean zIsUpperCase;
        if (str == null || 22 != str.length()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < 22; i++) {
            char cCharAt = str.charAt(i);
            if (!f147990b.contains(Character.valueOf(cCharAt))) {
                return false;
            }
            if (!z && cCharAt != (c = f147991c[i])) {
                if ((c < '0' || c > '9') && (cCharAt < '0' || cCharAt > '9')) {
                    if (Character.isUpperCase(c) != Character.isUpperCase(cCharAt)) {
                        zIsUpperCase = Character.isUpperCase(c);
                    } else if (c > cCharAt) {
                        zIsUpperCase = true;
                    } else {
                        zIsUpperCase = false;
                    }
                } else if (c > cCharAt) {
                    zIsUpperCase = true;
                } else {
                    zIsUpperCase = false;
                }
                if (!zIsUpperCase) {
                    return false;
                }
                z = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m63087c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
