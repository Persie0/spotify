package p204p;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class vza1 extends zag1 {
    /* JADX INFO: renamed from: r */
    public static boolean m86874r() {
        return c5a1.f34127f && c5a1.f34126e;
    }

    /* JADX INFO: renamed from: s */
    public static int m86875s(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            zag1 zag1Var = zza1.f287933a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return zza1.m97289c(i, c5a1.m31470f(j, bArr));
        }
        if (i2 == 2) {
            return zza1.m97290d(i, c5a1.m31470f(j, bArr), c5a1.m31470f(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // p204p.zag1
    /* JADX INFO: renamed from: g */
    public final String mo68635g(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bM31470f = c5a1.m31470f(i, bArr);
            if (bM31470f < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) bM31470f;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bM31470f2 = c5a1.m31470f(i, bArr);
            if (bM31470f2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bM31470f2;
                while (i6 < i3) {
                    byte bM31470f3 = c5a1.m31470f(i6, bArr);
                    if (bM31470f3 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) bM31470f3;
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (pag1.m69474j(bM31470f2)) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.m419a();
                }
                i += 2;
                pag1.m69475k(bM31470f2, c5a1.m31470f(i6, bArr), cArr, i5);
                i5++;
            } else if (pag1.m69476l(bM31470f2)) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.m419a();
                }
                int i8 = i + 2;
                i += 3;
                pag1.m69477m(bM31470f2, c5a1.m31470f(i6, bArr), c5a1.m31470f(i8, bArr), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.m419a();
                }
                byte bM31470f4 = c5a1.m31470f(i6, bArr);
                int i9 = i + 3;
                byte bM31470f5 = c5a1.m31470f(i + 2, bArr);
                i += 4;
                pag1.m69471g(bM31470f2, bM31470f4, bM31470f5, c5a1.m31470f(i9, bArr), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // p204p.zag1
    /* JADX INFO: renamed from: h */
    public final int mo68636h(String str, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        int i3;
        char cCharAt;
        long j4 = i;
        long j5 = ((long) i2) + j4;
        int length = str.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                break;
            }
            c5a1.m31474j(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128 && j4 < j5) {
                c5a1.m31474j(bArr, j4, (byte) cCharAt2);
                j3 = j5;
                j2 = j;
                j4 += j;
            } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                j2 = j;
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                    j3 = j5;
                    if (j4 > j3 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new sza1(i4, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char cCharAt3 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            c5a1.m31474j(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            c5a1.m31474j(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j6 = j4 + 3;
                            c5a1.m31474j(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j4 += 4;
                            c5a1.m31474j(bArr, j6, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new sza1(i4 - 1, length);
                }
                c5a1.m31474j(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                long j7 = j4 + 2;
                j3 = j5;
                c5a1.m31474j(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j4 += 3;
                c5a1.m31474j(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
            } else {
                j2 = j;
                long j8 = j4 + j2;
                c5a1.m31474j(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                j4 += 2;
                c5a1.m31474j(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                j3 = j5;
            }
            i4++;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    @Override // p204p.zag1
    /* JADX INFO: renamed from: p */
    public final int mo68637p(int i, byte[] bArr, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j = i;
        int i4 = (int) (((long) i2) - j);
        if (i4 >= 16) {
            long j2 = j;
            i3 = 0;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j3 = j2 + 1;
                if (c5a1.m31470f(j2, bArr) < 0) {
                    break;
                }
                i3++;
                j2 = j3;
            }
        } else {
            i3 = 0;
        }
        int i5 = i4 - i3;
        long j4 = j + ((long) i3);
        while (true) {
            byte bM31470f = 0;
            while (i5 > 0) {
                long j5 = j4 + 1;
                bM31470f = c5a1.m31470f(j4, bArr);
                if (bM31470f < 0) {
                    j4 = j5;
                    break;
                }
                i5--;
                j4 = j5;
            }
            if (i5 == 0) {
                return 0;
            }
            int i6 = i5 - 1;
            if (bM31470f < -32) {
                if (i6 == 0) {
                    return bM31470f;
                }
                i5 -= 2;
                if (bM31470f < -62) {
                    return -1;
                }
                long j6 = j4 + 1;
                if (c5a1.m31470f(j4, bArr) > -65) {
                    return -1;
                }
                j4 = j6;
            } else if (bM31470f < -16) {
                if (i6 < 2) {
                    return m86875s(j4, bArr, bM31470f, i6);
                }
                i5 -= 3;
                long j7 = j4 + 1;
                byte bM31470f2 = c5a1.m31470f(j4, bArr);
                if (bM31470f2 > -65) {
                    return -1;
                }
                if (bM31470f == -32 && bM31470f2 < -96) {
                    return -1;
                }
                if (bM31470f == -19 && bM31470f2 >= -96) {
                    return -1;
                }
                j4 += 2;
                if (c5a1.m31470f(j7, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i6 < 3) {
                    return m86875s(j4, bArr, bM31470f, i6);
                }
                i5 -= 4;
                long j8 = j4 + 1;
                byte bM31470f3 = c5a1.m31470f(j4, bArr);
                if (bM31470f3 > -65) {
                    return -1;
                }
                if ((((bM31470f3 + 112) + (bM31470f << 28)) >> 30) != 0) {
                    return -1;
                }
                long j9 = 2 + j4;
                if (c5a1.m31470f(j8, bArr) > -65) {
                    return -1;
                }
                j4 += 3;
                if (c5a1.m31470f(j9, bArr) > -65) {
                    return -1;
                }
            }
        }
    }
}
