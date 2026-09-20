package p204p;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux8 {

    /* JADX INFO: renamed from: a */
    public static final Charset f234844a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        if (r6 != 4) goto L59;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m84137a(String str) {
        byte[] bytes = str.getBytes(f234844a);
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            int[] iArr = px8.f182227b;
            if (i3 == 0) {
                while (true) {
                    int i6 = i2 + 4;
                    if (i6 > length || (i4 = (iArr[bytes[i2] & 255] << 18) | (iArr[bytes[i2 + 1] & 255] << 12) | (iArr[bytes[i2 + 2] & 255] << 6) | iArr[bytes[i2 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i5 + 2] = (byte) i4;
                    bArr[i5 + 1] = (byte) (i4 >> 8);
                    bArr[i5] = (byte) (i4 >> 16);
                    i5 += 3;
                    i2 = i6;
                }
                if (i2 >= length) {
                    break;
                }
                throw new IllegalArgumentException("bad base-64");
            }
            int i7 = i2 + 1;
            int i8 = iArr[bytes[i2] & 255];
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i8 >= 0) {
                        i8 |= i4 << 6;
                    } else if (i8 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i2 = i7;
                } else if (i3 == 2) {
                    if (i8 >= 0) {
                        i8 |= i4 << 6;
                    } else if (i8 == -2) {
                        bArr[i5] = (byte) (i4 >> 4);
                        i3 = 4;
                        i5++;
                    } else if (i8 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i2 = i7;
                } else if (i3 == 3) {
                    if (i8 >= 0) {
                        i8 |= i4 << 6;
                        bArr[i5 + 2] = (byte) i8;
                        bArr[i5 + 1] = (byte) (i8 >> 8);
                        bArr[i5] = (byte) (i8 >> 16);
                        i5 += 3;
                        i3 = 0;
                    } else if (i8 == -2) {
                        bArr[i5 + 1] = (byte) (i4 >> 2);
                        bArr[i5] = (byte) (i4 >> 10);
                        i5 += 2;
                        i3 = 5;
                    } else if (i8 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i2 = i7;
                } else if (i3 == 4) {
                    if (i8 == -2) {
                        i3++;
                    } else if (i8 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i2 = i7;
                } else {
                    if (i3 == 5 && i8 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i2 = i7;
                }
                i3++;
            } else {
                if (i8 >= 0) {
                    i3++;
                } else if (i8 != -1) {
                    throw new IllegalArgumentException("bad base-64");
                }
                i2 = i7;
            }
            i4 = i8;
            i2 = i7;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                bArr[i5] = (byte) (i4 >> 4);
                i5++;
            } else if (i3 == 3) {
                int i9 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 10);
                i5 += 2;
                bArr[i9] = (byte) (i4 >> 2);
            }
            if (i5 == i) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* JADX INFO: renamed from: b */
    public static String m84138b(byte[] bArr) {
        try {
            int length = bArr.length;
            rx8 rx8Var = new rx8();
            int i = (length / 3) * 4;
            if (length % 3 > 0) {
                i += 4;
            }
            rx8Var.f170906a = new byte[i];
            rx8Var.m76609f1(bArr, length);
            return new String((byte[]) rx8Var.f170906a, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
