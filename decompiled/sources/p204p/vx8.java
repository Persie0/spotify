package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public abstract class vx8 {

    /* JADX INFO: renamed from: a */
    public static final char[] f245637a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f245638b;

    static {
        System.getProperty("line.separator");
        f245637a = new char[64];
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            f245637a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            f245637a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            f245637a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = f245637a;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        f245638b = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = f245638b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            f245638b[f245637a[i3]] = (byte) i3;
        }
        byte[] bArr2 = f245638b;
        bArr2[45] = bArr2[43];
        bArr2[95] = bArr2[47];
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86642a(String str) {
        char c;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && charArray[length - 1] == '=') {
            length--;
        }
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = charArray[i2];
            int i4 = i2 + 2;
            char c3 = charArray[i2 + 1];
            char c4 = 'A';
            if (i4 < length) {
                i2 += 3;
                c = charArray[i4];
            } else {
                i2 = i4;
                c = 'A';
            }
            if (i2 < length) {
                c4 = charArray[i2];
                i2++;
            }
            if (c2 > 127 || c3 > 127 || c > 127 || c4 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f245638b;
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
            if (i8 < i) {
                bArr[i8] = (byte) i6;
                i8 = i3 + 2;
            }
            if (i8 < i) {
                i3 = i8 + 1;
                bArr[i8] = (byte) i7;
            } else {
                i3 = i8;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static char[] m86643b(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((i * 4) + 2) / 3;
        char[] cArr = new char[((i + 2) / 3) * 4];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i) {
            int i9 = i7 + 1;
            byte b = bArr[i7];
            int i10 = b & 255;
            if (i9 < i) {
                i2 = i7 + 2;
                i3 = bArr[i9] & 255;
            } else {
                i2 = i9;
                i3 = 0;
            }
            if (i2 < i) {
                i4 = i2 + 1;
                i5 = bArr[i2] & 255;
            } else {
                i4 = i2;
                i5 = 0;
            }
            int i11 = ((b & 3) << 4) | (i3 >>> 4);
            int i12 = ((i3 & 15) << 2) | (i5 >>> 6);
            int i13 = i5 & 63;
            char[] cArr2 = f245637a;
            cArr[i8] = cArr2[i10 >>> 2];
            int i14 = i8 + 2;
            cArr[i8 + 1] = cArr2[i11];
            char c = '=';
            cArr[i14] = i14 < i6 ? cArr2[i12] : '=';
            int i15 = i8 + 3;
            if (i15 < i6) {
                c = cArr2[i13];
            }
            cArr[i15] = c;
            i8 += 4;
            i7 = i4;
        }
        return cArr;
    }

    /* JADX INFO: renamed from: c */
    public static String m86644c(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        return new String(m86643b(bytes, bytes.length));
    }
}
