package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cln0 extends y85 {

    /* JADX INFO: renamed from: M0 */
    public static final char[] f39320M0 = {'+'};

    /* JADX INFO: renamed from: N0 */
    public static final char[] f39321N0 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: L0 */
    public final boolean[] f39322L0;

    /* JADX INFO: renamed from: Z */
    public final boolean f39323Z;

    public cln0(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f39323Z = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.f39322L0 = zArr;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX INFO: renamed from: M */
    public final String m33285M(String str) {
        int i;
        int i2;
        int i3;
        char[] cArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int length;
        int i8;
        char[] cArr2;
        int codePoint;
        int i9;
        str.getClass();
        int length2 = str.length();
        int i10 = 0;
        while (i10 < length2) {
            char cCharAt2 = str.charAt(i10);
            boolean[] zArr = this.f39322L0;
            if (cCharAt2 >= zArr.length || !zArr[cCharAt2]) {
                int length3 = str.length();
                char[] cArrM82788a = uco0.m82788a();
                int i11 = 0;
                int length4 = 0;
                while (i10 < length3) {
                    if (i10 >= length3) {
                        throw new IndexOutOfBoundsException("Index exceeds specified range");
                    }
                    int i12 = i10 + 1;
                    char cCharAt3 = str.charAt(i10);
                    if (cCharAt3 < 55296 || cCharAt3 > 57343) {
                        i = 0;
                        i2 = cCharAt3;
                    } else {
                        i = 0;
                        if (cCharAt3 > 56319) {
                            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i10 + " in '" + ((Object) str) + "'");
                        }
                        if (i12 == length3) {
                            i9 = -cCharAt3;
                        } else {
                            char cCharAt4 = str.charAt(i12);
                            if (!Character.isLowSurrogate(cCharAt4)) {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt4 + "' with value " + ((int) cCharAt4) + " at index " + i12 + " in '" + ((Object) str) + "'");
                            }
                            codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                        }
                    }
                    if (i2 < 0) {
                        i2 = codePoint;
                        i2 = i9;
                        throw new IllegalArgumentException("Trailing high surrogate at end of input");
                    }
                    i2 = codePoint;
                    if (i2 >= zArr.length || !zArr[i2]) {
                        if (i2 == 32 && this.f39323Z) {
                            cArr = f39320M0;
                        } else {
                            char[] cArr3 = f39321N0;
                            i3 = 1;
                            if (i2 <= 127) {
                                cArr = new char[3];
                                cArr[i] = '%';
                                cArr[2] = cArr3[i2 & 15];
                                cArr[1] = cArr3[i2 >>> 4];
                            } else if (i2 <= 2047) {
                                cArr = new char[6];
                                cArr[i] = '%';
                                cArr[3] = '%';
                                cArr[5] = cArr3[i2 & 15];
                                cArr[4] = cArr3[((i2 >>> 4) & 3) | 8];
                                cArr[2] = cArr3[(i2 >>> 6) & 15];
                                cArr[1] = cArr3[12 | (i2 >>> 10)];
                            } else if (i2 <= 65535) {
                                cArr = new char[9];
                                cArr[i] = '%';
                                cArr[1] = 'E';
                                cArr[3] = '%';
                                cArr[6] = '%';
                                cArr[8] = cArr3[i2 & 15];
                                cArr[7] = cArr3[((i2 >>> 4) & 3) | 8];
                                cArr[5] = cArr3[(i2 >>> 6) & 15];
                                cArr[4] = cArr3[((i2 >>> 10) & 3) | 8];
                                cArr[2] = cArr3[i2 >>> 12];
                            } else {
                                if (i2 > 1114111) {
                                    throw new IllegalArgumentException(s571.m77246e(i2, "Invalid unicode character value "));
                                }
                                cArr = new char[12];
                                cArr[i] = '%';
                                cArr[1] = 'F';
                                cArr[3] = '%';
                                cArr[6] = '%';
                                cArr[9] = '%';
                                cArr[11] = cArr3[i2 & 15];
                                cArr[10] = cArr3[((i2 >>> 4) & 3) | 8];
                                cArr[8] = cArr3[(i2 >>> 6) & 15];
                                cArr[7] = cArr3[((i2 >>> 10) & 3) | 8];
                                cArr[5] = cArr3[(i2 >>> 12) & 15];
                                cArr[4] = cArr3[((i2 >>> 16) & 3) | 8];
                                cArr[2] = cArr3[(i2 >>> 18) & 7];
                            }
                        }
                        if (Character.isSupplementaryCodePoint(i2)) {
                            i4 = 2;
                        } else {
                            i4 = i3;
                        }
                        i5 = i4 + i10;
                        if (cArr != null) {
                            i6 = i10 - i11;
                            i7 = length4 + i6;
                            length = cArr.length + i7;
                            if (cArrM82788a.length < length) {
                                i8 = (length3 - i10) + length + 32;
                                if (i8 >= 0) {
                                    throw new AssertionError("Cannot increase internal buffer any further");
                                }
                                cArr2 = new char[i8];
                                if (length4 > 0) {
                                    int i13 = i;
                                    System.arraycopy(cArrM82788a, i13, cArr2, i13, length4);
                                }
                                cArrM82788a = cArr2;
                            }
                            if (i6 > 0) {
                                str.getChars(i11, i10, cArrM82788a, length4);
                                length4 = i7;
                            }
                            if (cArr.length > 0) {
                                System.arraycopy(cArr, 0, cArrM82788a, length4, cArr.length);
                                length4 += cArr.length;
                            }
                            i11 = i5;
                        }
                        i10 = i5;
                        while (i10 < length3) {
                            cCharAt = str.charAt(i10);
                            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                                break;
                            }
                            i10++;
                        }
                    } else {
                        i2 = i9;
                        cArr = null;
                    }
                    i3 = 1;
                    if (Character.isSupplementaryCodePoint(i2)) {
                        i4 = 2;
                    } else {
                        i4 = i3;
                    }
                    i5 = i4 + i10;
                    if (cArr != null) {
                        i6 = i10 - i11;
                        i7 = length4 + i6;
                        length = cArr.length + i7;
                        if (cArrM82788a.length < length) {
                            i8 = (length3 - i10) + length + 32;
                            if (i8 >= 0) {
                                throw new AssertionError("Cannot increase internal buffer any further");
                            }
                            cArr2 = new char[i8];
                            if (length4 > 0) {
                                int i14 = i;
                                System.arraycopy(cArrM82788a, i14, cArr2, i14, length4);
                            }
                            cArrM82788a = cArr2;
                        }
                        if (i6 > 0) {
                            str.getChars(i11, i10, cArrM82788a, length4);
                            length4 = i7;
                        }
                        if (cArr.length > 0) {
                            System.arraycopy(cArr, 0, cArrM82788a, length4, cArr.length);
                            length4 += cArr.length;
                        }
                        i11 = i5;
                    }
                    i10 = i5;
                    while (i10 < length3) {
                        cCharAt = str.charAt(i10);
                        if (cCharAt >= zArr.length) {
                            break;
                        }
                        break;
                        break;
                    }
                }
                int i15 = length3 - i11;
                if (i15 > 0) {
                    int i16 = i15 + length4;
                    if (cArrM82788a.length < i16) {
                        if (i16 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr4 = new char[i16];
                        if (length4 > 0) {
                            System.arraycopy(cArrM82788a, 0, cArr4, 0, length4);
                        }
                        cArrM82788a = cArr4;
                    }
                    str.getChars(i11, length3, cArrM82788a, length4);
                    length4 = i16;
                }
                return new String(cArrM82788a, 0, length4);
            }
            i10++;
        }
        return str;
    }
}
