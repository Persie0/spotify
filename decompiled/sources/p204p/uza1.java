package p204p;

import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class uza1 extends wag1 {
    /* JADX INFO: renamed from: s */
    public static boolean m84290s() {
        return b5a1.f23538e && b5a1.f23537d;
    }

    /* JADX INFO: renamed from: t */
    public static int m84291t(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            wag1 wag1Var = yza1.f277744a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return yza1.m94979c(i, b5a1.m28160g(j, bArr));
        }
        if (i2 == 2) {
            return yza1.m94980d(i, b5a1.m28160g(j, bArr), b5a1.m28160g(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // p204p.wag1
    /* JADX INFO: renamed from: j */
    public final String mo65954j(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        Charset charset = ee50.f58680a;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw InvalidProtocolBufferException.m1951c();
        }
        return str;
    }

    @Override // p204p.wag1
    /* JADX INFO: renamed from: l */
    public final String mo65955l(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        long j;
        byte bMo60798e;
        byte bMo60798e2;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long jM89843j = b5a1.f23536c.m89843j(b5a1.f23540g, byteBuffer) + ((long) i);
        long j2 = ((long) i2) + jM89843j;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            j = 1;
            if (jM89843j >= j2 || (bMo60798e2 = b5a1.f23536c.mo60798e(jM89843j)) < 0) {
                break;
            }
            jM89843j++;
            cArr[i3] = (char) bMo60798e2;
            i3++;
        }
        int i4 = i3;
        while (jM89843j < j2) {
            long j3 = jM89843j + j;
            x4a1 x4a1Var = b5a1.f23536c;
            byte bMo60798e3 = x4a1Var.mo60798e(jM89843j);
            if (bMo60798e3 >= 0) {
                int i5 = i4 + 1;
                cArr[i4] = (char) bMo60798e3;
                while (j3 < j2 && (bMo60798e = b5a1.f23536c.mo60798e(j3)) >= 0) {
                    j3 += j;
                    cArr[i5] = (char) bMo60798e;
                    i5++;
                }
                i4 = i5;
                jM89843j = j3;
            } else if (mag1.m61297g(bMo60798e3)) {
                if (j3 >= j2) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                jM89843j += 2;
                mag1.m61294d(bMo60798e3, x4a1Var.mo60798e(j3), cArr, i4);
                i4++;
            } else if (mag1.m61296f(bMo60798e3)) {
                if (j3 >= j2 - j) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                long j4 = 2 + jM89843j;
                jM89843j += 3;
                mag1.m61293c(bMo60798e3, x4a1Var.mo60798e(j3), x4a1Var.mo60798e(j4), cArr, i4);
                i4++;
            } else {
                if (j3 >= j2 - 2) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                byte bMo60798e4 = x4a1Var.mo60798e(j3);
                long j5 = jM89843j + 3;
                byte bMo60798e5 = x4a1Var.mo60798e(2 + jM89843j);
                jM89843j += 4;
                mag1.m61291a(bMo60798e3, bMo60798e4, bMo60798e5, x4a1Var.mo60798e(j5), cArr, i4);
                i4 += 2;
            }
            j = 1;
        }
        return new String(cArr, 0, i4);
    }

    @Override // p204p.wag1
    /* JADX INFO: renamed from: m */
    public final int mo65956m(String str, byte[] bArr, int i, int i2) {
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
            b5a1.m28164k(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128 && j4 < j5) {
                b5a1.m28164k(bArr, j4, (byte) cCharAt2);
                j3 = j5;
                j2 = j;
                j4 += j;
            } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                j2 = j;
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                    j3 = j5;
                    if (j4 > j3 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new rza1(i4, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char cCharAt3 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            b5a1.m28164k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            b5a1.m28164k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j6 = j4 + 3;
                            b5a1.m28164k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j4 += 4;
                            b5a1.m28164k(bArr, j6, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new rza1(i4 - 1, length);
                }
                b5a1.m28164k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                long j7 = j4 + 2;
                j3 = j5;
                b5a1.m28164k(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j4 += 3;
                b5a1.m28164k(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
            } else {
                j2 = j;
                long j8 = j4 + j2;
                b5a1.m28164k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                j4 += 2;
                b5a1.m28164k(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                j3 = j5;
            }
            i4++;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    @Override // p204p.wag1
    /* JADX INFO: renamed from: o */
    public final int mo65957o(int i, byte[] bArr, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j = i;
        int i4 = (int) (((long) i2) - j);
        if (i4 >= 16) {
            int i5 = 8 - (((int) j) & 7);
            long j2 = j;
            i3 = 0;
            while (true) {
                if (i3 >= i5) {
                    while (true) {
                        int i6 = i3 + 8;
                        if (i6 > i4) {
                            break;
                        }
                        if ((b5a1.f23536c.m89843j(b5a1.f23539f + j2, bArr) & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j2 += 8;
                        i3 = i6;
                    }
                    while (true) {
                        if (i3 >= i4) {
                            i3 = i4;
                            break;
                        }
                        long j3 = j2 + 1;
                        if (b5a1.m28160g(j2, bArr) < 0) {
                            break;
                        }
                        i3++;
                        j2 = j3;
                    }
                } else {
                    long j4 = j2 + 1;
                    if (b5a1.m28160g(j2, bArr) < 0) {
                        break;
                    }
                    i3++;
                    j2 = j4;
                }
            }
        } else {
            i3 = 0;
        }
        int i7 = i4 - i3;
        long j5 = j + ((long) i3);
        while (true) {
            byte bM28160g = 0;
            while (i7 > 0) {
                long j6 = j5 + 1;
                bM28160g = b5a1.m28160g(j5, bArr);
                if (bM28160g < 0) {
                    j5 = j6;
                    break;
                }
                i7--;
                j5 = j6;
            }
            if (i7 == 0) {
                return 0;
            }
            int i8 = i7 - 1;
            if (bM28160g < -32) {
                if (i8 == 0) {
                    return bM28160g;
                }
                i7 -= 2;
                if (bM28160g < -62) {
                    return -1;
                }
                long j7 = j5 + 1;
                if (b5a1.m28160g(j5, bArr) > -65) {
                    return -1;
                }
                j5 = j7;
            } else if (bM28160g < -16) {
                if (i8 < 2) {
                    return m84291t(j5, bArr, bM28160g, i8);
                }
                i7 -= 3;
                long j8 = j5 + 1;
                byte bM28160g2 = b5a1.m28160g(j5, bArr);
                if (bM28160g2 > -65) {
                    return -1;
                }
                if (bM28160g == -32 && bM28160g2 < -96) {
                    return -1;
                }
                if (bM28160g == -19 && bM28160g2 >= -96) {
                    return -1;
                }
                j5 += 2;
                if (b5a1.m28160g(j8, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i8 < 3) {
                    return m84291t(j5, bArr, bM28160g, i8);
                }
                i7 -= 4;
                long j9 = j5 + 1;
                byte bM28160g3 = b5a1.m28160g(j5, bArr);
                if (bM28160g3 > -65) {
                    return -1;
                }
                if ((((bM28160g3 + 112) + (bM28160g << 28)) >> 30) != 0) {
                    return -1;
                }
                long j10 = 2 + j5;
                if (b5a1.m28160g(j9, bArr) > -65) {
                    return -1;
                }
                j5 += 3;
                if (b5a1.m28160g(j10, bArr) > -65) {
                    return -1;
                }
            }
        }
    }
}
