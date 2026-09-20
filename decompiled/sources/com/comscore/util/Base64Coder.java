package com.comscore.util;

/* JADX INFO: loaded from: classes.dex */
public class Base64Coder {

    /* JADX INFO: renamed from: a */
    private static char[] f1606a = new char[64];

    /* JADX INFO: renamed from: b */
    private static byte[] f1607b;

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            f1606a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            f1606a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            f1606a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = f1606a;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        f1607b = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = f1607b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            f1607b[f1606a[i3]] = (byte) i3;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }

    public static byte[] decode(char[] cArr) {
        int i;
        char c;
        int length = cArr.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && cArr[length - 1] == '=') {
            length--;
        }
        int i2 = (length * 3) / 4;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 = i) {
            char c2 = cArr[i4];
            i = i4 + 2;
            char c3 = cArr[i4 + 1];
            char c4 = 'A';
            if (i < length) {
                char c5 = cArr[i];
                i = i4 + 3;
                c = c5;
            } else {
                c = 'A';
            }
            if (i < length) {
                c4 = cArr[i];
                i++;
            }
            if (c2 > 127 || c3 > 127 || c > 127 || c4 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f1607b;
            byte b = bArr2[c2];
            byte b2 = bArr2[c3];
            byte b3 = bArr2[c];
            byte b4 = bArr2[c4];
            if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i5 = (b << 2) | (b2 >>> 4);
            int i6 = ((b2 & 15) << 4) | (b3 >>> 2);
            int i7 = ((b3 & 3) << 6) | b4;
            int i8 = i3 + 1;
            bArr[i3] = (byte) i5;
            if (i8 < i2) {
                bArr[i8] = (byte) i6;
                i8 = i3 + 2;
            }
            if (i8 < i2) {
                i3 = i8 + 1;
                bArr[i8] = (byte) i7;
            } else {
                i3 = i8;
            }
        }
        return bArr;
    }

    public static char[] encode(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = ((i * 4) + 2) / 3;
        char[] cArr = new char[((i + 2) / 3) * 4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = i5 + 1;
            byte b = bArr[i5];
            int i8 = b & 255;
            if (i7 < i) {
                int i9 = bArr[i7] & 255;
                i7 = i5 + 2;
                i2 = i9;
            } else {
                i2 = 0;
            }
            if (i7 < i) {
                i3 = bArr[i7] & 255;
                i7++;
            } else {
                i3 = 0;
            }
            int i10 = ((b & 3) << 4) | (i2 >>> 4);
            int i11 = ((i2 & 15) << 2) | (i3 >>> 6);
            int i12 = i3 & 63;
            char[] cArr2 = f1606a;
            cArr[i6] = cArr2[i8 >>> 2];
            int i13 = i6 + 2;
            cArr[i6 + 1] = cArr2[i10];
            char c = '=';
            cArr[i13] = i13 < i4 ? cArr2[i11] : '=';
            int i14 = i6 + 3;
            if (i14 < i4) {
                c = cArr2[i12];
            }
            cArr[i14] = c;
            i6 += 4;
            i5 = i7;
        }
        return cArr;
    }
}
